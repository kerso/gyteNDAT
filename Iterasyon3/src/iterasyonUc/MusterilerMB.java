package iterasyonUc;

import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import entities.KisiTable;

@ManagedBean
@ViewScoped
public class MusterilerMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2651932861275751169L;
	
	
	private List<KisiTable> musterilerListesi;
	
	private KisiTable secilenMusteri;
	
	private KisiTable[] secilenMusteriCheckBox;
	
	public MusterilerMB() throws Exception
	{
		
		try{
			musterilerListesi = DAOClass.retrieveAll(KisiTable.class);
		}catch(Exception ex)
		{
			
			System.out.println(ex.getMessage() + ex.getStackTrace().toString());
		}
		
		
		
	}

	public void save(ActionEvent actionEvent) throws Exception {
		System.out.println("save");
		if(secilenMusteri !=null)
		{
			secilenMusteri.setDeleted(false);
			DAOClass.save(KisiTable.class, secilenMusteri);
			
			RequestContext.getCurrentInstance().execute("dlg.hide()");
			resetForm(actionEvent);
			FacesUtil.addDefaultSuccessMessage();
			refreshSeries();
		}
		
		System.out.println("save");
	}
	
	public void delete(ActionEvent actionEvent) throws Exception {
		
		System.out.println("delete");
		
		if(secilenMusteri == null || secilenMusteri.getId() <= 0) {
			throw new Exception("Kayıt zaten kaydedilmemiş.");
		}
		
		
		
		KisiTable persistedMusteri = DAOClass.retrieveEntityById(KisiTable.class, secilenMusteri.getId());
			
			
		persistedMusteri.setDeleted(true);
		DAOClass.save(KisiTable.class, persistedMusteri);
			
		secilenMusteri = null;
		
		RequestContext.getCurrentInstance().execute("dlg.hide()");
		resetForm(actionEvent);
		FacesUtil.addDefaultSuccessMessage();
		refreshSeries();
	}
	
	public void refreshSeries() throws Exception {
		musterilerListesi = DAOClass.retrieveAllEntities(KisiTable.class, "name",null);
		
	
	}
	
	public void resetForm(ActionEvent actionEvent) throws Exception {
		secilenMusteri = null;
		System.out.println("resetForm");
	
	}
	

	public String onRowSelected() throws Exception {
		System.out.println("onRowSelected");
		if(getSecilenMusteri().getId() > 0) {
			secilenMusteri = DAOClass.retrieveEntityById(KisiTable.class, getSecilenMusteri().getId());
		
			//segmentSelectionChanged();
		}
		return null;
	}
	
	
	
	public KisiTable getSecilenMusteri() {
		if(secilenMusteri == null)
			secilenMusteri = new KisiTable();
		return secilenMusteri;
	}


	public void setSecilenMusteri(KisiTable secilenMusteri) {
		this.secilenMusteri = secilenMusteri;
	}


	public List<KisiTable> getMusterilerListesi() {
		return musterilerListesi;
	}


	public void setMusterilerListesi(List<KisiTable> musterilerListesi) {
		this.musterilerListesi = musterilerListesi;
	}


	public KisiTable[] getSecilenMusteriCheckBox() {
		return secilenMusteriCheckBox;
	}


	public void setSecilenMusteriCheckBox(KisiTable[] secilenMusteriCheckBox) {
		this.secilenMusteriCheckBox = secilenMusteriCheckBox;
	}

}

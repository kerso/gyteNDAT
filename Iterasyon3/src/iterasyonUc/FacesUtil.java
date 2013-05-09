package iterasyonUc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class FacesUtil {
	
	public static void addErrorMessage(String id, String message) {	
		FacesContext.getCurrentInstance().addMessage(id, new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
	}
	
	public static void addInfoMessage(String id, String message) {	
		FacesContext.getCurrentInstance().addMessage(id, new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
	}
	
	public static void addDefaultSuccessMessage() {
		addInfoMessage(null, "İşlem başarılı");
	}
	
	
	
}

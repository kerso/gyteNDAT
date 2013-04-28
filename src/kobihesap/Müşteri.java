/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kobihesap;


/**
 * @author İbrahim,Ahmet,İlkay
 * @version 1.0
 * @created 28-Nis-2013 19:08:04
 */
public class Müşteri extends Kişi {

	private Integer Performans;

	/**
     * Kişi classından extend ettiğimiz Müşteri sınıfının yapıcı fonksionu.
     */
    public Müşteri(){

	}

    @Override
	public void finalize() throws Throwable {
		super.finalize();
	}
    
	/**
     * Müşterinin performansını yani ödeme durumlarında nasıl bir tutarlılık gösterdiğiyle ilgili değer döndürür.
     * @return
     */
    public Integer getPerformans(){
		return null;
	}

	/**
	 * Müşterinin ödeme durumlarında tarihlere ne kadar uygun olduğuyla alakalı bir puan set eder.
	 * @param Performans
	 */
	public void setPerformans(Integer Performans){
		Integer eski = Performans;
	}
}//end Müşteri
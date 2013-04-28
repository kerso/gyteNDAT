/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kobihesap;


/**
 * @author İbrahim,Ahmet,İlkay
 * @version 1.0
 * @created 28-Nis-2013 19:08:17
 */
public class Isletmeci extends Kişi {

	private String Pozisyon;
	private String SertifikaNo;

	/**
     *Kişi sınıfından extend ettiğimiz işletmeci sınıfımızın yapıcı fonksiyonu
     */
    public Isletmeci(){

	}

    @Override
	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
     *ilgili işletmecinin pozisyonunu string olarak döndürür
     * @return
     */
    public String getPozisyon(){
		return null;
	}

	/**
	 * ilgili işletmecinin pozisyonunu string olarak alıp set .
	 * @param Pozisyon
	 */
	public void setPozisyon(String Pozisyon){
		String eski = Pozisyon;
	}

	/**
     *işletmecinin sertifika numarasını integer olarak döndürür
     * @return
     */
    public Integer getSertifikaNo(){
		return 0;
	}

	/**
	 * işletmecinin sertifika numarasını integer olarak alıp set eder.
	 * @param SertifikaNo
	 */
	public void setSertifikaNo(Integer SertifikaNo){
		Integer eskiSert = SertifikaNo;
	}
}//end Isletmeci
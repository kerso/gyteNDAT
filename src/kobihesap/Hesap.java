/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kobihesap;


/**
 * @author İbrahim,Ahmet,İlkay
 * @version 1.0
 * @created 28-Nis-2013 19:08:25
 */
public class Hesap {

	private IslemTuru İslemTürü;
	private String IslemAcıklaması;
	private Integer Tutar;
	private Müşteri Musteri;

  

	/**
     *hesap yapıcı fonksiyonumuz
     */
    public Hesap(){

	}

    @Override
	public void finalize() throws Throwable {

	}
	/**
     *veritabanından işlem türünü döndürür
     * @return
     */
    public IslemTuru getIslemTuru(){
		return null;
	}

	/**
     *veritabanından seçilmiş işlemin açıklamısını döndürür
     * @return
     */
    public String getIslemAcıklaması(){
		return null;
	}

	/**
     *Ödeme tutarını integer olarak döndürür
     * @return
     */
    public Integer GetTutar(){
		return null;
	}

	/**
     *seçilmiş olan müşteriyi döndürür
     * @return
     */
    public Müşteri getMusteri(){
		return null;
	}

	/**
	 * yeni işlem türü set eder
	 * @param IslemTuru
	 */
	public void setIslemTuru(IslemTuru IslemTuru){
		IslemTuru eski;
        eski = IslemTuru;
	}

	/**
	 *  işlemin açıklamasını veritabanına yazar
	 * @param Acıklama
	 */
	public void setIslemAcıklaması(String Acıklama){
		String eski = Acıklama;
	}

	/**
	 * tutarı veritabanına yazar
	 * @param Tutar
	 */
	public void setTutar(Integer Tutar){
		Integer tutarr = Tutar;
	}
}//end Hesap
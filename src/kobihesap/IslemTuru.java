/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kobihesap;


/**
 * @author İbrahim,Ahmet,İlkay
 * @version 1.0
 * @created 28-Nis-2013 19:08:38
 */
public class IslemTuru {

	private String IslemTuruAdı;
	private String Acıklama;
	public Hesap m_Hesap;

	/**
     *işlem türümüzün yapıcısı, içerisinde inital değerler olabilir.
     */
    public IslemTuru(){

	}

	public void finalize() throws Throwable {

	}
	/**
     * veritabanından çekilen işlem türünün adını  döndürür
     * @return
     */
    public String getIslemTuruAdı(){
		return null;
	}

	/**
     * ilgili işlem türünün açıklamasını döndürür
     * @return
     */
    public String getAcıklama(){
		return null;
	}

	/**
	 * ilgili işlem türünün adını string olarak alıp set eder.
	 * @param IslemTuruAdı
	 */
	public void setIslemTuruAdı(String IslemTuruAdı){
		String eski = IslemTuruAdı;
	}

	/**
	 * ilgili işlem türünün açıklamasını string olarak alıp set eder.
	 * @param Acıklama
	 */
	public void setAcıklama(String Acıklama){
		String eski = Acıklama;
	}
}//end IslemTuru
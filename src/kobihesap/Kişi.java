/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kobihesap;


/**
 * @author İbrahim,Ahmet,İlkay
 * @version 1.0
 * @created 28-Nis-2013 19:06:48
 */
public class Kişi {

	private String Isim;
	private String Soyisim;
	private String Email;
	private String Sifre;
	private Integer Telefon;
	private String Adres;

	/**
     *İşletmeci ve Müşteri gibi classlara extend edeceğimiz temel Kişi sınıfının yapıcı fonksiyonu.
     */
    public Kişi(){

	}

    @Override
	public void finalize() throws Throwable {

	}
	/**
     *ilgili kişinin soyismini string olarak döndürür
     * @return
     */
    public String getSoyisim(){
		return null;
	}

	/**
     *ilgili kişinin isminin string olarak döndürür.
     * @return
     */
    public String getIsim(){
		return null;
	}

	/**
     *ilgili kişinin e-mail adresini string olarak döndürür.
     * @return
     */
    public String getEmail(){
		return null;
	}

	/**
     * ilgili kişinin telefon numarasını integer olarak döndürür
     * @return
     */
    public Integer getTelefon(){
		return null;
	}

	/**
     * ilgili kişinin adresinin string olarak döndürür.
     * @return
     */
    public String getAdres(){
		return null;
	}

	/**
     *ilgili kişinin şifresini string olarak döndürür.
     * @return
     */
    public String getSifre(){
		return null;
	}

	/**
	 * ilgili kişinin adını set etmeye yarar. Parametre olarak string alır.
	 * @param Isim
	 */
	public void setIsim(String Isim){
		String eski = Isim;
	}

	/**
	 * ilgili kişinin soyadını set etmeye yarar. Parametre olarak string alır.
	 * @param Soyisim
	 */
	public void setSoyisim(String Soyisim){
		String eski = Soyisim;
	}

	/**
	 * ilgili kişinin e-posta adresini set etmeye yarar. Parametre olarak string alır.
	 * @param Email
	 */
	public void setEmail(String Email){
		String eski  = Email;
	}

	/**
	 * ilgili kişinin şifresini set etmeye yarar. Parametre olarak string alır.
	 * @param Sifre
	 */
	public void setSifre(String Sifre){
		String eski = Sifre;
	}

	/**
	 * ilgili kişinin adresini set etmeye yarar. Parametre olarak string alır.
	 * @param Adres
	 */
	public void setAdres(String Adres){
		String eski = Adres;
	}

	/**
	 * ilgili kişinin telefonunu set etmeye yarar. Parametre olarak integer alır. 
	 * @param Telefon
	 */
	public void setTelefon(Integer Telefon){
		Integer eski = Telefon;
	}
}//end Kişi
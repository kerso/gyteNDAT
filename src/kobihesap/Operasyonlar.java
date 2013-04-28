/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kobihesap;

import java.util.List;


/**
 * @author İbrahim,Ahmet,İlkay
 * @version 1.0
 * @created 28-Nis-2013 19:07:52
 */
public class Operasyonlar {

	private List<Müşteri> Musteriler;


	/**
     *Operations sınıfımızın yapıcı fonksiyonu, initial işlemler gerçekleştirilir.
     */
    public Operasyonlar(){

	}

    @Override
	public void finalize() throws Throwable {

	}
	/**
	 * ilgili yere yeni müşteri eklemeye yarar, parametre olarak Müşteri türünde bir nesne(yeni müşteriyi) alır.
	 * @param Musteri
	 */
	public void ekle(Müşteri Musteri){

	}

	/**
	 * parametre olarak gelen Müşteri türündeki nesneyi(müşteriyi) silmeye yarar.
	 * @param Musteri
	 */
	public void sil(Müşteri Musteri){

	}

	/**
	 * aranacak olan müşterinin "adını" String olarak alır ve geriye bulunan müşteriler Listesini döndürür.
	 * @param Isim
	 */
	public List<Müşteri> araI(String Isim){
		return null;
	}

	/**
	 *  aranacak olan müşterinin "soyadını" String olarak alır ve geriye bulunan müşteriler Listesini döndürür
	 * @param Soyisim
	 */
	public List<Müşteri> araS(String Soyisim){
		return null;
	}

	/**
	 * Hesap türünde bir nesneyi(hesabı) parametre olarak alır ve ilgili yere ekler.
	 * @param Hesap
	 */
	public void hesapEkle(Hesap Hesap){

	}

	/**
	 * Hesap türünde bir nesneyi(hesabı) parametre olarak alır ve bu hesabı siler.
	 * @param Hesap
	 */
	public void hesapSil(Hesap Hesap){

	}

	/**
	 * Integer olarak bir tutar değeri alır ve bunu veritabanında arayıp bir hesaplar Listesi geriye döndürür
	 * @param Tutar
	 */
	public List<Hesap> hesapAra(Integer Tutar){
		return null;
	}

	/**
	 * Müşteri türünde bir nesneyi(müsteriyi) parametre olarak alır ve bunu vt'nda arayıp geriye bulunan müşteriler Listesini döndürür.
	 * @param Musteri
	 */
	public List<Hesap> hesapAra(Müşteri Musteri){
		return null;
	}
}//end Operasyonlar
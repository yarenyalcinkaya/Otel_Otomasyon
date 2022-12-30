
package oteldeneme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

     
public class Müşteri_Bilgileri extends MüşteriKayıtı{

	@Override
	public String getAd() {
		return super.getAd();
	}

	@Override
	public void setAd(String ad) {
		super.setAd(ad);
	}

	@Override
	public String getSoyad() {
		return super.getSoyad();
	}

	@Override
	public void setSoyad(String soyad){
		super.setSoyad(soyad);
	}

	@Override
	public String getTc() {
		return super.getTc();
	}

	@Override
	public void setTc(String tc) {
		super.setTc(tc);
	}

	@Override
	public String getMail() {
		return super.getMail();
	}

	@Override
	public void setMail(String mail) {
		super.setMail(mail);
	}

	@Override
	public String getNumara(){
		return super.getNumara();
	}

	@Override
	public void setNumara(String numara) {
		super.setNumara(numara);
	}

	@Override
	public String getCinsiyet() {
		return super.getCinsiyet();
	}

	@Override
	public void setCinsiyet(String cinsiyet) {
		super.setCinsiyet(cinsiyet);
	}

	@Override
	public String getGiriş_tarihi() {
		return super.getGiriş_tarihi();
	}

	@Override
	public void setGiriş_tarihi(String giriş_tarihi) {
		super.setGiriş_tarihi(giriş_tarihi);
	}

	@Override
	public String getÇıkış_tarihi() {
		return super.getÇıkış_tarihi();
	}

	@Override
	public void setÇıkış_tarihi(String çıkış_tarihi) {
		super.setÇıkış_tarihi(çıkış_tarihi);
	}
	
	public void Güncelle(String Ad,String Soyad,String TC,String Mail,String Numara,String Cinsiyet,
			String Giris_Tarihi,String Çıkış_tarihi) {
		
	}
	
	public void Sil(String Ad,String Soyad,String TC,String Mail,String Numara,String Cinsiyet,
			String Giris_Tarihi,String Çıkış_tarihi) {
		
	}
	
	public void bilgi_göster(String Ad,String Soyad,String TC,String Mail,String Numara,String Cinsiyet,
			String Giris_Tarihi,String Çıkış_tarihi) {
		File file=new File("Müşteri.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			FileReader fReader=new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String line;
		
		Reader fReader = null;
		BufferedReader bReader=new BufferedReader(fReader);
		
		try {
			while((line = bReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
    


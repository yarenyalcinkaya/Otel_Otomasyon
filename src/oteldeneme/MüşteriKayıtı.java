
package oteldeneme;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class MüşteriKayıtı {
	private String ad;
	private String soyad;
	private String tc;
	private String mail;
	private String numara;
	private String cinsiyet;
	private String giriş_tarihi;
	private String çıkış_tarihi;
	
	public MüşteriKayıtı() {
	}
	
	public MüşteriKayıtı(String ad, String soyad, String tc, String mail, String numara, String cinsiyet,
			String giriş_tarihi, String çıkış_tarihi) {
		this.ad = ad;
		this.soyad = soyad;
		this.tc = tc;
		this.mail = mail;
		this.numara = numara;
		this.cinsiyet = cinsiyet;
		this.giriş_tarihi = giriş_tarihi;
		this.çıkış_tarihi = çıkış_tarihi;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNumara() {
		return numara;
	}

	public void setNumara(String numara) {
		this.numara = numara;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getGiriş_tarihi() {
		return giriş_tarihi;
	}

	public void setGiriş_tarihi(String giriş_tarihi) {
		this.giriş_tarihi = giriş_tarihi;
	}

	public String getÇıkış_tarihi() {
		return çıkış_tarihi;
	}

	public void setÇıkış_tarihi(String çıkış_tarihi) {
		this.çıkış_tarihi = çıkış_tarihi;
	}
	
	public void kayıt_et(String Ad,String Soyad,String TC,String Mail,String Numara,String Cinsiyet,
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
		String str=this.getAd()+ this.getSoyad()+ this.getTc()+ this.getMail()+ this.getNumara()+
				this.getCinsiyet()+ this.getGiriş_tarihi()+ this.getÇıkış_tarihi();
		
		try {
			FileWriter fWriter=new FileWriter(file, false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Writer fWriter=null;
		BufferedWriter bWriter=new BufferedWriter(fWriter);
		try {
			bWriter.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
    
   

    
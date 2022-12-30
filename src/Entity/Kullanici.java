
package Entity;


public class Kullanici {
    
    private String adi;
    private String soyadi;
    private String cinsiyet;
    private String tel;
    private String tc;
    private String email;
    private String girisTarihi;
    private String cikisTarihi;
    private String oda;
    private int ucret;
    private int seciliOdalar;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGirisTarihi() {
        return girisTarihi;
    }

    public void setGirisTarihi(String girisTarihi) {
        this.girisTarihi = girisTarihi;
    }

    public String getCikisTarihi() {
        return cikisTarihi;
    }

    public void setCikisTarihi(String cikisTarihi) {
        this.cikisTarihi = cikisTarihi;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public int getSeciliOdalar() {
        return seciliOdalar;
    }

    public void setSeciliOdalar(int seciliOdalar) {
        this.seciliOdalar = seciliOdalar;
    }

    public String getOda() {
        return oda;
    }

    public void setOda(String oda) {
        this.oda = oda;
    }

    @Override
    public String toString() {
        
        return adi +";"+  soyadi  +";"+ cinsiyet +";"+ tel+";"+ tc +";"+ email  +";"+ girisTarihi +";"+ cikisTarihi +";"+ oda +";"+ ucret +";"+ seciliOdalar+";";
    }

    
    
    
}

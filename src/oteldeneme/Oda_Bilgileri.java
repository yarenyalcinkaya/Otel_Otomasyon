
package oteldeneme;


public class Oda_Bilgileri {
    
    private int oda_no;
	private int kişi_sayısı;
	
	public Oda_Bilgileri() {
	}

	public Oda_Bilgileri(int oda_no, int kişi_sayısı) {
		this.oda_no = oda_no;
		this.kişi_sayısı = kişi_sayısı;
	}

	public int getoda_no() {
		return oda_no;
	}

	public void setoda_no(int oda_no) {
		this.oda_no = oda_no;
	}

	public int getKişi_sayısı() {
		return kişi_sayısı;
	}

	public void setKişi_sayısı(int kişi_sayısı) {
		this.kişi_sayısı = kişi_sayısı;
	}
	
	public boolean oda_durumu(int oda_no) {
		if(oda_no==this.oda_no) {
			return true;
		}else {
                  
			return false;
		}
	}

}
    

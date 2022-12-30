package oteldeneme;

public class Yemek_Menüsü implements Menüler{

    
    String yemekMenusu;
    
    
    @Override
    public String getBilgi() {
        
        yemekMenusu = "Kebap\nDoner";
        return yemekMenusu;
    }

    @Override
    public String toString() {
        return getBilgi()+";";
    }

    

    
    
    
    
    
}

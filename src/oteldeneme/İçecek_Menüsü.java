package oteldeneme;

public class İçecek_Menüsü implements Menüler{

    
    String icecekler;
    
    
    @Override
    public String getBilgi() {
        
        icecekler = "Kola\nSu...";
        return icecekler;
    }

    @Override
    public String toString() {
        return icecekler+";";
    }

    
}

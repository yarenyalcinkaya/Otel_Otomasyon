package oteldeneme;

public class Tatlı_Menüsü implements Menüler {

    private String tatlilar;

   
    @Override
    public String getBilgi() {
        tatlilar = "Sütlac\ntrileçe\nbrowni\nwaffle";
        return tatlilar;
    }
    
    @Override
    public String toString() {
        return getBilgi()+";";
    }
    
}


package Dosya;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.interfaces.DSAKey;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dosyaİşlemleri {
    
    File f;
    
   public void yazdir(String kaydedilecekYer,Object veri) throws IOException{
       
       f = new File("Data/"+kaydedilecekYer+".txt");
       
       if(!f.exists()){
           try {
               f.createNewFile();
           } catch (IOException ex) {
               Logger.getLogger(Dosyaİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       FileWriter fw = new FileWriter(f,true);
       fw.write(veri.toString()+"\n");
       fw.close();
       
   }
   
   public ArrayList oku(String okunacakYer) throws FileNotFoundException, IOException{
       
       ArrayList<String> list = new ArrayList<>();
       f = new File("Data/"+okunacakYer+".txt");
       
       if(!f.exists()){
           try {
               f.createNewFile();
           } catch (IOException ex) {
               Logger.getLogger(Dosyaİşlemleri.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
       FileReader fr = new FileReader(f);
       BufferedReader br = new BufferedReader(fr);
       String line;
       
       while((line = br.readLine()) != null ){
           list.add(line);
       }
       br.close();
       return list;
   }
    
}

    
   
  
    
  
    
    
    
    
    
   

package GUI;

import Dosya.Dosyaİşlemleri;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUI {
    
    
    private JFrame frame;
    private JLabel label,label2;
    private JPanel panel;
    private JButton buton;
    private JTextField text,text2;
    private JLabel arkaplan;
   

    public GUI() {
    }
    
    

    public GUI(JFrame frame, JLabel label, JPanel panel, JButton buton,JTextField text,JLabel label2,JTextField text2) {
        this.frame = frame;
        this.label = label;
        this.panel = panel;
        this.buton = buton;
        this.text= text;
        this.text2=text2;
        this.label2=label2;
        
    }
   

    public JFrame getFrame() {
        if(this.frame == null){
            frame = new JFrame();
            frame.setBounds(0, 0, 500, 500);
           frame.setContentPane(getPanel());
           frame.setVisible(true);
                           
        }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getLabel() {
        if(this.label==null){
            label= new JLabel();
            label.setText("Kullanıcı Adı:");
            label.setBounds(20, 15, 100, 30);
           
                
        }
        return label;
    }
     public void setLabel(JLabel label) {
        this.label = label;
    }
    
    public JLabel getLabel2(){
        if(this.label2==null){
            label2 =new JLabel();
            label2.setText("Kullanıcı Şifre:");
            label2.setBounds(20, 45, 100, 30);
        }
        return label2;
    }
    
    public void setLabel2(){
        this.label2=label2;
        
    }
    


    public JPanel getPanel() {
       if(this.panel == null){
           panel = new JPanel(null);
           panel.setBounds(0, 0, 500, 500);
           panel.add(getButon());
           panel.add(getLabel());
           panel.add(getLabel2());
           panel.add(getText());
           panel.add(getText2());
           
           panel.add(getArkaplan());
       }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getButon() {
        if(this.buton==null){
            buton =new JButton();
            buton.setText("Giriş Yap");
            buton.setBounds(200,100 , 100, 50);
            
             buton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               
                try {
                    Dosyaİşlemleri ds = new Dosyaİşlemleri();
                    ArrayList<String> kullanicilar = ds.oku("kullanıcılar");
                    
                    boolean girisYapildiMi = false;
                    
                    int i = 0;
                    
                    while(i != kullanicilar.size()){
                        String[] veri = kullanicilar.get(i).split(";");
                        boolean adDogruMu = false;
                        boolean sifreDogruMu = false;
                        
                        if(getText().getText().equals(veri[0])){
                            adDogruMu = true;
                        }
                        if(getText2().getText().equals(veri[1])){
                            sifreDogruMu = true;
                        }
                        
                        if(adDogruMu && sifreDogruMu){
                            girisYapildiMi = true;
                            JOptionPane.showMessageDialog(null, "Giriş Başarılı");
                            GUI3 guı3 = new GUI3();
                            guı3.getFrame().setVisible(true);
                            getFrame().setVisible(false);
                            break;
                        }
                        i++;
                    }
                    
                    if(!girisYapildiMi){
                        JOptionPane.showMessageDialog(null, "Hatalı Giriş!");
                    }
                    
                    
                    
                    System.out.println("butona tıklandı");
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
     
            });
        
        }
        return buton;
    }

    public void setButon(JButton buton) {
        this.buton = buton;
    }

    public JTextField getText() {
        if(this.text==null){
            
            text = new JTextField();
            text.setBounds(110,20,80,25);
            
            
        }
        return text;
    }

    public void setText(JTextField text) {
        this.text = text;
        
        
    }

    public JTextField getText2() {
        if(text2==null){
             text2 = new JTextField();
              text2.setBounds(110, 50, 80, 25);
        }
        return text2;
    }

    public void setText2(JTextField text2) {
        this.text2 = text2;
    }

    public JLabel getArkaplan() {
        if(this.arkaplan == null){
            arkaplan = new JLabel();
            arkaplan.setBounds(0, 0, 500, 500);
            arkaplan.setIcon(new ImageIcon(getClass().getResource("/Images/bungalovEvler.jpg")));
        }
        return arkaplan;
    }

    public void setArkaplan(JLabel arkaplan) {
        this.arkaplan = arkaplan;
    }

   
    

   
    
    
    
    
    
}

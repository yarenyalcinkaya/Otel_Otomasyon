
package GUI;

import Dosya.Dosyaİşlemleri;
import Entity.Kullanici;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI2 {
    
    private JFrame frame;
    private JPanel panel;
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9;
    private  JButton buton,buton2;
    private JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9;
    private JLabel arkaplan;
    

    public GUI2(JFrame frame, JPanel panel, JLabel label1, JLabel label2, JLabel label3, JLabel label4, JLabel label5, JLabel label6, JLabel label7, JLabel label8,JLabel label9, JButton buton, JTextField text1, JTextField text2, JTextField text3, JTextField text4, JTextField text5, JTextField text6,JLabel arkaplan,JTextField text7,JTextField text8,JTextField text9
    ) {
        this.frame = frame;
        this.panel = panel;
        this.label1 = label1;
        this.label2 = label2;
        this.label3 = label3;
        this.label4 = label4;
        this.label5 = label5;
        this.label6 = label6;
        this.label7 = label7;
        this.label8 = label8;
        this.label9 = label9;
        this.buton = buton;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.text5 = text5;
        this.text6 = text6;
        this.text7= text7;
        this.text8= text8;
        this.text9 =text9;
        this.arkaplan=arkaplan;
    }

    GUI2() {
    }

   
    public JFrame getFrame() {
         if(this.frame == null){
            frame = new JFrame();
            frame.setBounds(0, 0, 800, 500);
            frame.setContentPane(getPanel());
            frame.setVisible(true);
            
            
         }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }
    public JLabel getLabel1() {
        if(this.label1==null){
            label1= new JLabel();
            label1.setText("Ad :");
            label1.setBounds(20,30,50,20);
           
    }
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
    }

    public JLabel getLabel2() {
         if(this.label2==null){
            label2= new JLabel();
            label2.setText("Soyad :");
            label2.setBounds(17,66,50,20);
           
    }
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JLabel getLabel3() {
         if(this.label3==null){
            label3= new JLabel();
            label3.setText("TC :");
            label3.setBounds(20,110,36,20);
           
    }
        return label3;
    }

    public void setLabel3(JLabel label3) {
        this.label3 = label3;
    }

    public JLabel getLabel4() {
         if(this.label4==null){
            label4= new JLabel();
            label4.setText("Mail :");
            label4.setBounds(20,150,50,20);
           
    }
        return label4;
    }

    public void setLabel4(JLabel label4) {
        this.label4 = label4;
    }

    public JLabel getLabel5() {
         if(this.label5==null){
            label5= new JLabel();
            label5.setText("Numara :");
            label5.setBounds(20,190,60,20);
           
    }
        return label5;
    }

    public void setLabel5(JLabel label5) {
        this.label5 = label5;
    }

    public JLabel getLabel6() {
         if(this.label6==null){
            label6= new JLabel();
            label6.setText("Cinsiyet :");
            label6.setBounds(20,230,60,20);
           
    }
        return label6;
    }

    public void setLabel6(JLabel label6) {
        this.label6 = label6;
    }

    public JLabel getLabel7() {
         if(this.label7==null){
            label7= new JLabel();
            label7.setText("Giriş Tarihi :");
            label7.setBounds(20,276,70,20);
           
    }
        return label7;
    }

    public void setLabel7(JLabel label7) {
        this.label7 = label7;
    }

    public JLabel getLabel8() {
         if(this.label8==null){
            label8= new JLabel();
            label8.setText("Çıkış Tarihi :");
            label8.setBounds(20,306,70,20);
           
    }
        return label8;
    }

    public void setLabel8(JLabel label8) {
        this.label8 = label8;
    }
     public JLabel getLabel() {
         if(this.label9==null){
            label9= new JLabel();
            label9.setText("Oda Seçimi :");
            label9.setBounds(20,346,70,20);
           
    }
        return label9;
    }

    public void setLabel9(JLabel label8) {
        this.label9 = label9;
    }


    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel(null);
            panel.setBounds(0, 0, 730, 456);
            panel.add(getButon());
            panel.add(getButon2());
            panel.add(getLabel1()); 
            panel.add(getLabel2()); 
            panel.add(getLabel3()); 
            panel.add(getLabel4()); 
            panel.add(getLabel5()); 
            panel.add(getLabel6()); 
            panel.add(getLabel7()); 
            panel.add(getLabel8());
            panel.add(getLabel());
            panel.add(getText1());
            panel.add(getText2());
            panel.add(getText3());
            panel.add(getText4());
            panel.add(getText5());
            panel.add(getText6());
            panel.add(getText7());
            panel.add(getText8());
            panel.add(getText9());
            panel.add(getArkaplan());
                    
            
        }
        
  
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }


    
    public JButton getButon() {
        if(this.buton ==null){
            buton = new JButton();
            buton.setBounds(199,380,103,36);
            buton.setText("Kayıt Et");
            buton.setVisible(true);
             buton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Kullanici kullanici = new Kullanici();
                
                kullanici.setAdi(getText1().getText());
                kullanici.setSoyadi(getText2().getText());
                kullanici.setTc(getText3().getText());
                kullanici.setEmail(getText4().getText());
                
                kullanici.setTel(getText5().getText());
                kullanici.setCinsiyet(getText6().getText());
                kullanici.setGirisTarihi(getText7().getText());
                kullanici.setCikisTarihi(getText8().getText());
                kullanici.setOda(getText9().getText());
                
             
                
                try {
                    Dosyaİşlemleri ds = new Dosyaİşlemleri();
                    ds.yazdir("Kayitlar", kullanici);
                } catch (IOException ex) {
                    Logger.getLogger(GUI2.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }      
             });
                     }
        return buton;
        }
                     

    public void setButon(JButton buton) {
        this.buton = buton;
    }

    public JTextField getText1() {
        if(this.text1==null){
            text1 = new JTextField();
            text1.setBounds(90,30,140,20);
        }
        return text1;
    }

    public void setText1(JTextField text1) {
        this.text1 = text1;
    }

    public JTextField getText2() {
        if(this.text2==null){
            text2 = new JTextField();
            text2.setBounds(90,70,140,20);
        }
        return text2;
    }

    public void setText2(JTextField text2) {
        this.text2 = text2;
    }

    public JTextField getText3() {
        if(this.text3==null){
            text3 = new JTextField();
            text3.setBounds(90,110,140,20);
        }
        return text3;
    }

    public void setText3(JTextField text3) {
        this.text3 = text3;
    }

    public JTextField getText4() {
        if(this.text4==null){
            text4 = new JTextField();
            text4.setBounds(90,150,140,20);
        }
        return text4;
    }

    public void setText4(JTextField text4) {
        this.text4 = text4;
    }

    public JTextField getText5() {
        if(this.text5==null){
            text5 = new JTextField();
            text5.setBounds(92,190,80,20);
        }
        return text5;
    }

    public void setText5(JTextField text5) {
        this.text5 = text5;
    }

    public JTextField getText6() {
        if(this.text6==null){
            text6 = new JTextField();
            text6.setBounds(92,227,138,20);
        }
        return text6;
    }

    public void setText6(JTextField text6) {
        this.text6 = text6;
    }
    public JTextField getText7() {
        if(this.text7==null){
            text7 = new JTextField();
            text7.setBounds(92,273,138,20);
        }
        return text7;
    }

    public void setText7(JTextField text6) {
        this.text7 = text7;
    }
    public JTextField getText8() {
        if(this.text8==null){
            text8 = new JTextField();
            text8.setBounds(92,308,138,20);
        }
        return text8;
    }

    public void setText8(JTextField text6) {
        this.text8 = text8;
    }
    public JTextField getText9() {
        if(this.text9==null){
            text9 = new JTextField();
            text9.setBounds(92,343,138,20);
        }
        return text9;
    }

    public void setText9(JTextField text6) {
        this.text9 = text9;
    }
    

   
     public JLabel getArkaplan() {
        if(this.arkaplan == null){
            arkaplan = new JLabel();
            arkaplan.setBounds(300, 0, 500, 500);
            arkaplan.setIcon(new ImageIcon(getClass().getResource("/Images/bungalovEvler500piksel.jpg")));
        }
        return arkaplan;
    }

    public void setArkaplan(JLabel arkaplan) {
        this.arkaplan = arkaplan;
    }

    public JButton getButon2() {
       if(this.buton2 == null){
            buton2 = new JButton();
            
            buton2.setBounds(199, 420, 103, 25);
            buton2.setText("Diğer Sayfa");
            buton2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    GUI3 gui3 = new GUI3();
                    gui3.getFrame().setVisible(true);
                    getFrame().setVisible(false);
                }
            });
        }
        return buton2; 
    }

    public void setButon2(JButton buton2) {
        this.buton2 = buton2;
    }
    

     
     

   

}

   
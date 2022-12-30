
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;





public class GUI4 {
    private JTextArea bilgilerAlani;
    JFrame frame;
    JButton buton1,buton2;
    JPanel panel;

    public JPanel getPanel() {
        if(this.panel == null){
            panel = new JPanel(null);
            panel.setBounds(0, 0, 650, 650);
            panel.add(getBilgilerAlani());
            panel.add(getButon1());
            panel.add(getButon2());
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
    public JTextArea getBilgilerAlani() {
        if(this.bilgilerAlani == null){
            bilgilerAlani = new JTextArea();
            bilgilerAlani.setBounds(10, 50, 600, 450);
            
        }
        return bilgilerAlani;
    }

    public void setBilgilerAlani(JTextArea bilgilerAlani) {
        this.bilgilerAlani = bilgilerAlani;
    }

    public JFrame getFrame() {
        if(this.frame == null){
            frame = new JFrame();
            frame.setSize(650,650);
            frame.setContentPane(getPanel());
            frame.setVisible(true);
            
         }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JButton getButon1() {
        if(this.buton1 == null){
            buton1 = new JButton("Bilgileri Göster");
            buton1.setBounds(50, 10, 200, 25);
            buton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try {
                        Dosyaİşlemleri ds = new Dosyaİşlemleri();
                        
                        ArrayList<String> bilgiler = ds.oku("Kayitlar");
                        
                        int i = 0;
                        while(i != bilgiler.size()){
                            bilgilerAlani.setText(bilgilerAlani.getText()+bilgiler.get(i)+"\n");
                            i++;
                            
                        }
                        
                        
                        
                        
                    } catch (IOException ex) {
                        Logger.getLogger(GUI4.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    

                }
            });
        }
        return buton1;
    }

    public void setButon1(JButton buton1) {
        this.buton1 = buton1;
    }

    public JButton getButon2() {
        if(this.buton2 == null){
            buton2 = new JButton();
            
            buton2.setBounds(260, 10, 103, 25);
            buton2.setText("Geri Dön");
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
    
   
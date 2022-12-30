package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI5 {
    private JFrame frame;
    private JPanel panel;
    private JButton buton1,buton2,buton3;
    private JLabel arkaplan;

    public GUI5() {
    }

    public GUI5(JFrame frame, JPanel panel, JButton buton1, JButton buton2, JButton buton3, JLabel arkaplan) {
        this.frame = frame;
        this.panel = panel;
        this.buton1 = buton1;
        this.buton2 = buton2;
        this.buton3 = buton3;
        this.arkaplan = arkaplan;
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

    public JPanel getPanel() {
            if(this.panel == null){
            panel = new JPanel(null);
            panel.setBounds(0, 0, 500, 500);
            panel.add(getButon1());
            panel.add(getButon2());
            panel.add(getButon3());
            panel.add(getArkaplan());
            
            }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getButon1() {
          if(this.buton1 ==null){
            buton1 = new JButton();
            buton1.setBounds(20,110,110,90);
            buton1.setText("Yemek Menüsü");
            buton1.setVisible(true);
            buton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                GUI7 guı7 = new GUI7();
                guı7.getFrame().setVisible(true);
                getFrame().setVisible(false);
            }      
             });
                     }
        return buton1;
    }

    public void setButon1(JButton buton1) {
        this.buton1 = buton1;
    }

    public JButton getButon2() {
          if(this.buton2 ==null){
            buton2 = new JButton();
            buton2.setBounds(200,110,110,90);
            buton2.setText("İçecek Menüsü");
            buton2.setVisible(true);
            buton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                GUI8 guı8 = new GUI8();
                guı8.getFrame().setVisible(true);
                getFrame().setVisible(false);
            }      
             });
                     }
        return buton2;
    }

    public void setButon2(JButton buton2) {
        this.buton2 = buton2;
    }

    public JButton getButon3() {
          if(this.buton3 ==null){
            buton3 = new JButton();
            buton3.setBounds(370,110,110,90);
            buton3.setText("Tatlı Menüsü");
            buton3.setVisible(true);
            buton3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                GUI9 guı9 = new GUI9();
                guı9.getFrame().setVisible(true);
                getFrame().setVisible(false);
            }      
             });
                     }
        return buton3;
    }

    public void setButon3(JButton buton3) {
        this.buton3 = buton3;
    }

    public JLabel getArkaplan() {
          if(this.arkaplan == null){
            arkaplan = new JLabel();
            arkaplan.setBounds(0, 0, 500, 500);
            arkaplan.setIcon(new ImageIcon(getClass().getResource("/Images/ingilizce-yiyecekler-ve-icecekler.jpg")));
        }
        return arkaplan;
    }

    public void setArkaplan(JLabel arkaplan) {
        this.arkaplan = arkaplan;
    }
    
}

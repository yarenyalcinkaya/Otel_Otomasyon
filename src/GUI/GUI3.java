
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class GUI3 {
  private JFrame frame;
  private JPanel panel;
  private JButton buton1,buton2,buton3,buton4;
  private JLabel arkaplan;

    public GUI3(JFrame frame, JPanel panel, JButton buton1, JButton buton2, JButton buton3,JLabel arkaplan) {
        this.frame = frame;
        this.panel = panel;
        this.buton1 = buton1;
        this.buton2 = buton2;
        this.buton3 = buton3;
        this.buton4 = buton4;
        this.arkaplan=arkaplan;
    }
 

    GUI3() {
    }

   
    public JFrame getFrame() {
         if(this.frame == null){
            frame = new JFrame();
            frame.setSize(500,500);
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
            panel.add(getButon4());
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
            buton1.setBounds(40,337,80,64);
            buton1.setText("Kayıt");
            buton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI2 guı2 = new GUI2();
                guı2.getFrame().setVisible(true);
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
            buton2.setBounds(152,337,80,64);
            buton2.setText("Bilgiler");
            buton2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI4 guı4 = new GUI4();
                guı4.getFrame().setVisible(true);
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
            buton3.setBounds(265,337,80,64);
            buton3.setText("Oda");
            buton3.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                
                GUI6 guı6 = new GUI6();
                guı6.getFrame().setVisible(true);
                getFrame().setVisible(false);
            }      
             });
                     }
        
        return buton3;
    }

    public void setButon3(JButton buton3) {
        this.buton3 = buton3;
    }

    public JButton getButon4() {
        if(this.buton4 ==null){
            buton4 = new JButton();
            buton4.setBounds(373,337,80,64);
            buton4.setText("Menü");
            buton4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                GUI5 guı5 = new GUI5();
                guı5.getFrame().setVisible(true);
                getFrame().setVisible(false);
            }      
             });
                     
        
    }
        return buton4;
    }

    public void setButon4(JButton buton4) {
        
        this.buton4 = buton4;
        
    }
     public JLabel getArkaplan() {
        if(this.arkaplan == null){
            arkaplan = new JLabel();
            arkaplan.setBounds(0, 0, 500, 500);
            arkaplan.setIcon(new ImageIcon(getClass().getResource("/Images/Screenshot_19-750x430.png")));
        }
        return arkaplan;
    }

    public void setArkaplan(JLabel arkaplan) {
        this.arkaplan = arkaplan;
    }

    
}

    
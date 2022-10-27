/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package anyaforger;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 
 * ©Muhammad Syaman
 * github: symanmh
 * 
 */
public class AnyaForger extends JApplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setTitle("Menggambar Pemandangan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new AnyaForger();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
    
    public void init() {
        JPanel panel = new Panel2D ();
        getContentPane().add(panel);
    }
    
    class Panel2D extends JPanel {
        
        public Panel2D() {
            setPreferredSize(new Dimension(1200, 600)); // mengatur ukuran panel
            setBackground(new Color(251,233,219,255)); // mengatur warna background
        }
        
        public void paintComponent (Graphics g) {
            super.paintComponent(g);
            
            g.setColor(new Color(245,181,171,255)); // memberikan warna 
            g.fillOval(-400, -250, 500, 700);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(0, -100, 200, 250);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(60, -70, 150, 150);
            
            
            g.setColor(new Color(39,69,63,255)); // memberikan warna 
            g.fillRect(10,10,50,50); // mengisi warna
            g.setColor(new Color(247,245,246,255)); // memberikan warna 
            g.fillRect(10,110,50,50); // mengisi warna
            g.setColor(new Color(39,69,63,255)); // memberikan warna 
            g.fillRect(10,60,50,50); // mengisi warna
            g.setColor(new Color(245,181,171,255)); // memberikan warna 
            g.fillRect(11,60,48,49); // mengisi warna
            
            // membuat mata kiri
            g.setColor(new Color(39,69,63,255));  
            g.fillOval(100, 150, 450, 200);
            g.setColor(new Color(251,233,219,255)); 
            g.fillOval(110, 160, 430, 200);
            g.setColor(new Color(251,233,219,255));  
            g.fillRect(100, 250,500,200); 
            g.setColor(new Color(39,69,63,255)); 
            g.fillRect(100, 250,450,10); 
            g.setColor(new Color(39,69,63,255));  
            g.fillOval(280, 140,150,150); 
            g.setColor(new Color(251,233,219,255)); 
            g.fillRect(100, 260,500,200); 
            g.setColor(new Color(251,233,219,255)); 
            g.fillOval(280, 114,1000,50); 
            
            // membuat mata kanan
            g.setColor(new Color(39,69,63,255));
            g.fillOval(680, 150, 450, 200); 
            g.setColor(new Color(251,233,219,255));
            g.fillOval(690, 160, 430,200);
            g.setColor(new Color(251,233,219,255)); 
            g.fillRect(680, 250,500,200); 
            g.setColor(new Color(39,69,63,255)); 
            g.fillRect(680, 250,450,10); 
            g.setColor(new Color(39,69,63,255));  
            g.fillOval(790, 140,150,150); 
            g.setColor(new Color(251,233,219,255)); 
            g.fillRect(680, 260,500,200); 
            g.setColor(new Color(251,233,219,255)); 
            g.fillOval(650, 105,1000,50);
            g.setColor(new Color(251,233,219,255)); 
            g.fillOval(707, 59,180,100); 
            
            g.setColor(new Color(39,69,63,255));
            g.fillOval(390,350, 450, 200); 
            g.setColor(new Color(247,245,246,255));
            g.fillOval(400, 355, 430,180);
            g.setColor(new Color(251,233,219,255)); 
            g.fillRect(390,350,450,100);
            g.setColor(new Color(39,69,63,255)); 
            g.fillRect(390, 448,450,10); 
            
            
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(190, -50, 100, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(230, -50, 100, 180);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(250, -50, 100, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(280, -50, 100, 180);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(330, -50, 100, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(360, -50, 100, 180);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(390, -50, 100, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(420, -50, 100, 180);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(450, -50, 100, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(480, -50, 100, 180);
            
            
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(960, -50, 110, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(930, -50, 100, 180);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(900, -50, 100, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(870, -50, 100, 180);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(820, -50, 100, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(790, -50, 100, 180);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(760, -50, 100, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(730, -50, 100, 180);
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(700, -50, 100, 180);
            g.setColor(new Color(251,233,219,255));  
            g.fillOval(670, -50, 100, 180);
            
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(1050, -50, 140, 200);
            
            
            g.setColor(new Color(245,181,171,255));  
            g.fillOval(1130, -230, 500, 700);
            
        }
    }
    
}

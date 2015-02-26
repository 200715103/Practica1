/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica1_200715103;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author julio
 */




public class PruebaJFrame extends JFrame{
    JLabel label2 = new JLabel("adios");
    JLabel label1 = new JLabel("hola");
    JLabel label3;
    int j=140;
    
    
//    PruebaJFrame()
//    {
//    
//    }
    public static void main(String args[])
    {
        PruebaJFrame prueba = new PruebaJFrame();
        prueba.window();
    }
    
    
    
    
    
    private JLabel[] createLabels(){
        JLabel[] labels=new JLabel[6];
        for (int i=0;i<6;i++){
            labels[i]=new JLabel("message" + i);
            System.out.println("label"+i);
        }
        return labels;
    }
    
    
    public void window()
    {
        
    JFrame window = new JFrame("hola frame");
    
    
        JLabel[] labels = createLabels();
        JPanel[] panels = new JPanel[6];
        
        for(int i =0; i<6;i++)
        {
           
         panels[i]=new JPanel();
         if(i<5){panels[i].setBackground(Color.red);}
         
         else{panels[i].setBackground(Color.yellow);}
         panels[i].setLocation(j, 100);
         panels[i].setSize(70, 70);
         panels[i].add(labels[i]);
         j += 70;
         System.out.println("panel"+i);
        }
    

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    
    
   
    
    /**********************************************/
    
    
    
    /**********************************************/
    
    panel1.setBackground(Color.red);
    panel1.setLocation(0, 100);
    panel1.setSize(70, 70);
    
    
    panel2.setBackground(Color.blue);
    panel2.setLocation(70, 100);
    panel2.setSize(70, 70);
    
    
    panel3.setSize(70, 70);
    panel3.setLocation(0,0);
    panel3.setBackground(Color.yellow);
    
    
    
    
    //"C:/Users/julio/Documents/NetBeansProjects/Estructuras/src/Practica1_200715103/Plantas Img/planta1.png"
    //"C:\\Users\\julio\\Documents\\NetBeansProjects\\Estructuras\\src\\Practica1_200715103\\Plantas Img\\planta1.png"
    
    ImageIcon icon = new ImageIcon
        ("C:/Users/julio/Documents/NetBeansProjects/Estructuras/src/Practica1_200715103/Plantas Img/planta1.png");
    Icon icon3 = new ImageIcon("planta1.png");
   
    label1.setIcon(icon);
    
    label3= new JLabel("gracias",icon3,SwingConstants.LEFT);
    
    label3.setIcon(icon3);
    
    
     
    
    
    label1.setSize(70,70);
    label2.setSize(70,70);
   

    
    
    panel1.add(label1);
    panel2.add(label2);
    panel3.add(label3);
    
    
    
    
    
    window.add(panel1);
    window.add(panel2);
    window.add(panel3);
    
    
    window.add(panels[0]);
    window.add(panels[1]);
    window.add(panels[2]);
    window.add(panels[3]);
    window.add(panels[4]);
    window.add(panels[5]);
    
            
                    
    
    
    
    
    window.setSize(500, 500);
    window.setLayout(null);
    window.setVisible(true);
    
    
    
    
    
    
    
    
    }
}//fin clase PruebaJFrame



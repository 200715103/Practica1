/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Practica1_200715103;
import javax.swing.*;
class MyPanel extends JPanel{

    
    
    
    
    
    
    public MyPanel(){
        super();
        showGUI();
    }

    private JLabel[] createLabels(){
        JLabel[] labels=new JLabel[10];
        for (int i=0;i<10;i++){
            labels[i]=new JLabel("message" + i);
        }
        return labels;
    }

    private void showGUI(){
        JLabel[] labels=createLabels();
        for (int i=0;i<10.;i++){
            this.add(labels[i]);
        }
    }
}

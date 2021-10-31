package Panels;

import People.Person;
import java.awt.*;
import javax.swing.*;

public class ModirPanel extends PersonPanel {

    public void init(){
    JFrame f=new JFrame();
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    f.setBounds((d.width)/4, (d.height)/4, (d.width)/2,(d.height) /2);
    f.setResizable(false);
    int w=f.getWidth(),h=f.getHeight();
    JButton newAzmoon=new JButton("ایجاد آزمون");
    newAzmoon.setBounds(9*w/12,h/8 , w/6, h/6);
    newAzmoon.setFont(new java.awt.Font("B Nazanin", 1, 14));
    
    f.add(newAzmoon);
    f.setLayout(null);
    f.setVisible(true);
    }
    public ModirPanel(Person person) {
        super(person);
    }

}


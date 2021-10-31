package Panels;

import Examination.Examination;
import People.Person;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class ManagerPanel extends javax.swing.JFrame implements PersonPanel  {
    private Person person;
    private ArrayList<Examination> azmoon;

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }
    public ManagerPanel(Person person, JFrame f) {
        setPerson(person);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        f.setBounds((d.width) / 4, (d.height) / 4, (d.width) / 2, (d.height) / 2);
        f.setResizable(false);
        int w = f.getWidth(), h = f.getHeight();
        JButton newAzmoon = new JButton("ایجاد آزمون");
        newAzmoon.setBounds(9 * w / 12, h / 8, w / 6, h / 6);
        newAzmoon.setFont(new java.awt.Font("B Nazanin", 1, 14));

        f.add(newAzmoon);
        f.setLayout(null);
        f.setVisible(true);
    }

}

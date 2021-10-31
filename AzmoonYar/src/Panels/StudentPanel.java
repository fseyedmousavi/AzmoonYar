package Panels;

import Examination.Examination;
import People.Person;
import java.util.ArrayList;

public class StudentPanel extends javax.swing.JFrame implements PersonPanel {

    private Person person;
    private ArrayList<Examination> azmoon;

    public StudentPanel(Person person) {
        setPerson(person);
    }

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

}

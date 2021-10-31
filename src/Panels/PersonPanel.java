package Panels;

import Azmoon.*;
import People.*;
import java.util.ArrayList;

public abstract class PersonPanel {

    private Person person;
    private ArrayList<Azmoon> azmoon;

    public PersonPanel(Person person) {
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

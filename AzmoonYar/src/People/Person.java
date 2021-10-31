package People;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String password;

    /**
     *
     * @param firstName the firstName to set for the first time
     * @param lastName the larstName to set for the first time
     * @param password the password to set for the first time
     */
    public Person(String firstName, String lastName, String password) {
        setFirstName(firstName);
        setLastName(lastName);
        setPassword(password);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}

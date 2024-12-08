/**
 * Abstract Person class representing a person with basic attributes such as name, age, and gender.
 * This class serves as a base class for other specific types of persons like Employee and Visitor.
 *
 * Author: zyao12
 */
public abstract class Person {
    private String name;   // Name of the person
    private int age;       // Age of the person
    private String gender; // Gender of the person

    /**
     * Default constructor for Person.
     * Initializes the Person object with default values.
     */
    public Person() {
    }

    /**
     * Parameterized constructor to initialize a Person with specific details.
     *
     * @param name   the name of the person
     * @param age    the age of the person
     * @param gender the gender of the person
     */
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Gets the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     *
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the person.
     *
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     *
     * @param age the new age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the gender of the person.
     *
     * @return the gender of the person
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender of the person.
     *
     * @param gender the new gender of the person
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}

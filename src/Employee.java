/**
 * Employee class extends Person to represent an employee at an amusement park.
 * It stores details such as the employee's ID and role.
 *
 * Author: zyao12
 */
public class Employee extends Person {
    private String employeeId;  // Unique ID for the employee
    private String role;        // The role of the employee (e.g., Ride Operator)

    /**
     * Default constructor for Employee.
     * Initializes the Employee object with default values.
     */
    public Employee() {
    }

    /**
     * Parameterized constructor to initialize Employee with specific details.
     *
     * @param name        the name of the employee
     * @param age         the age of the employee
     * @param gender      the gender of the employee
     * @param employeeId  the unique ID of the employee
     * @param role        the role of the employee
     */
    public Employee(String name, int age, String gender, String employeeId, String role) {
        super(name, age, gender);  // Call the parent class constructor (Person)
        this.employeeId = employeeId;
        this.role = role;
    }

    /**
     * Gets the employee's unique ID.
     *
     * @return the employee ID
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the employee's unique ID.
     *
     * @param employeeId the new employee ID
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * Gets the employee's role.
     *
     * @return the employee's role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the employee's role.
     *
     * @param role the new role for the employee
     */
    public void setRole(String role) {
        this.role = role;
    }
}

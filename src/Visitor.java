/**
 * The Visitor class represents a visitor in the amusement park.
 * It extends the Person class and includes additional fields for ticket ID and membership ID.
 *
 * Author: zyao12
 */
public class Visitor extends Person {

    private String ticketId;
    private int membershipId;

    /**
     * Default constructor for Visitor.
     */
    public Visitor() {
    }

    /**
     * Parameterized constructor for creating a Visitor with specific details.
     *
     * @param name the name of the visitor
     * @param age the age of the visitor
     * @param gender the gender of the visitor
     * @param ticketId the ticket ID for the visitor
     * @param membershipId the membership ID of the visitor
     */
    public Visitor(String name, int age, String gender, String ticketId, int membershipId) {
        super(name, age, gender);
        this.ticketId = ticketId;
        this.membershipId = membershipId;
    }

    /**
     * Gets the ticket ID of the visitor.
     *
     * @return the ticket ID of the visitor
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Sets the ticket ID for the visitor.
     *
     * @param ticketId the new ticket ID to set
     */
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * Gets the membership ID of the visitor.
     *
     * @return the membership ID of the visitor
     */
    public int getMembershipId() {
        return membershipId;
    }

    /**
     * Sets the membership ID for the visitor.
     *
     * @param membershipId the new membership ID to set
     */
    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    /**
     * Example of creating a new Visitor object:
     * Visitor visitor1 = new Visitor("Jack", 25, "Male", "V101", 111);
     * This will create a visitor named "Jack", age 25, male, with ticket ID "V101" and membership ID 111.
     */
}

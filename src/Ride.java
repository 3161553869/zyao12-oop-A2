import java.io.*;
import java.util.*;

/**
 * The Ride class represents a ride at an amusement park, managing visitors, queueing, and ride history.
 * This class allows operators to add visitors to a queue, run the ride, track the ride history,
 * and export/import the ride history to/from a file.
 *
 * Author: zyao12
 */
public class Ride implements RideInterface {
    private String rideName;         // Name of the ride
    private int maxRiders;           // Maximum number of riders per cycle
    private Employee operator;       // The operator assigned to the ride
    private Queue<Visitor> visitorQueue = new LinkedList<>(); // Queue for managing visitors
    private List<Visitor> rideHistory = new ArrayList<>();    // List to store ride history
    private int numOfCycles = 0;     // Tracks the number of cycles run

    // Default constructor
    public Ride() {}

    // Parameterized constructor
    public Ride(String rideName, int maxRiders, Employee operator) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.operator = operator;
    }

    // Getters and setters

    /**
     * Gets the name of the ride.
     *
     * @return ride name
     */
    public String getRideName() {
        return rideName;
    }

    /**
     * Sets the name of the ride.
     *
     * @param rideName the name of the ride
     */
    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    /**
     * Gets the maximum number of riders for a cycle.
     *
     * @return maximum number of riders
     */
    public int getMaxRiders() {
        return maxRiders;
    }

    /**
     * Sets the maximum number of riders for a cycle.
     *
     * @param maxRiders maximum number of riders
     */
    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    /**
     * Gets the operator of the ride.
     *
     * @return operator
     */
    public Employee getOperator() {
        return operator;
    }

    /**
     * Sets the operator for the ride.
     *
     * @param operator the operator of the ride
     */
    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    /**
     * Gets the total number of cycles the ride has run.
     *
     * @return number of cycles
     */
    public int getNumOfCycles() {
        return numOfCycles;
    }

    /**
     * Gets the size of the visitor queue.
     *
     * @return number of visitors in the queue
     */
    public int getSizeOfVisitorQueue() {
        return visitorQueue.size();
    }




}

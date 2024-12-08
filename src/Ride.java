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

    // Queue-related methods

    /**
     * Adds a visitor to the ride's queue.
     *
     * @param visitor the visitor to be added to the queue
     */
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " has joined the queue for " + rideName + ".");
    }

    /**
     * Removes a visitor from the ride's queue.
     */
    @Override
    public void removeVisitorFromQueue() {
        Visitor removedVisitor = visitorQueue.poll();
        if (removedVisitor != null) {
            System.out.println(removedVisitor.getName() + " has been removed from the queue for " + rideName + ".");
        } else {
            System.out.println("The queue for " + rideName + " is empty. No visitor to remove.");
        }
    }

    /**
     * Prints the current visitor queue.
     */
    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("The queue for " + rideName + " is currently empty.");
        } else {
            System.out.println("Visitors in the queue for " + rideName + ":");
            for (Visitor visitor : visitorQueue) {
                System.out.println("- " + visitor.getName() + " (Age: " + visitor.getAge() + ")");
            }
        }
    }

    /**
     * Runs one cycle of the ride, allowing up to the maximum number of riders.
     */
    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("The ride " + rideName + " cannot be run because no operator is assigned.");
            return;
        }

        if (visitorQueue.isEmpty()) {
            System.out.println("The ride " + rideName + " cannot be run because the queue is empty.");
            return;
        }

        int riders = 0;
        System.out.println("Running one cycle for " + rideName + "...");
        while (riders < maxRiders && !visitorQueue.isEmpty()) {
            Visitor visitor = visitorQueue.poll();
            if (visitor != null) {
                addVisitorToHistory(visitor);
                System.out.println(visitor.getName() + " is enjoying the ride " + rideName + ".");
                riders++;
            }
        }

        numOfCycles++;
        System.out.println("Cycle completed. Total cycles run for " + rideName + ": " + numOfCycles);
    }

    /**
     * Adds a visitor to the ride history after the ride cycle.
     *
     * @param visitor the visitor to be added
     */
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " has been added to the ride history for " + rideName + ".");
    }

    /**
     * Checks if a visitor has taken the ride before.
     *
     * @param visitor the visitor to check
     * @return true if the visitor has ridden, false otherwise
     */
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor);
        System.out.println(visitor.getName() + " is " + (found ? "" : "not ") + "in the ride history for " + rideName + ".");
        return found;
    }

    /**
     * Gets the total number of visitors who have taken the ride.
     *
     * @return number of visitors
     */
    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    /**
     * Prints the entire ride history.
     */
    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("No visitors have taken the ride " + rideName + " yet.");
        } else {
            System.out.println("Ride history for " + rideName + ":");
            for (Visitor visitor : rideHistory) {
                System.out.println("- " + visitor.getName() + " (Age: " + visitor.getAge() + ")");
            }
        }
    }

    /**
     * Sorts the ride history by visitor names.
     */
    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history has been sorted.");
    }

    /**
     * Exports the ride history to a CSV file.
     *
     * @param filename the file name to export to
     */
    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getGender() + ","
                        + visitor.getTicketId() + "," + visitor.getMembershipId() + "\n");
            }
            System.out.println("Ride history has been successfully exported to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while exporting ride history: " + e.getMessage());
        }
    }

    /**
     * Imports ride history from a CSV file.
     *
     * @param filename the file name to import from
     */
    public void importRideHistory(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    String name = data[0];
                    int age = Integer.parseInt(data[1]);
                    String gender = data[2];
                    String ticketId = data[3];
                    int membershipId = Integer.parseInt(data[4]);

                    Visitor visitor = new Visitor(name, age, gender, ticketId, membershipId);
                    visitorQueue.add(visitor);
                }
            }
            System.out.println("Ride history has been successfully imported from " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while importing ride history: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

/**
 * Main class for demonstrating ride operations and visitor management.
 * This class contains multiple parts, each simulating different functionalities
 * of a theme park ride system, including adding visitors, checking ride history,
 * and handling queue operations.
 * Author: zyao12
 */
public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        // Uncomment the parts to test specific functionalities
        // assignment.partThree();
        // assignment.partFourA();
        // assignment.partFourB();
        // assignment.partFive();
//         assignment.partSix();
        assignment.partSeven();
    }

    /**
     * Part 3: Demonstrates adding visitors to the queue and removing them.
     */
    public void partThree() {
        // Create a Ride Operator
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");

        // Create a Ride object
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Add visitors to the queue
        addVisitorsToQueue(rollerCoaster);

        // Print the queue, remove a visitor, and print again
        rollerCoaster.printQueue();
        rollerCoaster.removeVisitorFromQueue();
        rollerCoaster.printQueue();
    }

    /**
     * Helper method to add a list of visitors to the queue for the ride.
     * @param rollerCoaster The ride object.
     */
    private void addVisitorsToQueue(Ride rollerCoaster) {
        // Create and add visitors
        rollerCoaster.addVisitorToQueue(new Visitor("Jack", 25, "Male", "V101", 111));
        rollerCoaster.addVisitorToQueue(new Visitor("Sharon", 22, "Female", "V102", 111));
        rollerCoaster.addVisitorToQueue(new Visitor("Benny", 28, "Male", "V103", 11111));
        rollerCoaster.addVisitorToQueue(new Visitor("Leo", 24, "Female", "V104", 11111));
        rollerCoaster.addVisitorToQueue(new Visitor("Nehemia", 30, "Male", "V105", 11111));
    }

    /**
     * Part 4A: Demonstrates adding visitors to the ride history and checking them.
     */
    public void partFourA() {
        // Create Ride and Operator
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Add visitors to history
        addVisitorsToHistory(rollerCoaster);

        // Check visitor history and print results
        rollerCoaster.checkVisitorFromHistory(new Visitor("Benny", 28, "Male", "V103", 11111));
        rollerCoaster.checkVisitorFromHistory(new Visitor("Demo", 29, "Male", "V106", 3333));

        // Print the history
        System.out.println("Total visitors in ride history: " + rollerCoaster.numberOfVisitors());
        rollerCoaster.printRideHistory();
    }

    /**
     * Helper method to add visitors to the ride history.
     * @param rollerCoaster The ride object.
     */
    private void addVisitorsToHistory(Ride rollerCoaster) {
        // Add visitors to ride history
        rollerCoaster.addVisitorToHistory(new Visitor("Jack", 25, "Male", "V101", 33333));
        rollerCoaster.addVisitorToHistory(new Visitor("Sharon", 22, "Female", "V102", 2222));
        rollerCoaster.addVisitorToHistory(new Visitor("Benny", 28, "Male", "V103", 22));
        rollerCoaster.addVisitorToHistory(new Visitor("Leo", 24, "Female", "V104", 333));
        rollerCoaster.addVisitorToHistory(new Visitor("Nehemia", 30, "Male", "V105", 4444));
    }

    /**
     * Part 4B: Demonstrates sorting the ride history by visitor name and age.
     */
    public void partFourB() {
        // Create Ride and Operator
        Employee operator = new Employee("Bob", 40, "Male", "E102", "Ride Operator");
        Ride thunderStorm = new Ride("Thunderstorm", 4, operator);

        // Add visitors to ride history
        addVisitorsForSorting(thunderStorm);

        // Print ride history before and after sorting
        System.out.println("Before sorting:");
        thunderStorm.printRideHistory();
        thunderStorm.sortRideHistory();
        System.out.println("After sorting:");
        thunderStorm.printRideHistory();
    }

    /**
     * Helper method to add visitors for sorting.
     * @param thunderStorm The ride object.
     */
    private void addVisitorsForSorting(Ride thunderStorm) {
        thunderStorm.addVisitorToHistory(new Visitor("Tom", 25, "Male", "V101", 1));
        thunderStorm.addVisitorToHistory(new Visitor("Sherly", 22, "Female", "V102", 2));
        thunderStorm.addVisitorToHistory(new Visitor("Ben", 28, "Male", "V103", 3));
        thunderStorm.addVisitorToHistory(new Visitor("David", 24, "Female", "V104", 4));
        thunderStorm.addVisitorToHistory(new Visitor("Jack", 30, "Male", "V105", 5));
        thunderStorm.addVisitorToHistory(new Visitor("Lee", 30, "Female", "V106", 5));
    }

    /**
     * Part 5: Simulates a full cycle of adding visitors, running the ride, and displaying results.
     */
    public void partFive() {
        // Create Ride and Operator
        Employee operator = new Employee("Bob", 40, "Male", "E102", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Add visitors to queue
        addMultipleVisitorsToQueue(rollerCoaster);

        // Print the queue before and after the cycle
        System.out.println("\nVisitors in queue before the cycle:");
        rollerCoaster.printQueue();
        rollerCoaster.runOneCycle();
        System.out.println("\nVisitors in queue after the cycle:");
        rollerCoaster.printQueue();

        // Print ride history
        System.out.println("\nRide history:");
        rollerCoaster.printRideHistory();
    }

    /**
     * Helper method to add multiple visitors to the queue.
     * @param rollerCoaster The ride object.
     */
    private void addMultipleVisitorsToQueue(Ride rollerCoaster) {
        rollerCoaster.addVisitorToQueue(new Visitor("Tom", 25, "Male", "V101", 000));
        rollerCoaster.addVisitorToQueue(new Visitor("Sherly", 22, "Female", "V102", 999));
        rollerCoaster.addVisitorToQueue(new Visitor("Ben", 28, "Male", "V103", 6777));
        rollerCoaster.addVisitorToQueue(new Visitor("David", 24, "Female", "V104", 868));
        rollerCoaster.addVisitorToQueue(new Visitor("Jack", 30, "Male", "V105", 456654));
        rollerCoaster.addVisitorToQueue(new Visitor("Lee", 30, "Female", "V106", 645645));
        rollerCoaster.addVisitorToQueue(new Visitor("Jack", 25, "Male", "V107", 654654));
        rollerCoaster.addVisitorToQueue(new Visitor("Sharon", 22, "Female", "V108", 65465463));
        rollerCoaster.addVisitorToQueue(new Visitor("Benny", 28, "Male", "V109", 635634));
        rollerCoaster.addVisitorToQueue(new Visitor("Leo", 24, "Female", "V110", 63463546));
        rollerCoaster.addVisitorToQueue(new Visitor("Nehemia", 30, "Male", "V111", 634565436));
    }

    /**
     * Part 6: Exports the ride history to a file.
     */
    public void partSix() {
        // Create Ride and Operator
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Add visitors to history
        addVisitorsToHistory(rollerCoaster);

        // Export ride history to a CSV file
        String filename = "f1.csv";
        rollerCoaster.exportRideHistory(filename);
    }

    /**
     * Part 7: Imports ride history from a file and displays visitor count and queue.
     */
    public void partSeven() {
        // Create Ride and Operator
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Import ride history and print visitor details
        rollerCoaster.importRideHistory("f1.csv");
        System.out.println("The number of Visitors: " + rollerCoaster.getSizeOfVisitorQueue() + "\n");
        System.out.println("All Visitors:");
        rollerCoaster.printQueue();
    }
}

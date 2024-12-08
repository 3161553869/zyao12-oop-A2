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
        
    }

    /**
     * Part 7: Imports ride history from a file and displays visitor count and queue.
     */
    public void partSeven() {

    }
}

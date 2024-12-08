import java.util.List;

/**
 * The RideInterface defines the essential methods for managing the visitors, ride history,
 * and ride cycles for an amusement park ride.
 * This interface allows adding/removing visitors from the queue, running the ride,
 * tracking visitors in history, and managing ride cycles.
 *
 * Author: zyao12
 */
public interface RideInterface {

    /**
     * Adds a visitor to the ride's queue.
     *
     * @param visitor the visitor to be added to the queue
     */
    void addVisitorToQueue(Visitor visitor);

    /**
     * Removes a visitor from the ride's queue.
     */
    void removeVisitorFromQueue();

    /**
     * Prints the list of visitors currently in the ride's queue.
     */
    void printQueue();

    /**
     * Runs one cycle of the ride, allowing a specified number of visitors to experience the ride.
     */
    void runOneCycle();

    /**
     * Adds a visitor to the ride history after they have experienced the ride.
     *
     * @param visitor the visitor to be added to the history
     */
    void addVisitorToHistory(Visitor visitor);

    /**
     * Checks if a visitor has already taken the ride before by looking them up in the ride history.
     *
     * @param visitor the visitor to be checked
     * @return true if the visitor is in the history, false otherwise
     */
    boolean checkVisitorFromHistory(Visitor visitor);

    /**
     * Returns the total number of visitors who have taken the ride.
     *
     * @return number of visitors
     */
    int numberOfVisitors();

    /**
     * Prints the entire ride history, displaying all visitors who have experienced the ride.
     */
    void printRideHistory();
}

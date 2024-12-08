import java.util.Comparator;

/**
 * The VisitorComparator class implements the Comparator interface to compare two Visitor objects.
 * The comparison is based on age first, and if ages are equal, it compares by name.
 *
 * Author: zyao12
 */
public class VisitorComparator implements Comparator<Visitor> {

    /**
     * Compares two Visitor objects by their age. If the ages are equal, compares by name.
     *
     * @param v1 the first Visitor to be compared
     * @param v2 the second Visitor to be compared
     * @return a negative integer, zero, or a positive integer as the first Visitor is less than, equal to, or greater than the second Visitor
     */
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // Compare by age
        int ageComparison = Integer.compare(v1.getAge(), v2.getAge());
        if (ageComparison != 0) {
            return ageComparison;  // If ages are different, return the comparison result
        }
        // If ages are the same, compare by name
        return v1.getName().compareTo(v2.getName());
    }
}

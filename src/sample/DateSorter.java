package sample;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Provides functionality to sort dates based on specific criteria.
 * Dates with an 'r' in the month are sorted in ascending order,
 * and then dates without an 'r' in the month are sorted in descending order.
 */
public class DateSorter {

    /**
     * Comparator to sort LocalDate objects according to the specified criteria.
     * Dates with an 'r' in the month come first in ascending order,
     * followed by dates without an 'r' in the month in descending order.
     */
    private static final Comparator<LocalDate> localDateComparator = (LocalDate firstDate, LocalDate secondDate) -> {
        if (firstDate.isEqual(secondDate)) { // The dates are equal
            return 0;
        }

        int firstMonth = firstDate.getMonthValue();
        int secondMonth = secondDate.getMonthValue();

        boolean firstContainsR = firstMonth < 5 || firstMonth > 8; // The first four and the last four contain 'r'
        boolean secondContainsR = secondMonth < 5 || secondMonth > 8;

        if (firstContainsR && secondContainsR) { // If both contain 'r'
            return firstDate.isBefore(secondDate) ? -1 : 1; // Ascending order
        } else if (firstContainsR) { // If only the first contain 'r'
            return -1; // The date with the 'r' should be before the date without 'r'
        } else if (secondContainsR) { // If only the second contains 'r'
            return 1; // The date with the 'r' should be before the date without 'r'
        } else { // If none of them contain 'r'
            return firstDate.isAfter(secondDate) ? -1 : 1; // Descending order
        }
    };

    /**
     * Sorts a list of LocalDate objects according to the specified criteria.
     * Dates with an 'r' in the month are sorted in ascending order,
     * and then dates without an 'r' in the month are sorted in descending order.
     *
     * @param unsortedDates an unsorted list of dates
     * @return the collection of dates sorted according to the specified criteria
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        // Solution here
    }
}

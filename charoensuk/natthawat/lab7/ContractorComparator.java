package charoensuk.natthawat.lab7;

import java.util.Comparator;

/**
 * Comparator for sorting contractors by multiple attributes.
 */
public class ContractorComparator implements Comparator<Contractor> {
    public int compare(Contractor c1, Contractor c2) {
        // 1. Primary: duration descending
        int res = Integer.compare(c2.getContractDuration(), c1.getContractDuration());
        if (res != 0) return res;

        // 2. Secondary: hourly rate ascending
        res = Double.compare(c1.getHourlyRate(), c2.getHourlyRate());
        if (res != 0) return res;

        // 3. Tertiary: name alphabetically
        return c1.getName().compareTo(c2.getName());
    }
}
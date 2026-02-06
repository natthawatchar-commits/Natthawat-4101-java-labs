package charoensuk.natthawat.lab7;

import java.util.Comparator;

public class ContractorHourlyRateComparator implements Comparator<Contractor> {
    public int compare(Contractor c1, Contractor c2) {
        return Double.compare(c1.getHourlyRate(), c2.getHourlyRate());
    }
}
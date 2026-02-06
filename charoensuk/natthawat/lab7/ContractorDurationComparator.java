package charoensuk.natthawat.lab7;

import java.util.Comparator;

public class ContractorDurationComparator implements Comparator<Contractor> {
    public int compare(Contractor c1, Contractor c2) {
        return Integer.compare(c2.getContractDuration(), c1.getContractDuration());
    }
}
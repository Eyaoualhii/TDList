import java.util.Comparator;

public class EtudiantComparatorByID implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant o1, Etudiant o2) {
        return o1.getId()-o2.getId();
    }
}

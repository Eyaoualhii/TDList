import java.util.Comparator;
public class EtudiantComparatorByName implements Comparator<Etudiant>{



    @Override
    public int compare(Etudiant o1, Etudiant o2) {

        System.out.println(o1.getNom().compareTo(o2.getNom()));
        return o1.getNom().compareTo(o2.getNom());
    }
}

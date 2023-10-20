import java.util.ArrayList;
import java.util.Collections;

public class GestionEtudiants implements University{


    ArrayList<Etudiant> etudiants = new ArrayList();
    @Override
    public void ajouterEtudiant(Etudiant e) {
    etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        if (etudiants.contains(e)) return true;
        return false;
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : etudiants){
            if (e.getNom().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
    etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : etudiants){
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(etudiants,new EtudiantComparatorByID());
    }

    @Override
    public void trierEtudiantsParNom() {
    Collections.sort(etudiants,new EtudiantComparatorByName());
    }
}

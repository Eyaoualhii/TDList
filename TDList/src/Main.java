public class Main {
    public static void main(String[] args) {



        Etudiant e1 = new Etudiant();
        Etudiant e2 = new Etudiant(1,"Oualhi","Eya");
        Etudiant e3 = new Etudiant(2,"Oualhi","Eya");
        Etudiant e4 = new Etudiant(3,"Test","Test");
        System.out.println(e1.equals(e2));
        System.out.println(e2.toString());

        GestionEtudiants e = new GestionEtudiants();


        e.ajouterEtudiant(e1);
        e.ajouterEtudiant(e3);
        e.ajouterEtudiant(e4);

        System.out.println("Liste etudiant avant suppression de etudiant e2 :");
        e.displayEtudiants();


        e.supprimerEtudiant(e2);
        System.out.println("Liste etudiant apres suppression de etudiant e2 :");
        e.displayEtudiants();
        System.out.println("Resultat tri liste par ID :");
        e.trierEtudiantsParId();
        e.displayEtudiants();
        System.out.println("Resultat tri liste par Nom :");
//        e.trierEtudiantsParNom();
        e.displayEtudiants();

        System.out.println("Recherche si e2 existe dans la liste :");
        System.out.println(e.rechercherEtudiant(e2));





    }
}
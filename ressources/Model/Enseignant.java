
import java.util.*;
import java.util.Scanner;


/**
 * 
 */
public class Enseignant extends Utilisateur {

    /**
     * Default constructor
     */
    public Enseignant(int numem, int numHarpege) {
        super();
        this.numem = numem;
        this.numHarpege = numHarpege;
    }

    /**
     * 
     */
    private int numem;

    /**
     * 
     */
    private int numHarpege;



    /**
     * @param cours 
     * @return
     */
    public Devoir creerDevoir(Cours cours) {

        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Veuillez saisir un nom de devoir :");
        String nom = saisieUtilisateur.next();
        System.out.println("Veuillez saisir les consignes :");
        String consignes = saisieUtilisateur.next();
        System.out.println("Veuillez saisir une note :");
        int ent = saisieUtilisateur.nextInt();
        Devoir devoir = new Devoir(nom, consignes, LocalDate.now(), ent);

        cours.setDevoirs(devoir);

        return devoir;
    }

    /**
     * @param rendu
     */
    public void noter(Rendu rendu) {
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Veuillez saisir une note :");
        int ent = saisieUtilisateur.nextInt();
        rendu.setPoints(ent);
    }

}
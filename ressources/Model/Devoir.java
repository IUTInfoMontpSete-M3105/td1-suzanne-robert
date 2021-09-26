
import java.util.*;

/**
 * 
 */
public class Devoir {

    /**
     * Default constructor
     */
    public Devoir(String nom, String consignes, Date deadline, int points) {
        this.nom = nom;
        this.consignes = consignes;
        this.deadline = deadline;
        this.points = points;
    }

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String consignes;

    /**
     * 
     */
    private Date deadline;

    /**
     * 
     */
    private int points;

    /**
     * @param e
     */
    public void createRendu(Etudiant e) {
        // TODO implement here
    }

    public String getNom() {
        return nom;
    }
}
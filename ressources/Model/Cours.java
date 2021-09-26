
import java.util.*;

/**
 * 
 */
public class Cours {

    /**
     * Default constructor
     */
    public Cours(String nom, int semestre) {
        this.nom = nom;
        this.semestre = semestre;
    }

    /**
     * 
     */
    private Sring nom;

    /**
     * 
     */
    private int semestre;
    
    private static ArrayList<Devoir> devoirs = new ArrayList<Devoir>();

    public static void setDevoirs(Devoir devoir) {
        devoirs.add(devoir);
    }

    /**
     * @return
     */
    public String getDevoir() {
        String string = "";
        for (Devoir devoir: devoirs) {
            string += " " + devoir.getNom();
        }
        return string;
    }

}
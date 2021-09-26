
import java.util.*;

/**
 * 
 */
public class Rendu {

    /**
     * Default constructor
     */
    public Rendu(String document, Date dateRendu, int points) {
        this.document = document;
        this.dateRendu = dateRendu;
        this.points = points;
    }

    /**
     * 
     */
    private String document;

    /**
     * 
     */
    private Date dateRendu;

    /**
     * 
     */
    private int points;



    /**
     * 
     */
    public void uploadDocument() {
        // TODO implement here
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
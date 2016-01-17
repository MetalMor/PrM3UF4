package practica.m3uf4;

/**
 *
 * 301015
 * @author mor
 */
public class Aliment {
    
    private String nom;
    private TipusAliment tipus;
    
    public Aliment() {
        
    }
    
    public Aliment(String n, TipusAliment t) {
        this.nom = n;
        this.tipus = t;
    }
    
    /*
     * ** GETTERS **
     */
    
    public String getTipus() {
        return tipus.toString();
    }

    public String getNom() {
        return nom;
    }
    
    
    
    /*
     * ** SETTERS **
     */
    
    public void setTipusAliment(TipusAliment t) {
        tipus = t;
    }
    
    @Override
    public String toString() {
        return nom;
    }
    
}

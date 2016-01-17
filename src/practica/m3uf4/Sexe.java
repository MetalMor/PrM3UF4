package practica.m3uf4;

/**
 *
 * 301015
 * @author mor
 */
public enum Sexe {
    
    M("Masculí"),
    F("Femení"),
    X("Altre");
    
    private final String description;
    
    private Sexe(String d) {
        description = d;
    }
    
    /*
     * ** GETTERS **
     */
    
    protected String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
    
    
    
}

package practica.m3uf4;

/**
 *
 * 051115
 * @author mor
 */
public enum TipusAliment {
    
    C("Carn"),
    P("Peix"),
    V("Vegetal"),
    I("Insectes");
    
    
    private final String description;
    
    private TipusAliment(String d) {
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

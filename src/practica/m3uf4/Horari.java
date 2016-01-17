package practica.m3uf4;

/**
 *
 * 301015
 * @author mor
 */
public enum Horari {
    
    DIA("7.00 - 18.59"),
    NIT("19.00 - 6.59");
    
    private String description;
    
    private Horari(String d) {
        description = d;
    }
    
    /*
     * ** GETTERS **
     */
    
    protected String getDescription() {
        return description;
    }
    
}

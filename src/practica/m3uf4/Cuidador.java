package practica.m3uf4;

import java.util.ArrayList;

/**
 *
 * 301015
 * @author mor
 */
public class Cuidador extends Personal {
    
    private Horari horari;
    private ArrayList<Aliment> aliments;

    public Cuidador(String n, String dni, int t, Animal esp, Sexe sx, int e, float s, Horari h) {
        super(n, dni, t, esp, sx, e, s);
        horari = h;
    }
    
    @Override
    public String toString() {
        return "Cuidador "+super.toString();
    }
    
    /*
     * ** GETTERS **
     */
    
    public Horari getHorari() {
        return horari;
    }
    
    public ArrayList<Aliment> getAliments() {
        return aliments;
    }
    
    /*
     * ** SETTERS **
     */
    
    public void setHorari(Horari h) {
        horari = h;
    }
    
    public void setAliments(Aliment a) {
        aliments.add(a);
    }
    
}

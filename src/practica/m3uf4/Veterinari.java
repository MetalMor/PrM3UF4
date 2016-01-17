package practica.m3uf4;

import java.util.ArrayList;

/**
 *
 * 301015
 * @author mor
 */
public class Veterinari extends Personal {
    
    private int dept;
    private Veterinari cap;

    public Veterinari(String n, String dni, int t, Animal esp, Sexe sx, int e, float s, int dept, Veterinari cap) {
        super(n, dni, t, esp, sx, e, s);
        this.dept = dept;
        this.cap = cap;
    }
    
    @Override
    public String toString() {
        return "Veterinari "+super.toString();
    }
    
    /*
     * ** GETTERS **
     */
    
    public int getDept() {
        return dept;
    }
    
    public Veterinari getCap() {
        return cap;
    }
    
    /*
     * ** SETTERS **
     */
    
    public void setDept(int d) {
        dept = d;
    }
    
    public void setCap(Veterinari v) {
        cap = v;
    }
    
}

package practica.m3uf4;

import java.util.ArrayList;

/**
 *
 * 301015
 * @author mor
 */
public class Carnivor extends Animal {
    
    private int gabia;

    public Carnivor() {
        
    }

    public Carnivor(int gabia, String nom, int id, String especie, Sexe sexe, String classe, boolean reproduccio, int edat, ArrayList<Aliment> alimentacio) {
        
        super(nom, id, especie, sexe, classe, reproduccio, edat, alimentacio);
        this.gabia = gabia;
        
    }
    
    public void menjar(Aliment a) {
        
        if (a.getTipus().equals("Carn") || 
                a.getTipus().equals("Peix"))
            System.out.println("El " + this + " ha menjat " + a + '.');
        
        else System.out.println("El " + this + " no vol " + a + '.');
        
    }
    
}

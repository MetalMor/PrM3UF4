package practica.m3uf4;

import java.util.ArrayList;

/**
 *
 * @author mor
 */
public class Herbivor extends Animal {
    
    private static int zona = 25;
    
    public void menjar(Aliment a) {
        if (a.getTipus().equals("Vegetal")) System.out.println("El " + this + " ha menjat " + a + '.');
        else System.out.println("El " + this + " no vol " + a + '.');
    }

    public Herbivor() {
        
    }

    public Herbivor(String nom, int id, String especie, Sexe sexe, String classe, boolean reproduccio, int edat, ArrayList<Aliment> alimentacio) {
        
        super(nom, id, especie, sexe, classe, reproduccio, edat, alimentacio);
        
    }
    
    
    
}

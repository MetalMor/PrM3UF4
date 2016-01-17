package practica.m3uf4;

import java.util.ArrayList;

/**
 *
 * 301015
 * @author mor
 */
public class Omnivor extends Animal {
    
    private static int zona;
    private int gabia;
    private boolean agressivitat;

    public Omnivor() {
        
    }

    public Omnivor(boolean agressivitat, String nom, int id, String especie, Sexe sexe, String classe, boolean reproduccio, int edat, ArrayList<Aliment> alimentacio) {
        super(nom, id, especie, sexe, classe, reproduccio, edat, alimentacio);
        this.gabia = gabia;
        this.agressivitat = agressivitat;
        
        if (this.agressivitat == true)
            this.setGabia(this.getId()/10); // asigna num de gabia si el animal es agresivo con otros (?)
        
    }
    
    public void menjar(Aliment a) {
        System.out.println("El " + this + " ha menjat " + a + '.');
    }

    public static int getZona() {
        return zona;
    }

    public int getGabia() {
        return gabia;
    }

    public boolean isAgressivitat() {
        return agressivitat;
    }

    public void setGabia(int gabia) {
        this.gabia = gabia;
    }
    
    
    
}

package practica.m3uf4;

import java.util.*;

/**
 *
 * 301015
 * @author mor
 */
public abstract class Animal implements AnimalOps {
    
    private String nom;
    private int id;
    private String especie;
    private Sexe sexe;
    private String classe;
    private boolean reproduccio;
    private int edat;
    private ArrayList<Aliment> alimentacio;

    public Animal() {
        
    }
    
    public Animal(String nom, int id, String especie, Sexe sexe, String classe, boolean reproduccio, int edat, ArrayList<Aliment> alimentacio) {
        this.nom = nom;
        this.id = id;
        this.especie = especie;
        this.sexe = sexe;
        this.classe = classe;
        this.reproduccio = reproduccio;
        this.edat = edat;
        this.alimentacio = alimentacio;
    }
    
    
    
    @Override
    public String toString() {
        return this.especie+" "+this.nom;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if(obj == null)
            return false;
        if(!(obj instanceof Animal))
            return false;
        
        Animal other = (Animal) obj;
        if(other.id == this.id)
            return true;
        return false;
        
    }
    
    public abstract void menjar(Aliment a);
    
    public void reproduirse() {
        
        if (this.sexe.getDescription().equals("Femení")) {
            
            if (this.reproduccio == true)
                System.out.println("La " + this + " s'ha reproduit.");
            
        }
        
        else if(this.sexe.getDescription().equals("Altre"))
            System.out.println("El " + this + " s'ha reproduit asexualment");
        
        else System.out.println("El " + this + " no sa pot reproduir :(");
        
    }
    
    /*
     * ** GETTERS **
     */
    
    public String getNom() {
        return nom;
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public int getId() {
        return id;
    }
    
    public String getAlimentacio() {
        
        String str = null;
        for(Aliment a:alimentacio)
            str = str+a.getNom()+", ";
        
        return str;
        
    }    
    
    
}

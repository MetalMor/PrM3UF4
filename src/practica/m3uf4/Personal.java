package practica.m3uf4;

/**
 *
 * 301015
 * @author mor
 */
public class Personal {
    
    private String nom;
    private String DNI;
    private int tel;
    private Animal especialitzacio;
    private Sexe sexe;
    private int edat;
    private float sou;
    
    public Personal(String n, String dni, int t, Animal esp, Sexe sx, int e, float s) {
        nom = n;
        DNI = dni;
        especialitzacio = esp;
        tel = t;
        sexe = sx;
        edat = e;
        sou = s;
    }
    
    public String mostrarDades() {
        
        return "Nom: "+this.getNom()+
                " // DNI: "+this.getDNI()+
                " // Telèfon: "+this.getTel()+
                " // Especialitat: "+this.getEspecialitzacio()+
                " // Sexe: "+this.getSexe()+
                " // Edat: "+this.getEdat()+
                " // Sou: "+this.getSou();
        
    }
    
    @Override
    public String toString() {
        return this.getNom()+"("+this.getDNI()+").";
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if (obj == null) return false;
        
        if (!(obj instanceof Personal)) return false;
        
        Personal other = (Personal) obj;
        if (this.DNI.equals(other.DNI)) return true;
        return false;
        
    }
    
    /*
     * ** GETTERS **
     */
    
    public String getNom() {
        return nom;
    }

    public String getDNI() {
        return DNI;
    }

    public int getTel() {
        return tel;
    }

    public Animal getEspecialitzacio() {
        return especialitzacio;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public int getEdat() {
        return edat;
    }

    public float getSou() {
        return sou;
    }
    
    /*
     * ** SETTERS **
     */

    public void setNom(String n) {
        nom = n;
    }

    public void setDNI(String dni) {
        DNI = dni;
    }

    public void setTel(int t) {
        tel = t;
    }

    public void setEspecialitzacio(Animal esp) {
        especialitzacio = esp;
    }

    public void setSexe(Sexe s) {
        sexe = s;
    }

    public void setEdat(int e) {
        edat = e;
    }

    public void setSou(float s) {
        sou = s;
    }
    
}

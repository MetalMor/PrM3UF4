package practica.m3uf4;

import java.lang.reflect.Array;
import java.util.*;

/**
 *
 * 301015
 * @author mor
 */
public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Aliment> arrayAliments1 = new ArrayList<>();
        ArrayList<Aliment> arrayAliments2 = new ArrayList<>();
        ArrayList<Aliment> arrayAliments3 = new ArrayList<>();
        ArrayList<Aliment> arrayAliments4 = new ArrayList<>();
        
        Aliment a1 = new Aliment("pollo",TipusAliment.C);
        Aliment a2 = new Aliment("lechuga",TipusAliment.V);
        Aliment a3 = new Aliment("sardina",TipusAliment.P);
        Aliment a4 = new Aliment("zanahoria",TipusAliment.V);
        Aliment a5 = new Aliment("moscas",TipusAliment.I);
        Aliment a6 = new Aliment("gambas",TipusAliment.P);
        Aliment a7 = new Aliment("ternera",TipusAliment.C);
        Aliment a8 = new Aliment("grillos",TipusAliment.I);
        
        arrayAliments1.add(a1);
        arrayAliments1.add(a7);
        
        arrayAliments2.add(a2);
        arrayAliments2.add(a4);
        
        arrayAliments3.add(a3);
        arrayAliments3.add(a6);
        
        arrayAliments4.add(a5);
        arrayAliments4.add(a8);
        
        Animal x1 = new Carnivor(13, "pepito", 666, "tigre", Sexe.M, "mamifero", true, 3, arrayAliments1);
        Animal x2 = new Carnivor(13, "juanita", 333, "tigre", Sexe.F, "mamifero", true, 4, arrayAliments1);
        Animal x3 = new Herbivor("naranjita", 42, "armadillo", Sexe.F, "mamifero", true, 1, arrayAliments2);
        Animal x4 = new Herbivor("johnny", 41, "armadillo", Sexe.M, "mamifero", true, 1, arrayAliments2);
        Animal x5 = new Omnivor(false, "paca", 87, "cerdo", Sexe.F, "mamifero", true, 5, arrayAliments1);
        Animal x6 = new Omnivor(false, "manolo", 87, "cerdo", Sexe.M, "mamifero", true, 5, arrayAliments2);
        Animal x7 = new Omnivor(true, "gigatron", 87, "oso", Sexe.M, "mamifero", true, 5, arrayAliments3);
        
        
        x1.menjar(a5);
        x1.menjar(a1);
        
        x2.reproduirse();
        x1.reproduirse();
        
        
        Personal p4 = new Veterinari("Petadora", "66666666S", 666666666, x4, Sexe.F, 50, 3000, 1, null);
        Personal p1 = new Veterinari("Derp", "2173394K", 634228791, x1, Sexe.M, 25, 1000, 4, (Veterinari) p4);
        Personal p2 = new Veterinari("Mung", "7228992P", 679821453, x2, Sexe.M, 30, 1000, 8, (Veterinari) p4);
        Personal p3 = new Veterinari("Guachupina", "35694782G", 741558887, x3, Sexe.F, 20, 750, 3, (Veterinari) p4);
        Personal p5 = new Veterinari("Peskao", "12345678A", 699874225, x5, Sexe.M, 30, 1000, 3, (Veterinari) p4);
        Personal p6 = new Veterinari("Chichorina", "56991437Q", 677412769, x6, Sexe.F, 40, 1200, 2, (Veterinari) p4);
        
        Personal p7 = new Cuidador("Rodolfo", "93321472J", 622010971, x1, Sexe.M, 18, 1800, Horari.NIT);
        Personal p8 = new Cuidador("Estupendiviris", "77491633F", 621110897, x7, Sexe.F, 37, 1200, Horari.DIA);
        Personal p9 = new Cuidador("Gallarda", "41538872D", 937442898, x4, Sexe.F, 65, 1200, Horari.DIA);
                
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);
        System.out.println(p8);
        System.out.println(p9);
        
    }
    
}

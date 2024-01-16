//Mohamed Camara
//DBE

import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

public class Ex22{
     //methode d'addition
    public static int somme(int[] tab) {
        int somme =0;

        for (int valeur : tab) {
            somme += valeur;
        }

        return somme;
    }
    
    public static void main(String[] args) {
      //Element du tableau
        int[] tableau = {3, 6, 9};

        int resultat = somme(tableau);

        System.out.println("Somme total : " + resultat);
    }

}

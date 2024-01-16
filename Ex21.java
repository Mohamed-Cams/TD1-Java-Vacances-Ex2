//Mohamed Camara
//DBE

import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

public class Ex21{

    //Methode Creation tableau
    public static int[] Tableau(int n){

        int[]tableau = new int[n];
        int i;

        for (i=0 ; i<n ; i++){

            tableau[i]= i+1;

        }

        return tableau;
    }
    
    //Main
    public static void main (String[] args){
       //Taille Tableau
        int n=3;
        int i;

        int []Resultat = Tableau(n);

        for(i=0 ; i<Resultat.length ; i++){

            System.out.print(Resultat[i] + " ");

    }
}
}

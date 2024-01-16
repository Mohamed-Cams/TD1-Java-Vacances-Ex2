//Mohamed Camara
//DBE

import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

public class Ex23{
    //methode d'incrémentation
    public static void incrementer(int[] tab){

        for (int i=0; i<tab.length; i++){

            tab[i]= tab[i]+1;

        }

    }

    public static void main(String[] args){

        int[]tableau= {3,6,9,15};
        //avant l'incrémentaion
        System.out.println("Avant : "+Arrays.toString(tableau));

        incrementer(tableau);
        //aprés l'incrementaion
        System.out.println("Après : "+Arrays.toString(tableau));

    }

}
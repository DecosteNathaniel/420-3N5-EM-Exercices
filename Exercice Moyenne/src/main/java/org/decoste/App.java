package org.decoste;

import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        int[] TabloRan = new int[100];
        int min = 0;
        int max = TabloRan.length - 1;
        for (int i = 0; i <= max-1; i++){
            int random = (int)Math.floor(Math.random()*(max-min+1)+min);
            TabloRan[i] = random;
        }

        long somme = 0;
        for (int i = 0; i < TabloRan.length; i++){
            somme+= TabloRan[i];
        }
        System.out.println("Le somme est : "+somme);

        long moyenne;
        moyenne = somme / max;
        System.out.println("La moyenne est : "+moyenne);

        System.out.println("Le min est : "+min);
        System.out.println("Le max est : "+max);
    }
}

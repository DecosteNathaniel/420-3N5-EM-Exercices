package org.decoste;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int hauteur = Integer.parseInt(args[0]);

        int nbespace = hauteur-1;
        int nbetoiles = 1;

        for (int ligne = 1; ligne <= hauteur; ligne++){
            for (int i = 1; i <= nbespace; i++){System.out.print(" ");}
            nbespace--;

            for (int i = 1; i <= nbetoiles; i++){System.out.print("*");}
            nbetoiles+=2;
            System.out.println();
        }
    }
}

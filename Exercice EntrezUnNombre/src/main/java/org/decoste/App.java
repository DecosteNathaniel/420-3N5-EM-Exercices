package org.decoste;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre:");

        while(scanner.hasNext() && !scanner.hasNextInt()){
            System.out.println("Ceci n’est pas un nombre, veuillez entrer un nombre:");
            scanner.next();
        }
        int nb = scanner.nextInt();
        System.out.println("Merci votre nombre est: " + nb);
    }
}

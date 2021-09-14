package org.decoste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {

        String texte = "";
        for (int i = 0; i == args.length; i++){
            File myObj = new File(args[i]);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                texte += data;
            }
            texte += "-------------------";
        }

        System.out.println(texte);
    }
}

package org.exercicetriangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String message = "*";
        for ( int i = 0; i < Integer.parseInt(args[0]); i++)
        {
            System.out.println(message);
            message+= "*";
        }
    }
}

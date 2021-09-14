package org.decoste;


import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        Truc a = new Truc(1235, "awdadsadaw");
        Truc b = new Truc(123456, "lolxd");
        Truc c = new Truc(987654, "bye");

        List<Truc> liste1 = new ArrayList<Truc>();
        liste1.add(a);
        liste1.add(b);
        liste1.add(c);

        List<Truc> liste2 = new ArrayList<Truc>();
        liste2.add(b);
        liste2.add(c);
        liste2.add(a);

        a = b;

        System.out.println(liste1.toString() + liste2.toString());
    }
}

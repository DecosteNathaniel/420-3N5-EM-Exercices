package org.decoste;

public class Truc {
    int pipo;
    String popi;

    public Truc(int a, String b){
        pipo = a;
        popi = b;
    }


    @Override
    public String toString() {
        return "pipo = " + pipo +
                "     popi = " + popi;
    }
}

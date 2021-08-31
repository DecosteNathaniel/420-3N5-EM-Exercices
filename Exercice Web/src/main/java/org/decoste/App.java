package org.decoste;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class App 
{
    public static void main( String[] args )
    {
        Document doc = null;
        try {
            doc = Jsoup.connect(args[0]).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String html = doc.html();
        System.out.print(html);
    }
}

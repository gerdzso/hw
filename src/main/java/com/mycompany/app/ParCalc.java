package com.mycompany.app;

import java.lang.Math;
import java.text.DecimalFormat;

/**
* Paraméterek (sugár, kerület) kiszámításáért felelős osztály
*/
public class ParCalc{

    private static Double radius = null;
    public static Double getRadius(){return radius;}

    private static Double area = null;
    /**
    /* Terület kiszámítását végző függvény, az eredményt belső változóban tárolja
    /* @param void
    /* @return void
    */
    public static Double getArea(){
        if (area == null){area = Math.PI * Math.pow(radius,2);}
        return area;
    }

    private static Double girth = null;
    /**
    /* Kerület kiszámítását végző függvény, az eredményt belső változóban tárolja
    /* @param void
    /* @return void
    */
    public static Double getGirth(){
        if (girth == null){girth = 2 * radius * Math.PI;}
        return girth;
    }

    /**
    * Osztály konstruktora
    */
    public ParCalc(){}

    /**
    /* Az inputot ellenőrzi, hogy potenciálisan sugár-e
    /* @param input String
    /* @return void
    */
    public static void parseRadius(String input) throws RadiusFormatException{
        radius = Double.parseDouble(input);
        // cache törlése
        area = null; girth = null;
        if (radius.isNaN()){radius = null; throw new RadiusFormatException();}
        else if (radius.isInfinite()){radius = null; throw new RadiusFormatException();}
        else if (radius <= 0){radius = null; throw new RadiusFormatException();}
    }

}

package com.mycompany.app;

import java.util.*;

/**
* Nyelvi beállításokért felelős osztály
*/
public class LangSet{

private ResourceBundle messages;

public String s0;
public String s1;
public String s2;
public String s3;
public String se;

private int lan;
/**
* Megfelelő nyelvű mondatokat válogat össze
* @param inp nyelvi kód: 0 esetén angol; 1 esetén magyar
* @return void
*/
public void setLan(int inp){

    lan = inp;
    String language = "";
    String country = "";
    if (lan == 0){
        language = new String("us");
        country = new String("US");
    } else {
        language = new String("hu");
        country = new String("HU");
    }

    Locale currentLocale = new Locale(language, country);
    messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
    s0 = messages.getString("s0");
    s1 = messages.getString("s1");
    s2 = messages.getString("s2");
    s3 = messages.getString("s3");
    se = messages.getString("se");

}

/**
* Osztály Konstruktora
*/
public LangSet(){}

}

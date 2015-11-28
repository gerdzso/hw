package com.mycompany.app;

import java.lang.Math;
import java.text.DecimalFormat;

public class ParCalc{

private static double radius = 0;
public static boolean isNumb = false;
public ParCalc(){

	//while(!isNumb){
	//	System.out.print("Enter the radius of your circle: ");
	//	String input = System.console().readLine();
	//	System.out.println(isNumber(input));
	//	if(isNumb){System.out.println(params(radius));}
	//	System.out.println("%%%%%%%%%%");
	//}

}

public static String isNumber(String input){
	String out;
	try{
	if(input.equals("NaN")||input.equals("Infinity")||input.equals("-Infinity")){input = "bla";}
	radius = Double.parseDouble(input);
	isNumb = true;
	out = "The given radius: " + input;
	} catch (Exception e){
            if(input==null){out="";} else {out = "The given input is not a number! Try again"; isNumb=false;}
        }
	return out;
}

public static String params(){
	String out;
	DecimalFormat formatter = new DecimalFormat("#0.00");
	double girth = 0;
	double area = 0;
        if (isNumb){
	    if (radius > 0){
		area = Math.PI * Math.pow(radius,2);
		girth = 2 * radius * Math.PI;
		out = "The area of the circle: " + String.valueOf(formatter.format(area)) + "\n";
		out = out + "The girth of the circle: " + String.valueOf(formatter.format(girth));
	    } else {out = "The given number must be higher than 0! Try again!"; isNumb = false;}
        } else {out = "";}
	return out;
}

}

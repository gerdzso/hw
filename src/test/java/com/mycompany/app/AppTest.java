package com.mycompany.app;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){
        //Assert.assertEquals(ParCalc.parseRadius("bla"), "The given input is not a number! Try again");
        //Assert.assertEquals(ParCalc.isNumber("1"), "The given radius: 1");
	//Assert.assertEquals(ParCalc.isNumber("NaN"), "The given input is not a number! Try again");
	//Assert.assertEquals(ParCalc.isNumber("Infinity"), "The given input is not a number! Try again");
	//Assert.assertEquals(ParCalc.isNumber("-Infinity"), "The given input is not a number! Try again");
    }

//    public void testApp2(){
//	Assert.assertEquals(ParCalc.params(1.0), "The area of the circle: 3.14" + "\n" + "The girth of the circle: 6.28");
//	Assert.assertEquals(ParCalc.params(0), "The given number must be higher than 0! Try again!");
//	Assert.assertEquals(ParCalc.params(-1.2), "The given number must be higher than 0! Try again!");
//    }
}

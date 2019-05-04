package com.isortegah.funcional;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SumaTest{

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "fast" })
    public void sumaTest() {
        int x = 10;
        int y = 5;
        SumaInterfaz sumaLambda = (a, b) -> {
            System.out.println(a + b);
        };
        sumaLambda.suma(x,y);
    }

}
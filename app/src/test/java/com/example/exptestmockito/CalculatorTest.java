package com.example.exptestmockito;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CalculatorTest {

//Le test ne peut pas être effectué car l'interfece calculatorService
 //  n'est pas encore implémentée.
    //méthode 1
    //Créer un objet
  /*  calculatorService calcSce= new calculatorService() {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
    @Override
    public int multiply(int a, int b) {
        return 0;
    }
}

   */
//méthode 2
//créer un moke avec le framework Mockito
    //un moke il simule qq chose c'est un fake objet
Calculator c= null;
@Mock

calculatorService calcSce = Mockito.mock(calculatorService.class);
    @Before
    public void setUp() throws Exception {
        c=new Calculator(calcSce);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void methode1Test() {
        Mockito.when(calcSce.add(4,3)).thenReturn(7);
        assertEquals(27,c.method1(4,3));
        }
    @Test
    public void method2Test() {
        Mockito.when(calcSce.multiply(4,3)).thenReturn(12);
        assertEquals(24,c.method2(4,3));
    }
}
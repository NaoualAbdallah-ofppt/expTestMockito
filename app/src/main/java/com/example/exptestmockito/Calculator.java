package com.example.exptestmockito;

public class Calculator {
    calculatorService calcSce;

    public Calculator(calculatorService calcSce) {
        this.calcSce = calcSce;
    }

    public int method1 (int a, int b)
    {
        //on utilise le résultat de la méthode add auquel
        // on rajoute 20
        return  calcSce.add(a,b) + 20;
    }
    public int method2(int a, int b)
    {
        //on utilise le résultat de la méthode multiply et on
        // le multiplie par 2
        return  calcSce.multiply(a,b)*2;
    }
}

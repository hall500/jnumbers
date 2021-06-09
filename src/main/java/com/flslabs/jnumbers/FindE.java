/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flslabs.jnumbers;

import java.lang.Double;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author HALL
 */
public class FindE {
    /**
     * Develop a program that has the user enter a number. Your program
     * should then print out 'e' up to that many decimal places. Keep a limit 
     * as to how far the program will go.
     */
    public void run(int n){
        System.out.println("Find E Program starting on JNumber");
        System.out.println("Finding E to the Nth Number");
        System.out.println(this.toNth(n));
        System.out.println("Find E Program ending on JNumber");
    }
    
    public String toNth(int places){
        if(places > 34) throw new IllegalArgumentException();
        FactorialFinder ff = new FactorialFinder();
        BigDecimal euler  = new BigDecimal(1);
        for(int i = 1; i <= 20; i++){
            int factorial = ff.recursion(i);
            BigDecimal divideBy = new BigDecimal(factorial);
            BigDecimal val = new BigDecimal(1).divide(divideBy, MathContext.DECIMAL128);
            euler = euler.add(val, MathContext.DECIMAL128);
        }
        euler = euler.setScale(places, RoundingMode.HALF_UP);
        return euler.toPlainString();
    }
}

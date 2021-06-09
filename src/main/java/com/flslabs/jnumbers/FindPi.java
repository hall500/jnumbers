/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flslabs.jnumbers;

import java.lang.Double;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
/**
 *
 * @author HALL
 */
public class FindPi {
    /**
     * Develop a program that has the user enter a number.Your program should 
 print out PI up to that many decimal places. Try to keep a limit as to
 how far the program will go.
     * @param n
     */
    public void run(int n){
        System.out.println("Find PI Program starting on JNumber");
        System.out.println("PI to Nth decimal place");
        System.out.println(this.toNth(n));
        System.out.println("Find PI Program ending on JNumber");
    }
    
    /**
     *
     * @param places
     * @return String
     */
    public String toNth(int places){
        if(places > 34) places = 34;
        BigDecimal upperBound = new BigDecimal(22);
        BigDecimal lowerBound = new BigDecimal(7);
        BigDecimal pi = upperBound.divide(lowerBound, MathContext.DECIMAL128);
        pi = pi.setScale(places, RoundingMode.HALF_UP);
        return pi.toPlainString();
    }
}

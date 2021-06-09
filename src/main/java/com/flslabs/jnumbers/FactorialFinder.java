/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flslabs.jnumbers;

/**
 *
 * @author HALL
 */
public class FactorialFinder {
    /**
     * The factorial of a positive integer n, is defined as the product of the 
     * sequence n, n-1, n-2, ...1. Also the factorial of zero, 0, is defined as
     * being 1. Develop a program that solves the factorial of any user given 
     * number using both loops and recursion.
     */
    public int loops(int n){
        int product = 1;
        while(n > 0){
            product *= n;
            --n;
        }
        return product;
    }
    
    public int recursion(int n){
        if(n < 1) return 1;
        else return n * recursion(n - 1);
    }
    
    public void run(int n){
        System.out.println("Factorial Finder Program is starting on JNumbers");
        System.out.println("Printing with Loops");
        System.out.println(this.loops(n));
        System.out.println("Printing with recursion");
        System.out.println(this.recursion(n));
        System.out.println("Factorial Finder Program is ending on JNumbers");
    }
}

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
public class ChangeReturn {
    /**
     * Develop a program that has the user enter the cost of an item and then 
     * the amount the amount the user paid for the item. Your program should 
     * figure out the change and the number of quarters, dimes, nickels, pennies
     * needed for change
     **/
    
    public Change[] init(){
        Change dollars = new Change("dollars", 100);
        Change quarters = new Change("quarters", 25);
        Change dimes = new Change("dimes", 10);
        Change nickels = new Change("nickels", 5);
        Change pennies = new Change("pennies", 4);
        Change cents = new Change("cents", 1);
        Change[] coins = { dollars, quarters, dimes, nickels, pennies, cents };
        return coins;
    }
    
    public void run(int costOfItems, int totalPaid){
        System.out.println("Start of Change Return Program on JNumbers");
        int difference;
        if(totalPaid < costOfItems){
            difference = costOfItems - totalPaid;
            System.out.println("You underpaid");
            System.out.println("You need to balance " + difference);
            return;
        }
        
        Change[] coins = init();
        difference = totalPaid - costOfItems;
        int i = 0;
        while(difference > 0 && i < 5){
            difference = coins[i].compute(difference);
            if(coins[i].hasChange()) System.out.println(coins[i].toString());
            i++;
        }
        System.out.println("End of Change Return Program on JNumbers");
    }
}

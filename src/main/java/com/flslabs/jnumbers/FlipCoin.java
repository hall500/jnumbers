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
public class FlipCoin {
    /**
     * Write some code that simulates flipping a single coin however many
     * times the user decides. The code should record the outcomes and count
     * the number of tails and heads.
     */
    public void run(int numOfFlips){
        System.out.println("Start of Coin Flip Program on JNumbers");
        Flip fp = new Flip();
        while(numOfFlips > 0){
            fp.nextFlip();
            --numOfFlips;
        }
        
        System.out.println("Number of Heads: " + fp.getHeads());
        System.out.println("Number of Tails: " + fp.getTails());
        System.out.println("Outcomes: " + fp.toString());
        System.out.println("End of Coin Flip Program on JNumbers");
    }
}

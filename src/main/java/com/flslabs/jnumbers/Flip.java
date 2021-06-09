/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flslabs.jnumbers;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author HALL
 */
public class Flip {
    private int heads;
    private int tails;
    private ArrayList<String> outcomes = new ArrayList<String>();
    
    public void nextFlip(){
        Random rand = new Random();
        int num = rand.nextInt(2);
        if(num == 1){
            this.heads++;
            this.outcomes.add("H");
        }else{
            this.tails++;
            this.outcomes.add("T");
        }
    }
    
    public int getHeads(){
        return this.heads;
    }
    
    public int getTails(){
        return this.tails;
    }
    
    public int total(){
        return this.outcomes.size();
    }
    
    @Override
    public String toString(){
        String[] arr = {};
        arr = this.outcomes.toArray(arr);
        return Arrays.toString(arr);
    }
}

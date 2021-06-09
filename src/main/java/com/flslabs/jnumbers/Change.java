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
public class Change {
    String name;
    int available;
    int worth;
    
    public Change(String name, int worth){
        this.name = name;
        this.worth = worth;
    }
    
    public int compute(int total){
        this.available = (int) total / this.worth;
        return (int) (total % this.worth);
    }
    
    public int getChange(){
        return this.available;
    }
    
    public boolean hasChange(){
        return this.available > 0;
    }
    
    @Override
    public String toString(){
        return "Give out " + this.available + " - " + this.name;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author hoang
 */
public abstract class Beverage {
    String description;

    public String getDescription() {
        return description;
    }
    
    public abstract double cost();

    @Override
    public String toString() {
        return this.description + ": $" + cost();
    }
    
    
}

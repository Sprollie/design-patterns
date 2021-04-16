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
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage = new  Espresso();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        System.out.println(beverage);
    }
    
}

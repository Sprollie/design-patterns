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
public class NoCommand implements Command {

    public NoCommand() {
    }

    @Override
    public void execute() {
        System.out.println("No action was performed!");
    }

    @Override
    public void undo() {
        System.out.println("No action was performed!");
    }
    
}

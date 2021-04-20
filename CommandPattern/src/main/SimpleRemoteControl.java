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
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {}

    public void setSlot(Command slot) {
        this.slot = slot;
    }
    
    public void buttonWasPressed(){
        slot.execute();
    }

}

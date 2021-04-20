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
public class Light {
    String roomName;

    public Light(String lightName) {
        this.roomName = lightName;
    }
    
    public void on() {
        System.out.println(this.roomName + " light is On");
    }
    
    public void off() {
        System.out.println(this.roomName + " light is Off");
    }
}

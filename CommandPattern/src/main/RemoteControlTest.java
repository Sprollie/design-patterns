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
public class RemoteControlTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenRoomLight = new Light("Kitchen Room");
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
        
        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        
        System.out.println(remote);
        
        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
    }
    
}

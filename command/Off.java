/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author akash
 */
public class Off implements Command{

    Fan fan;
    public Off(Fan fan){
        this.fan=fan;
    }
    
    @Override
    public void execute() {
        fan.off();
    }
    
}

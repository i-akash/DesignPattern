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
public class Main {
    public static void main(String[] args){
        Fan fan =new Fan();
        On on=new On(fan);
        Off off=new Off(fan);
        
        Worker worker=new Worker();
        worker.takeCommand(on);
        worker.takeCommand(off);
        
        
        worker.executeQueue();
        
    }
}

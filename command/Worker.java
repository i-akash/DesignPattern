/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class Worker {
 
    private ArrayList<Command> command;
    public Worker(){
        command=new ArrayList();
    }
    
    public void takeCommand(Command comm){
        command.add(comm);
    }

    public void executeQueue(){
        for(Command com:command){
            com.execute();
        }
    }    
}

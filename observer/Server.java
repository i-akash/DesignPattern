/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class Server {
    private String IP;
    private ArrayList<Observer> observer;  
    public Server(){
        observer=new ArrayList();
        IP="";
    }
    
    
    public String getIP(){
        return IP;
    }
    
    public void  setIP(String IP){
          this.IP=IP;
          notifyClient();
    }
    
    public void attach(Observer client){
        observer.add(client);
    }
    
    public void notifyClient(){
        for(Observer client:observer){
            client.updateIP();
        }
    }
    
}

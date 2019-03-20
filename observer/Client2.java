/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author akash
 */
public class Client2 implements Observer{
    private Server server;
    public Client2(Server server){
        this.server=server;
        this.server.attach(this);
    }
    
    @Override
    public void updateIP() {
           System.out.println("client 2 ---> "+server.getIP());
        }
    
}

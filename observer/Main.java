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
public class Main {
    
   public static void main(String[] args){
   Server server=new Server();
   
   Client1 client1=new Client1(server);
   Client2 client2=new Client2(server);
   
   server.setIP("127.0.0.1");
   server.setIP("192.168.0.110");
    
   } 
  }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author akash
 */
public class Main {
    public static void main(String[] args){
        
        Worker worker=new Worker(new Binary());
        worker.execute(10);
        
        Worker worker1=new Worker(new HexaDecimal());
        worker1.execute(5);
    }
}

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
public class Worker {
    Strategy strategy;
    public Worker(Strategy strategy){
        this.strategy=strategy;
    }
    
    public void execute(Integer num){
        strategy.execute(num);
    }
}

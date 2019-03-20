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
public class Binary implements Strategy{

    @Override
    public void execute(Integer num) {
        System.out.println("binary --> "+Integer.toBinaryString(num));
    }
    
}

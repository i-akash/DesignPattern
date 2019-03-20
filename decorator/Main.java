/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author akash
 */
public class Main {
    
   public static void main(String[] args){
   
       Shape shape=new Filled(new Circle());
       shape.draw();
       
       Shape shape2=new Border(new Circle());
       shape2.draw();
    
   } 
}

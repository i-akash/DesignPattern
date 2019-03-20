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
public class Filled extends ShapeDecorator{

    public Filled(Shape shape) {
        super(shape);
    }

    @Override
    public void decorate() {
        System.out.println("Filled --> ");
    }
    
}

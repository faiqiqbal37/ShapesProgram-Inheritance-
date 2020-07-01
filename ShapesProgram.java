/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesprogram;

/**
 *
 * @author OMEN
 */
public class ShapesProgram {    // This is our test class.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Shape shapearr[] = new Shape[6];  // The address of a child class can be stored in parent class.
        shapearr[0] = new Rectangle();
    shapearr[1] = new Rectangle(10,20);
        shapearr[2] = new Rectangle(10,20,"Yellow",true);
        shapearr[3] = new Square();
        shapearr[4] = new Square(5);
        shapearr[5] = new Square(5, "Purple", false);
        
        for (Shape shapearr1 : shapearr) {
            System.out.println(shapearr1);
        }
        
        
        
        
        
    }
    
}

/* Observation:1 If we remove the no-argument constuctor from the shape class error
pops up during because the no-argument constructor is inherited in child 
classes(rectangle and square) using super keyword. 
*/

/* Observation:2 If we remove all the constructors from each class, except the
two-argument constructor from the Rectangle and Square class an error will emerge
because the no-argument constructor of parent class(shape)
is called in child class(rectangle) which is then further called in the grand-child class(shape).
*/



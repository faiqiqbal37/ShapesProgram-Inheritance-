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
public class Square extends Rectangle {
    public Square(){
        super();
        System.out.println("No Argument Constructor of square class is called.");
    }
    
    public Square(double side){
        super(side,side);
        System.out.println("1 Argument Constructor of square class is called.");
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        System.out.println("3 Argument Constructor of square class is called.");
    }
    
    public double getSide(){
       return super.getLength();
     }
    @Override
    public double getLength(){
        return super.getLength();
    }
    
    @Override
    public double getWidth(){
        return super.getWidth();
    }
    
    @Override
    public String toString(){
        return String.format("A Square with side=%f, which is a subclass of <<", getSide()) + super.toString() + ">>";
    }
    
    
    
    
}

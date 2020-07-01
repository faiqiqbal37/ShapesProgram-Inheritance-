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
public class Rectangle extends Shape {
  
// Instantiating variables    
    private double width = 1.0;
    private double length = 1.0;
    
// Making Constructors
    
    public Rectangle(){
        
        
        super();
        width = 1.0;
        length = 1.0;
        System.out.println("No Argument Constructor of rectangle class is called.");
    }
   
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
        System.out.println("2 Argument Constructor of rectangle class is called.");
    }
    public Rectangle(double width, double length, String color, Boolean filled){
        
       
        super(color, filled);
        this.width = width;
        this.length = length;
        System.out.println("4 Argument Constructor of rectangle class is called."); 
        
    }

    
    // Making Methods
    public double getWidth(){
         return width;
     }
     
     public void setWidth(double width){
         this.width = width;
     }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
     
      @Override
    public double getArea(){
        return length * width;
    }
    
      @Override
    public double getPerimeter(){
        return 2*(length) + 2*(width);
    }
    
      @Override
    public String toString(){
        return String.format("A Rectangle width =<< %f >> and length=<< %f >>, which is a subclass of << ", width, length) + super.toString() + ">>";
    }
    

}
    

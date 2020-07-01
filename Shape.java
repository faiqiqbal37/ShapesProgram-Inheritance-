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
public class Shape {
    
// Instantiating Variables

    private String color = "red";
    private boolean filled = true;

// Making Constructors
    
   public Shape(){
        System.out.println("No Argument Constructor of shape class is called.");
        color = "green";
        filled = true;
        
        
    }
    
    public Shape(String color, boolean filled){
        System.out.println("2 Argument Constructor of shape class is called.");
        this.color = color;
        this.filled = filled;
    }
    
// Making Methods.    
    public String getColor(){
        return color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return filled;
    }
    
    @Override
    public String toString(){
        String status;
        if(filled == true){
            status = "Filled";
        }
        else{
            status = "Not Filled";
        }
        return String.format("A << %s >> Shape with << %s >> color.", status, getColor());
        
    }
   
    public double getArea(){
        return 0;
        
    }
    
    public double getPerimeter(){
        return 0;
    }
}



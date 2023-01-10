/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plattermanagement;

/**
 *
 * @author Sarthak
 */
public class PlateD {    

    private double innerRadius;
    private double outerRadius ;

    public double getInnerRadius() {
        return innerRadius;
    }

    public double getOuterRadius() {
        return outerRadius;
    }
Circle circleInnerRadius;
Circle circleOuterRadius;
    public PlateD(double innerRadius, double outerRadius) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        circleInnerRadius = new Circle(innerRadius);
        circleOuterRadius = new Circle(outerRadius);
    }
    public double getShadedArea(){
        return circleOuterRadius.getCircleArea()- circleInnerRadius.getCircleArea();
    }
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
   }
    




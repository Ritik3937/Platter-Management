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
public class Circle {
    private double radius ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getCircleBoundry() {
        return 2 * 3.14 * radius ;
    }
    public double getCircleArea() {
        return 3.14 * radius * radius ;
    }
    
    
}

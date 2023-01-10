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
public class PlateB {
 private double length;
 private double breadth;
 private double radiusA;
 private double radiusB;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getRadiusA() {
        return radiusA;
    }
    public double getRadiusB() {
        return radiusB;
    }
    Rectangle rectangle ;
    Circle circleA ;
    Circle circleB ;
    

    public PlateB(double length, double breadth, double radiusA, double radiusB) {
        this.length = length;
        this.breadth = breadth;
        this.radiusA = radiusA;
        this.radiusB = radiusB ;
        rectangle = new Rectangle(length,breadth);
        circleA = new Circle(radiusA);
        circleB = new Circle(radiusB);
    }
    
 
    public double getShadedArea() {
        return rectangle.getRectangleArea() - circleA.getCircleArea() - circleB.getCircleArea() ;
    }
       public double getTotalvacantBoundary(){
        return circleA.getCircleBoundry()+circleB.getCircleBoundry();
       }
       public double getTotalVacantArea(){
        return circleA.getCircleArea()+circleB.getCircleArea();
    }
}

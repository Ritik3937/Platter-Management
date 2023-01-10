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
public class PlateA {
    private double length ;
    private double breadth ;
    private double radiusA ;
    private double radiusB ;
    private double radiusC ;

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

    public double getRadiusC() {
        return radiusC;
    }
    
    Rectangle rectangle ;
    Circle circleA ;
    Circle circleB ;
    Circle circleC ;
    public PlateA(double length, double breadth, double radiusA, double radiusB, double radiusC) {
        this.length=length;
        this.breadth=breadth;
        this.radiusA=radiusA;
        this.radiusB=radiusB;
        this.radiusC=radiusC;
        
        
        rectangle = new Rectangle(length, breadth);
        circleA = new Circle(radiusA);
        circleB = new Circle(radiusB);
        circleC = new Circle(radiusC);
        
    }
    public double getShadedArea() {
        return rectangle.getRectangleArea() - circleA.getCircleArea() - circleB.getCircleArea() - circleC.getCircleArea();
    }
    public double getTotalvacantBoundary(){
        return circleA.getCircleBoundry()+circleB.getCircleBoundry()+circleC.getCircleBoundry();
    }
    public double getTotalVacantArea(){
        return circleA.getCircleArea()+circleB.getCircleArea()+circleC.getCircleArea();
    }
    
}

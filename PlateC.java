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
public class PlateC {
private double radiusA;
private double side;

    public double getRadiusA() {
        return radiusA;
    }

    public double getSide() {
        return side;
    }
     Square square;
     Circle circleA;
    public PlateC(double side, double radiusA) {
        this.side = side;
        this.radiusA = radiusA;
        
        
        square = new Square(side);
        circleA = new Circle (radiusA);
    }
public double getShadedArea() {
        return square.getSquareArea()- circleA.getCircleArea();
    }
      
}

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
public class PlatterManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*****Plate A *********");
        Rectangle rectangleA = new Rectangle(75,25);
        System.out.println("Plate A Rectangle A  Boundry" + rectangleA.getRectangleBoundry());
        System.out.println("Plate A Rectangle A  Area " + rectangleA.getRectangleArea());
        Circle plateACircleA = new Circle(2);
        System.out.println("Plate A Circle A boundry " + plateACircleA.getCircleBoundry());
        System.out.println("Plate A Circle A Area " + plateACircleA.getCircleArea());
        Circle plateACircleB = new Circle(3);
        System.out.println("Plate A circle B Boundry " + plateACircleB.getCircleBoundry());
        System.out.println("Plate A circle B Area " + plateACircleB.getCircleArea());
        Circle plateACircleC = new Circle(4);
        System.out.println("Plate A circle C Boundry " + plateACircleC.getCircleBoundry());
        System.out.println("Plate A circle C Area " + plateACircleC.getCircleArea());
        PlateA plateA = new PlateA(75, 25, 2, 3, 4);
        plateA.getLength();
        plateA.getBreadth();
        plateA.getRadiusA();
        plateA.getRadiusB();
        plateA.getRadiusC();
        System.out.println("Shaded Area Plate A " + plateA.getShadedArea());
        System.out.println("Total Vacant Boundry " + plateA.getTotalvacantBoundary());
        System.out.println("Total Vacant Area " + plateA.getTotalVacantArea());
        
        System.out.println("*****Plate B*******");
        Rectangle rectangleB = new Rectangle(30, 20);
        System.out.println("Rectangle B  Boundry" + rectangleB.getRectangleBoundry());
        System.out.println("Rectangle B  Area " + rectangleB.getRectangleArea());
        Circle plateBCircleA = new Circle(6);
        System.out.println("Plate B circle A boundry " + plateBCircleA.getCircleBoundry());
        System.out.println("Plate B Circle A area " + plateBCircleA.getCircleArea());
        Circle plateBCircleB = new Circle(4);
        System.out.println("Plate B circle B boundry " + plateBCircleB.getCircleBoundry());
        System.out.println("Plate B Circle B area " + plateBCircleB.getCircleArea());
        PlateB plateB = new PlateB(30, 20, 6, 4);
        plateB.getLength();
        plateB.getBreadth();
        plateB.getRadiusA();
        plateB.getRadiusB();
        System.out.println("Shaded Area Plate B " + plateB.getShadedArea());
        System.out.println("Total Vacant boundry " + plateB.getTotalvacantBoundary());
        System.out.println("Total Vacant Area " + plateB.getTotalVacantArea());
        
        System.out.println("*****Plate C *********");
        Square square = new Square(25);
        System.out.println("Square Boundry " + square.getSquareBoundry());
        System.out.println("Square Area " + square.getSquareArea());
        Circle plateCCircleA = new Circle(5);
        System.out.println("Plate C circle A boundry " + plateCCircleA.getCircleBoundry());
        System.out.println("Plate C circle A Area " + plateCCircleA.getCircleArea());
        PlateC plateC = new PlateC(25, 5);
        plateC.getSide();
        plateC.getRadiusA();
        System.out.println("Shaded Area Plate C " + plateC.getShadedArea());
        
        System.out.println("*****Plate D********");
        Circle innerCircle = new Circle(6);
        System.out.println("Inner Circle Boundry " + innerCircle.getCircleBoundry());
        System.out.println("Inner Circle Area " + innerCircle.getCircleArea());
        Circle outerCircle = new Circle(12);
        System.out.println("Outer Circle Boundry " + outerCircle.getCircleBoundry());
        System.out.println("Outer Circle Area " + outerCircle.getCircleArea());
        PlateD plateD = new PlateD(6, 12);
        plateD.getInnerRadius();
        plateD.getOuterRadius();
        System.out.println("Shaded Area Plate D " + plateD.getShadedArea());
       
    }
    
}

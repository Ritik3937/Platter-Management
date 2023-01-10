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
public class Square {
    private double side ;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }
    
    public double getSquareBoundry() {
        return 4 * side ;
    }
    public double getSquareArea() {
        return side * side ;
    }
}

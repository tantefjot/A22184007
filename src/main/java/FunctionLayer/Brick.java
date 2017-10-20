/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Rikke Nielsen
 */
public class Brick {

    private String colour;
    private int brickID;
    private double price;

    public Brick(String colour, int brickID, double price) {
        this.colour = colour;
        this.brickID = brickID;
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getBrickID() {
        return brickID;
    }

    public void setBrickID(int brickID) {
        this.brickID = brickID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

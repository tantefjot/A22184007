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
public class Order {
    private int orderID;
    private int length;
    private int width;
    private int height;
    private int userID;

    public Order(int order_id, int length, int wide, int height, int userID) {
        this.orderID = order_id;
        this.length = length;
        this.width = wide;
        this.height = height;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Order{" + "orderID=" + orderID + ", length=" + length + ", width=" + width + ", height=" + height + ", userID=" + userID + '}';
    }

    

    
 
    
}

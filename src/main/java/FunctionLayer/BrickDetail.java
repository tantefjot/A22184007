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
public class BrickDetail {
    private int orderID;
    private int BrickID;
    private int quantity;

    public BrickDetail(int orderID, int BrickID, int quantity) {
        this.orderID = orderID;
        this.BrickID = BrickID;
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getBrickID() {
        return BrickID;
    }

    public void setBrickID(int BrickID) {
        this.BrickID = BrickID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}

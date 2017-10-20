/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rikke Nielsen
 */
public class OrderMapper {

    @SuppressWarnings("UseSpecificCatch")
    public Order createOrder(int userID, int length, int width, int heigth) throws SQLException {
        try {
            String SQL = "INSERT INTO orders (userID, length, width,heigth) VALUES (?, ?, ?,?)";
            PreparedStatement stmt = (PreparedStatement) Connector.getconnection().prepareStatement(SQL);

            stmt.setInt(1, userID);
            stmt.setInt(2, length);
            stmt.setInt(3, width);
            stmt.setInt(4, heigth);
            stmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

//    public static void main(String[] args) throws SQLException {
//        OrderMapper om = new OrderMapper();
//        Order order = om.createOrder(1, 20, 30, 40);
//}

    public List<Order> getOrder() throws SQLException {
        List<Order> order = new ArrayList();
         String SQL = "SELECT * FROM orders";
            try {
           
            
            PreparedStatement pstmt = (PreparedStatement) Connector.getconnection().prepareStatement(SQL);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                int orderID = rs.getInt("orderID");
                int userID = rs.getInt("userID");
                int width = rs.getInt("width");
                int length = rs.getInt("length");
                int height = rs.getInt("height");
               order.add(new Order(orderID, height, length, width, userID));
            
               return order;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}


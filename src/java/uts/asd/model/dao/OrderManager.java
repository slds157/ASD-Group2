/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.model.dao;

import uts.asd.model.Order;
import java.sql.*;
import java.util.LinkedList;

/**
 *
 * @author kj760
 */
public class OrderManager {
    private Statement st;
    
    public OrderManager(Connection conn) throws SQLException{
    st = conn.createStatement();
    }
      public void createOrder(String itemName, Integer price, Integer ammount, Integer bill, Integer userId, String address, String payment ) throws SQLException{
            st.executeUpdate("INSERT INTO ASDADMIN.\"ORDER\" (ITEMNAME, PRICE, AMMOUNT, BILL, USERID, ADDRESS, PAYMENT) "+ " VALUES('"+itemName+"',"+price+","+ammount+","+bill+","+userId+",'"+address+"','"+payment+"')");
    } 
      
      public LinkedList<Order> Orderlist(int userId) throws SQLException {
      String fetch = "SELECT * FROM ASDADMIN.\"ORDER\" WHERE USERID="+userId+"";
      ResultSet rs = st.executeQuery(fetch);
      LinkedList<Order> temp = new LinkedList();
      
      while (rs.next()){
      int userID = rs.getInt(6);
      if(userID == userId)
      {
      int orderId = rs.getInt(1);
      String ItemName = rs.getString(2);
      int price = rs.getInt(3);
      int ammount = rs.getInt(4);
      int bill = rs.getInt(5);
      String address = rs.getString(7);
      String payment = rs.getString(8);
      temp.add(new Order(orderId,ItemName, price, ammount, bill,userId, address,payment));
      }
      }
      return temp;
      }
      
      
      public void updateOrder(int orderId, int ammount, int bill, String address, String payment) throws SQLException{
      st.executeUpdate("UPDATE ASDADMIN.\"ORDER\" SET AMMOUNT="+ammount+",BILL="+bill+",ADDRESS='"+address+"',PAYMENT='"+payment+"'WHERE ORDERID="+orderId+"");
      }
      
         public void deleteOrder(int orderId) throws SQLException{
    st.executeUpdate("DELETE FROM ASDADMIN.\"ORDER\" WHERE ORDERID="+orderId+"");
    }
      
       public Order readOrder(int orderid) throws SQLException {
        String fetch = "SELECT * FROM ASDADMIN.\"ORDER\" WHERE ORDERID=" + orderid + "";//read from where ID = and password = 

        ResultSet rs = st.executeQuery(fetch);

        while (rs.next()) {
            int orderId = rs.getInt(1);

            if (orderId == orderid) {
               String itemName = rs.getString(2);
               int price = rs.getInt(3);
               int ammount = rs.getInt(4);
               int bill = rs.getInt(5);
               int userId = rs.getInt(6);
               String address = rs.getString(7);
               String payment = rs.getString(8);
                return new Order(orderId, itemName, price, ammount, bill, userId, address, payment);
            }
        }
        return null;
    }
}

    
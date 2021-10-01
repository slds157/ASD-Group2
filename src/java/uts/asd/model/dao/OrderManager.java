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
      public void createOrder(String itemName, Integer price, Integer ammount, Integer bill, Integer userId ) throws SQLException{
            st.executeUpdate("INSERT INTO ASDADMIN.\"ORDER\" (ITEMNAME, PRICE, AMMOUNT, BILL, USERID) "+ " VALUES('"+itemName+"',"+price+","+ammount+","+bill+","+userId+")");
    } 
      
      public LinkedList<Order> Orderlist(int userId) throws SQLException {
      String fetch = "SELECT * FROM ASDADMIN.\"ORDER\" WHERE USERID="+userId+"";
      ResultSet rs = st.executeQuery(fetch);
      LinkedList<Order> temp = new LinkedList();
      
      while (rs.next()){
      int userID = rs.getInt(6);
      if(userID == userId)
      {
      String ItemName = rs.getString(2);
      int price = rs.getInt(3);
      int ammount = rs.getInt(4);
      int bill = rs.getInt(5);
      temp.add(new Order(ItemName, price, ammount, bill));
      }
      }
      return temp;
      }
}

    
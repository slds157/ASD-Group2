/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.model.dao;

import uts.asd.model.Order;
import java.sql.*;

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
}

    
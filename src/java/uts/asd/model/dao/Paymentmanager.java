/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.model.dao;

import java.sql.*;
import java.util.LinkedList;
import uts.asd.model.Payment;
/**
 *
 * @author kj760
 */
public class Paymentmanager {
    private Statement st;
    public Paymentmanager(Connection conn) throws SQLException{
    st = conn.createStatement();
    }
    
    public void createPayment(String cardType, int cardNum, int userId ) throws SQLException{
            st.executeUpdate("INSERT INTO ASDADMIN.\"PAYMENT\" (CARDTYPE, CARDNUMBER, USERID) "+ " VALUES('"+cardType+"',"+cardNum+","+userId+")");
    } 
    
    public LinkedList<Payment> PaymentList(int userId) throws SQLException {
      String fetch = "SELECT * FROM ASDADMIN.\"PAYMENT\" WHERE USERID="+userId+"";
      ResultSet rs = st.executeQuery(fetch);
      LinkedList<Payment> temp = new LinkedList();
      
      while (rs.next()){
      int userID = rs.getInt(4);
      if(userID == userId)
      {
      String cardType = rs.getString(2);
      int cardNum = rs.getInt(3);
   
      temp.add(new Payment(cardType, cardNum));
      }
      }
      return temp;
      }
}

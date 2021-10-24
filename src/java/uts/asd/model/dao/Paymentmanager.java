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
    
    public void createPayment(String cardType, int cardNum, int userId, String userName, String docType, int docNumber ) throws SQLException{
            st.executeUpdate("INSERT INTO ASDADMIN.\"PAYMENT\" (CARDTYPE, CARDNUMBER, USERID,USERNAME, DOCTYPE, DOCNUMBER ) "+ " VALUES('"+cardType+"',"+cardNum+","+userId+",'"+userName+"','"+docType+"',"+docNumber+")");
    } 
    
    public LinkedList<Payment> PaymentList(int userId) throws SQLException {
      String fetch = "SELECT * FROM ASDADMIN.\"PAYMENT\" WHERE USERID="+userId+"";
      ResultSet rs = st.executeQuery(fetch);
      LinkedList<Payment> temp = new LinkedList();
      
      while (rs.next()){
      int userID = rs.getInt(4);
      if(userID == userId)
      {
          int paymentId = rs.getInt(1);
      String cardType = rs.getString(2);
      int cardNum = rs.getInt(3);
      String userName = rs.getString(5);
      String docType =  rs.getString(6);
      int docNum = rs.getInt(7);
      temp.add(new Payment(paymentId ,cardType, cardNum,userID,userName,docType, docNum ));
      }
      }
      return temp;
      }
    
     public void updatePayment(int paymentId, String cardType, int cardNum, String userName, String docType, int docNum) throws SQLException{
      st.executeUpdate("UPDATE ASDADMIN.\"PAYMENT\" SET CARDTYPE='"+cardType+"',CARDNUMBER="+cardNum+",USERNAME='"+userName+"',DOCTYPE='"+docType+"',DOCNUMBER="+docNum+" WHERE PAYMENTID="+paymentId+"");
      }
    
            public Payment readPayment(int paymentid) throws SQLException {
        String fetch = "SELECT * FROM ASDADMIN.\"PAYMENT\" WHERE PAYMENTID=" + paymentid + "";//read from where ID = and password = 
        
        ResultSet rs = st.executeQuery(fetch);

        while (rs.next()) {
            int paymentId = rs.getInt(1);

            if (paymentId == paymentid) {
               String cardType = rs.getString(2);
               int cardNum = rs.getInt(3);
               int userId = rs.getInt(4);
               String userName = rs.getString(5);
               
               String docType = rs.getString(6);
               int docNum = rs.getInt(7);
                return new Payment(paymentId, cardType, cardNum, userId, userName, docType, docNum );
            }
        }
        return null;
    }
             public void deletePayment(int paymentId) throws SQLException{
    st.executeUpdate("DELETE FROM ASDADMIN.\"PAYMENT\" WHERE PAYMENTID="+paymentId+"");
    }
}

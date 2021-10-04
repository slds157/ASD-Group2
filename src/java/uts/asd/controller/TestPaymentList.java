/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.controller;
import static java.nio.file.Files.list;
import java.sql.Connection;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import uts.asd.model.Payment;
import uts.asd.model.dao.DBConnector;
import uts.asd.model.dao.Paymentmanager;

/**
 *
 * @author kj760
 */
public class TestPaymentList {
     private static Scanner in = new Scanner(System.in);
     public static void main(String[] args){
     try {
     DBConnector connector = new DBConnector();
     Connection conn = connector.openConnection();
     Paymentmanager db = new Paymentmanager(conn);
     
     System.out.print("user id");
     int userId = Integer.parseInt(in.nextLine());
   
     
     LinkedList<Payment> Paymentlist = db.PaymentList(userId);
     for(int orderSize = 0; orderSize < Paymentlist.size(); orderSize++)
     {
         Payment payments = (Payment)Paymentlist.get(orderSize);
          System.out.println(payments.getCardType());
           System.out.println(payments.getCardNum());
     }
    
     
     connector.closeConnection();

     }
     catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestOrderList.class.getName()).log(Level.SEVERE, null, ex);
     }
     System.out.println("Student is added to the database");
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import uts.asd.model.dao.DBConnector;
import uts.asd.model.dao.Paymentmanager;
/**
 *
 * @author kj760
 */
public class TestPayment {
     private static Scanner in = new Scanner(System.in);
     public static void main(String[] args){
     try {
     DBConnector connector = new DBConnector();
     Connection conn = connector.openConnection();
     Paymentmanager db = new Paymentmanager(conn);
     
     System.out.print("card type");
     String cardType = in.nextLine();
     System.out.print("card number");
     Integer cardNum = Integer.parseInt(in.nextLine());
     System.out.print("User Id");
     Integer userId = Integer.parseInt(in.nextLine());
     
     db.createPayment(cardType, cardNum, userId);
     
     System.out.println();
     
     connector.closeConnection();

     }
     catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestOrder.class.getName()).log(Level.SEVERE, null, ex);
     }
     System.out.println("Student is added to the database");
}
}

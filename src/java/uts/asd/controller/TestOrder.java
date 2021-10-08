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
import uts.asd.model.dao.OrderManager;

/**
 *
 * @author kj760
 */
public class TestOrder {
     private static Scanner in = new Scanner(System.in);
     public static void main(String[] args){
     try {
     DBConnector connector = new DBConnector();
     Connection conn = connector.openConnection();
     OrderManager db = new OrderManager(conn);
     
     System.out.print("Item Name: ");
     String orderName = in.nextLine();
     System.out.print("Price:");
     Integer price = Integer.parseInt(in.nextLine());
      System.out.print("ammount: ");
     Integer ammount = Integer.parseInt(in.nextLine());
     System.out.print("bill:");
     Integer bill = Integer.parseInt(in.nextLine());
     System.out.print("User Id: ");
     Integer userId = Integer.parseInt(in.nextLine());
     
     db.createOrder(orderName, price, ammount, bill, userId);
     
     System.out.println();
     
     connector.closeConnection();

     }
     catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestOrder.class.getName()).log(Level.SEVERE, null, ex);
     }
     System.out.println("order is added to the database");
}
}
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
import uts.asd.model.Order;
import uts.asd.model.dao.DBConnector;
import uts.asd.model.dao.OrderManager;

/**
 *
 * @author kj760
 */
public class TestOrderList {
      private static Scanner in = new Scanner(System.in);
     public static void main(String[] args){
     try {
     DBConnector connector = new DBConnector();
     Connection conn = connector.openConnection();
     OrderManager db = new OrderManager(conn);
     
     System.out.print("user id");
     int userId = Integer.parseInt(in.nextLine());
   
     
     LinkedList<Order> Orderlist = db.Orderlist(userId);
     for(int orderSize = 0; orderSize < Orderlist.size(); orderSize++)
     {
         Order orders = (Order)Orderlist.get(orderSize);
          System.out.println(orders.getItemName());
           System.out.println(orders.getPrice());
            System.out.println(orders.getAmmount());
             System.out.println(orders.getBill());
     }
    
     
     connector.closeConnection();

     }
     catch (ClassNotFoundException | SQLException ex) {

Logger.getLogger(TestOrderList.class.getName()).log(Level.SEVERE, null, ex);
     }
     System.out.println("Student is added to the database");
}
}

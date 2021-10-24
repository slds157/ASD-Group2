/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uts.asd.model.dao.OrderManager;

/**
 *
 * @author kj760
 */
public class OrderDeleteServlet extends HttpServlet {
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
     
            HttpSession session = request.getSession();
            int orderId = Integer.parseInt(request.getParameter("orderId"));
            OrderManager manager = (OrderManager)session.getAttribute("ordermanager");
            try {
                manager.deleteOrder(orderId);
                  request.getRequestDispatcher("OrderDeleteConfirm.jsp").include(request,response);
            }catch(SQLException | NullPointerException ex){
                Logger.getLogger(OrderDeleteServlet.class.getName()).log(Level.SEVERE, null, ex);
           }
      }
}

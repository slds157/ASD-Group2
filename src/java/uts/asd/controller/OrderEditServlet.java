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
import uts.asd.model.Order;
import uts.asd.model.dao.OrderManager;

/**
 *
 * @author kj760
 */
public class OrderEditServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
     
            HttpSession session = request.getSession();
            int orderId = Integer.parseInt(request.getParameter("orderId"));
            OrderManager manager = (OrderManager) session.getAttribute("ordermanager");
            Order order = null;
            try {
                order = manager.readOrder(orderId);
                session.setAttribute("order", order);
                request.getRequestDispatcher("editOrder.jsp").include(request, response);
            }catch(SQLException | NullPointerException ex){
                Logger.getLogger(OrderEditServlet.class.getName()).log(Level.SEVERE, null, ex);
           }
      }
   
}

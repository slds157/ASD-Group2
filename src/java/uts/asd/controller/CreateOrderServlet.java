/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
public class CreateOrderServlet extends HttpServlet {
    @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            HttpSession session = request.getSession();
            String itemName = request.getParameter("itemName");
            int price = Integer.parseInt(request.getParameter("price"));
            int ammount = Integer.parseInt(request.getParameter("ammount"));
            int userId = Integer.parseInt(request.getParameter("userId"));
            int bill = price * ammount;
            
            OrderManager manager = (OrderManager) session.getAttribute("ordermanager");
            try
            {  
                
                    manager.createOrder(itemName, price, ammount, bill, userId);
                    Order order = new Order(itemName, price, ammount, bill, userId);
                    session.setAttribute("order",order);
                    request.getRequestDispatcher("confirm.jsp").include(request, response);
                
                
            } catch (SQLException ex){
                Logger.getLogger(CreateOrderServlet.class.getName()).log(Level.SEVERE,null,ex);
            }
    }
    
    
}

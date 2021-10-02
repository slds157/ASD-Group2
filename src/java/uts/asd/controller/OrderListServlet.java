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
public class OrderListServlet extends HttpServlet {
 @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            HttpSession session = request.getSession();
            int userId = 100000;
            OrderManager manager = (OrderManager) session.getAttribute("ordermanager");
            try
            {  
                    LinkedList<Order> Orderlist = manager.Orderlist(userId);
                    
                    session.setAttribute("orderlist",Orderlist);
                    System.out.println("*******************");
                    System.out.println(request.getRequestDispatcher("Order.jsp"));
                    request.getRequestDispatcher("Order.jsp").include(request, response);
                    
                
            } catch (SQLException ex){
                Logger.getLogger(OrderListServlet.class.getName()).log(Level.SEVERE,null,ex);
                System.out.println(ex.getErrorCode()+"and"+ex.getMessage());
            }

    
    
}
}
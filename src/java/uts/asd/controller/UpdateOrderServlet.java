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
public class UpdateOrderServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    HttpSession session = request.getSession();
            int orderId = Integer.parseInt(request.getParameter("orderId"));
            int ammount = Integer.parseInt(request.getParameter("ammount"));
            int price = Integer.parseInt(request.getParameter("price"));
            int bill = ammount * price;
            String address = request.getParameter("address");
            String payment = request.getParameter("payment");
            Order order = null;
            OrderManager manager = (OrderManager)session.getAttribute("ordermanager");
            try{
               manager.updateOrder(orderId, ammount, bill, address, payment);
               order = manager.readOrder(orderId);
               session.setAttribute("order", order);
                request.getRequestDispatcher("confirmOrderUpdate.jsp").include(request, response);
            } catch (SQLException ex){
                Logger.getLogger(UpdateOrderServlet.class.getName()).log(Level.SEVERE,null,ex);
            }
    }
   
    
}

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
import uts.asd.model.dao.OrderManager;
import uts.asd.model.dao.Paymentmanager;

/**
 *
 * @author kj760
 */
public class PaymentDeleteServlet extends HttpServlet {

     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
     
            HttpSession session = request.getSession();
            int paymentId = Integer.parseInt(request.getParameter("paymentId"));
            Paymentmanager manager = (Paymentmanager)session.getAttribute("paymentmanager");
            try {
                manager.deletePayment(paymentId);
                  request.getRequestDispatcher("PaymentDeleteConfirm.jsp").include(request,response);
            }catch(SQLException | NullPointerException ex){
                Logger.getLogger(PaymentDeleteServlet.class.getName()).log(Level.SEVERE, null, ex);
           }
      }
    
}

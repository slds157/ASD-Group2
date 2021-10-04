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
import uts.asd.model.Payment;
import uts.asd.model.dao.Paymentmanager;


/**
 *
 * @author kj760
 */
public class CreatePaymentServlet extends HttpServlet {
  @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            HttpSession session = request.getSession();
            String cardType = request.getParameter("cardType");
            int cardNum = Integer.parseInt(request.getParameter("cardNum"));
            int userId = Integer.parseInt(request.getParameter("userId"));

            
            Paymentmanager manager = (Paymentmanager) session.getAttribute("paymentmanager");
            try
            {  
                
                    manager.createPayment(cardType, cardNum, userId);
                    Payment payment = new Payment(cardType, cardNum, userId);
                    session.setAttribute("payment",payment);
                    request.getRequestDispatcher("PaymentConfirm.jsp").include(request, response);
                
                
            } catch (SQLException ex){
                Logger.getLogger(CreateOrderServlet.class.getName()).log(Level.SEVERE,null,ex);
            }
    }
    
   
}

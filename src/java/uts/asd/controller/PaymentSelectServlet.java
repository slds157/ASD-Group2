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
import uts.asd.model.Payment;
import uts.asd.model.dao.Paymentmanager;

/**
 *
 * @author kj760
 */
public class PaymentSelectServlet extends HttpServlet {

      @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
            HttpSession session = request.getSession();
            int userId = 100000;
            Paymentmanager manager = (Paymentmanager) session.getAttribute("paymentmanager");
            try
            {  
                    LinkedList<Payment> Paymentlist = manager.PaymentList(userId);
                    
                    session.setAttribute("paymentlist",Paymentlist);
                    request.getRequestDispatcher("buyProducts.jsp").include(request, response);
                    
                
            } catch (SQLException ex){
                Logger.getLogger(PaymentSelectServlet.class.getName()).log(Level.SEVERE,null,ex);
                System.out.println(ex.getErrorCode()+"and"+ex.getMessage());
            }

    
    
}
}

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
public class PaymentUpdateServlet extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    HttpSession session = request.getSession();
            int paymentId = Integer.parseInt(request.getParameter("paymentId"));
            String cardType = request.getParameter("cardType");
            int cardNum = Integer.parseInt(request.getParameter("cardNum"));
            String userName = request.getParameter("username");
            String docType = request.getParameter("doctype");
            System.out.println("*****************"+request.getParameter("docnum"));
            int docNum = Integer.parseInt(request.getParameter("docnum"));
            Payment payment = null;
            Paymentmanager manager = (Paymentmanager)session.getAttribute("paymentmanager");
            try{
               manager.updatePayment(paymentId, cardType, cardNum, userName, docType, docNum);
               payment = manager.readPayment(paymentId);
               session.setAttribute("payment", payment);
                request.getRequestDispatcher("paymentUpdateConfirm.jsp").include(request, response);
            } catch (SQLException ex){
                Logger.getLogger(UpdateOrderServlet.class.getName()).log(Level.SEVERE,null,ex);
            }
    }
   
    
}

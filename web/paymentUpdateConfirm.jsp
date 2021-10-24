<%-- 
    Document   : paymentUpdateConfirm
    Created on : 2021-10-24, 20:24:02
    Author     : kj760
--%>

<%@page import="uts.asd.model.Payment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <body>
            <%
        
        Payment payment = (Payment) session.getAttribute("payment");
        
        %>
        <div class="container">
<table class="table table-striped">
  <caption>Payment</caption>
  <thead>
    <tr>
      
      <th>Card Type</th>
      <th>Card Number</th>
      <th>Name</th>
      <th>Document Type</th>
      <th>Document Number</th>
    </tr>
  </thead>
  <tbody>
    <tr>

      <td><%= payment.getCardType() %></td>
      <td><%= payment.getCardNum() %></td>
      <td><%= payment.getUserName()%></td>
      <td><%= payment.getDocType() %></td>
      <td><%= payment.getDocNumber() %></td>
    </tr>
  
  </tbody>
</table>
    <a href="Main.jsp" class="btn btn-default" role="button">Main Page</a>
        </div>
    </body>
</html>

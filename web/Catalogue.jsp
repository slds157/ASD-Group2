<%-- 
    Document   : Catalogue
    Created on : 07/09/2021, 4:45:30 AM
    Author     : Dell
--%>

<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        Product current = (Product)session.getAttribute("product");
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        String unitPrice = request.getParameter("unitPrice");
        String description = request.getParameter("description");
        String quantity = request.getParameter("quantity");
        if (current == null) {
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="3,index.jsp">
        <link rel="stylesheet" href="css.css">
        <title>NO PRODUCT FOUND</title>
    </head>
    <body>
        <h1><a href="addProduct.jsp">Add Product</a></h1>
    </body>
    <%
    }else{
    %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catalogue Page</title>
    </head>
    <body>       
        <h1>Product Catalogue</h1>
        
        <div class="topcorner"><a href="addProduct.jsp">Add Product</a >
            <a href="index.jsp">Cancel</a>
        </div> 
        
            <div align="center">
        <table border="1" cellpadding="4">
                <caption><h2>Product Catalogue</h2></caption>
            <tr>
                <th>Product Name</th>
                <th>Category Name</th>
                <th>Product Price</th>
                <th>Description</th>
                <th>Quantity</th>
                <th>Edit Action</th>
            </tr>
            
                <tr>
                    <td><%=name%></td>
                    <td><%=type%></td>
                    <td><%=unitPrice%></td>
                    <td><%=description%></td>
                    <td><%=quantity%></td>
                    <td><a href="editProduct.jsp">Edit</a></td>
                </tr>
                <%}%>
        </table>
    </div>

    </body>
</html>

<%-- 
    Document   : editProduct
    Created on : 07/09/2021, 4:45:54 AM
    Author     : Dell
--%>

<%@page import="uts.asd.model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Product product = (Product)session.getAttribute("product");
        %>
        <div class="header">
            <div class="header-content">
                <div class="logo">
                    <h3>Online Shopping</h3>
                </div>
            </div>
        </div>
        <div class="container"><h1>Add Product<span id = "message"></span></h1>
        <form action="Catalogue.jsp" method="POST">
            <table class="tablecenter">
                <tr>
                    <td><label for="name">Product Name:</label></td>
                    <td><input type="text" placeholder="Enter product name" id="name" name="name" size="50"  value="${product.name}"></td>
                </tr>
                <tr>
                    <td><label for="type">Product Type: </label></td>
                    <td><input type="text" placeholder= "Enter type" id="type" name="type" size="50"  value="${product.type}"></td>
                </tr>
                <tr>
                    <td><label for="price">Unit Price:</label></td>
                    <td><input type="number" placeholder="Enter unit price" id="price" name="price" size="10"  value="${product.unitPrice}"></td>
                </tr>
                <tr>
                    <td><label for="description">Description:</label></td>
                    <td><input type="text" id="description" name="description" size="100"  value="${product.description}"></td>
                </tr>
                <tr>
                    <td><label for="quantity">Quantity:</label></td>
                    <td><input type="number" placeholder="Enter quantity" id="quantity" name="quantity" size="20"  value="${product.quantity}"></td>
                </tr>
                <tr><td></td>
                    <td>
                        <a href="Catalogue.jsp" class="tableButton">Cancel</a>
                        <input class="tableButton" type="submit" value="Edit">
                    </td>
                </tr>
            </table>
        </form>
        </div>
        <%
            String name = request.getParameter("name");
            String type = request.getParameter("type");
            String unitPrice = request.getParameter("unitPrice");
            String description = request.getParameter("description");
            String quantity = request.getParameter("quantity"); 
            product = new Product(name, type, unitPrice, description, quantity);
        %>
    </body>
</html>

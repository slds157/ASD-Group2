<%-- 
    Document   : buyProducts
    Created on : 2021-9-5, 16:34:18
    Author     : kj760
--%>

<%@page import="uts.asd.model.Payment"%>
<%@page import="java.util.LinkedList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>Bootstrap 101 Template</title>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
      
      <div class="container">
    <h1>USB Drive</h1>
    <form role="form" method="post" action="CreateOrderServlet">
        <div>
            
            <p>Price: 100$ </p>
            
        </div>
  <div class="form-group">
      <p>ammount:</p>
<input type="number" class="form-control" name="ammount" placeholder="请输入名称">
     
  </div>
  <div class="form-group">
      <p>address:</p>
<input type="text" class="form-control" name="address" placeholder="请输入名称">
        
<input type="hidden" class="form-control" name="userId" value="100000">
     <input type="hidden"  name="price" value="100">
     <input type="hidden" name="itemName" value="USB Drive">
  </div>
         <div class="form-group">
   <select class="form-control" name="payment">
           <%
        LinkedList<Payment> PaymentList = (LinkedList)session.getAttribute("paymentlist") ;
        for(int l = 0; l < PaymentList.size();l++)
        { Payment payment = (Payment)PaymentList.get(l);
    %>
    <option value="<%= payment.getCardNum() %> <%= payment.getUserName() %>"><%= payment.getCardNum() %> <%= payment.getUserName() %> </option>
    <%
        }
    %>
      </select>
  </div>
        <button type="submit" class="btn btn-default">pay</button>  <a href="Main.jsp" class="btn btn-primary" role="button">Cancel</a> 
</form>
    </div>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
  </body>
</html>
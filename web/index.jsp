<%-- 
    Document   : index
    Created on : 2021-9-4, 0:33:36
    Author     : kj760
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>ASD</title>

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

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
  <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="index.jsp">Online shopping</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Shopping <span class="sr-only">(current)</span></a></li>
        <li><a href="Catalogue.jsp">Link</a></li>
      
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Catalogue.jsp">Catalogue</a></li>
         <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Account <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="Login.jsp">Login</a></li>
            <li><a href="Register.jsp">Register</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
    <div class="row">
    <div class="col-sm-6 col-md-3">
         <div class="thumbnail">
            <img src="/wp-content/uploads/2014/06/kittens.jpg" 
             alt="goods">
            <div class="caption">
                <h3>goods</h3>
                <p>description</p>
                <p>
                    <a href="buyProducts.jsp" class="btn btn-primary" role="button">
                        buy 
                    </a> 
                    <a href="#" class="btn btn-default" role="button">
                        add to cart
                    </a>
                </p>
            </div>
         </div>
    </div>
    <div class="col-sm-6 col-md-3">
         <div class="thumbnail">
            <img src="/wp-content/uploads/2014/06/kittens.jpg" 
             alt="goods">
            <div class="caption">
                <h3>goods</h3>
                <p>description</p>
                <p>
                    <a href="#" class="btn btn-primary" role="button">
                        buy
                    </a> 
                    <a href="#" class="btn btn-default" role="button">
                        add to cart
                    </a>
                </p>
            </div>
         </div>
    </div><div class="col-sm-6 col-md-3">
         <div class="thumbnail">
            <img src="/wp-content/uploads/2014/06/kittens.jpg" 
             alt="goods">
            <div class="caption">
                <h3>goods</h3>
                <p>description</p>
                <p>
                    <a href="#" class="btn btn-primary" role="button">
                        buy
                    </a> 
                    <a href="#" class="btn btn-default" role="button">
                        add to cart
                    </a>
                </p>
            </div>
         </div>
    </div><div class="col-sm-6 col-md-3">
         <div class="thumbnail">
            <img src="/wp-content/uploads/2014/06/kittens.jpg" 
             alt="goods">
            <div class="caption">
                <h3>goods</h3>
                <p>description</p>
                <p>
                    <a href="#" class="btn btn-primary" role="button">
                        buy
                    </a> 
                    <a href="#" class="btn btn-default" role="button">
                        add to cart
                    </a>
                </p>
            </div>
         </div>
    </div>
</div>
  </body>
</html>
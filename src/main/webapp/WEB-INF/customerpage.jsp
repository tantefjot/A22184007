<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        You are now logged in as a customer of our wonderful site.
        <br>
        
        Do you want to shop or see your earlier orders?
         <form name="login" action="FrontController" method="POST">
        <br>
        <button type="shop">shop</button>
        <br>
        <button type="orders" >see orders</button>
    </body>
</html>

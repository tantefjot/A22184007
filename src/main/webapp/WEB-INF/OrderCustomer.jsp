<%-- 
    Document   : order
    Created on : 18-10-2017, 16:44:07
    Author     : Rikke Nielsen 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order siden</title>
    </head>
    <body>
       <form action="/OrderController">
  indtast længde:<br>
  <input type="text" name="length" value="">
  <br>
   indtast højde:<br>
  <input type="text" name="heigth" value="">
  <br>
  indtast bredde:<br>
  <input type="text" name="width" value=""><br>
  <input type="submit" value="Submit">
</form> 

        
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>

<table>
  <tr>
    <th>OrderID</th>
    <th>Røde legoklodser</th>
    <th>Gule legoklodser</th>
    <th>Blå legoklodser</th>
    <th>total antal klodser</th>
    <th>total pris</th>
  </tr>
  <tr>
  <td></td>
   <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
    <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
    <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
    <tr>
  <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td> 
  </tr>
  <tr>
  <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
    <tr>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
</table>


        </form>

      
    </body>
</html>

<%-- 
    Document   : dat_hang
    Created on : Oct 2, 2017, 2:42:45 PM
    Author     : Admin
--%>

<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.cart"%>
<%@page import="model.m_khach_hang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="public_main/css/bootstrap.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <title>Đơn hàng</title>
        
        
    </head>
    <%
       
        cart c = (cart)session.getAttribute("cart");
        m_khach_hang k = (m_khach_hang)session.getAttribute("kh");
        
        
        
    %>
    <body>
        <h1>Đơn hàng của anh/chị <b><%= k.getTen_khach_hang()%></b></h1>
        
        <table border="1" width="100%">
            <tr>
                <td>Ten san pham</td>
                <td>Don gia</td>
                <td>So luong</td>
                <td>Tong</td>
            </tr>
            <%for(Map.Entry<Integer , Item> list: c.getCartItems().entrySet() ){%>
            <tr>
                <td><%= list.getValue().getSp().getTen_san_pham()%></td>
                <td><%= list.getValue().getSp().getDon_gia()%></td>
                <td>1</td>
                <td><%= (list.getValue().getSp().getDon_gia()*1)%></td>
            </tr>
            <%}%>
        </table>
        
        Tong tien: <%= c.totalCart()%>
        
       
        <br>
        <a href="dat_hang" class="btn btn-success">Xong</a>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="public_main/js/bootstrap.js"></script>
    </body>
</html>

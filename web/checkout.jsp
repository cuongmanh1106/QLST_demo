<%-- 
    Document   : checkout
    Created on : Sep 14, 2017, 8:17:51 PM
    Author     : Admin
--%>

<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.m_khach_hang"%>
<%@page import="model.cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
        
        cart c = (cart)session.getAttribute("cart");
        m_khach_hang kh = (m_khach_hang)session.getAttribute("kh");
        
        if(c==null)
            response.sendRedirect("/QL_SieuThi/index.jsp");
        %>
        <h1>Chao,<%= kh.getTen_khach_hang()%></h1>
        
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
        
        <hr>
        <a href="dat_hang">Dat hang</a>
        <a href="san_pham">Mua tiep</a>
        
    </body>
</html>

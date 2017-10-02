<%-- 
    Document   : dang_nhap
    Created on : Sep 14, 2017, 9:45:46 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String error = ""; %>
        <h1>Hello World!</h1>
        <% if(request.getAttribute("error")!=null){%>
        <p><%= request.getAttribute("error") %></p>
        <%}
        %>
        <form action="user" method="post">
            email:<input type="email" name="email" size="20"><br><br>
            Mật khẩu:<input type="password" name="mat_khau" size="20"><br>
            <input type="hidden" value="dangnhap" name="command">
            <input type="submit" name="sub" value="Go!">
            
        </form>
    </body>
</html>
 
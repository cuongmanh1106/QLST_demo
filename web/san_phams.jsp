<%-- 
    Document   : san_phams
    Created on : Sep 18, 2017, 8:14:29 PM
    Author     : Admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.m_san_pham"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
         <h1>Loai san pham</h1>
        <% ArrayList<m_san_pham> list = (ArrayList) request.getAttribute("san_phams");%>
        <% int count = Integer.parseInt(String.valueOf(request.getAttribute("count"))); 
            
        %>

        <div class="col-sm-7">
          <table class="table table-striped table-bordered table-hover">
            <thead class="thin-border-bottom">
              <tr>
                <th> Mã loại người dùng </th>
                <th> Tên loại người dùng</th>
              </tr>
            </thead>
            <tbody>
               <% for(m_san_pham l:list){ %>
              <tr>
                <td><%= l.getMa_san_pham() %></td>    
                <td><%= l.getTen_san_pham() %></td>      
              </tr>
              <%}%>
            </tbody>
          </table>
           

                <% 
               int dem = 0;
               if(count%2 == 0)
               {
                   dem = count/2;
               }
               else
                   dem = count/2 + 1;
               for(int i = 1; i <= dem ; i++) {%>
                <span><a href="san_phams?pages=<%= i%>&command=ao_nam"><%= i%></a><span>
                
               <% } %>
        </div>
    </body>
</html>

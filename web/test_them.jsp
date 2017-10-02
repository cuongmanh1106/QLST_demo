<%-- 
    Document   : test_them
    Created on : Sep 19, 2017, 3:31:16 PM
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
        <h1>Hello World!</h1>
        
        <% 
        
//        int ma_loai = 1;
//        String mo_ta_tom_tat = null;
//        String mo_ta_chi_tiet = null;
//        int don_gia = 0;
//        String hinh = null;
        
        String ten_san_pham = request.getParameter("ten_san_pham");
//        ma_loai = Integer.parseInt(request.getParameter("ma_loai"));
//        mo_ta_tom_tat = request.getParameter("noi_dung_tom_tat");
//        mo_ta_chi_tiet = request.getParameter("noi_dung_chi_tiet");
//        don_gia = Integer.parseInt(request.getParameter("don_gia"));
//        hinh = request.getParameter("hinh");
        %>
        
        <%= ten_san_pham %>
       
    </body>
</html>

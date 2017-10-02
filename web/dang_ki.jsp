<%-- 
    Document   : dang_ki
    Created on : Sep 14, 2017, 9:46:20 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                var x_timer;
                $("#email").keyup(function (e) {
                    clearTimeout(x_timer);
                    var user_name = $(this).val();
                    x_timer = setTimeout(function () {
                        check_username_ajax(user_name);
                    }, 1000);
                });

                function check_username_ajax(username) {
                    $("#user-result").html('<img src="public/images/ajax-loader.gif" />');
                    $.post('CheckmailServlet', {'username': username}, function (data) {
                        $("#user-result").html(data);
                    });
                }
            });
        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="user" method="post">
            Họ Tên: <input type="text" name="ten_khach_hang"><br>
            Email:  <input type="email" name="email" id="email"><span id="user-result"></span><br>
            
            Mật khẩu: <input type="password" name="mat_khau"><br>
            Phái: <input type="radio" value="1" name="phai">Nam
            <input type="radio" value="0" name="phai">Nữ<br>
            
            Ngày sinh: <input type="text" name="ngay_sinh"><br>
            Địa chỉ  : <input type="text" name="dia_chi"><br>
            Điện thoại:<input type="text" name="dien_thoai"><br>
            <input type="hidden" value="dangki" name="command">
            <input type="submit" value="Register">
        </form>
    </body>
</html>

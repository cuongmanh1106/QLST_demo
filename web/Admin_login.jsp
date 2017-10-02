<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MC - Login</title>
    <!-- Core CSS - Include with every page -->
    <link href="public/plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="public/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="public/plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
   <link href="public/css/style_admin.css" rel="stylesheet" />
      <link href="public/css/main-style.css" rel="stylesheet" />

</head>
<%
    String thongbao = "";
    if(request.getAttribute("thongbao")!=null)
    {
       thongbao = (String)request.getAttribute("thongbao");
    }
%>
<body class="body-Login-back">

    <div class="container">
       
        <div class="row">
            <div class="col-md-4 col-md-offset-4 text-center logo-margin ">
              <img src="public/img/logo.png" alt=""/>
                </div>
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">                  
                    <div class="panel-heading">
                        <h3 class="panel-title">Please Sign In</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" action="Admin_dang_nhap" method="post">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Account" name="ten_dang_nhap" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="mat_khau" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                               
                                <input type="submit" class="btn btn-lg btn-success btn-block" value="Login"> 
                            </fieldset>
                        </form>
                        <h3 style="color:red;"><%= thongbao%></h3>
                    </div>
                </div>
            </div>
        </div>
    </div>

     <!-- Core Scripts - Include with every page -->
    <script src="public/plugins/jquery-1.10.2.js"></script>
    <script src="public/plugins/bootstrap/bootstrap.min.js"></script>
    <script src="public/plugins/metisMenu/jquery.metisMenu.js"></script>

</body>

</html>

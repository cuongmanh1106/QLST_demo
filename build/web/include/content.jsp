
<%
    String view = "";
    if(request.getAttribute("view")==null)
    {  
        view = "";
    }
    else
        view = (String) request.getAttribute("view");
    
    if(view == "views/login_register/v_login.jsp")
    {
%>
<%@include file = "../views/login_register/v_login.jsp" %>
           
<%
    }
    else if(view == "")
    {
        
%>
<%@include file = "../views/home/v_home.jsp" %>
<%
        
    }
    else if(view == "views/login_register/v_register.jsp")
    {
    
%>
<%@include file = "../views/login_register/v_register.jsp" %>
<%
        
    }
     
    else if(view == "views/product/v_san_pham.jsp")
    {
%>
<%@include file = "../views/product/v_san_pham.jsp" %>
<%
        
    }
    else if(view == "views/single/v_single.jsp")
    {
%>
<%@include file = "../views/single/v_single.jsp" %>
<%
        
    }
    else if(view == "views/checkout/v_checkout.jsp")
    {
%>
<%@include file = "../views/checkout/v_checkout.jsp" %>
<%
        
    }
%>
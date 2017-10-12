package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;
import model.Item;
import model.cart;
import model.m_khach_hang;
import model.m_khach_hang;
import java.util.List;
import java.util.ArrayList;
import dbHelpers.san_pham_query;
import model.m_san_pham;
import model.m_san_pham;
import java.util.ArrayList;
import model.m_san_pham;
import java.util.ArrayList;
import model.m_san_pham;
import model.m_san_pham;
import java.util.ArrayList;
import java.util.Map;
import model.Item;
import model.m_khach_hang;
import model.cart;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(19);
    _jspx_dependants.add("/include/layout.jsp");
    _jspx_dependants.add("/include/head.jsp");
    _jspx_dependants.add("/include/page_header.jsp");
    _jspx_dependants.add("/include/menu.jsp");
    _jspx_dependants.add("/include/content.jsp");
    _jspx_dependants.add("/include/../views/login_register/v_login.jsp");
    _jspx_dependants.add("/include/../views/home/v_home.jsp");
    _jspx_dependants.add("/include/../views/home/../../include/slider.jsp");
    _jspx_dependants.add("/include/../views/home/../../include/best_seller.jsp");
    _jspx_dependants.add("/include/../views/login_register/v_register.jsp");
    _jspx_dependants.add("/include/../views/product/v_san_pham.jsp");
    _jspx_dependants.add("/include/../views/product/../../include/slider_product.jsp");
    _jspx_dependants.add("/include/../views/product/menu_left.jsp");
    _jspx_dependants.add("/include/../views/product/top_product.jsp");
    _jspx_dependants.add("/include/../views/product/show.jsp");
    _jspx_dependants.add("/include/../views/single/v_single.jsp");
    _jspx_dependants.add("/include/../views/single/san_pham_cung_loai.jsp");
    _jspx_dependants.add("/include/../views/checkout/v_checkout.jsp");
    _jspx_dependants.add("/include/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<title></title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"public_main/css/bootstrap.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"public_main/css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public_main/css/style_login.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public_main/css/styleNav.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public_main/css/styleMenu.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"puglic_main/css/product_slide.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public_main/css/categoryStyle.css\">\n");
      out.write("        <script src=\"public/js/kiemtra.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"public_main/fonts/font-awesome-4.3.0/css/font-awesome.min.css\">\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("</head>\n");
      out.write("<body>");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

     String tim = "";
    if((String)request.getAttribute("tim")!="")
        tim = (String) request.getAttribute("tim");
    
    m_khach_hang kh = null;
    
    if(session.getAttribute("kh")!=null)
    {
        kh = (m_khach_hang)session.getAttribute("kh");
    }
    
    cart ca = (cart)session.getAttribute("cart");
    if(ca == null)
    {
        ca = new cart();
        session.setAttribute("cart", ca);
    }

      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\t\t<div class=\"logo center col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t<img class=\"img-responsive\" src=\"public/images/logo_final.png\">\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-6\">\n");
      out.write("\t\t\t<div class=\"search\">\t\n");
      out.write("\t\t\t\t<form action=\"Search\" method=\"post\" role=\"search\">\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" name=\"search\" value=\"\"   placeholder=\"Search Product ...\">\n");
      out.write("                                            <!--<input type=\"submit\">-->\n");
      out.write("                                            <button type=\"submit\" >\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div class=\"brand col-lg-4 col-md-4 col-sm-4 col-xs-6\">\n");
      out.write("                        <span class=\"fa-stack fa-lg login\"> \n");
      out.write("                            <a href=\"");
      out.print( (kh!=null)?"Logout":"form_login");
      out.write("\" title=\"");
      out.print( (kh!=null)?"Logout":"Login");
      out.write("\"><i class=\"fa fa-user fa-stack-2x\" aria-hidden=\"true\"></i></a>\n");
      out.write("                               \n");
      out.write("                        </span>\n");
      out.write("                   \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<span class=\"fa-stack fa-lg\">\n");
      out.write("                            <a href=\"form_register\" title=\"register\">\n");
      out.write("\t\t\t\t<i class=\"fa fa-circle fa-stack-2x\"></i>\n");
      out.write("\t\t\t\t<i class=\"fa fa-users fa-stack-1x fa-inverse\"></i>\n");
      out.write("                            </a>\n");
      out.write("\t\t\t</span>\n");
      out.write("                   \n");
      out.write("                            \n");
      out.write("                            <ul class=\"icon1 sub-icon1\">\n");
      out.write("                               \n");
      out.write("                                <li class=\"sl\"><span style=\"font-size: 15px;\">( ");
      out.print( (ca.countItem()==0)?"Empty":ca.countItem());
      out.write(" ) </span>\n");
      out.write("                                <div class=\"cart\">\n");
      out.write("                                        \n");
      out.write("                                        <a href=\"#\" class=\"cart-in\"> </a>\n");
      out.write("                                            \n");
      out.write("                                       </div>\n");
      out.write("                                    <ul class=\"sub-icon1 list\">\n");
      out.write("                                        <h3>Recently added items(2)</h3>\n");
      out.write("                                        <div class=\"shopping_cart\">\n");
      out.write("                                            \n");
      out.write("                                            ");
for(Map.Entry<Integer , Item> list: ca.getCartItems().entrySet() ){
      out.write("\n");
      out.write("                                            <div class=\"cart_box\">\n");
      out.write("                                                <div class=\"message\">\n");
      out.write("                                                    <div class=\"alert-close\"> </div> \n");
      out.write("                                                    <div class=\"list_img\"><img src=\"public/images/");
      out.print( list.getValue().getSp().getHinh());
      out.write("\" class=\"img-responsive\" alt=\"\"></div>\n");
      out.write("                                                    <div class=\"list_desc\"><h4><a href=\"CartServlet?command=remove&ma_san_pham=");
      out.print( list.getValue().getSp().getMa_san_pham());
      out.write('"');
      out.write('>');
      out.print( list.getValue().getSp().getTen_san_pham());
      out.write("</a></h4>1 x<span class=\"actual\">\n");
      out.write("                                                            ");
      out.print( list.getValue().getSp().getDon_gia());
      out.write("</span></div>\n");
      out.write("                                                    \n");
      out.write("                                                    <div class=\"clearfix\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"total\">\n");
      out.write("                                            <div class=\"total_left\">CartSubtotal : </div>\n");
      out.write("                                            <div class=\"total_right\">");
      out.print( ca.totalCart());
      out.write("</div>\n");
      out.write("                                            <div class=\"clearfix\"> </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"login_buttons\">\n");
      out.write("                                            <div class=\"check_button\"><a href=\"xemgiohang\">Check out</a></div>\n");
      out.write("                                            <div class=\"clearfix\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                       \n");
      out.write("                        \n");
      out.write("                    ");

                       
    
                        if(session.getAttribute("kh")!=null)
                        {
                            kh = (m_khach_hang)session.getAttribute("kh");
                        
                    
      out.write("\n");
      out.write("                    <h4>\n");
      out.write("                        <span>\n");
      out.write("                            Chào, <span style=\"color: red\">");
      out.print( kh.getTen_khach_hang());
      out.write("</span>\n");
      out.write("                        </span>\n");
      out.write("                    </h4>\n");
      out.write("                    \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</div>");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<nav>\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Catalog ▾</a><span class=\"dropBottom\"></span>\n");
      out.write("\t\t\t<ul class=\"catalog\">\n");
      out.write("\t\t\t\t<li><a href=\"san_phams\">Meat</a>\n");
      out.write("<!--\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"san_phams?command=snack\">Photoshop</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"san_phams?command=drink\">Illustrator</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Web Design</a><span class=\"dropRight\"></span>\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"san_phams?command=seafood\">Bakery</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"san_phams?command=ingredient\">Meat & Poultry</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Comestic</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>-->\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Fruit & Vegetable</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"san_phams?command=vegetable\">Vegetable</a></li>\n");
      out.write("                                        <li><a href=\"san_phams?command=fruit\">Fruit</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("\t\t\t\t<li><a href=\"san_phams?command=ingredient\">Ingredient</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"san_phams?command=seafood\">Seafood</a></li>\n");
      out.write("                                <li><a href=\"#\">Snack & Drink</a>\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"san_phams?command=snack\">Snack</a></li>\n");
      out.write("                                        <li><a href=\"san_phams?command=drink\">Drink</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li><a href=\"#\">About us</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Blog ▾</a><span class=\"dropBottom\"></span>\n");
      out.write("\t\t\t<ul class=\"blog\">\n");
      out.write("\t\t\t\t<li><a href=\"#\">Design</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Articles</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Interviews</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</li>\n");
      out.write("\t\t<li><a href=\"#\">Sale ▾</a></li>\n");
      out.write("\t\t<li><a href=\"#\">Contact us</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\r');
      out.write('\n');

    String view = "";
    if(request.getAttribute("view")==null)
    {  
        view = "";
    }
    else
        view = (String) request.getAttribute("view");
    
    if(view == "views/login_register/v_login.jsp")
    {

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- Website CSS style -->\n");
      out.write("\t\t<link href=\"public/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\t<!-- Website Font style -->\n");
      out.write("\t    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"public_main/css/style.css\">\n");
      out.write("\t\t<!-- Google Fonts -->\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<title>Admin</title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row main\">\n");
      out.write("\t\t\t\t<div class=\"main-login main-center\">\n");
      out.write("                                    <h2 style=\"text-align: center\">Đăng nhập</h2>\n");
      out.write("\t\t\t\t\t<form  method=\"post\" action=\"user\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                    <input name=\"command\" value=\"dangnhap\" type=\"hidden\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\" class=\"cols-sm-2 control-label\">Your Email</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\"  placeholder=\"Enter your Email\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\" class=\"cols-sm-2 control-label\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"mat_khau\" id=\"mat_khau\"  placeholder=\"Enter your Password\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group \">\n");
      out.write("                                                        <input type=\"submit\" class=\"btn btn-primary btn-lg btn-block login-button\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <script src=\"public/js/bootstrap.min.js\"></script>\n");
      out.write("\t</body>\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("           \r\n");

    }
    else if(view == "")
    {
        

      out.write('\r');
      out.write('\n');
      out.write("<section id=\"wrapper\" class=\"skewed container\">\n");
      out.write("\t\t<div class=\"layer bottom\">\n");
      out.write("\t\t\t<div class=\"content-wrap\">\n");
      out.write("\t\t\t\t<div class=\"content-body\">\n");
      out.write("\t\t\t\t\t<h1>Just Fresh Direct</h1>\n");
      out.write("\t\t\t\t\t<p>High-qualitity of products at the competitive prices.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<img class=\"img-responsive\" src=\"public/images/beef.jpg\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"layer top\">\n");
      out.write("\t\t\t<div class=\"content-wrap\">\n");
      out.write("\t\t\t\t<div class=\"content-body\">\n");
      out.write("\t\t\t\t\t<h1>Best Place To Buy</h1>\n");
      out.write("\t\t\t\t\t<p>High-qualitity of products at the competitive prices.</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<img class=\"img-responsive\" src=\"public/images/trolley.jpg\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"handle\"></div>\n");
      out.write("\t</section>");
      out.write("\n");
      out.write("<div class=\"gallery\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t<div class=\"item-1\">\n");
      out.write("\t\t\t\t\t<img class=\"img-responsive\" src=\"public/images/vegetable.jpg\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-1-cap\">\n");
      out.write("\t\t\t\t\t\t<h2>Fresh Vegetables</h2>\n");
      out.write("\t\t\t\t\t\t<p>Always fresh-cut vegetables from local farms to your table.</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn\">Buy now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t<div class=\"item-1\">\n");
      out.write("\t\t\t\t\t<img class=\"img-responsive\" src=\"public/images/fruit.jpg\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-1-cap\">\n");
      out.write("\t\t\t\t\t\t<h2>Fresh Fruit</h2>\n");
      out.write("\t\t\t\t\t\t<p>Your one stop place for fresh fruit.</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn\">Buy now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t\t<div class=\"item-1\">\n");
      out.write("\t\t\t\t\t<img class=\"img-responsive\" src=\"public/images/bakery.jpg\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-1-cap\">\n");
      out.write("\t\t\t\t\t\t<h2>Bakery</h2>\n");
      out.write("\t\t\t\t\t\t<p>Shop for famous homemade classic goods & desserts.</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn\">Buy now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t\t<div class=\"item-1\">\n");
      out.write("\t\t\t\t\t<img class=\"img-responsive\" src=\"public/images/meat.jpg\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-1-cap\">\n");
      out.write("\t\t\t\t\t\t<h2>Meat & Poultry</h2>\n");
      out.write("\t\t\t\t\t\t<p>Treat yourself to top-quality beef, chicken, turkey & pork.</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn\">Buy now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t\t<div class=\"item-1\">\n");
      out.write("\t\t\t\t\t<img class=\"img-responsive\" src=\"public/images/bakery.jpg\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item-1-cap\">\n");
      out.write("\t\t\t\t\t\t<h2>Fresh Vegetables</h2>\n");
      out.write("\t\t\t\t\t\t<p>Always fresh-cut vegetables from local farms to your table.</p>\n");
      out.write("\t\t\t\t\t\t<a class=\"btn\">Buy now</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<section id=\"online\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-4 col-lg-offset-1 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"online-cap\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Now you can buy products online</h2>\n");
      out.write("\t\t\t\t\t\t\t<p>We are your one-stop-shop for locally-produced, fresh organic food.</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-onl\">Shop now</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    san_pham_query sq = new san_pham_query();
    m_san_pham sp = new m_san_pham();
    
    ArrayList<m_san_pham> a = sq.Doc_top_san_pham();
    

      out.write("\n");
      out.write("\n");
      out.write("<section id=\"best-seller\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<h2 class=\"bs-title\">Best Seller</h2>\n");
      out.write("\t\t\t\t<hr style=\"width: 50px; height: 2px; border-radius: 15px; background: #009344; margin-bottom: 30px\">\n");
      out.write("                            ");
 for(m_san_pham s:a) {
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"product-item\">\n");
      out.write("\t\t\t\t\t\t<div class=\"product-img\">\n");
      out.write("\t\t\t\t\t\t\t<p class=\"product-name\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">");
      out.print( s.getTen_san_pham());
      out.write("</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"img-change\" href=\"chi_tiet_san_pham?ma_san_pham=");
      out.print( s.getMa_san_pham());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-responsive\" src=\"public/images/");
      out.print( s.getHinh());
      out.write("\" alt=\"Chilli\">\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"product-info\">\n");
      out.write("\t\t\t\t\t\t\t<p class=\"product-price\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"money\" data-currency-usd=\"$30.00\">$30.00</span>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"product-cart\">\n");
      out.write("\t\t\t\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"CartServlet?command=plus&ma_san_pham=");
      out.print( s.getMa_san_pham());
      out.write("\">\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span class=\"fa-stack fa-lg\">\n");
      out.write("                                                                                    \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-circle fa-stack-2x fa-bg\" ></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-shopping-cart fa-stack-1x fa-icon\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                         \n");
      out.write("\n");
      out.write("                            \n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("</section>");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"slider\">\n");
      out.write("\t<div class=\"slideshow-container\">\n");
      out.write("\t\t<div class=\"mySlides fade\">\n");
      out.write("\t\t\t<div class=\"numbertext\">1 / 3</div>\n");
      out.write("\t\t\t<img src=\"public/images/slider_3.jpg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("\t\t</div>\t\t  \n");
      out.write("\n");
      out.write("\t\t<div class=\"mySlides fade\">\n");
      out.write("\t\t\t<div class=\"numbertext\">2 / 3</div>\n");
      out.write("\t\t\t<img src=\"public/images/slider_discount.jpg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"mySlides fade\">\n");
      out.write("\t\t\t<div class=\"numbertext\">3 / 3</div>\n");
      out.write("\t\t\t<img src=\"public/images/slider_buy1.jpg\" style=\"width:100%\">\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<br>\n");
      out.write("\n");
      out.write("\t<div style=\"text-align:center\">\n");
      out.write("\t\t<span class=\"dot\"></span> \n");
      out.write("\t\t<span class=\"dot\"></span> \n");
      out.write("\t\t<span class=\"dot\"></span> \n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section id=\"mission\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1>what we do</h1>\n");
      out.write("\t\t<hr style=\"width: 50px; height: 2px; border-radius: 15px; background: #009344;\">\n");
      out.write("\t\t<div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t<div class=\"mission-task\">\n");
      out.write("\t\t\t\t<img class=\"img-responsive\" src=\"public/images/shopping-cart.png\">\n");
      out.write("\t\t\t\t<h3>Explore</h3>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris in porttitor massa, vel consequat neque.</p>\n");
      out.write("\t\t\t\t<a class=\"btn-bs\">Read more</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t<div class=\"mission-task\">\n");
      out.write("\t\t\t\t<img class=\"img-responsive\" src=\"public/images/shopping-cart.png\">\n");
      out.write("\t\t\t\t<h3>Inspiration</h3>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris in porttitor massa, vel consequat neque.</p>\n");
      out.write("\t\t\t\t<a class=\"btn-bs\">Read more</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t<div class=\"mission-task\">\n");
      out.write("\t\t\t\t<img class=\"img-responsive\" src=\"public/images/shopping-cart.png\">\n");
      out.write("\t\t\t\t<h3>Explore</h3>\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris in porttitor massa, vel consequat neque.</p>\n");
      out.write("\t\t\t\t<a class=\"btn-bs\">Read more</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"test\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("</div>");
      out.write('\r');
      out.write('\n');

        
    }
    else if(view == "views/login_register/v_register.jsp")
    {
    

      out.write('\r');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!--<head> \n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t Website CSS style \n");
      out.write("\t\t<link href=\"../../public/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t\t Website Font style \n");
      out.write("\t    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../../public_main/css/style.css\">\n");
      out.write("\t\t Google Fonts \n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>\n");
      out.write("                <script src=\"../../public/js/kiemtra.js\"></script>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<title>Admin</title>\n");
      out.write("\t</head>\n");
      out.write("                \n");
      out.write("\t\t\n");
      out.write("<body>\t-->\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row main\">\n");
      out.write("\t\t\t\t<div class=\"main-login main-center\">\n");
      out.write("                                    <h2 style=\"text-align: center\">Đăng kí</h2>\n");
      out.write("\t\t\t\t\t<form class=\"\" method=\"post\" action=\"user\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                                    <input name=\"command\" value=\"dangki\" type=\"hidden\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"name\" class=\"cols-sm-2 control-label\">Your Name (*)</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"ten_khach_hang\" id=\"name\"  placeholder=\"Enter your Name\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"email\" class=\"cols-sm-2 control-label\">Your Email (*)</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\"  placeholder=\"Enter your Email\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"password\" class=\"cols-sm-2 control-label\">Password (*)</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"mat_khau\" id=\"password\"  placeholder=\"Enter your Password\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"confirm\" class=\"cols-sm-2 control-label\">Confirm Password (*)</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"confirm\" id=\"confirm\"  placeholder=\"Confirm your Password\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"cols-sm-2 control-label\">Ngày sinh</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"ngay_sinh\" id=\"datepicker\"  placeholder=\"Enter your birth\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"cols-sm-2 control-label\">Địa chỉ</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"dia_chi\" id=\"dia_chi\"  placeholder=\"Enter your address\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"cols-sm-2 control-label\">Điện thoại</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"dien_thoai\" id=\"dien_thoai\"  placeholder=\"Enter your number\"/>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("                                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"username\" class=\"cols-sm-2 control-label\">Phái</label>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"radio\" value=\"1\" name=\"phai\" checked=\"checked\" />Nam &nbsp; \n");
      out.write("                                                                        <input type=\"radio\" value=\"0\" name=\"phai\" />Nữ\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("                                            \n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group \">\n");
      out.write("                                                    <input type=\"submit\" class=\"btn btn-primary btn-lg btn-block login-button\" onclick=\"return kiemtra_dangki()\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("   \t\n");
      out.write("\n");
      out.write("\t\t <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("    <!--<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>-->\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("    <!--<script src=\"../../public/js/bootstrap.min.js\"></script>-->\n");
      out.write("\t<!--</body>-->\n");
      out.write("<!--</html>-->");
      out.write('\r');
      out.write('\n');

        
    }
     
    else if(view == "views/product/v_san_pham.jsp")
    {

      out.write('\r');
      out.write('\n');
      out.write("<section id=\"online\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("\t\t\t\t\t<div class=\"online-cap\">\n");
      out.write("\t\t\t\t\t\t<h1>Fruits & Vegetables</h1>\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\t\t<div class=\"information\">\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tMany people love supermarkets for the variety of products they can buy there. Such customers adore looking at the collection of different stuff and choose from all these things. However the products are strictly classified.\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t<p>\n");
      out.write("\t\t\t\tThe assortment is not only comfortably structured. We treat every customer as a welcoming guest and that's why the main elements of the supermarket are totally adapted for the visitors' comfort. First of all, it's worth to be mentioned about the good loyal prices suitable for any customer.\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
      out.write('\n');
      out.write("<div class=\"container\">\n");
      out.write("\t\t<div class=\"col-md-3\">\n");
      out.write("            <div class=\"leftMenu\">\n");
      out.write("  <details>\n");
      out.write("      <summary><a href=\"#\" style=\"color:white; text-decoration: none\">Meat </a></summary>\n");
      out.write("   \n");
      out.write("  </details>\n");
      out.write("\n");
      out.write("  <details>\n");
      out.write("    <summary>Vegetable & Fruit <span class=\"glyphicon glyphicon-chevron-down\" style=\"float: right;\"></span></summary>\n");
      out.write("    <a href=\"san_phams?command=vegetable\">Vegetable</a>\n");
      out.write("    <a href=\"san_phams?command=fruit\">Fruit</a>\n");
      out.write("    \n");
      out.write("  </details>\n");
      out.write("\n");
      out.write("  <details>\n");
      out.write("      <summary> <a href=\"san_phams?command=ingredient\" style=\"color:white; text-decoration: none\">Ingredient </a></summary>\n");
      out.write("   \n");
      out.write("  </details>\n");
      out.write("\n");
      out.write("  <details>\n");
      out.write("      <summary> <a href=\"san_phams?command=seafood\" style=\"color:white; text-decoration: none\">Seafood </a></summary>\n");
      out.write("   \n");
      out.write("  </details>\n");
      out.write("                \n");
      out.write("  <details>\n");
      out.write("    <summary>Snack & Drink <span class=\"glyphicon glyphicon-chevron-down\" style=\"float: right;\"></span></summary>\n");
      out.write("    <a href=\"san_phams?command=snack\">Snack</a>\n");
      out.write("    <a href=\"san_phams?command=drink\">Drink</a>\n");
      out.write("    \n");
      out.write("  </details>\n");
      out.write("                \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"leftMenu\">\n");
      out.write("  <h4><span class=\"glyphicon glyphicon-minus\" aria-hidden=\"true\"></span>&nbsp;Special</h4>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Discount (20)</label>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>New Arrival (20)</label>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"leftMenu\">\n");
      out.write("  <h4><span class=\"glyphicon glyphicon-minus\" aria-hidden=\"true\"></span>&nbsp;Price</h4>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>< $5</label>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>$5 - $20</label>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>$20 - $50</label>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>$50 - $100</label>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>> $100</label>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"leftMenu\">\n");
      out.write("  <h4><span class=\"glyphicon glyphicon-minus\" aria-hidden=\"true\"></span>&nbsp;Brands</h4>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>ABC (20)</label>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Bin (20)</label>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Jenny (20)</label>\n");
      out.write("  <label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Harrik (20)</label>\n");
      out.write("</div>      \n");
      out.write("        </div>");
      out.write('\n');
      out.write('\n');
      out.write('\n');

    ArrayList<m_san_pham> top = (ArrayList)request.getAttribute("top");

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-md-9\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-9 col-sm-9 col-xs-9\">\n");
      out.write("\t\t\t\t\t<h2>\n");
      out.write("\t\t\t\t\tFruit</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 col-sm-3 col-xs-3\">\n");
      out.write("\t\t\t\t\t<!-- Controls -->\n");
      out.write("\t\t\t\t\t<div class=\"controls pull-right hidden-xs\">\n");
      out.write("\t\t\t\t\t\t<a class=\"left fa fa-chevron-left btn \" href=\"#carousel-example\"\n");
      out.write("\t\t\t\t\t\tdata-slide=\"prev\"></a><a class=\"right fa fa-chevron-right btn\" href=\"#carousel-example\"\n");
      out.write("\t\t\t\t\t\tdata-slide=\"next\"></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"carousel-example\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\t\t\t\t<!-- Wrapper for slides -->\n");
      out.write("\t\t\t\t<div class=\"carousel-inner\">\n");
      out.write("                                    \n");
      out.write("                            ");

                                int dem3 = 0;
                                int dem2 = 0;
                                for(m_san_pham s:top)
                                {
                                    if(dem2 == 0)
                                    {
                            
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"item ");
      out.print( (dem3==0 && (dem3%4)==0)?"active":"" );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("                                    ");

                                        dem2++;
                                        dem3++;
                                    }
                                    if(dem2 <= 4)
                                    {
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-3\">\n");
      out.write("                                    <div class=\"col-item\">\n");
      out.write("                                            <div class=\"photo\">\n");
      out.write("                                                <a href=\"chi_tiet_san_pham?ma_san_pham=");
      out.print( s.getMa_san_pham());
      out.write("\" title=\"view details\"><img src=\"public/images/");
      out.print( s.getHinh());
      out.write("\" class=\"img-responsive\" alt=\"a\" /></a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"info\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                            <div class=\"rating col-md-6 col-sm-6 col-xs-6\" style=\"text-align: left;\">\n");
      out.write("\n");
      out.write("                                                                    ");
      out.print( s.getTen_san_pham());
      out.write("\n");
      out.write("                                            <!-- <h5 class=\"price-text-color\">\n");
      out.write("                                            $199.99</h5> -->\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"rating hidden-sm col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                                        \t$ ");
      out.print( s.getDon_gia());
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"separator clear-left\">\n");
      out.write("                                    \t<p class=\"btn-add\">\n");
      out.write("                                    \t\t<a href=\"CartServlet?command=plus&ma_san_pham=");
      out.print( s.getMa_san_pham());
      out.write("\" class=\"hidden-sm\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a></p>\n");
      out.write("                                    \t\t<!--  -->\n");
      out.write("                                    \t</div>\n");
      out.write("                                    \t<div class=\"clearfix\">\n");
      out.write("                                    \t</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                 ");

                                    dem2++;
                                    dem3++;
                                    }
                                    if(dem2 >4)
                                    {
                                 
      out.write("\n");
      out.write("                                  </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                    dem3++;
                                    dem2=0;
                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                                                    \n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
    ArrayList<m_san_pham> sps = (ArrayList)request.getAttribute("san_phams"); 
    
    String command = "";
    if(request.getAttribute("command")!=null)
        command = (String) request.getAttribute("command");
    int countsp = sps.size();
   
    

      out.write("\n");
      out.write("\n");
      out.write(" <div class=\"row\">\n");
      out.write("        \t<div class=\"row\">\n");
      out.write("        \t\t<div class=\"col-md-9\">\n");
      out.write("        \t\t\t<h2>\n");
      out.write("        \t\t\tPromotion For Now</h2>\n");
      out.write("        \t\t</div>\n");
      out.write("                        \n");
      out.write("                    ");

                    int dem1 = 0;
                    int sl = sps.size();
                    for(m_san_pham sp:sps)
                    { 
                        if(dem1 == 0)
                        {
                    
      out.write("\n");
      out.write("                    <div class=\"item\" style=\" margin-top: 30px \">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                    ");
 
                        dem1++;
                        }
                        if(dem1 <= 3)
                        {
                            
                        
                    
                    
      out.write("\n");
      out.write("                            <div class=\"col-sm-4\">\n");
      out.write("                                <div class=\"col-item\">\n");
      out.write("                                    <div class=\"photo\">\n");
      out.write("                                        <a href=\"chi_tiet_san_pham?ma_san_pham=");
      out.print( sp.getMa_san_pham());
      out.write("\"><img src=\"public/images/");
      out.print( sp.getHinh());
      out.write("\" class=\"img-responsive\" alt=\"a\" /></a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"info\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"price col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                                                <h5>\n");
      out.write("                                                ");
      out.print( sp.getTen_san_pham());
      out.write("</h5>\n");
      out.write("                                                <h5 class=\"discount\">\n");
      out.write("                                                $49.99</h5>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"rating hidden-sm col-md-6 col-sm-6 col-xs-6\">\n");
      out.write("                                                $");
      out.print( sp.getDon_gia());
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"separator clear-left\">\n");
      out.write("                                            <p class=\"btn-add\">\n");
      out.write("                                                <i class=\"fa fa-shopping-cart\"></i><a href=\"CartServlet?command=plus&ma_san_pham=");
      out.print( sp.getMa_san_pham());
      out.write("\" class=\"hidden-sm\">Add to cart</a></p>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"clearfix\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                            </div>\n");
      out.write("                    ");

                        dem1++;
                        }
                        if(dem1 > 3)
                        {
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                           </div>\n");
      out.write("                    </div> \n");
      out.write("                        \n");
      out.write("                    ");

                            dem1=0;
                         }
                    
                    
      out.write("    \n");
      out.write("                    \n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                       </div>\n");
      out.write("           \n");
      out.write("        </div> \n");
      out.write("                    ");
 
                    
                    if((request.getAttribute("count"))!=null){
      out.write(" \n");
      out.write("                                ");
 int count = Integer.parseInt(String.valueOf(request.getAttribute("count")));
      out.write("        \n");
      out.write("                                <ul class=\"pagination\">\n");
      out.write("                                     ");
 
                                    int dem = 0;
                                    if(count%6 == 0)
                                    {
                                        dem = count/6;
                                    }
                                    else
                                        dem = count/6 + 1;
                                    for(int i = 1; i <= dem ; i++) {
      out.write("\n");
      out.write("                                    <li><a href=\"san_phams?command=");
      out.print( command);
      out.write("&pages=");
      out.print( i);
      out.write('"');
      out.write('>');
      out.print( i);
      out.write("</a></li>\n");
      out.write("                                   \n");
      out.write("                                    ");

                                        }
                                    
      out.write("\n");
      out.write("                                  </ul>\n");
      out.write("                                 ");

                                }
                                 
      out.write("\n");
      out.write("                   \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write('\r');
      out.write('\n');

        
    }
    else if(view == "views/single/v_single.jsp")
    {

      out.write('\r');
      out.write('\n');
      out.write('\n');
      out.write('\n');
 
    m_san_pham sp = (m_san_pham)request.getAttribute("sp");


      out.write("\n");
      out.write("<div class=\"men\">\n");
      out.write("   \t<div class=\"container\">\n");
      out.write("      <div class=\"col-md-9 single_top\">\n");
      out.write("      \t<div class=\"single_left\">\n");
      out.write("      \t  <div class=\"labout span_1_of_a1\">\n");
      out.write("\t\t\t<div class=\"flexslider\">\n");
      out.write("\t\t\t\t\t <ul class=\"slides\">\n");
      out.write("                                             <li data-thumb=\"public/images/");
      out.print( sp.getHinh());
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"public/images/");
      out.print( sp.getHinh());
      out.write("\" />\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t </ul>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t          <div class=\"clearfix\"></div>\t\n");
      out.write("\t    </div>\n");
      out.write("\t\t<div class=\"cont1 span_2_of_a1 simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t<h1>");
      out.print( sp.getTen_san_pham());
      out.write("</h1>\n");
      out.write("\t\t\t\t<p class=\"availability\">Views: <span class=\"color\">");
      out.print( sp.getSo_lan_xem());
      out.write("</span></p>\n");
      out.write("                                \n");
      out.write("\t\t\t    <!-- <div class=\"price_single\">\n");
      out.write("\t\t\t\t  <span class=\"reducedfrom\">$140.00</span>\n");
      out.write("\t\t\t\t  <span class=\"amount item_price actual\">$120.00</span><a href=\"#\">click for offer</a>\n");
      out.write("\t\t\t\t</div> -->\n");
      out.write("\t\t\t\t<h2 class=\"quick\">Quick Overview:</h2>\n");
      out.write("\t\t\t\t<ul class=\"quick_desc\"> \n");
      out.write("\t\t\t\t\t<li>Nam liber tempor cum soluta nobis eleifend optioncongue</li> \n");
      out.write("\t\t\t\t\t<li>nihil imperdiet doming id quod mazim placerat facer possim assum.</li>\n");
      out.write("\t\t\t\t\t<li>Typi non habent claritatem insitam; es</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t    <div class=\"wish-list\">\n");
      out.write("\t\t\t\t \t<span class=\"amount item_price actual\">$");
      out.print( sp.getDon_gia());
      out.write("</span>\n");
      out.write("\t\t\t\t </div>\n");
      out.write("                                 \n");
      out.write("\t\t\t\t<div class=\"quantity_box\">\n");
      out.write("\t\t\t\t\t<ul class=\"product-qty\">\n");
      out.write("\t\t\t\t\t   <!-- <span>Quantity:</span> -->\n");
      out.write("                                           <select class=\"product-qty\" name=\"\">\n");
      out.write("                                               <option value=\"1\">1</option>\n");
      out.write("\t\t\t\t\t\t <option value=\"2\">2</option>\n");
      out.write("\t\t\t\t\t\t <option value=\"3\">3</option>\n");
      out.write("\t\t\t\t\t\t <option>4</option>\n");
      out.write("\t\t\t\t\t\t <option>5</option>\n");
      out.write("\t\t\t\t\t\t <option>6</option>\n");
      out.write("\t\t\t\t\t   </select>\n");
      out.write("\t\t\t\t\t   <a href=\"CartServlet?command=plus&ma_san_pham=");
      out.print( sp.getMa_san_pham());
      out.write("\" class=\"btn btn-primary btn-normal btn-inline btn_form button item_add item_1\" target=\"_self\">Add to cart</a>\n");
      out.write("\t\t\t\t    </ul>\n");
      out.write("\t\t\t\t    <ul class=\"single_social\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t   \t\t    </ul>\n");
      out.write("\t\t   \t\t    <div class=\"clearfix\"></div>\n");
      out.write("\t   \t\t    </div>\n");
      out.write("\t\t\t    \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t    <div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("      ");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
 
    ArrayList<m_san_pham> loai_sp = (ArrayList)request.getAttribute("loai_sp");
    
    

      out.write("\n");
      out.write("<div class=\"col-md-3 tabs\">\n");
      out.write("\t      <h3 class=\"m_1\">Related Products</h3>\n");
      out.write("              \n");
      out.write("            ");
for (m_san_pham l:loai_sp){
      out.write("\n");
      out.write("\t      <ul class=\"product\">\n");
      out.write("                  <li class=\"product_img\"><img src=\"public/images/");
      out.print( l.getHinh());
      out.write("\" class=\"img-responsive\" alt=\"\"/></li>\n");
      out.write("\t      \t<li class=\"product_desc\">\n");
      out.write("\t      \t\t<h4><a href=\"#\">");
      out.print( l.getTen_san_pham());
      out.write("</a></h4>\n");
      out.write("\t      \t\t<p class=\"single_price\">$");
      out.print( l.getDon_gia());
      out.write("</p>\n");
      out.write("                        <a href=\"chi_tiet_san_pham?ma_san_pham=");
      out.print( l.getMa_san_pham());
      out.write("\" class=\"link-cart\">Shop now</a>\n");
      out.write("\t      \t    \n");
      out.write("\t        </li>\n");
      out.write("\t      \t<div class=\"clearfix\"> </div>\n");
      out.write("\t      </ul>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("\t     \n");
      out.write("        </div>");
      out.write("\n");
      out.write("     <div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("   </div>");
      out.write('\r');
      out.write('\n');

        
    }
    else if(view == "views/checkout/v_checkout.jsp")
    {

      out.write('\r');
      out.write('\n');
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

        cart c = (cart)session.getAttribute("cart");
        m_khach_hang k = (m_khach_hang)session.getAttribute("kh");
        
        if(c==null)
            response.sendRedirect("/QL_SieuThi/index.jsp");
        
      out.write("\n");
      out.write("        <h1>Chao,");
      out.print( k.getTen_khach_hang());
      out.write("</h1>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" width=\"100%\" style=\"font-size: 20px;\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Ten san pham</td>\n");
      out.write("                <td>Don gia</td>\n");
      out.write("                <td>So luong</td>\n");
      out.write("                <td>Tong</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
for(Map.Entry<Integer , Item> list: c.getCartItems().entrySet() ){
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( list.getValue().getSp().getTen_san_pham());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( list.getValue().getSp().getDon_gia());
      out.write("</td>\n");
      out.write("                <td>1</td>\n");
      out.write("                <td>");
      out.print( (list.getValue().getSp().getDon_gia()*1));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        Tong tien: ");
      out.print( c.totalCart());
      out.write("\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        <a href=\"dat_hang.jsp\" class=\"btn btn-success btn-circle\">Dat hang</a>\n");
      out.write("        <a href=\"index.jsp\" class=\"btn btn-success btn-circle\">Mua tiep</a>");
      out.write('\r');
      out.write('\n');

        
    }

      out.write('\n');
      out.write('\n');
      out.write("<footer>\n");
      out.write("        \t\t\t\t\t\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("        \t\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("        \t\t\t\t\t\t\t\t<div class=\"map\">\n");
      out.write("        \t\t\t\t\t\t\t\t\t<h2>watermelon</h2>\n");
      out.write("        \t\t\t\t\t\t\t\t\t<div>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p><strong>Address</strong></p>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p>97 Man Thien Street, District 9, HCMC</p>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p><strong>Phone</strong></p>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p> 028 - 1234 - 567</p>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p><strong>E-mail</strong></p>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p>watermelon@gmail.com</p>\n");
      out.write("        \t\t\t\t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("        \t\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("        \t\t\t\t\t\t\t\t<div class=\"map\">\n");
      out.write("        \t\t\t\t\t\t\t\t\t<h2>Blog</h2>\n");
      out.write("        \t\t\t\t\t\t\t\t\t<div>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p><strong>How to get the promotion?</strong></p>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p><strong>Fresh - Cheap - Tasty</strong></p>\n");
      out.write("        \t\t\t\t\t\t\t\t\t\t<p> Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("\n");
      out.write("        \t\t\t\t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("        \t\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("        \t\t\t\t\t\t\t\t<div class=\"form-group signup\">\n");
      out.write("        \t\t\t\t\t\t\t\t\t<b>Email: </b><input type=\"email\" id=\"email\" class=\"form-control\"><br>\n");
      out.write("        \t\t\t\t\t\t\t\t\t<b>Password: </b><input type=\"password\" class=\"form-control\" id=\"pass\"></div>\n");
      out.write("        \t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn-signup\" onclick=\"signup();\">Sign up</button>\n");
      out.write("        \t\t\t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t\t\t<p style=\"text-align: center; margin-top: 20px; font-size: 12px; color: #333\">Copyright &copy; 2017 All rights reserved by watermelon </p> \n");
      out.write("        \t\t\t\t\t\t</div>\n");
      out.write("        \t\t\t\t\t</footer>\n");
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("<script src=\"public_main/js/bootstrap.js\"></script>\n");
      out.write("<script defer src=\"public_main/js/jquery.flexslider.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"public_main/css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script>\n");
      out.write("// Can also be used with $(document).ready()\n");
      out.write("$(window).load(function() {\n");
      out.write("  $('.flexslider').flexslider({\n");
      out.write("    animation: \"slide\",\n");
      out.write("    controlNav: \"thumbnails\"\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<script>\n");
      out.write("\tdocument.addEventListener('DOMContentLoaded', function(){\n");
      out.write("\t\tlet wrapper = document.getElementById('wrapper');\n");
      out.write("\t\tlet topLayer = wrapper.querySelector('.top');\n");
      out.write("\t\tlet handle = wrapper.querySelector('.handle');\n");
      out.write("\t\tlet skew = 0;\n");
      out.write("\t\tlet delta = 0;\n");
      out.write("\n");
      out.write("\t\tif(wrapper.className.indexOf('skewed') != -1){\n");
      out.write("\t\t\tskew = 1000;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\twrapper.addEventListener('mousemove', function(e){\n");
      out.write("\t\t\tdelta = (e.clientX - window.innerWidth / 2) * 0.5;\n");
      out.write("\n");
      out.write("\t\t\thandle.style.left = e.clientX + delta + 'px';\n");
      out.write("\n");
      out.write("\t\t\ttopLayer.style.width= e.clientX + skew + delta + 'px';\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\tfunction signup(){\n");
      out.write("\t\tvar email = document.getElementById(\"email\").value;\n");
      out.write("\t\tvar pass = document.getElementById(\"email\").value;\n");
      out.write("\n");
      out.write("\t\tif(email == \"\" || pass == \"\"){\n");
      out.write("\t\t\talert(\"Please fill in!\");\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\tvar slideIndex = 0;\n");
      out.write("\tshowSlides();\n");
      out.write("\n");
      out.write("\tfunction showSlides() {\n");
      out.write("\t\tvar i;\n");
      out.write("\t\tvar slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("\t\tvar dots = document.getElementsByClassName(\"dot\");\n");
      out.write("\t\tfor (i = 0; i < slides.length; i++) {\n");
      out.write("\t\t\tslides[i].style.display = \"none\";  \n");
      out.write("\t\t}\n");
      out.write("\t\tslideIndex++;\n");
      out.write("\t\tif (slideIndex > slides.length) {slideIndex = 1}    \n");
      out.write("\t\t\tfor (i = 0; i < dots.length; i++) {\n");
      out.write("\t\t\t\tdots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tslides[slideIndex-1].style.display = \"block\";  \n");
      out.write("\t\t\tdots[slideIndex-1].className += \" active\";\n");
      out.write("    setTimeout(showSlides, 2000); // Change image every 2 seconds\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function myFunction() {\n");
      out.write("        var x = document.getElementById(\"myTopnav\");\n");
      out.write("        if (x.className === \"topnav\") {\n");
      out.write("            x.className += \" responsive\";\n");
      out.write("        } else {\n");
      out.write("            x.className = \"topnav\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

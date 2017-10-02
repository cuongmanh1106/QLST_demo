
<%@page import="model.m_khach_hang"%>
<%@page import="model.Item"%>
<%@page import="java.util.Map"%>
<%@page import="model.cart"%>
<%
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
    

%>

<div class="header">
    <%if(kh!=null){%>
    <p><%= kh.getEmail()%></p>
    <p><%= kh.getTen_khach_hang()%></p>
    <p><%= kh.getPhai()%></p>
    <p><%= kh.getNgay_sinh()%></p>
    <p><%= kh.getDia_chi()%></p>
    <p><%= kh.getDien_thoai()%></p>
    <p><%= kh.getMat_khau()%></p>
    
    <%}%>
            <div class="header-top">
                <div class="container">	
                    <div class="header-top-in">			
                        <div class="logo">
                            <a href="index.jsp"><img src="images/logo.png" alt=" " ></a>
                        </div>
                        <div class="header-in">
                            <ul class="icon1 sub-icon1">
                                
                                <li><a href="signin">  Sign In/</a></li>
                                <li><a href="register">  Register</a></li>
                                <li><div class="cart">
                                        <a href="#" class="cart-in"> </a>
                                        <span><%= ca.countItem()%> </span>
                                    </div>
                                    <ul class="sub-icon1 list">
                                        <h3>Recently added items(2)</h3>
                                        <div class="shopping_cart">
                                            
                                            <%for(Map.Entry<Integer , Item> list: ca.getCartItems().entrySet() ){%>
                                            <div class="cart_box">
                                                <div class="message">
                                                    <div class="alert-close"> </div> 
                                                    <div class="list_img"><img src="public/images/<%= list.getValue().getSp().getHinh()%>" class="img-responsive" alt=""></div>
                                                    <div class="list_desc"><h4><a href="CartServlet?command=remove&ma_san_pham=<%= list.getValue().getSp().getMa_san_pham()%>"><%= list.getValue().getSp().getTen_san_pham()%></a></h4>1 x<span class="actual">
                                                            <%= list.getValue().getSp().getDon_gia()%></span></div>
                                                    
                                                    <div class="clearfix"></div>
                                                </div>
                                            </div>
                                            <%}%>
                                        </div>
                                        <div class="total">
                                            <div class="total_left">CartSubtotal : </div>
                                            <div class="total_right"><%= ca.totalCart()%></div>
                                            <div class="clearfix"> </div>
                                        </div>
                                        <div class="login_buttons">
                                            <div class="check_button"><a href="xemgiohang">Check out</a></div>
                                            <div class="clearfix"></div>
                                        </div>
                                        <div class="clearfix"></div>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>

        </div>
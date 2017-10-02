<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.cart"%>
<%@page import="model.m_khach_hang"%>
<%@page import="model.m_khach_hang"%>


<%
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
%>
<div class="container">
		<div class="logo center col-lg-4 col-md-4 col-sm-4 col-xs-12">
			<img class="img-responsive" src="public/images/logo_final.png">	
		</div>

		<div class="col-lg-4 col-md-4 col-sm-4 col-xs-6">
			<div class="search">	
				<form action="Search" method="post" role="search">
					<div class="form-group">
                                            <input type="text" name="search" value=""   placeholder="Search Product ...">
                                            <!--<input type="submit">-->
                                            <button type="submit">
							<span class="glyphicon glyphicon-search"></span>
						</button>
					</div>

				</form>


			</div>
		</div>
		
		<div class="brand col-lg-4 col-md-4 col-sm-4 col-xs-6">
                        <span class="fa-stack fa-lg login"> 
                            <a href="<%= (kh!=null)?"Logout":"form_login"%>" title="<%= (kh!=null)?"Logout":"Login"%>"><i class="fa fa-user fa-stack-2x" aria-hidden="true"></i></a>
                               
                        </span>
                   
			
			

			<span class="fa-stack fa-lg">
                            <a href="form_register" title="register">
				<i class="fa fa-circle fa-stack-2x"></i>
				<i class="fa fa-users fa-stack-1x fa-inverse"></i>
                            </a>
			</span>
                   
                            
                            <ul class="icon1 sub-icon1">
                               
                                <li class="sl"><span style="font-size: 15px;">( <%= (ca.countItem()==0)?"Empty":ca.countItem()%> ) </span>
                                <div class="cart">
                                        
                                        <a href="#" class="cart-in"> </a>
                                            
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
                       
                        
                    <%
                       
    
                        if(session.getAttribute("kh")!=null)
                        {
                            kh = (m_khach_hang)session.getAttribute("kh");
                        
                    %>
                    <h4>
                        <span>
                            Chào, <span style="color: red"><%= kh.getTen_khach_hang()%></span>
                        </span>
                    </h4>
                    
                    <%}%>
		</div>
		
	</div>
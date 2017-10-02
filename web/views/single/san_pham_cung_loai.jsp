 
<%@page import="model.m_san_pham"%>
<%@page import="java.util.ArrayList"%>
<% 
    ArrayList<m_san_pham> loai_sp = (ArrayList)request.getAttribute("loai_sp");
    
    
%>
<div class="col-md-3 tabs">
	      <h3 class="m_1">Related Products</h3>
              
            <%for (m_san_pham l:loai_sp){%>
	      <ul class="product">
                  <li class="product_img"><img src="public/images/Fruit/<%= l.getHinh()%>" class="img-responsive" alt=""/></li>
	      	<li class="product_desc">
	      		<h4><a href="#"><%= l.getTen_san_pham()%></a></h4>
	      		<p class="single_price"><%= l.getDon_gia()%></p>
                        <a href="chi_tiet_san_pham?ma_san_pham=<%= l.getMa_san_pham()%>" class="link-cart">Shop now</a>
	      	    
	        </li>
	      	<div class="clearfix"> </div>
	      </ul>
            <%}%>
	     
        </div>

<%@page import="model.m_san_pham"%>
<% 
    m_san_pham sp = (m_san_pham)request.getAttribute("sp");

%>
<div class="men">
   	<div class="container">
      <div class="col-md-9 single_top">
      	<div class="single_left">
      	  <div class="labout span_1_of_a1">
			<div class="flexslider">
					 <ul class="slides">
                                             <li data-thumb="public/images/Fruit/<%= sp.getHinh()%>">
							<img src="public/images/Fruit/<%= sp.getHinh()%>" />
						
					 </ul>
				  </div>
		          <div class="clearfix"></div>	
	    </div>
		<div class="cont1 span_2_of_a1 simpleCart_shelfItem">
				<h1><%= sp.getTen_san_pham()%></h1>
				<p class="availability">Views: <span class="color"><%= sp.getSo_lan_xem()%></span></p>
                                
			    <!-- <div class="price_single">
				  <span class="reducedfrom">$140.00</span>
				  <span class="amount item_price actual">$120.00</span><a href="#">click for offer</a>
				</div> -->
				<h2 class="quick">Quick Overview:</h2>
				<ul class="quick_desc"> 
					<li>Nam liber tempor cum soluta nobis eleifend optioncongue</li> 
					<li>nihil imperdiet doming id quod mazim placerat facer possim assum.</li>
					<li>Typi non habent claritatem insitam; es</li>
				</ul>
			    <div class="wish-list">
				 	<span class="amount item_price actual"><%= sp.getDon_gia()%></span>
				 </div>
                                 
				<div class="quantity_box">
					<ul class="product-qty">
					   <!-- <span>Quantity:</span> -->
                                           <select class="product-qty" name="">
                                               <option value="1">1</option>
						 <option value="2">2</option>
						 <option value="3">3</option>
						 <option>4</option>
						 <option>5</option>
						 <option>6</option>
					   </select>
					   <a href="CartServlet?command=plus&ma_san_pham=<%= sp.getMa_san_pham()%>" class="btn btn-primary btn-normal btn-inline btn_form button item_add item_1" target="_self">Add to cart</a>
				    </ul>
				    <ul class="single_social">
						
		   		    </ul>
		   		    <div class="clearfix"></div>
	   		    </div>
			    
			</div>
		    <div class="clearfix"> </div>
		</div>

		</div>
      <%@include file = "san_pham_cung_loai.jsp" %>
     <div class="clearfix"> </div>
	</div>
   </div>
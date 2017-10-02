<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dbHelpers.san_pham_query"%>
<%@page import="model.m_san_pham"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    san_pham_query sq = new san_pham_query();
    m_san_pham sp = new m_san_pham();
    
    ArrayList<m_san_pham> a = sq.Doc_top_san_pham();
    
%>

<section id="best-seller">
			<div class="container">
				<h2 class="bs-title">Best Seller</h2>
				<hr style="width: 50px; height: 2px; border-radius: 15px; background: #009344; margin-bottom: 30px">
                            <% for(m_san_pham s:a) {%>
				<div class="col-lg-4 col-md-4">
					<div class="product-item">
						<div class="product-img">
							<p class="product-name">
								<a href="#"><%= s.getTen_san_pham()%></a>
							</p>
							<a class="img-change" href="public/images/Vegetable/<%= s.getHinh()%>">
								<img class="img-responsive" src="public/images/<%= s.getHinh()%>" alt="Chilli">
							</a>
						</div>
						<div class="product-info">
							<p class="product-price">
								<span class="money" data-currency-usd="$30.00">$30.00</span>
							</p>
							<div class="product-cart">
								<form>
									<input type="hidden" name="id" value="">
									<a href="CartServlet?command=plus&ma_san_pham=<%= s.getMa_san_pham()%>">	
										<span class="fa-stack fa-lg">
                                                                                    
											<i class="fa fa-circle fa-stack-2x fa-bg" ></i>
											<i class="fa fa-shopping-cart fa-stack-1x fa-icon"></i>
										</span>
									</a>
								</form>
							</div>
						</div>
					</div>
				</div>
                            <%}%>
                         

                            
	
</div>
</section>
<%@page import="model.m_san_pham"%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<m_san_pham> top = (ArrayList)request.getAttribute("top");
%>

<div class="col-md-9">
        <div class="row">
			<div class="row">
				<div class="col-md-9 col-sm-9 col-xs-9">
					<h2>
					Fruit</h2>
				</div>
				<div class="col-md-3 col-sm-3 col-xs-3">
					<!-- Controls -->
					<div class="controls pull-right hidden-xs">
						<a class="left fa fa-chevron-left btn " href="#carousel-example"
						data-slide="prev"></a><a class="right fa fa-chevron-right btn" href="#carousel-example"
						data-slide="next"></a>
					</div>
				</div>
			</div>
			<div id="carousel-example" class="carousel slide" data-ride="carousel">
				<!-- Wrapper for slides -->
				<div class="carousel-inner">
                                    
                            <%
                                int dem3 = 0;
                                int dem2 = 0;
                                for(m_san_pham s:top)
                                {
                                    if(dem2 == 0)
                                    {
                            %>
					<div class="item <%= (dem3==0 && (dem3%4)==0)?"active":"" %>">
						<div class="row">
                                    <%
                                        dem2++;
                                        dem3++;
                                    }
                                    if(dem2 <= 4)
                                    {
                                    %>
                                    


                            <div class="col-sm-3">
                                    <div class="col-item">
                                            <div class="photo">
                                                <a href="chi_tiet_san_pham?ma_san_pham=<%= s.getMa_san_pham()%>" title="view details"><img src="public/images/<%= s.getHinh()%>" class="img-responsive" alt="a" /></a>
                                            </div>
                                            <div class="info">
                                                    <div class="row">
                                                            <div class="rating col-md-6 col-sm-6 col-xs-6" style="text-align: left;">

                                                                    <%= s.getTen_san_pham()%>
                                            <!-- <h5 class="price-text-color">
                                            $199.99</h5> -->
                                        </div>
                                        <div class="rating hidden-sm col-md-6 col-sm-6 col-xs-6">
                                        	$ <%= s.getDon_gia()%>
                                        </div>
                                    </div>
                                    <div class="separator clear-left">
                                    	<p class="btn-add">
                                    		<a href="CartServlet?command=plus&ma_san_pham=<%= s.getMa_san_pham()%>" class="hidden-sm"><i class="fa fa-shopping-cart"></i>Add to cart</a></p>
                                    		<!--  -->
                                    	</div>
                                    	<div class="clearfix">
                                    	</div>
                                    </div>
                                </div>
                            </div>
                                 <%
                                    dem2++;
                                    dem3++;
                                    }
                                    if(dem2 >4)
                                    {
                                 %>
                                  </div>
                                </div>
                                <%
                                    dem3++;
                                    dem2=0;
                                    }
                                %>

                        
                                                    
                        <%
                            }
                        %>
                       

                   
                </div>
            </div>
        </div>

<%@page import="model.m_san_pham"%>
<%@page import="java.util.ArrayList"%>
<% 
    ArrayList<m_san_pham> sps = (ArrayList)request.getAttribute("san_phams"); 
    
    String command = "";
    if(request.getAttribute("command")!=null)
        command = (String) request.getAttribute("command");
    int countsp = sps.size();
   
    
%>

<% if(request.getAttribute("error")!=null)
{
    String error = (String) request.getAttribute("error");
%>
<h1 style="color:red"><%= error%></h1>
<%
}
%>

 <div class="row">
        	<div class="row">
        		<div class="col-md-9">
                            <h2 style="margin-top: 30px;">
        			Promotion For Now</h2>
        		</div>
                        
                    <%
                    int dem1 = 0;
                    int sl = sps.size();
                    for(m_san_pham sp:sps)
                    { 
                        if(dem1 == 0)
                        {
                    %>
                    <div class="item" style=" margin-top: 30px ">
                        <div class="row">
                    <% 
                        dem1++;
                        }
                        if(dem1 <= 3)
                        {
                            
                        
                    
                    %>
                            <div class="col-sm-4">
                                <div class="col-item">
                                    <div class="photo">
                                        <a href="chi_tiet_san_pham?ma_san_pham=<%= sp.getMa_san_pham()%>"><img src="public/images/<%= sp.getHinh()%>" class="img-responsive" alt="a" /></a>
                                    </div>
                                    <div class="info">
                                        <div class="row">
                                            <div class="price col-md-6 col-sm-6 col-xs-6">
                                                <h5>
                                                <%= sp.getTen_san_pham()%></h5>
                                                <h5 class="discount">
                                                $49.99</h5>
                                            </div>
                                            <div class="rating hidden-sm col-md-6 col-sm-6 col-xs-6">
                                                $<%= sp.getDon_gia()%>
                                            </div>
                                        </div>
                                        <div class="separator clear-left">
                                            <p class="btn-add">
                                                <i class="fa fa-shopping-cart"></i><a href="CartServlet?command=plus&ma_san_pham=<%= sp.getMa_san_pham()%>" class="hidden-sm">Add to cart</a></p>

                                            </div>
                                            <div class="clearfix">
                                            </div>
                                        </div>
                                    </div>
                            </div>
                    <%
                        dem1++;
                        }
                        if(dem1 > 3)
                        {
                    %>
                    
                           </div>
                    </div> 
                        
                    <%
                            dem1=0;
                         }
                    
                    %>    
                    
                    <%
                    }
                    %>
                    
                    
                    
                  
                       </div>
           
        </div> 
                    <% 
                    
                    if((request.getAttribute("count"))!=null){%> 
                                <% int count = Integer.parseInt(String.valueOf(request.getAttribute("count")));%>        
                                <ul class="pagination">
                                     <% 
                                    int dem = 0;
                                    if(count%6 == 0)
                                    {
                                        dem = count/6;
                                    }
                                    else
                                        dem = count/6 + 1;
                                    for(int i = 1; i <= dem ; i++) {%>
                                    <li><a href="san_phams?command=<%= command%>&pages=<%= i%>"><%= i%></a></li>
                                   
                                    <%
                                        }
                                    %>
                                  </ul>
                                 <%
                                }
                                 %>
                   

            </div>
           
        </div>
    </div>
</div>
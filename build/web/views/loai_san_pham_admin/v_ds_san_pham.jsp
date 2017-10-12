<%@page import="model.m_loai_san_pham"%>
<%@page import="dbHelpers.loai_san_pham_query"%>
<%@page import="dbHelpers.loai_san_pham_cha_query"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.m_san_pham"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<% 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_san_pham> list = (ArrayList) request.getAttribute("san_phams");

    int ma_loai = Integer.parseInt(String.valueOf(request.getAttribute("ma_loai")));
    
   
    
    
%>

<div id="page-wrapper">

            
            <div class="row">
                 <!--  page header -->
                <div class="col-lg-12">
                    <h1 class="page-header">Danh sách sản phẩm</h1>
                </div>
                 <!-- end  page header -->
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                             
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Mã sản phẩm</th>
                                            <th>Tên sản phẩm</th>
                                            <th>Ten loai</th>
                                            <th>Mô tả tóm tắt</th>
                                            <th>Đơn giá</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% for(m_san_pham sp:list){ 
                                            loai_san_pham_query lq = new loai_san_pham_query();
                                            m_loai_san_pham lsp = lq.Doc_loai_san_pham_theo_ma_loai(sp.getMa_loai());
                                            
                                        %>
                                        <tr class="odd gradeX">
                                            <td><%= sp.getMa_san_pham()%></td>
                                            <td><%= sp.getTen_san_pham()%></td>
                                            <td><%= lsp.getTen_loai()%></td>
                                            <td><%= sp.getMo_ta_tom_tat()%></td>
                                            
                                            <td class="center"><%=(sp.getDon_gia())%></td>
                                                          
                                            <td class="center">
                                               

                                                <a href="form_sua?ma_san_pham=<%= sp.getMa_san_pham()%>&command=san_pham" title="Edit" >
                                                <img src="public/images/icons/pencil.png" alt="Edit" />
                                                </a> 
                                                <a href="javaScript:void(0)" title="Delete" onclick="Xoasanpham(<%= sp.getMa_san_pham()%>)"> 
                                                <img src="public/images/icons/cross.png" alt="Delete" />
                                                </a>                     
                                                
                                            </td>
                                        </tr>
                                        <% }%>
                                       
                                    </tbody>
                                    
                                    
                                </table>
                                 
                                <% if(String.valueOf(request.getAttribute("count"))!=null){%> 
                                <% int count = Integer.parseInt(String.valueOf(request.getAttribute("count")));%>        
                                <ul class="pagination">
                                     <% 
                                    int dem = 0;
                                    if(count%5 == 0)
                                    {
                                        dem = count/5;
                                    }
                                    else
                                        dem = count/5 + 1;
                                    for(int i = 1; i <= dem ; i++) {%>
                                    <li><a href="Ds_san_pham_theo_ma_loai?ma_loai=<%= ma_loai%>&pages=<%= i%>"><%= i%></a></li>
                                   
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
                    <!--End Advanced Tables -->
                </div>
            </div>
           
        </div>
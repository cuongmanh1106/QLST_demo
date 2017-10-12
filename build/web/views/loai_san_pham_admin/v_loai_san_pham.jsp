<%@page import="model.m_loai_san_pham_cha"%>
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
    
    ArrayList<m_loai_san_pham> list = (ArrayList) request.getAttribute("loai_san_phams");

    
    
   String thongbao ="";
   if(request.getAttribute("thongbao")!=null)
       thongbao = (String)request.getAttribute("thongbao");
   
   if(thongbao.equals("error"))
   {
    
    
%>
<%= "<script> alert('Da co san pham thuoc loai san pham nay') </script>"%>
<%
   }
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
                             <form method="post" action="search">
                                <input type="hidden" name="command" value="loai_san_pham">
                                <input type="text" placeholder="Nhập mã loại..." name="tim" id="tim" value="">
                                <input type="submit" value="Tim" onclick="return kiemtrasearchso()">
                            </form>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Ma loai</th>
                                            <th>Ten loai</th>
                                            <th>Ten loai cha</th>
                                           
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% for(m_loai_san_pham lsp:list){ 
                                            loai_san_pham_cha_query lq = new loai_san_pham_cha_query();
                                            m_loai_san_pham_cha lc = lq.Doc_loai_san_pham_cha_phan_trang(lsp.getMa_loai_cha());
                                            
                                        %>
                                        <tr class="odd gradeX">
                                            <td><%= lsp.getMa_loai()%></td>
                                            <td><%= lsp.getTen_loai()%></td>
                                            <td><%= lc.getTen_loai()%></td>
                                            
                                                          
                                            <td class="center">
                                               

                                                <a href="form_sua?ma_loai=<%= lsp.getMa_loai()%>&command=loai_san_pham" title="Edit" >
                                                <img src="public/images/pencil.png" alt="Edit" />
                                                </a> 
                                                <a href="javaScript:void(0)" title="Delete" onclick="Xoaloaisanpham(<%= lsp.getMa_loai()%>)"> 
                                                <img src="public/images/cross.png" alt="Delete" />
                                                </a>                     
                                                <a href="Ds_san_pham_theo_ma_loai?ma_loai=<%= lsp.getMa_loai()%>" title="Xem danh sach san pham" >
                                                <img src="public/images/search.png" alt="Seach_more" />
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
                                    if(count%4 == 0)
                                    {
                                        dem = count/4;
                                    }
                                    else
                                        dem = count/4 + 1;
                                    for(int i = 1; i <= dem ; i++) {%>
                                    <li><a href="loai_san_pham_admin?pages=<%= i%>"><%= i%></a></li>
                                   
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
<%@page import="model.m_loai_san_pham_cha"%>
<%@page import="model.m_loai_san_pham"%>
<%@page import="dbHelpers.loai_san_pham_query"%>
<%@page import="dbHelpers.loai_san_pham_cha_query"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.m_san_pham"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<% 
    
    ArrayList<m_loai_san_pham_cha> list = (ArrayList) request.getAttribute("lcs");

    
    
   String thongbao ="";
   if(request.getAttribute("thongbao")!=null)
       thongbao = (String)request.getAttribute("thongbao");
   
   if(thongbao.equals("error"))
   {
    
    
%>
<%= "<script> alert('Da co LOAI SAN PHAM thuoc LOAI SAN PHAM CHA nay') </script>"%>
<%
   }
%>

<div id="page-wrapper">

            
            <div class="row">
                 <!--  page header -->
                <div class="col-lg-12">
                    <h1 class="page-header">Danh sách loai san pham cha</h1>
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
                                <input type="text" name="tim" id="tim" value="">
                                <input type="submit" value="Tim" onclick="return kiemtrasearchso()">
                            </form>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Ma loai cha</th>
                                            <th>Ten loai</th>
                                            
                                           
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% for(m_loai_san_pham_cha lc:list){ 
                                            loai_san_pham_cha_query lq = new loai_san_pham_cha_query();
                                            
                                            
                                        %>
                                        <tr class="odd gradeX">
                                            <td><%= lc.getMa_loai_cha()%></td>
                                            <td><%= lc.getTen_loai()%></td>
                                            
                                            
                                                          
                                            <td class="center">
                                               

                                                <a href="form_sua?ma_loai=<%= lc.getMa_loai_cha()%>&command=loai_san_pham" title="Edit" >
                                                <img src="public/images/icons/pencil.png" alt="Edit" />
                                                </a> 
                                                <a href="javaScript:void(0)" title="Delete" onclick="Xoaloaisanphamcha(<%= lc.getMa_loai_cha()%>)"> 
                                                <img src="public/images/icons/cross.png" alt="Delete" />
                                                </a>                     
                                               
                                                
                                            </td>
                                        </tr>
                                        <% }%>
                                       
                                    </tbody>
                                    
                                    
                                </table>
                                  
                                
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
           
        </div>
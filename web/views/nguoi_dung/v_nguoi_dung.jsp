
<%@page import="model.m_nguoi_dung"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<% 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_nguoi_dung> list = (ArrayList) request.getAttribute("nd");

    
    
   
String thongbao ="";
   if(request.getAttribute("thongbao")!=null)
       thongbao = (String)request.getAttribute("thongbao");
   
   if(thongbao.equals("error"))
   {
    
    
%>
<%= "<script> alert('Đã có HÓA ĐƠN chưa SẢN PHẨM NÀY') </script>"%>
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
                                <input type="hidden" name="command" value="san_pham">
                                <input type="text" name="tim" value="">
                                <input type="submit" value="Tim">
                            </form>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Mã nguoi dung</th>
                                            <th>Ho ten</th>
                                            <th>Ten dang nhap</th>
                                            <th>Email</th>
                                            <th>Ngay dang nhap cuoi</th>
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% for(m_nguoi_dung nguoi_dung:list){ 
                                            
                                            
                                        %>
                                        <tr class="odd gradeX">
                                            <td><%= nguoi_dung.getMa_nguoi_dung()%></td>
                                            <td><%= nguoi_dung.getHo_ten()%></td>
                                            <td><%= nguoi_dung.getTen_dang_nhap()%></td>
                                            <td><%= nguoi_dung.getEmail()%></td>
                                            <td><%= nguoi_dung.getNgay_dang_nhap_cuoi()%></td>
                                            
                                           
                                                          
                                            <td class="center">
                                               

                                                <a href="form_sua?ma_nguoi_dung=<%= nguoi_dung.getMa_nguoi_dung()%>&command=nguoi_dung" title="Edit" >
                                                <img src="public/images/icons/pencil.png" alt="Edit" />
                                                </a> 
                                                <a href="javaScript:void(0)" title="Delete" onclick="Xoanguoidung<%= nguoi_dung.getMa_nguoi_dung()%>)"> 
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
<%@page import="java.util.ArrayList"%>
<%@page import="model.m_khach_hang"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<% 
//   ArrayList<m_san_pham> list = new ArrayList<>();
//    if(request.getAttribute("san_phams")!=null)
//        list = (ArrayList) request.getAttribute("san_phams");
    
    ArrayList<m_khach_hang> list = (ArrayList) request.getAttribute("list");
    
    String tim = "";
    tim = (String)request.getAttribute("tim");

    
    
   
    
    
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
                                <input type="hidden" name="command" value="khach_hang">
                                <input type="text" placeholder="Nhập tên khách hàng...." name="tim" value="<%= (tim!="")?tim:""%>">
                                <input type="submit" value="Tim">
                            </form>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Mã khach hang</th>
                                            <th>Tên khach hang</th> 
                                            <th>Dia chi</th>
                                            <th>Dien thoai</th>
                                            <th>Email</th>
                                            
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% for(m_khach_hang kh:list){ 
                                            
                                            
                                        %>
                                        <tr class="odd gradeX">
                                            <td><%= kh.getMa_khach_hang()%></td>
                                            <td><%= kh.getTen_khach_hang()%></td>
                                            <td><%= kh.getDia_chi()%></td>
                                            <td><%= kh.getDien_thoai()%></td>
                                            <td><%= kh.getEmail()%></td>
                                            
                                            
                                                          
                                            <td class="center">
                                               
                                                <a href="form_sua?ma_khach_hang=<%= kh.getMa_khach_hang()%>&command=khach_hang" title="Edit" >
                                                <img src="public/images/icons/pencil.png" alt="Edit" />
                                                </a> 
                                               
                                                <a href="javaScript:void(0)" title="Delete" onclick="Xoasanpham(<%= kh.getMa_khach_hang()%>)"> 
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
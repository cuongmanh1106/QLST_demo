<%@page import="model.m_khach_hang"%>
<%@page import="dbHelpers.khach_hang_query"%>
<%@page import="model.m_hoa_don"%>
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
    
    ArrayList<m_hoa_don> list = (ArrayList) request.getAttribute("ct_hoa_don");

    
    
   
    
    
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
                                <input type="hidden" name="command" value="hoa_don">
                                <input type="text" name="tim" value="">
                                <input type="submit" value="Tim">
                            </form>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Ngay in</th>
                                            <th>Tên khach hang</th>
                                            <th>Tri gia</th>
                                            <th>Tinh trang</th>
                                            
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% for(m_hoa_don hd:list){ 
                                            khach_hang_query kq = new khach_hang_query();
                                            m_khach_hang kh = kq.doc_khach_hang_theo_ma_khach_hang(hd.getMa_khach_hang());
                                            
                                        %>
                                        <tr class="odd gradeX">
                                            <td><%= hd.getNgay_in()%></td>
                                            <td><%= kh.getTen_khach_hang()%></td>
                                            <td><%= hd.getTri_gia()%></td>
                                            <td><%= (hd.getTinh_trang()==1)?"Da thanh toan":"Chua thanh toan"%></td>
                                            
                                           
                                                          
                                            <td class="center">
                                               
                                                <a href="chi_tiet_hoa_don?ma_hoa_don=<%= hd.getMa_hoa_don()%>" title="Xem chi tiet hoa don" >
                                                <img src="public/images/icons/search.png" alt="Edit" />
                                                </a> 
                                                
<!--                                                <a href="javaScript:void(0)" title="Delete" onclick="Xoahoadon()"> 
                                                <img src="public/images/icons/cross.png" alt="Delete" />
                                                </a>                     -->
                                                
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
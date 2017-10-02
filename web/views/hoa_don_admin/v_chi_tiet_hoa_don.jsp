<%@page import="dbHelpers.san_pham_query"%>
<%@page import="model.m_chi_tiet_hoa_don"%>
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
    
    ArrayList<m_chi_tiet_hoa_don> list = (ArrayList) request.getAttribute("ct_hoa_don");

    
    
   
    
    
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
                                            <th>Tên sản phẩm</th>
                                            <th>Số lượng</th>
                                            <th>Đơn giá</th>
                                           
                                            <th></th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% for(m_chi_tiet_hoa_don ct:list){ 
                                            
                                            m_san_pham sp = new m_san_pham();
                                            san_pham_query sq = new san_pham_query();
                                            
                                            sp = sq.doc_san_pham_theo_ma_san_pham(ct.getMa_san_pham());
                                        %>
                                        <tr class="odd gradeX">
                                            <td><%= sp.getTen_san_pham()%></td>
                                            <td><%= ct.getSo_luong()%></td>
                                            <td><%= ct.getDon_gia()%></td>

                                        </tr>
                                        <% }%>
                                       
                                    </tbody>
                                    
                                    
                                </table>
                                 
                              <input class="button btn btn-default" type="button" value="Bỏ qua" onclick="window.location='hoa_don_admin'" />
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
           
        </div>
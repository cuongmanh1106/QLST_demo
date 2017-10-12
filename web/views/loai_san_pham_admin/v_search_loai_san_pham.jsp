<%@page import="model.m_loai_san_pham_cha"%>
<%@page import="model.m_loai_san_pham"%>
<%@page import="dbHelpers.loai_san_pham_query"%>
<%@page import="dbHelpers.loai_san_pham_cha_query"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.m_san_pham"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<% 

    
    m_loai_san_pham lsp = (m_loai_san_pham) request.getAttribute("lsp");
    
    
    
    int ma_loai = Integer.parseInt(String.valueOf(request.getAttribute("ma_loai")));
    
    loai_san_pham_cha_query cq = new loai_san_pham_cha_query();
    m_loai_san_pham_cha lc = cq.Doc_loai_san_pham_cha_phan_trang(lsp.getMa_loai_cha());
   
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
                                       
                                        <tr class="odd gradeX">
                                            <td><%= lsp.getMa_loai()%></td>
                                            <td><%= lsp.getTen_loai()%></td>
                                            <td><%= lc.getTen_loai()%></td>
                                            
                                            
                                                          
                                            <td class="center">
                                               

                                                <a href="form_sua?ma_loai=<%= lsp.getMa_loai()%>&command=loai_san_pham" title="Edit" >
                                                <img src="public/images/icons/pencil.png" alt="Edit" />
                                                </a> 
                                                <a href="javaScript:void(0)" title="Delete" onclick="Xoaloaisanpham(<%= lsp.getMa_loai()%>)"> 
                                                <img src="public/images/icons/cross.png" alt="Delete" />
                                                </a>                     
                                                
                                            </td>
                                        </tr>
                                       
                                       
                                    </tbody>
                                    
                                    
                                </table>
                                 
                                
                            </div>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
           
        </div>
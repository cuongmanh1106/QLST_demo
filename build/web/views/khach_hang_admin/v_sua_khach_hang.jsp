<%@page import="model.m_khach_hang"%>
<%@page import="model.m_loai_san_pham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.m_san_pham"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="page-wrapper">

<%m_khach_hang kh = (m_khach_hang) request.getAttribute("kh");%>      

   
    <div class="row">
         <!--  page header -->
        <div class="col-lg-12">
            <h1 class="page-header">Sua khach hang</h1>
        </div>
         
         
         <!-- end  page header -->
    </div>
    <div class="row">
        <div class="col-lg-12">
            <!-- Advanced Tables -->
            <div class="panel panel-default">
                <div class="panel-heading">
                     Advanced Tables
                </div>
                <div class="panel-body">
    <form method="post"  action="sua_khach_hang">
        <fieldset>
            <input type="hidden" name="ma_khach_hang" value="<%= kh.getMa_khach_hang() %>">
          <p>
              <label class="alert">Tên khach hang</label>
              <input class="text-input small-input kiemtra" type="text" id="ten_khach_hang" name="ten_khach_hang" value="<%= kh.getTen_khach_hang() %>" />
          </p>
          
          <p>
              <label class="alert">Email</label>
              <input class="text-input small-input kiemtra" readonly="readonly" type="text" id="email" name="email" value="<%= kh.getEmail() %>" />
          </p>
          
          
          <p>
              <label class="alert">Mat khau</label>
              <input class="text-input small-input kiemtra" type="password" id="ten_khach_hang" name="mat_khau" readonly="readonly" value="<%= kh.getMat_khau() %>" />
          </p>
          
         <p>
              <label class="alert">Dien thoai</label>
              <input class="text-input small-input kiemtra"  type="text" id="dien_thoai" name="dien_thoai" value="<%= kh.getDien_thoai() %>" />
          </p>
          
         
          <br>
          
            
          <p>
            <input class="button btn btn-primary" type="submit" value="Cập nhật" name="btnCapnhat"  />
            <input class="button btn btn-default" type="button" value="Bỏ qua" onclick="window.location='khach_hang_admin'" />
          </p>
        </fieldset>
        <div class="clear"></div>
        <!-- End .clear -->
        
    </form>
                            
                        </div>
                    </div>
                    <!--End Advanced Tables -->
                </div>
            </div>
           
        </div>
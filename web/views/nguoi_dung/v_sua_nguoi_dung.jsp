
<%@page import="model.m_nguoi_dung"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="page-wrapper">
    
<%
  m_nguoi_dung nguoi_dung = (m_nguoi_dung)request.getAttribute("nd");
%>
            
    <div class="row">
         <!--  page header -->
        <div class="col-lg-12">
            <h1 class="page-header">Sửa người dùng</h1>
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
    <form method="post"  action="sua_nguoi_dung">
        <fieldset>
          
            <input type="hidden" name="ma_nguoi_dung" value="<%= nguoi_dung.getMa_nguoi_dung()%>">
          <p>
              <label class="alert">Họ tên </label>
              <input class="text-input small-input kiemtra" type="text" id="ho_ten" name="ho_ten" value="<%= nguoi_dung.getHo_ten()%>" />
          </p>
          
           <p>
              <label class="alert">Tên đăng nhập </label>
              <input class="text-input small-input kiemtra" type="text" id="ten_dang_nhap" name="ten_dang_nhap" value="<%= nguoi_dung.getTen_dang_nhap()%>" />
          </p>
          
           <p>
              <label class="alert">Mật khẩu </label>
              <input class="text-input small-input kiemtra" type="password" id="mat_khau" name="mat_khau" value="<%= nguoi_dung.getMat_khau()%>" />
          </p>
          
           <p>
              <label class="alert">Email </label>
              <input class="text-input small-input kiemtra" type="email" id="email" name="email" value="<%= nguoi_dung.getEmail()%>" />
          </p>
          

          <p>
            <input class="button btn btn-primary" type="submit" value="Cập nhật" name="btnCapnhat" onclick="return kiemtranguoidung()  />
            <input class="button btn btn-default" type="button" value="Bỏ qua" onclick="window.location='nguoi_dung_admin'" />
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

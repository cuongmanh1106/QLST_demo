<%@page import="model.m_loai_san_pham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="page-wrapper">

            
    <div class="row">
         <!--  page header -->
        <div class="col-lg-12">
            <h1 class="page-header">Thêm sản phẩm</h1>
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
    <form method="post"  action="them_san_pham">
        <fieldset>
          
          <p>
              <label class="alert">Tên sản phẩm</label>
            <input class="text-input small-input kiemtra" type="text" id="ten_san_pham" name="ten_san_pham" />
          </p>
          
          
          <p>
            <label class="alert">Mã loại</label>
            
            <% ArrayList<m_loai_san_pham> loai_san_phams = (ArrayList) request.getAttribute("list"); %>
            
             <select class="form-control" id="form-field-select-1" name="ma_loai">
                 
             <% for(m_loai_san_pham l:loai_san_phams){%>
                
            <option value="<%= l.getMa_loai()%>"> <%= l.getTen_loai()%> </option>
            <%
            }
            %>
            </select>
          </p>
          
          <p>
            <label class="alert">Nội dung tóm tắt</label>
            <textarea name="noi_dung_tom_tat" cols="50" rows="3" class="text-input textarea wysiwyg " id="medium-input"></textarea>
          </p>
          <p>
            <label class="alert">Nội dung chi tiết</label>
            <textarea name="noi_dung_chi_tiet" cols="50" rows="5" class="text-input large-input ckeditor" id="large-input"></textarea>
          </p>
          
          <p>
            <label class="alert">Đơn giá</label>
            <input class="text-input small-input kiemtra"  type="text" id="don_gia" name="don_gia" />
          </p>
          
          <p>
            <label class="alert">Hình </label>
            <input type="file" name="hinh" id="hinh" />
            <div class="image-holder" id="image-holder"></div>
          <p>
          
          
          
            
          <p>
              <input class="button btn btn-primary" type="submit" value="Cập nhật" name="btnCapnhat" onclick="return Kiemtrathemsanpham()"  />
            <input class="button btn btn-default" type="button" value="Bỏ qua" onclick="window.location='san_phams_admin'" />
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

<%@page import="model.m_loai_san_pham_cha"%>
<%@page import="model.m_loai_san_pham"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="page-wrapper">

            
    <div class="row">
         <!--  page header -->
        <div class="col-lg-12">
            <h1 class="page-header">Thêm Loai San Pham</h1>
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
    <form method="post"  action="them_loai_san_pham">
        <fieldset>
          
          <p>
              <label class="alert">Tên loai</label>
            <input class="text-input small-input kiemtra" type="text" id="ten_san_pham" name="ten_loai" />
          </p>
          
          
          <p>
            <label class="alert">Mã loại</label>
            
            <% ArrayList<m_loai_san_pham_cha> loai_san_pham_chas = (ArrayList) request.getAttribute("list"); %>
            
             <select class="form-control" id="form-field-select-1" name="ma_loai_cha">
                 
             <% for(m_loai_san_pham_cha c:loai_san_pham_chas){%>
                
            <option value="<%= c.getMa_loai_cha()%>"> <%= c.getTen_loai()%> </option>
            <%
            }
            %>
            </select>
          
            
          <p>
              <input class="button btn btn-primary" type="submit" value="Cập nhật" name="" onclick="return kiemtraloaisanpham()"  />
            <input class="button btn btn-default" type="button" value="Bỏ qua" onclick="window.location='loai_san_pham_admin'" />
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

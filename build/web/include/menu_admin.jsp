<%@page import="model.m_nguoi_dung"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    m_nguoi_dung nd = null;
    if(session.getAttribute("nd")!=null)
    {
        nd = (m_nguoi_dung)session.getAttribute("nd");
    }
%>
<nav class="navbar-default navbar-static-side" role="navigation">
            <!-- sidebar-collapse -->
            <div class="sidebar-collapse">
                <!-- side-menu -->
                <ul class="nav" id="side-menu">
                    <li>
                        <!-- user image section-->
                        <div class="user-section">
                            <div class="user-section-inner">
                                <img src="public/img/user.jpg" alt="">
                            </div>
                            <div class="user-info">
                                <% if(nd!=null){%>
                                <div><%= nd.getHo_ten()%></div>
                                <%}%>
                                <div class="user-text-online">
                                    <a href="logout_admin"><span class="user-circle-online btn btn-success btn-circle "></span>&nbsp;Logout</a>
                                </div>
                            </div>
                        </div>
                        <!--end user image section-->
                    </li>
                    <li class="sidebar-search">
                        <!-- search section-->
                        <div class="input-group custom-search-form">
                            <input type="text" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                        </div>
                        <!--end search section-->
                    </li>
                    <li class="selected">
                        <a href="index.html"><i class="fa fa-dashboard fa-fw"></i>Danh mục</a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Sản Phẩm<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="san_phams_admin?pages=1">Danh sách sản phẩm</a>
                            </li>
                            <li>
                                <a href="form_them?command=san_pham">Thêm sản phẩm</a>
                            </li>
                        </ul>
                        <!-- second-level-items -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Loại sản phẩm<span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="loai_san_pham_admin?pages=1">Danh sách loại sản phẩm</a>
                            </li>
                            <li>
                                <a href="form_them?command=loai_san_pham">Thêm loại sản phẩm</a>
                            </li>
                        </ul>
                        <!-- second-level-items -->
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>Loại sản phẩm cha <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="loai_san_pham_cha">Danh sách loại sản phẩm cha</a>
                            </li>
                            <li>
                                <a href="form_them?command=loai_san_pham_cha">Thêm loại sản phẩm cha</a>
                            </li>
                        </ul>
                        <!-- second-level-items -->
                    </li>
                    
                    <li>
                        <a href="khach_hang_admin"><i class="fa fa-edit fa-fw"></i>Khach hang</a>
                    </li>
                     <li>
                        <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>Người Dùng <span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li>
                                <a href="nguoi_dung_admin">Danh sách người dùng</a>
                            </li>
                            <li>
                                <a href="form_them?command=nguoi_dung">Thêm người dùng</a>
                            </li>
                        </ul>
                        <!-- second-level-items -->
                    </li>
                    
                    <li>
                        <a href="hoa_don_admin"><i class="fa fa-edit fa-fw"></i>Hóa đơn</a>
                    </li>
                    
                    
                       
                    </li>
                </ul>
                <!-- end side-menu -->
            </div>
            <!-- end sidebar-collapse -->
        </nav>
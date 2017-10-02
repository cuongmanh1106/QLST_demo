
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="dbHelpers.hoa_don_query"%>
<%
    hoa_don_query h = new hoa_don_query();
    int sluong = h.hoa_don_chua_xem();
%>
<nav class="navbar navbar-default navbar-fixed-top" role="navigation" id="navbar">
            <!-- navbar-header -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html">
                    <img src="public/img/logo.png" alt="" />
                </a>
            </div>
            <!-- end navbar-header -->
            <!-- navbar-top-links -->
            <ul class="nav navbar-top-links navbar-right">
                <!-- main dropdown -->
              

                <li class="dropdown">
                    <a href="hoa_don_admin" title="Xem đơn hàng mới">
                        <span class="top-label label label-warning"><%= sluong%></span>  <i class="fa fa-bell fa-3x"></i>
                    </a>
                    <!-- dropdown alerts-->
                    
                    <!-- end dropdown-alerts -->
                </li>

               
                <!-- end main dropdown -->
            </ul>
            <!-- end navbar-top-links -->

        </nav>
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_controller;

import dbHelpers.nguoi_dung_query;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.m_nguoi_dung;
import tool.md5;

/**
 *
 * @author Admin
 */
@WebServlet(name = "Admin_dang_nhap", urlPatterns = {"/Admin_dang_nhap"})
public class Admin_dang_nhap extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Admin_dang_nhap</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Admin_dang_nhap at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "";
        String ten_dang_nhap = request.getParameter("ten_dang_nhap");
        String mat_khau = request.getParameter("mat_khau");
        mat_khau = md5.encryption(mat_khau);
        nguoi_dung_query nq = new nguoi_dung_query();
        
        m_nguoi_dung nd = new m_nguoi_dung();
        
        try {
            nd = nq.dang_nhap_admin(ten_dang_nhap, mat_khau);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_dang_nhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(nd!=null)
        {
            HttpSession session = request.getSession();
            session.setAttribute("nd", nd);
            url = "/admin.jsp";
        }
        else
        {
            url = "/Admin_login.jsp";
            String thongbao = "Sai ten dang nhap hoac mat khau";
            request.setAttribute("thongbao", thongbao);
        }
        
        RequestDispatcher dis = request.getRequestDispatcher(url);
        dis.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

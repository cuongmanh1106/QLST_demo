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
import model.m_nguoi_dung;
import tool.md5;

/**
 *
 * @author Admin
 */
@WebServlet(name = "sua_nguoi_dung_admin", urlPatterns = {"/sua_nguoi_dung"})
public class sua_nguoi_dung_admin extends HttpServlet {

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
            out.println("<title>Servlet sua_nguoi_dung_admin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet sua_nguoi_dung_admin at " + request.getContextPath() + "</h1>");
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
        
        doPost(request, response);
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
        
        String ho_ten = request.getParameter("ho_ten");
        String ten_dang_nhap = request.getParameter("ten_dang_nhap");
        String mat_khau = request.getParameter("mat_khau");
        mat_khau = md5.encryption(mat_khau);
        String email = request.getParameter("email");
        int ma_nguoi_dung = Integer.parseInt(request.getParameter("ma_nguoi_dung"));
        
        m_nguoi_dung nd = new m_nguoi_dung();
        
        nguoi_dung_query nq = new nguoi_dung_query();
        
        nd.setMa_loai_nguoi_dung(ma_nguoi_dung);
        nd.setHo_ten(ho_ten);
        nd.setTen_dang_nhap(ten_dang_nhap);
        nd.setMat_khau(mat_khau);
        nd.setEmail(email);
        
        try {
            nq.cap_nhat_nguoi_dung(nd);
        } catch (SQLException ex) {
            Logger.getLogger(them_nguoi_dung_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String url = "/nguoi_dung_admin";
        
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

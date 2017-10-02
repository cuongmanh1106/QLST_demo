/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_controller;

import dbHelpers.san_pham_query;
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
import model.m_san_pham;

/**
 *
 * @author Admin
 */
@WebServlet(name = "sua_san_pham_admin", urlPatterns = {"/sua_san_pham"})
public class sua_san_pham_admin extends HttpServlet {

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
            out.println("<title>Servlet sua_san_pham_admin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet sua_san_pham_admin at " + request.getContextPath() + "</h1>");
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
        
        try {
            san_pham_query sq = new san_pham_query();
            
            m_san_pham sp = new m_san_pham();
            m_san_pham sp1 = new m_san_pham();
            
            
            
            
            String hinh="";
            int ma_san_pham = Integer.parseInt(request.getParameter("ma_san_pham"));
            
            
            sp1 = sq.doc_san_pham_theo_ma_san_pham(ma_san_pham);
            
            
            
            String ten_san_pham = request.getParameter("ten_san_pham");
            int ma_loai = Integer.parseInt(request.getParameter("ma_loai"));
            String mo_ta_tom_tat = request.getParameter("noi_dung_tom_tat");
            String mo_ta_chi_tiet = request.getParameter("noi_dung_chi_tiet");
            int don_gia = Integer.parseInt(request.getParameter("don_gia"));
            String spm = (request.getParameter("san_pham_moi").equals("on"))?"1":"0";
            int san_pham_moi = Integer.parseInt(spm);
            if(request.getParameter("hinh")!=null)
                hinh = request.getParameter("hinh");
            else
                hinh = sp1.getHinh();
            
            sp.setTen_san_pham(ten_san_pham);
            sp.setMa_loai(ma_loai);
            sp.setMo_ta_chi_tiet(mo_ta_chi_tiet);
            sp.setMo_ta_tom_tat(mo_ta_tom_tat);
            sp.setDon_gia(don_gia);
            sp.setHinh(hinh);
            sp.setSan_pham_moi(san_pham_moi);
            sp.setMa_san_pham(ma_san_pham);
            
            
            
            sq.cap_nhat_san_pham(sp);
            
            
            String url = "/san_phams_admin";
            
            RequestDispatcher dis = request.getRequestDispatcher(url);
            
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(sua_san_pham_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
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

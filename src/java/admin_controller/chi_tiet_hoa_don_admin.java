/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_controller;

import dbHelpers.ct_hoa_don_query;
import dbHelpers.hoa_don_query;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.m_chi_tiet_hoa_don;

/**
 *
 * @author Admin
 */
@WebServlet(name = "chi_tiet_hoa_don_admin", urlPatterns = {"/chi_tiet_hoa_don"})
public class chi_tiet_hoa_don_admin extends HttpServlet {

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
            out.println("<title>Servlet chi_tiet_hoa_don_admin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet chi_tiet_hoa_don_admin at " + request.getContextPath() + "</h1>");
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
            int ma_hoa_don = Integer.parseInt(request.getParameter("ma_hoa_don"));
            
            
            ArrayList<m_chi_tiet_hoa_don> ct = new ArrayList<>();
            
            ct_hoa_don_query ctq = new ct_hoa_don_query();
            
            hoa_don_query hq = new hoa_don_query();
            
            hq.cap_nhat_tinh_trang(ma_hoa_don);
            ct = ctq.Doc_chi_tiet_hoa_don_theo_ma_hoa_don(ma_hoa_don);
            
            
            String view = "views/hoa_don_admin/v_chi_tiet_hoa_don.jsp";
            String url = "/hoa_don_admin.jsp";
            request.setAttribute("view", view);
            request.setAttribute("ct_hoa_don", ct);
            
            RequestDispatcher dis = request.getRequestDispatcher(url);
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(chi_tiet_hoa_don_admin.class.getName()).log(Level.SEVERE, null, ex);
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

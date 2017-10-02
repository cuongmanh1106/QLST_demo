/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_controller;

import dbHelpers.loai_san_pham_cha_query;
import dbHelpers.loai_san_pham_query;
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
import model.m_loai_san_pham;

/**
 *
 * @author Admin
 */
@WebServlet(name = "xoa_loai_san_pham_cha_admin", urlPatterns = {"/xoa_loai_san_pham_cha"})
public class xoa_loai_san_pham_cha_admin extends HttpServlet {

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
            out.println("<title>Servlet xoa_loai_san_pham_cha_admin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet xoa_loai_san_pham_cha_admin at " + request.getContextPath() + "</h1>");
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
            int ma_loai_cha = Integer.parseInt(request.getParameter("ma_loai_cha"));
            loai_san_pham_cha_query cq = new loai_san_pham_cha_query();
            loai_san_pham_query lq = new loai_san_pham_query();
            ArrayList<m_loai_san_pham> lsp = new ArrayList<>();
            
            
            lsp = lq.Doc_loai_san_pham_theo_ma_loai_cha(ma_loai_cha);
            String thongbao = "";
            int count = lsp.size();
            if(count==0)
            {
                cq.Xoa_loai_san_pham_cha(ma_loai_cha);
                thongbao ="ok";
            }
            else
                thongbao="error";
            
            
            request.setAttribute("thongbao", thongbao);
            String url = "/loai_san_pham_cha";
            RequestDispatcher dis = request.getRequestDispatcher(url);
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(xoa_loai_san_pham_cha_admin.class.getName()).log(Level.SEVERE, null, ex);
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

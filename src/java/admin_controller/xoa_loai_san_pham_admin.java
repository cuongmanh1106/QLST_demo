/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_controller;

import dbHelpers.loai_san_pham_query;
import dbHelpers.san_pham_query;
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
import model.m_san_pham;

/**
 *
 * @author Admin
 */
@WebServlet(name = "xoa_loai_san_pham_admin", urlPatterns = {"/xoa_loai_san_pham"})
public class xoa_loai_san_pham_admin extends HttpServlet {

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
            out.println("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 3.2 Final//EN\">");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet xoa_loai_san_pham_admin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet xoa_loai_san_pham_admin at " + request.getContextPath() + "</h1>");
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
            int ma_loai = Integer.parseInt(request.getParameter("ma_loai"));
            
            ArrayList<m_san_pham> list = new ArrayList<>();
            san_pham_query sq = new san_pham_query();
            loai_san_pham_query lq = new loai_san_pham_query();
            m_san_pham sp = new m_san_pham();
            m_loai_san_pham lsp = new m_loai_san_pham();
            
            String thongbao ="";
            
            lsp = lq.Doc_loai_san_pham_theo_ma_loai(ma_loai);
            list = sq.Doc_san_pham_theo_ma_loai(lsp.getMa_loai());
            
            int count = list.size();
            
            if(count == 0)
            {
                lq.Xoa_loai_san_pham(ma_loai);
                thongbao = "ok";
            }
            else
            {
                thongbao = "error";
            }
            request.setAttribute("thongbao", thongbao);
            String url ="/loai_san_pham_admin";
            
            RequestDispatcher dis = request.getRequestDispatcher(url);
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(xoa_loai_san_pham_admin.class.getName()).log(Level.SEVERE, null, ex);
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

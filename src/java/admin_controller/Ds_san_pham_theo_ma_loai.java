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
import java.util.ArrayList;
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
@WebServlet(name = "Ds_san_pham_theo_ma_loai", urlPatterns = {"/Ds_san_pham_theo_ma_loai"})
public class Ds_san_pham_theo_ma_loai extends HttpServlet {

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
            out.println("<title>Servlet Ds_san_pham_theo_ma_loai</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ds_san_pham_theo_ma_loai at " + request.getContextPath() + "</h1>");
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
            
            san_pham_query sq = new san_pham_query();
            
            ArrayList<m_san_pham> list = new ArrayList<>();
            
            int pages = 1;
            int limit = 0;
            int vt = 0;
            int count = 0;
            
            if(request.getParameter("pages")!=null)
            {
                pages = Integer.parseInt(request.getParameter("pages"));
            }
            else
                pages = 1;
            
            list = sq.Doc_san_pham_theo_ma_loai(ma_loai);
            count = list.size();
            
            if(count <= 5)
            {
                vt = 1;
                limit = count;
            }
            else{
                vt = (pages - 1)*5;
                limit = 5;
            }
            
            list= sq.Doc_san_pham_theo_ma_loai_pt(ma_loai, vt, limit);
            
            String view = "views/loai_san_pham_admin/v_ds_san_pham.jsp";
            
            request.setAttribute("san_phams", list);
            request.setAttribute("view", view);
            request.setAttribute("count", count);
            request.setAttribute("ma_loai", ma_loai);
            
            String url = "/loai_san_pham_admin.jsp";
            
            RequestDispatcher dis = request.getRequestDispatcher(url);
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Ds_san_pham_theo_ma_loai.class.getName()).log(Level.SEVERE, null, ex);
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

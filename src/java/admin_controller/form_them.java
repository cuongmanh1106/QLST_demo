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
import model.m_loai_san_pham_cha;

/**
 *
 * @author Admin
 */
@WebServlet(name = "form_them", urlPatterns = {"/form_them"})
public class form_them extends HttpServlet {

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
            out.println("<title>Servlet form_them</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet form_them at " + request.getContextPath() + "</h1>");
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
            loai_san_pham_query lq = new loai_san_pham_query();
            loai_san_pham_cha_query cq = new loai_san_pham_cha_query();
            ArrayList<m_loai_san_pham> list = new ArrayList<>();
            ArrayList<m_loai_san_pham_cha> list_cha = new ArrayList<>();
//            String command = "san_pham";
            String command = request.getParameter("command");
            String url = "";
            String view = "";
            switch(command)
            {
                case "san_pham":
                    
                    list = lq.Doc_loai_san_pham();
                    request.setAttribute("list", list);
                    url = "/them_san_pham_admin.jsp";
                    view = "views/san_pham_admin/v_them_san_pham.jsp";
                    
                break;
                   
                case "loai_san_pham":
                    url = "/loai_san_pham_admin.jsp";
                    view = "views/loai_san_pham_admin/v_them_loai_san_pham.jsp";
                    list_cha = cq.Doc_loai_san_pham_cha();
                    request.setAttribute("list", list_cha);
                break;
                    
                case "loai_san_pham_cha":
                    
                    url = "/loai_san_pham_cha_admin.jsp";
                    view = "views/loai_san_pham_cha_admin/v_them_loai_san_pham_cha.jsp";
                    
                break;
                    
                case "nguoi_dung":
                    url = "/nguoi_dung_admin.jsp";
                    view = "views/nguoi_dung/v_them_nguoi_dung.jsp";
                    
                    
                    
                    
            }
            request.setAttribute("view", view);
           
            RequestDispatcher dis = request.getRequestDispatcher(url);
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(form_them.class.getName()).log(Level.SEVERE, null, ex);
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

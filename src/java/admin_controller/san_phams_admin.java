/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_controller;

import controller.san_pham;
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
@WebServlet(name = "san_phams_admin", urlPatterns = {"/san_phams_admin"})
public class san_phams_admin extends HttpServlet {

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
            out.println("<title>Servlet san_phams_admin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet san_phams_admin at " + request.getContextPath() + "</h1>");
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
            ArrayList<m_san_pham> list = new ArrayList<>();
            String sort = "";
            
            int pages = 1;
            int vt = 0;
            int limit = 0;
            int count = 0;
            if(request.getParameter("pages")!=null)
            {
                pages = Integer.parseInt(request.getParameter("pages"));
            }
            else
                pages = 1;
            
            
            list = sq.Doc_san_pham();
            count = list.size();
            
            if(count<=10)
            {
                vt = 1;
                limit = count;
            }
            else
            {
                vt = (pages - 1) *10;
                limit = 10;
            }
            
            
            
            list = sq.Doc_san_pham_phan_trang(vt, limit);
            
            if(request.getParameter("sort")!= null)
            {
                sort = request.getParameter("sort");
                if(sort.equals("A-Z") )
                {
                    list = sq.Doc_san_pham_A_Z(vt, limit);
                    
                }
                else if(sort.equals("Z-A")  )
                {
                    list = sq.Doc_san_pham_Z_A(vt, limit);
                   
                }
                else if(sort.equals("nho-lon"))
                {
                    list = sq.Doc_san_pham_nho_lon(vt, limit);
                   
                }
                 else if(sort.equals("lon-nho"))
                {
                    list = sq.Doc_san_pham_lon_nho(vt, limit);
                   
                }
//                list = sq.Doc_san_pham_A_Z(vt, limit);                  
                request.setAttribute("sort", sort);
                
                
            }
//            list = sq.Doc_san_pham_A_Z(vt, limit);
            
            String view = "views/san_pham_admin/v_san_pham.jsp";
            
            request.setAttribute("san_phams", list);
            request.setAttribute("view", view);
            request.setAttribute("count", count);
            
            String url = "/san_pham_admin.jsp";
            
            RequestDispatcher dis = request.getRequestDispatcher(url);
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(san_phams_admin.class.getName()).log(Level.SEVERE, null, ex);
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

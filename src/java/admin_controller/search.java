/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_controller;

import dbHelpers.hoa_don_query;
import dbHelpers.khach_hang_query;
import dbHelpers.loai_san_pham_cha_query;
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
import model.m_hoa_don;
import model.m_khach_hang;
import model.m_loai_san_pham;
import model.m_san_pham;

/**
 *
 * @author Admin
 */
@WebServlet(name = "search", urlPatterns = {"/search"})
public class search extends HttpServlet {

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
            out.println("<title>Servlet search</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet search at " + request.getContextPath() + "</h1>");
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
            String command = request.getParameter("command");
            String tim = request.getParameter("tim");
           
            san_pham_query sq = new san_pham_query();
            loai_san_pham_query lq = new loai_san_pham_query();
            loai_san_pham_cha_query cq = new loai_san_pham_cha_query();
            ArrayList<m_san_pham> list = new ArrayList<>();
            String view ="";
            String url = "/san_phams_admin";
            switch(command)
            {
                case "san_pham":
                   
                    view = "views/san_pham_admin/v_search_san_pham.jsp";
                    url = "/san_pham_admin.jsp";
                    
                    list = sq.tim_kiem_san_pham(tim);
                    
                    
                    
                   
                    request.setAttribute("san_phams", list);
                    request.setAttribute("tim", tim);
                break;
                
                case "loai_san_pham":
                    view = "views/loai_san_pham_admin/v_search_loai_san_pham.jsp";
                    url = "/loai_san_pham_admin.jsp";
                    int ma_loai = Integer.parseInt(request.getParameter("tim"));
                    m_loai_san_pham lsp = lq.Doc_loai_san_pham_theo_ma_loai(ma_loai);
//                    if(lsp == null)
                        
                    request.setAttribute("lsp", lsp);
                    request.setAttribute("ma_loai", ma_loai);
                break;
                
                case "khach_hang":
                    view= "views/khach_hang_admin/v_search_khach_hang.jsp";
                    url ="/khach_hang_admin.jsp";
                    tim = request.getParameter("tim");
                    
                    ArrayList<m_khach_hang> listkh = new ArrayList<>();
                    
                    khach_hang_query kq = new khach_hang_query();
                    listkh = kq.tim_khach_hang(tim);
                    
                    request.setAttribute("list", listkh);
                    request.setAttribute("tim", tim);
                break;
                    
                case "hoa_don":
                    view = "views/hoa_don_admin/v_search_hoa_don.jsp";
                    url = "/hoa_don_admin.jsp";
                    tim = request.getParameter("tim");
                    ArrayList<m_hoa_don> ct_hoa_don = new ArrayList<>();
                    hoa_don_query hq = new hoa_don_query();
                    
                    ct_hoa_don = hq.tim_hoa_don(tim);
                    
                    request.setAttribute("view", view);
                    request.setAttribute("ct_hoa_don", ct_hoa_don);
                break;
                    
                
                    
            }
            request.setAttribute("view", view);
            RequestDispatcher dis = request.getRequestDispatcher(url);
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(search.class.getName()).log(Level.SEVERE, null, ex);
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

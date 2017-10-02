/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_controller;

import dbHelpers.khach_hang_query;
import dbHelpers.loai_san_pham_cha_query;
import dbHelpers.loai_san_pham_query;
import dbHelpers.nguoi_dung_query;
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
import model.m_khach_hang;
import model.m_loai_san_pham;
import model.m_loai_san_pham_cha;
import model.m_nguoi_dung;
import model.m_san_pham;

/**
 *
 * @author Admin
 */
@WebServlet(name = "form_sua", urlPatterns = {"/form_sua"})
public class form_sua extends HttpServlet {

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
            out.println("<title>Servlet form_sua</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet form_sua at " + request.getContextPath() + "</h1>");
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
            san_pham_query sq = new san_pham_query();
            loai_san_pham_query lq = new loai_san_pham_query();
            loai_san_pham_cha_query cq = new loai_san_pham_cha_query();
            ArrayList<m_loai_san_pham> list = new ArrayList<>();
            ArrayList<m_loai_san_pham_cha> list_cha = new ArrayList<>();
            String view = "";
            String url = "";
            switch(command)
            {
                case "san_pham":
                    int ma_san_pham = Integer.parseInt(request.getParameter("ma_san_pham"));
                    m_san_pham sp = new m_san_pham();
                    
                    list = lq.Doc_loai_san_pham();
                    
                    view = "views/san_pham_admin/v_sua_san_pham.jsp";
                    
                    sp = sq.doc_san_pham_theo_ma_san_pham(ma_san_pham);
                    
                   
                    url = "/sua_san_pham.jsp";
                    request.setAttribute("sp", sp);
                    request.setAttribute("loai_san_phams", list);
                break;
                
                case "loai_san_pham":
                    int ma_loai = Integer.parseInt(request.getParameter("ma_loai"));
                    m_loai_san_pham lsp = new m_loai_san_pham();
                    
                    lsp = lq.Doc_loai_san_pham_theo_ma_loai(ma_loai);
                    
                    list_cha = cq.Doc_loai_san_pham_cha();
                    view = "views/loai_san_pham_admin/v_sua_loai_san_pham.jsp";
                    
                    url ="/loai_san_pham_admin.jsp";
                    request.setAttribute("list", list_cha);
                    request.setAttribute("loai_san_pham", lsp);
                break;
                
                case "khach_hang":
                    int ma_khach_hang = Integer.parseInt(request.getParameter("ma_khach_hang"));
                    khach_hang_query kq = new khach_hang_query();
                    m_khach_hang kh = new m_khach_hang();
                    
                    kh = kq.doc_khach_hang_theo_ma_khach_hang(ma_khach_hang);
                    
                    view = "views/khach_hang_admin/v_sua_khach_hang.jsp";
                    url = "/khach_hang_admin.jsp";
                    request.setAttribute("kh", kh);
                break;
                    
                case "nguoi_dung":
                    
                    int ma_nguoi_dung = Integer.parseInt(request.getParameter("ma_nguoi_dung"));
                    nguoi_dung_query nq = new nguoi_dung_query();
                    m_nguoi_dung nd = new m_nguoi_dung();
                    
                    nd = nq.Doc_nguoi_dung_theo_ma_nguoi_dung(ma_nguoi_dung);
                    
                    view = "views/nguoi_dung/v_sua_nguoi_dung.jsp";
                    url = "/nguoi_dung_admin.jsp";
                    request.setAttribute("nd", nd);
                break;
                    
                   
                    
                    
                    
            }
            
            request.setAttribute("view", view);
            
            RequestDispatcher dis = request.getRequestDispatcher(url);
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(form_sua.class.getName()).log(Level.SEVERE, null, ex);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
@WebServlet(name = "san_phams", urlPatterns = {"/san_phams"})
public class san_phams extends HttpServlet {

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
            out.println("<title>Servlet san_phams</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet san_phams at " + request.getContextPath() + "</h1>");
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
            String command = "";
            if(request.getParameter("command")!=null)
                command = request.getParameter("command");
            else
                command = "";
            
            san_pham_query sq = new san_pham_query();
            ArrayList<m_san_pham> list = new ArrayList<>();
            
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
            
            
            
            
            switch(command)
            {
                
                    
                case "quan_ao":
                    list = sq.Doc_san_pham_quan_ao();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit = 6;
                    }
                    
                    list = sq.Doc_san_pham_quan_ao_pt(vt, limit);
                    
                    break;
                    
                case "thuc_pham_tuoi_song":
                    list = sq.Doc_san_pham_thuc_pham_tuoi_song();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit = 6;
                    }
                    
                    list = sq.Doc_san_pham_thuc_pham_tuoi_song_pt(vt, limit);
                    
                    break;
                    
                case "thuc_an_nhanh":
                    list = sq.Doc_san_pham_thuc_an_nhanh();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit = 6;
                    }
                    
                    list = sq.Doc_san_pham_thuc_pham_thuc_an_nhanh_pt(vt, limit);
                    
                    break;
                            
                case "ao_nam":
                    list = sq.Doc_san_pham_ao_nam();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit = 6;
                    }
                    
                    list = sq.Doc_san_pham_ao_nam_pt(vt, limit);
                    
                    break;
                    
                case "quan_nam":
                    list = sq.Doc_san_pham_quan_nam();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit = 6;
                    }
                    
                    list = sq.Doc_san_pham_quan_nam_pt(vt, limit);
                    
                    break;
                    
                case "ao_nu":
                    list = sq.Doc_san_pham_ao_nu();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit = 6;
                    }
                    
                    list = sq.Doc_san_pham_ao_nu_pt(vt, limit);
                    
                    break;
                    
                case "quan_nu":
                    list = sq.Doc_san_pham_quan_nu();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit =6;
                    }
                    
                    list = sq.Doc_san_pham_quan_nu_pt(vt, limit);
                    
                    break;
                    
                case "rau_cu":
                    list = sq.Doc_san_pham_rau_cu();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit =6;
                    }
                    
                    list = sq.Doc_san_pham_rau_cu_pt(vt, limit);
                    
                    break;
                    
                case "trai_cay":
                    list = sq.Doc_san_pham_trai_cay();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit =6;
                    }
                    
                    list = sq.Doc_san_pham_trai_cay_pt(vt, limit);
                    
                    break;
                    
                case "thit":
                    list = sq.Doc_san_pham_thit();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit =6;
                    }
                    
                    list = sq.Doc_san_pham_thit();
                    
                    break;
                    
                case "mi":
                    list = sq.Doc_san_pham_mi();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit =6;
                    }
                    
                    list = sq.Doc_san_pham_mi_pt(vt, limit);
                    
                    break;
                    
                case "ngu_coc":
                    list = sq.Doc_san_pham_ngu_coc();
                    count = list.size();
                    
                    if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit =6;
                    }
                    
                    list = sq.Doc_san_pham_ngu_coc_pt(vt, limit);
                    
                    break;
                
                default:
                    
                
                    list = sq.Doc_san_pham();
                    
                    count = list.size();
                    
                     if(count<=6)
                    {
                        vt = 1;
                        limit = count;
                    }
                    else
                    {
                        vt = (pages - 1) *6;
                        limit = 6;
                    }
                    
                    list = sq.Doc_san_pham_phan_trang(vt, limit);
                break;
            }
            
            
            //model
            String view = "views/product/v_san_pham.jsp";
            
            request.setAttribute("view", view);
            request.setAttribute("san_phams", list);
            request.setAttribute("count", count);
            request.setAttribute("command", command);
//            
            String url = "/product.jsp";
            RequestDispatcher dis = request.getRequestDispatcher(url);
            dis.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(san_phams.class.getName()).log(Level.SEVERE, null, ex);
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

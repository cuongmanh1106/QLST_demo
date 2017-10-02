/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelpers.ct_hoa_don_query;
import dbHelpers.hoa_don_query;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Item;
import model.cart;
import model.m_chi_tiet_hoa_don;
import model.m_hoa_don;
import model.m_khach_hang;

/**
 *
 * @author Admin
 */
@WebServlet(name = "dat_hang", urlPatterns = {"/dat_hang"})
public class dat_hang extends HttpServlet {

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
            out.println("<title>Servlet dat_hang</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet dat_hang at " + request.getContextPath() + "</h1>");
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
        
        hoa_don_query hq = new hoa_don_query();
        ct_hoa_don_query cq = new ct_hoa_don_query();
        
        m_hoa_don hd = new m_hoa_don();
        m_chi_tiet_hoa_don ct = new m_chi_tiet_hoa_don();
        HttpSession session = request.getSession();
        
        cart c = (cart)session.getAttribute("cart");
        
        m_khach_hang kh = (m_khach_hang)session.getAttribute("kh");
        
        hd.setMa_khach_hang(kh.getMa_khach_hang());
        hd.setTri_gia((int) c.totalCart());
        int ma_hoa_don = 0;
        try {
            ma_hoa_don = hq.them_hoa_don(hd);
        } catch (SQLException ex) {
            Logger.getLogger(dat_hang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Map.Entry<Integer , Item> list: c.getCartItems().entrySet() ){
            ct.setMa_hoa_don(ma_hoa_don);
            ct.setDon_gia(list.getValue().getSp().getDon_gia());
            ct.setSo_luong(1);
            ct.setMa_san_pham(list.getValue().getSp().getMa_san_pham());
            try {
                cq.them_ct_hoa_don(ct);
            } catch (SQLException ex) {
                Logger.getLogger(dat_hang.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        session.removeAttribute("cart");
        String url = "/index.jsp";
        RequestDispatcher dis = request.getRequestDispatcher(url);
        dis.forward(request, response);
        
        
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

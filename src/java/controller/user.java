/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelpers.khach_hang_query;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.m_khach_hang;
import tool.md5;

/**
 *
 * @author Admin
 */
@WebServlet(name = "user", urlPatterns = {"/user"})
public class user extends HttpServlet {

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
            out.println("<title>Servlet dang_ki</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet dang_ki at " + request.getContextPath() + "</h1>");
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
        m_khach_hang kh = new m_khach_hang();
        khach_hang_query kq = new khach_hang_query();
        String command = request.getParameter("command");
        HttpSession session = request.getSession();
        String url = "";
        switch(command)
        {
            case "dangki":
                String confirm = request.getParameter("confirm");
                String ten_khach_hang = request.getParameter("ten_khach_hang");
                String email = request.getParameter("email");
                String mat_khau = request.getParameter("mat_khau");
                int phai = Integer.parseInt(request.getParameter("phai"));
                String ngay_sinh = request.getParameter("ngay_sinh");
                String dia_chi = request.getParameter("dia_chi");
                String dien_thoai = request.getParameter("dien_thoai");

                kh.setTen_khach_hang(ten_khach_hang);
                kh.setEmail(email);
                kh.setMat_khau(md5.encryption(mat_khau));
                kh.setPhai(phai);
                kh.setNgay_sinh(ngay_sinh);
                kh.setDia_chi(dia_chi);
                kh.setDien_thoai(dien_thoai);
                

                try {
                    kq.them_khach_hang(kh);
                } catch (SQLException ex) {
                    Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                session.setAttribute("kh",kh);
                url = "index.jsp";
                break;
                
            case "dangnhap":
                String Email = request.getParameter("email");
                String Mat_khau = md5.encryption(request.getParameter("mat_khau"));
        
                try {
                    kh = kq.dang_nhap_khach_hang(Email, Mat_khau);
                } catch (SQLException ex) {
                    Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
                }

                if(kh!=null)
                {
                    session.setAttribute("kh", kh);
                    url = "index.jsp";
                }
                else
                {
                    request.setAttribute("error", "Error mail or password");
                    url = "/form_login";
                }
            break;
                
                
                
        }
        
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

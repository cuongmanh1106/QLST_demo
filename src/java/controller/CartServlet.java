/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelpers.san_pham_query;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Item;
import model.cart;
import model.m_san_pham;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CartServlet", urlPatterns = {"/CartServlet"})
public class CartServlet extends HttpServlet {

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
            out.println("<title>Servlet CartServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartServlet at " + request.getContextPath() + "</h1>");
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
        
        san_pham_query sq = new san_pham_query();
        
        HttpSession session = request.getSession();
        String command = request.getParameter("command");
        int ma_san_pham = Integer.parseInt(request.getParameter("ma_san_pham"));
        cart c = (cart) session.getAttribute("cart");
        
        try{
            m_san_pham sp = sq.doc_san_pham_theo_ma_san_pham(ma_san_pham);
            switch(command)
            {
                case "plus":
                    if(c.getCartItems().containsKey(ma_san_pham))
                    {
                        c.plusToCart(ma_san_pham, new Item(sp,c.getCartItems().get(ma_san_pham).getSo_luong()));
                    }
                else
                    {
                        c.plusToCart(ma_san_pham, new Item(sp,1));
                    }
                break;
                
                case "remove":
                
                    c.removeToCart(ma_san_pham);
                    break;
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        session.setAttribute("cart", c);
//        response.sendRedirect("/QLST_demo/index.jsp");
        String url = "san_phams";
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

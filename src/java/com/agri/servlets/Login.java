/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.servlets;

import com.agri.dao.UserDao;
import com.agri.dto.UserDto;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class Login extends HttpServlet {

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

        boolean validated = false;

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        validated = UserDao.validatedUser(username, password);
        
       
        
        if (validated) {
            
            UserDto user = UserDao.getRoleId(username);
            
           int roleId=user.getRoleId();
            
            
             if(roleId == 1) {
                
                request.getRequestDispatcher("publisher.jsp").forward(request, response);
                
            }
            else if(roleId == 2){
            
                request.getRequestDispatcher("author.jsp").forward(request, response);
                
            }
            else if(roleId == 3){
            
                request.getRequestDispatcher("editor.jsp").forward(request, response);
                
            }
            else if(roleId == 4){
            
                request.getRequestDispatcher("designer.jsp").forward(request, response);
                
            }
            else if(roleId == 5){
            
                request.getRequestDispatcher("bookseller.jsp").forward(request, response);
                
            }
        }
        else {
                
              request.getRequestDispatcher("login.jsp").forward(request, response);

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
        processRequest(request, response);
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
        processRequest(request, response);
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

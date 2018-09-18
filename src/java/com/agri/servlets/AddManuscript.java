/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.servlets;

import com.agri.dao.BookDao;
import com.agri.dto.Book;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class AddManuscript extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    private static String UPLOAD_DIRECTORY = "c:\\uploads";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int category = Integer.parseInt(request.getParameter("category"));
        int authorId = Integer.parseInt(request.getParameter("authorId"));
        System.out.println("Author ID :"+ authorId);
        String bookTitle = request.getParameter("bookTitle");
        String expectedPrice = request.getParameter("expectedPrice");
        
        Book book = new Book();
        
        

        book.setCategoryId(category);
        book.setAuthorId(authorId);
        book.setBookTitle(bookTitle);
        book.setExpectedPrice(Double.parseDouble(expectedPrice));

//        boolean reply = BookDao.addManuscript(book);
        ArrayList categoryList = BookDao.getCategory();
        request.setAttribute("myCategoryList", categoryList);
        request.getSession().setAttribute("book", book);
        
        request.getRequestDispatcher("upload.jsp").forward(request, response);
        

//        if (reply) {
//
////            String errorMessage = "Data Added Successfully";
////            ErrorMsg errorMsg = new ErrorMsg();
////            errorMsg.setErrorMessage(errorMessage);
////            request.setAttribute("myErrorMsg", errorMsg);
////
////            ArrayList empList = EmployeeDao.getEmployees();
////            request.setAttribute("myEmpList", empList);
//            ArrayList categoryList = BookDao.getCategory();
//            request.setAttribute("myCategoryList", categoryList);
//            request.getRequestDispatcher("upload.jsp").forward(request, response);
//            request.setAttribute("book", book);
//
//        } else {
////            String errorMessage = "Addition Failed";
////            ErrorMsg errorMsg = new ErrorMsg();
////            errorMsg.setErrorMessage(errorMessage);
////            request.setAttribute("myErrorMsg", errorMsg);
////            
////            ArrayList empList = EmployeeDao.getEmployees();
////            request.setAttribute("myEmpList", empList);
//
//            ArrayList categoryList = BookDao.getCategory();
//            request.setAttribute("myCategoryList", categoryList);
//            request.getRequestDispatcher("addManuscript.jsp").forward(request, response);
//        }
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

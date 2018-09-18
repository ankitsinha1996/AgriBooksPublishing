/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.servlets;

import com.agri.dao.BookDao;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * */
public class ShowViewManuscriptForm extends HttpServlet {

// * @author USER

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
        
        ArrayList categoryList = BookDao.getCategory();
        ArrayList authorList = null;
        ArrayList bookList = null;
        ArrayList manuscriptList = null;
        request.setAttribute("myCategoryList", categoryList);
        
        String categoryId_str=request.getParameter("category");
        String authorId_str= request.getParameter("authorId");
        String serialNum_str = request.getParameter("serialNum");
        String manuscript_str = request.getParameter("manuscript");
        
        
        if(categoryId_str!=null)
        {
            System.out.println("Here is my category id ::"+categoryId_str);
            int categoryId=Integer.parseInt(categoryId_str.trim());
            authorList=BookDao.getAuthor(categoryId);
            request.setAttribute("myAuthorList", authorList);
            request.setAttribute("categoryId_selected", categoryId_str.trim());
            
        }
        if(authorId_str!=null)
        {
            System.out.println("Here is my authorId id ::"+authorId_str);
            int authorId=Integer.parseInt(authorId_str.trim());
            bookList=BookDao.getBook(authorId);
            request.setAttribute("myBookList", bookList);
            System.out.println("got book list ::"+bookList.size());
            request.setAttribute("authorId_selected", authorId_str.trim());
            
        }
        if(serialNum_str!=null)
        {
            System.out.println("Here is my Book Serial No. ::"+serialNum_str);
            int serialNum=Integer.parseInt(serialNum_str.trim());
            manuscriptList=BookDao.getManuscript(serialNum);
            request.setAttribute("myManuscriptList", manuscriptList);
            request.setAttribute("serialNum_selected", serialNum_str.trim());
            
        }
        if(manuscript_str!=null)
        {
            System.out.println("Here is my Manuscript:"+manuscript_str);
            request.setAttribute("manusript_selected", manuscript_str.trim());
            
            
        }
        
        
        
        
//        ArrayList bookList = BookDao.getBook();
//        request.setAttribute("myBookList", bookList);
//        ArrayList manuscriptList = BookDao.getManuscript();
//        request.setAttribute("myManuscriptList", manuscriptList);
        request.getRequestDispatcher("viewManuscript.jsp").forward(request, response);
        
        
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

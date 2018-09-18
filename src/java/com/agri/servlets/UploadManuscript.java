/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.servlets;

import com.agri.dao.BookDao;
import com.agri.dto.Book;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author USER
 */
public class UploadManuscript extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private static String UPLOAD_DIRECTORY = "c:\\uploads";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String manuscriptFilePath = "";

        if (ServletFileUpload.isMultipartContent(request)) {

            try {

                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest(request);

                for (FileItem item : multiparts) {

                    if (!item.isFormField()) {
                        String name = new File(item.getName()).getName();
                        manuscriptFilePath = UPLOAD_DIRECTORY + File.separator + name;
                        System.err.println("File name " + UPLOAD_DIRECTORY + File.separator + name);
                        item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
                    } else {
                        System.err.println("Testing mulyipart failed");
                    }
                }

                //File uploaded successfully
                System.err.println("File Uploaded Successfully");
//                request.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
                ex.printStackTrace();
//                request.setAttribute("message", "File Upload Failed due to " + ex);
            }

        } else {
            System.err.println("Sorry this Servlet only handles file upload request");
        }

        Book book = (Book) request.getSession().getAttribute("book");

        book.setManuscript(manuscriptFilePath);

        boolean reply = BookDao.uploadManuscript(book);

        if (reply) {

//            String errorMessage = "Data Added Successfully";
//            ErrorMsg errorMsg = new ErrorMsg();
//            errorMsg.setErrorMessage(errorMessage);
//            request.setAttribute("myErrorMsg", errorMsg);
//
//            ArrayList empList = EmployeeDao.getEmployees();
//            request.setAttribute("myEmpList", empList);
//            ArrayList categoryList = BookDao.getCategory();
//            request.setAttribute("myCategoryList", categoryList);
            request.getSession().removeAttribute("book");
            request.getRequestDispatcher("author.jsp").forward(request, response);

        } else {
//            String errorMessage = "Addition Failed";
//            ErrorMsg errorMsg = new ErrorMsg();
//            errorMsg.setErrorMessage(errorMessage);
//            request.setAttribute("myErrorMsg", errorMsg);
//            
//            ArrayList empList = EmployeeDao.getEmployees();
//            request.setAttribute("myEmpList", empList);

//            ArrayList categoryList = BookDao.getCategory();
//            request.setAttribute("myCategoryList", categoryList);
            request.getRequestDispatcher("upload.jsp").forward(request, response);
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

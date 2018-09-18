/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.util;

import javax.servlet.http.Part;

/**
 *
 * @author USER
 */
public class AppUtil {
    
    public static String extractFileName(Part part,String fileStartsWith) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            System.out.println("What is s = "+s+" which starts with "+s.trim().startsWith("filename"));
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }
    
}

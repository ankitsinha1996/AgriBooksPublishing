/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.dto;

/**
 *
 * @author ANKITA-PC
 */
public class Author {
    
    private int authorId;
    private String author_name;
    private String author_email;
    private String author_phoneNo;

  

    /**
     * @return the author_name
     */
    public String getAuthor_name() {
        return author_name;
    }

    /**
     * @param author_name the author_name to set
     */
    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    /**
     * @return the author_email
     */
    public String getAuthor_email() {
        return author_email;
    }

    /**
     * @param author_email the author_email to set
     */
    public void setAuthor_email(String author_emaiil) {
        this.author_email = author_emaiil;
    }

    /**
     * @return the author_phoneNo
     */
    public String getAuthor_phoneNo() {
        return author_phoneNo;
    }

    /**
     * @param author_phoneNo the author_phoneNo to set
     */
    public void setAuthor_phoneNo(String author_phoneNo) {
        this.author_phoneNo = author_phoneNo;
    }

    /**
     * @return the authorId
     */
    public int getAuthorId() {
        return authorId;
    }

    /**
     * @param authorId the authorId to set
     */
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    
    
}

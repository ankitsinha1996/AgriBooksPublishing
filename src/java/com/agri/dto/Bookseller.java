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
public class Bookseller {
    
    private String booksellerId;
    private String bookstoreName;
    private String bookstoreEmail;
    private String bookstorePhoneNo;
    private String bookstoreAddress; 

    /**
     * @return the booksellerId
     */
    public String getBooksellerId() {
        return booksellerId;
    }

    /**
     * @param booksellerId the booksellerId to set
     */
    public void setBooksellerId(String booksellerId) {
        this.booksellerId = booksellerId;
    }

    /**
     * @return the bookstoreName
     */
    public String getBookstoreName() {
        return bookstoreName;
    }

    /**
     * @param bookstoreName the bookstoreName to set
     */
    public void setBookstoreName(String bookstoreName) {
        this.bookstoreName = bookstoreName;
    }

    /**
     * @return the bookstoreEmail
     */
    public String getBookstoreEmail() {
        return bookstoreEmail;
    }

    /**
     * @param bookstoreEmail the bookstoreEmail to set
     */
    public void setBookstoreEmail(String bookstoreEmail) {
        this.bookstoreEmail = bookstoreEmail;
    }

    /**
     * @return the bookstorePhoneNo
     */
    public String getBookstorePhoneNo() {
        return bookstorePhoneNo;
    }

    /**
     * @param bookstorePhoneNo the bookstorePhoneNo to set
     */
    public void setBookstorePhoneNo(String bookstorePhoneNo) {
        this.bookstorePhoneNo = bookstorePhoneNo;
    }

    /**
     * @return the bookstoreAddress
     */
    public String getBookstoreAddress() {
        return bookstoreAddress;
    }

    /**
     * @param bookstoreAddress the bookstoreAddress to set
     */
    public void setBookstoreAddress(String bookstoreAddress) {
        this.bookstoreAddress = bookstoreAddress;
    }
    
}

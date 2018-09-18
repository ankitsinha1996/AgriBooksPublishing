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
public class Book {
    
    private String bookTitle;
    private String category;
    private double price;
    private String author_name;
    private String manuscript;
    private double expectedPrice;
    private int categoryId;
    private int authorId;
    private int serialNum;
    

    /**
     * @return the bookTitle
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * @param bookTitle the bookTitle to set
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

 

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
     * @return the manuscript
     */
    public String getManuscript() {
        return manuscript;
    }

    /**
     * @param manuscript the manuscript to set
     */
    public void setManuscript(String manuscript) {
        this.manuscript = manuscript;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the expectedPrice
     */
    public double getExpectedPrice() {
        return expectedPrice;
    }

    /**
     * @param expectedPrice the expectedPrice to set
     */
    public void setExpectedPrice(double expectedPrice) {
        this.expectedPrice = expectedPrice;
    }

    /**
     * @return the categoryId
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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

    /**
     * @return the serialNum
     */
    public int getSerialNum() {
        return serialNum;
    }

    /**
     * @param serialNum the serialNum to set
     */
    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

   

    
   

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.dao;

import com.agri.dto.Author;
import com.agri.dto.Book;
import com.agri.dto.Category;
import com.agri.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ANKITA-PC
 */
public class BookDao {

    public static boolean addManuscript(Book book) {

        boolean result = false;

        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "INSERT INTO project_training_db.book \n"
                    + "	( category, \n"
                    + "	author_name, \n"
                    + "	bookTitle,  \n"
                    + " price ) \n"
                    + "	VALUES\n"
                    + "	(?,?,?,?);";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, book.getCategory());
            stmt.setString(2, book.getAuthor_name());
            stmt.setString(3, book.getBookTitle());
            stmt.setDouble(4, book.getExpectedPrice());

            int row = stmt.executeUpdate();

            if (row > 0) {

                result = true;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public static ArrayList getCategory() {

        ArrayList categoryList = new ArrayList();
        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "SELECT * FROM category order by categoryName";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                Category category = new Category();

                category.setCategoryId(rs.getInt("categoryId"));
                category.setCategoryName(rs.getString("categoryName"));

                categoryList.add(category);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return categoryList;
    }

    public static boolean uploadManuscript(Book book) {

        boolean result = false;

        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "INSERT INTO project_training_db.book \n"
                    + "	(category, \n"
                    + "	authorId, \n"
                    + "	bookTitle, \n"
                    + "	price, \n" 
                    + " manuscript \n"
                    + "	) \n"
                    + "	VALUES\n"
                    + "	(?,?,?,?,?);";

            PreparedStatement stmt = conn.prepareStatement(sql);
            
            
            stmt.setInt(1, book.getCategoryId());
            stmt.setInt(2, book.getAuthorId());
            stmt.setString(3, book.getBookTitle());
            stmt.setDouble(4, book.getExpectedPrice());
            stmt.setString(5, book.getManuscript());

            int row = stmt.executeUpdate();

            if (row > 0) {

                result = true;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public static boolean viewManuscript(Book book) {

        boolean result = false;
        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, book.getCategory());
            stmt.setString(2, book.getAuthor_name());
            stmt.setString(3, book.getBookTitle());
            stmt.setString(4, book.getManuscript());

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

//                Book book = new Book();
                book.setCategory(rs.getString("category"));
                book.setAuthor_name(rs.getString("author_name"));
                book.setBookTitle(rs.getString("bookTitle"));
                book.setManuscript(rs.getString("manuscript"));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;

    }

    public static ArrayList getAuthor() {
        
        ArrayList authorList = new ArrayList();
        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "SELECT 	authorId, \n"
                    + "	author_name \n"
                    + "	\n"
                    + "	FROM \n"
                    + "	project_training_db.author \n"
                    + " order \n"
                    + " by \n"
                    + " author_name";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                Author author = new Author();

                author.setAuthorId(rs.getInt("authorId"));
                author.setAuthor_name(rs.getString("author_name"));

                authorList.add(author);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return authorList;

    }

    public static ArrayList getAuthor(int categoryId) {
        
        ArrayList authorList = new ArrayList();
        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "SELECT * FROM book,author  WHERE book.authorId=author.authorId AND category=?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, categoryId);
            
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                Author author = new Author();
                
                author.setAuthorId(rs.getInt("authorId"));
//                System.out.println("authorId =" +author.getAuthorId());
                author.setAuthor_name(rs.getString("author_name"));

                authorList.add(author);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        return authorList;

    }


    public static ArrayList getBook(int authorId) {
        
        ArrayList bookList = new ArrayList();
        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "SELECT * FROM book WHERE authorId=?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, authorId);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                Book book = new Book();

                book.setSerialNum(rs.getInt("serialNum"));
                book.setBookTitle(rs.getString("bookTitle"));
                
                
                bookList.add(book);
//                System.out.println("no. of list="+bookList);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return bookList;
        
        
    }

    public static ArrayList getManuscript(int serialNum) {
        
         ArrayList manuscriptList = new ArrayList();
        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "SELECT * FROM book WHERE serialNum=?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, serialNum);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                Book book = new Book();

                book.setSerialNum(rs.getInt("serialNum"));
                book.setManuscript(rs.getString("manuscript"));
                System.out.println("Id ="+book.getManuscript());
                
                manuscriptList.add(book);
//                System.out.println("no. of list="+bookList);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return manuscriptList;
        
    }

}

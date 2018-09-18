/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.dao;

import com.agri.dto.Author;
import com.agri.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ANKITA-PC
 */
public class AuthorDao {

    public static boolean addAuthor(Author author) {

        boolean result = false;

        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "INSERT INTO project_training_db.author \n"
                    + "	(authorId, \n"
                    + "	author_name, \n"
                    + "	author_email, \n"
                    + "	author_phoneNo \n"
                    + "	)\n"
                    + "	VALUES\n"
                    + "	(?,?,?,?);";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, author.getAuthorId());
            stmt.setString(2, author.getAuthor_name());
            stmt.setString(3, author.getAuthor_email());
            stmt.setString(4, author.getAuthor_phoneNo());

            int row = stmt.executeUpdate();

            if (row > 0) {

                result = true;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.dao;

import com.agri.dto.UserDto;
import com.agri.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ANKITA-PC
 */
public class UserDao {

    public static boolean validatedUser(String username, String password) {

        boolean result = false;

        DbUtil myDbUtil = DbUtil.getInstance();

        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "SELECT 	username, \n"
                    + "	password \n"
                    + "	FROM \n"
                    + "	project_training_db.users "
                    + " WHERE username= ? and password= ?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, username);
            stmt.setString(2, password);

            System.out.println("SQL==>" + stmt);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                result = true;

            }
        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return result;
    }

    public static UserDto getRoleId(String username) {

        UserDto roleId = new UserDto();
        DbUtil myDbUtil = DbUtil.getInstance();
        try {
            Connection conn = myDbUtil.getDbConnetion();

            String sql = "SELECT 	roleId \n"
                    + "	FROM \n"
                    + "	project_training_db.users  "
                    + " WHERE username= ? ";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, username);

            System.out.println("SQL==>" + stmt);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                
               roleId.setRoleId(rs.getInt("roleId"));

            }

        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return roleId;
    }

}

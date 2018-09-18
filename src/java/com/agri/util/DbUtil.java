/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agri.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class DbUtil {

    public static DbUtil dbUtil;

    private DbUtil() {

    }

    public static DbUtil getInstance() {
        if (dbUtil == null) {
            dbUtil = new DbUtil();
            System.out.println("DbUtil Created");
        }
        return dbUtil;
    }

    public Connection getDbConnetion() throws 
            ClassNotFoundException, InstantiationException,
            IllegalAccessException, SQLException {
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_training_db","root", "");
        
        return connection;
            }
}

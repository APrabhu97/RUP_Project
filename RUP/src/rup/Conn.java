/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rup
        ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mahe
 */
public class Conn {
    public
            static Connection connect(){
                try{          //Connection Code 
                    Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rup_project?zeroDateTimeBehavior=convertToNull",
                                                     "root","1234");  
                    int t;
                    return conn;
                }
                catch(Exception e){
                    e.printStackTrace();
                    return null;
                }
            }
            
}

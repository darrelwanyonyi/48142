package studentsApp;

import com.mysql.jdbc.Connection;

import java.sql.*;

public class dbConn {

    private Connection connection = null;

   /* public static void main(String[] args) {
        new dbConnector().connector();
    }*/

    public Connection connector(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            System.out.println("Missing MySQL JDBC Driver");
            e.printStackTrace();
            return connection;
        }
        try{
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ics2101","root", "");
        }
        catch(SQLException e) {
            System.out.println("Connection Failed!");
            e.printStackTrace();
            return connection;
        }
        if (connection != null) {
            //System.out.println("Connection is a go!");
        }
        else {
            System.out.println("Connection aborted!");
        }
        return connection;
    }
    public void closeDB(){
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
            e.printStackTrace();
        }
    }
}
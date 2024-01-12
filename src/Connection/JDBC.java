package Connection;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JDBC {
    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3306/test_db";
        String user = "root";
        String pwd = "chuck9sarah";
        String query = "Select * from Departement";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }
            catch (ClassNotFoundException e) {
                throw new RuntimeException("Cannot load JDBC driver", e);
            }
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(url,user,pwd);
        }
        try {
            Connection connection = JDBC.getConnection();
            System.out.println("Connected to the database successfully!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }



}
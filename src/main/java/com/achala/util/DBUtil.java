package com.achala.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

    private static final String URL =
        "jdbc:mysql://mysql:3306/employee_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception {
        int retries = 10;
        while (retries-- > 0) {
            try {
                System.out.println("Trying to connect to MySQL...");
                return DriverManager.getConnection(URL, USER, PASS);
            } catch (Exception e) {
                System.out.println("MySQL not ready, retrying...");
                Thread.sleep(3000);
            }
        }
        throw new Exception("Unable to connect to MySQL");
    }
}

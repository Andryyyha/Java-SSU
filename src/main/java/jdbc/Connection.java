package jdbc;

import java.sql.*;

public class Connection {

    private java.sql.Connection connection;
    private String username = "user";
    private String password = "password";
    private String url = "jdbc:postgresql://0.0.0.0:5432/bank";

    public void setConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

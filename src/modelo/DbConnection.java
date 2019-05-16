package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {
    private String bd = "empresa";
    private String login = "root";
    private String password="";
    private String url = "jdbc:mysql://localhost/" + bd;
    Connection conn = null;

    public DbConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, login, password);
        }
        catch(SQLException e){
            System.out.println(e);
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public void desconectar(){
        this.conn = null;
    }
}

package Electricity;

import java.sql.*;

public class Conn {
    public Connection c;
    public Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","root");
            s =c.createStatement();

        }catch(Exception e){
            System.out.println(e);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jorge
 */
public class Conexao {
    private Connection conn;
	
    public Conexao() {
        try{
            Class.forName("org.hsqldb.jdbcDriver");
            this.conn = DriverManager.getConnection("jdbc:hsqldb:banco/","ControlXYZ","");
        }catch(ClassNotFoundException e){
            System.err.println("Erro ao carregar o driver JDBC. ");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getCon() {
        return conn;
    }

    public void fechaConexao() throws SQLException{
        this.conn.close();
    }
}

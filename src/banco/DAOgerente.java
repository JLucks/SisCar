/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Gerente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class DAOgerente {
    private Conexao conn = new Conexao();
	
	public DAOgerente(){}
	
	public void adicionaGerente(Gerente ger) {
		String sql = "INSERT INTO Gerente(esperiencias,funcionario) VALUES(?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, ger.getEsperiencias());
                        stmt.setInt(2, ger.getCodFun());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Gerente> recuperaGerentes() {
      String sql = "select * from Gerente";
      List<Gerente> gers = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Gerente ger = new Gerente();
                     ger.setCodGerente(rs.getInt("idAdministrador"));
                     ger.setEsperiencias(rs.getString("esperiencias"));
                     ger.setCodFun(rs.getInt("funcionario"));
                     gers.add(ger);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return gers;
	}
       
    public void atualizaGerente(int id, String esper) {
        String sql = "UPDATE Gerente SET esperiencias= ? WHERE idGerente = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, esper);
			stmt.setInt(2, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaGerente(int id) {
        String sql = "DELETE FROM Gerente WHERE idGerente = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaGerenteFunc(int id) {
        String sql = "DELETE FROM Gerente WHERE funcionario = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Gerente buscaGerente(int id) {        
        Gerente ger = new Gerente();
        String sql = "SELECT * FROM Gerente WHERE idGerente = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                ger.setCodGerente(rs.getInt("idGerente"));
                ger.setEsperiencias(rs.getString("esperiencias"));
                ger.setCodFun(rs.getInt("funcionario"));
            }
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return ger;
    }
    
    public Gerente buscaGerenteFunc(int id) {        
        Gerente ger = new Gerente();
        String sql = "SELECT * FROM Gerente WHERE funcionario = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                ger.setCodGerente(rs.getInt("idGerente"));
                ger.setEsperiencias(rs.getString("esperiencias"));
                ger.setCodFun(rs.getInt("funcionario"));
            }
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return ger;
    }
}

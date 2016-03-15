/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Administrador;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOadministrador {
    private Conexao conn = new Conexao();
	
	public DAOadministrador(){}
	
	public void adicionaAdministrador(Administrador adm) {
		String sql = "INSERT INTO Administrador(idAdministrador,especializacoes,funcionario) VALUES(?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, adm.getId());
			stmt.setString(2, adm.getEspecializacoes());
                        stmt.setInt(3, adm.getCodFunc());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Administrador> recuperaAdministradores() {
      String sql = "select * from Administrador";
      List<Administrador> adms = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Administrador adm = new Administrador();
                     adm.setId(rs.getInt("idAdministrador"));
                     adm.setEspecializacoes(rs.getString("especializacoes"));
                     adm.setCodFunc(rs.getInt("funcionario"));
                     adms.add(adm);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return adms;
	}
       
    public void atualizaAdministrador(int id, String espec) {
        String sql = "UPDATE Administrador SET especializacoes= ? WHERE idAdministrador = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, espec);
			stmt.setInt(2, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaAdministrador(int id) {
        String sql = "DELETE FROM Administrador WHERE idAdministrador = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Administrador buscaAdministrador(int id) {        
        Administrador adm = new Administrador();
        String sql = "SELECT * FROM Administrador WHERE idAdministrador = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            adm.setId(rs.getInt("idAdministrador"));
            adm.setEspecializacoes(rs.getString("especializacoes"));
            adm.setCodFunc(rs.getInt("funcionario"));
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return adm;
    }
}

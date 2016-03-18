/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Filial;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOfilial {
    private Conexao conn = new Conexao();
	
    public DAOfilial(){}

    public void adicionaFilial(Filial filial) {
            String sql = "INSERT INTO Filial(matricula,endereco) VALUES(?,?)";
            try {
                    PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
                    stmt.setString(1, filial.getMatricula());
                    stmt.setString(2, filial.getEndereco());
                    stmt.execute();
                    stmt.close();
            } catch (SQLException u) {
                    throw new RuntimeException(u);
            }
    }
	
    public List<Filial> recuperaFilial() {
      String sql = "select * from Filial";
      List<Filial> filiais = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Filial filial = new Filial();
                     filial.setCodFilial(rs.getInt("idFilial"));
                     filial.setMatricula(rs.getString("matricula"));
                     filial.setEndereco(rs.getString("endereco"));
                     filiais.add(filial);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return filiais;
	}
       
    public void atualizaFilial(int codFilial, String enderec) {
        String sql = "UPDATE Filial SET endereco= ? WHERE idFilial = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, enderec);
			stmt.setInt(2, codFilial);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaFilal(int codFilial) {
        String sql = "DELETE FROM Filial WHERE idFilial = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, codFilial);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Filial buscaFilial(int codFilial) {        
        Filial filial = new Filial();
        String sql = "SELECT * FROM Filial WHERE idFilial = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, codFilial);
            ResultSet rs = stmt.executeQuery();
            filial.setCodFilial(rs.getInt("idFilial"));
            filial.setMatricula(rs.getString("matricula"));
            filial.setEndereco(rs.getString("endereco"));
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return filial;
    }
}

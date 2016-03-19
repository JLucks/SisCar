package banco;

import base.Gerente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOgerente {
    private Conexao conn = new Conexao();
	
	public DAOgerente(){}
	
	public void adicionaGerente(Gerente ger) {
		String sql = "INSERT INTO Gerente(idGerente,experiencias,funcionario) VALUES(?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, ger.getCodGerente());
			stmt.setString(2, ger.getExperiencias());
                        stmt.setInt(3, ger.getCodFunc());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Gerente> recuperaGerentes() {
      String sql = "select * from Gerente";
      List<Gerente> grts = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Gerente ger = new Gerente();      
                     ger.setCodGerente(rs.getInt("idGerente"));
                     ger.setExperiencias(rs.getString("experiencias"));
                     ger.setCodFunc(rs.getInt("funcionario"));
                     grts.add(ger);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return grts;
	}
       
    public void atualizaGerente(int id, String exp) {
        String sql = "UPDATE Gerente SET experiencias= ? WHERE idGerente = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, exp);
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
    
    public Gerente buscaGerente(int id) {        
        Gerente ger = new Gerente();
        String sql = "SELECT * FROM Gerente WHERE idGerente = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            ger.setCodGerente(rs.getInt("idGerente"));
            ger.setExperiencias(rs.getString("experiencias"));
            ger.setCodFunc(rs.getInt("funcionario"));
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return ger;
    }
}

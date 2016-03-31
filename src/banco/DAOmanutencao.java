/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Manutencao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOmanutencao {
    private Conexao conn = new Conexao();
	
	public DAOmanutencao(){}
	
	public void adicionaManutencao(Manutencao rec) {
		String sql = "INSERT INTO Manutencao(descricao,valor,veiculo,data) VALUES(?,?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, rec.getDescricao());
                        stmt.setFloat(2, rec.getValor());
                        stmt.setInt(3, rec.getIdVeiculo());
                        stmt.setString(4, rec.getData());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Manutencao> recuperaReceitasDespesas() {
      String sql = "select * from Manutencao";
      List<Manutencao> recs = new ArrayList<>();
        try {
          PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          while (rs.next()) {
                   Manutencao rec = new Manutencao();
                   rec.setId(rs.getInt("id"));
                   rec.setDescricao(rs.getString("descricao"));
                   rec.setValor(rs.getFloat("valor"));
                   rec.setIdVeiculo(rs.getInt("veiculo"));
                   rec.setData(rs.getString("data"));
                   recs.add(rec);
          }       			
          stmt.close();
          } catch (SQLException u) {
              throw new RuntimeException(u);
          }
        return recs;
    }
}

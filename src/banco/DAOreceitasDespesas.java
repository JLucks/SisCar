/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.ReceitaDespesa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOreceitasDespesas {
    private Conexao conn = new Conexao();
	
	public DAOreceitasDespesas(){}
	
	public void adicionaReceitasDespesas(ReceitaDespesa rec) {
		String sql = "INSERT INTO ReceitasDespesa(descricao,valor,filial) VALUES(?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, rec.getDescricao());
                        stmt.setFloat(2, rec.getValor());
                        stmt.setInt(3, rec.getIdFilial());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<ReceitaDespesa> recuperaReceitasDespesas() {
      String sql = "select * from ReceitasDespesa";
      List<ReceitaDespesa> recs = new ArrayList<>();
        try {
          PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          while (rs.next()) {
                   ReceitaDespesa rec = new ReceitaDespesa();
                   rec.setId(rs.getInt("id"));
                   rec.setDescricao(rs.getString("descricao"));
                   rec.setValor(rs.getFloat("valor"));
                   rec.setIdFilial(rs.getInt("filial"));
                   recs.add(rec);
          }       			
          stmt.close();
          } catch (SQLException u) {
              throw new RuntimeException(u);
          }
        return recs;
    }
}

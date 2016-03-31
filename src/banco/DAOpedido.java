/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOpedido {
    private Conexao conn = new Conexao();
	
    public DAOpedido(){}

    public void adicionaPedido(Pedido ped) {
            String sql = "INSERT INTO Pedido(modelo,ano,quantidade,fornecedor,filial,data) VALUES(?,?,?,?,?,?)";
            try {
                    PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
                    stmt.setString(1, ped.getModelo());
                    stmt.setString(2, ped.getAno());
                    stmt.setInt(3, ped.getQuantidade());
                    stmt.setInt(4, ped.getIdFornecedor());
                    stmt.setInt(5, ped.getIdFilial());
                    stmt.setString(6, ped.getData());
                    stmt.execute();
                    stmt.close();
            } catch (SQLException u) {
                    throw new RuntimeException(u);
            }
    }
	
    public List<Pedido> recuperaPedido() {
      String sql = "select * from Pedido";
      List<Pedido> peds = new ArrayList<>();
        try {
          PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          while (rs.next()) {
                   Pedido ped = new Pedido();
                   ped.setId(rs.getInt("id"));
                   ped.setModelo(rs.getString("modelo"));
                   ped.setAno(rs.getString("ano"));
                   ped.setQuantidade(rs.getInt("quantidade"));
                   ped.setIdFornecedor(rs.getInt("fornecedor"));
                   ped.setIdFilial(rs.getInt("filial"));
                   ped.setData(rs.getString("data"));
                   peds.add(ped);
          }       			
          stmt.close();
          } catch (SQLException u) {
              throw new RuntimeException(u);
          }
        return peds;
    }
}

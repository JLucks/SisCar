/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOfornecedor {
    private Conexao conn = new Conexao();
	
    public DAOfornecedor(){}

    public void adicionaFornecedor(Fornecedor forn) {
            String sql = "INSERT INTO Fornecedor(nome,cnpj,endereco) VALUES(?,?,?)";
            try {
                    PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
                    stmt.setString(1, forn.getNome());
                    stmt.setString(2, forn.getCnpj());
                    stmt.setString(3, forn.getEndereco());
                    stmt.execute();
                    stmt.close();
            } catch (SQLException u) {
                    throw new RuntimeException(u);
            }
    }
	
    public List<Fornecedor> recuperaFornecedor() {
      String sql = "select * from Fornecedor";
      List<Fornecedor> forns = new ArrayList<>();
        try {
          PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
          ResultSet rs = stmt.executeQuery();
          while (rs.next()) {
                   Fornecedor forn = new Fornecedor();
                   forn.setId(rs.getInt("id"));
                   forn.setNome(rs.getString("nome"));
                   forn.setCnpj(rs.getString("cnpj"));
                   forn.setEndereco(rs.getString("endereco"));
                   forns.add(forn);
          }       			
          stmt.close();
          } catch (SQLException u) {
              throw new RuntimeException(u);
          }
        return forns;
    }
    
    public Fornecedor recuperaFornecedor(String nome) {
      String sql = "select * from Fornecedor WHERE nome = ?";
      Fornecedor forn = new Fornecedor();
        try {
          PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
          stmt.setString(1, nome);
          ResultSet rs = stmt.executeQuery();
          if(rs.next()){
                   
                   forn.setId(rs.getInt("id"));
                   forn.setNome(rs.getString("nome"));
                   forn.setCnpj(rs.getString("cnpj"));
                   forn.setEndereco(rs.getString("endereco"));
          }       			
          stmt.close();
          } catch (SQLException u) {
              throw new RuntimeException(u);
          }
        return forn;
    }
}

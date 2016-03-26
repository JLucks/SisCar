/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Aluguel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOaluguel {
     private Conexao conn = new Conexao();
	
	public DAOaluguel(){}
	
	public void adicionaAluguel(Aluguel alu) {
		String sql = "INSERT INTO Aluguel(cliente,vendedor,veiculo,tempo,preco,desconto,multa,total,dataAluguel,dataDevol) VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, alu.getCodCli());
                        stmt.setInt(2, alu.getCodVen());
                        stmt.setInt(3, alu.getCodVei());
                        stmt.setInt(4, alu.getTempo());
                        stmt.setFloat(5, alu.getPreco());
                        stmt.setInt(6, alu.getDesconto());
                        stmt.setFloat(7, alu.getMulta());
                        stmt.setFloat(8, alu.getTotal());
                        stmt.setString(9, alu.getDataAlu());
                        stmt.setString(10, alu.getDataDev());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Aluguel> recuperaAlugueis() {
      String sql = "select * from Aluguel";
      List<Aluguel> alus = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Aluguel alu = new Aluguel();
                     alu.setNumOrdem(rs.getInt("numOrdem"));
                     alu.setCodCli(rs.getInt("cliente"));
                     alu.setCodVei(rs.getInt("veiculo"));
                     alu.setCodVen(rs.getInt("vendedor"));
                     alu.setDesconto(rs.getInt("desconto"));
                     alu.setMulta(rs.getFloat("multa"));
                     alu.setPreco(rs.getFloat("preco"));
                     alu.setTempo(rs.getInt("tempo"));
                     alu.setTotal(rs.getFloat("total"));
                     alu.setDataAlu(rs.getString("dataAluguel"));
                     alu.setDataDev(rs.getString("dataDevol"));
                     alus.add(alu);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return alus;
	}
    
    public List<Aluguel> recuperaAlugueisAbertos() {
      String sql = "select * from Aluguel WHERE total = 0";
      List<Aluguel> alus = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Aluguel alu = new Aluguel();
                     alu.setNumOrdem(rs.getInt("numOrdem"));
                     alu.setCodCli(rs.getInt("cliente"));
                     alu.setCodVei(rs.getInt("veiculo"));
                     alu.setCodVen(rs.getInt("vendedor"));
                     alu.setDesconto(rs.getInt("desconto"));
                     alu.setMulta(rs.getFloat("multa"));
                     alu.setPreco(rs.getFloat("preco"));
                     alu.setTempo(rs.getInt("tempo"));
                     alu.setTotal(rs.getFloat("total"));
                     alu.setDataAlu(rs.getString("dataAluguel"));
                     alu.setDataDev(rs.getString("dataDevol"));
                     alus.add(alu);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return alus;
	}
       
    public void atualizaAluguel(Aluguel alu) {
        String sql = "UPDATE Aluguel SET (total= ?, dataDevol= ?) WHERE numOrdem = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setFloat(1, alu.getTotal());
			stmt.setString(2, alu.getDataDev());
                        stmt.setInt(3, alu.getNumOrdem());
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Aluguel buscaAdministrador(int id) {        
        Aluguel alu = new Aluguel();
        String sql = "SELECT * FROM Aluguel WHERE numOrdem = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                alu.setNumOrdem(rs.getInt("numOrdem"));
                alu.setCodCli(rs.getInt("cliente"));
                alu.setCodVei(rs.getInt("veiculo"));
                alu.setCodVen(rs.getInt("vendedor"));
                alu.setDesconto(rs.getInt("desconto"));
                alu.setMulta(rs.getFloat("multa"));
                alu.setPreco(rs.getFloat("preco"));
                alu.setTempo(rs.getInt("tempo"));
                alu.setTotal(rs.getFloat("total"));
                alu.setDataAlu(rs.getString("dataAluguel"));
                alu.setDataDev(rs.getString("dataDevol"));
            }
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return alu;
    }
}

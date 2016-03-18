/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Veiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class DAOveiculo {
    private Conexao conn = new Conexao();
	
	public DAOveiculo(){}
	
	public void adicionaVeiculo(Veiculo veic) {
		String sql = "INSERT INTO Veiculo(idVeiculo, chassi, placa, modelo, cor, ano, filial) VALUES(?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, veic.getCodVei());
			stmt.setString(2, veic.getChassi());
                        stmt.setString(3, veic.getPlaca());
                        stmt.setString(4, veic.getModelo());
                        stmt.setString(5, veic.getCor());
                        stmt.setString(6, veic.getAno());
                        stmt.setInt(7, veic.getCodFilial());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Veiculo> recuperaVeiculos() {
      String sql = "select * from Veiculo";
      List<Veiculo> veics = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Veiculo veic = new Veiculo();
                     veic.setCodVei(rs.getInt("idVeiculo"));
                     veic.setChassi(rs.getString("chassi"));
                     veic.setPlaca(rs.getString("placa"));
                     veic.setModelo(rs.getString("modelo"));
                     veic.setCor(rs.getString("cor"));
                     veic.setAno(rs.getString("ano"));
                     veic.setCodFilial(rs.getInt("filial"));
                     veics.add(veic);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return veics;
	}
       
    public void atualizaVeiculo(int codVei, String placa, String cor, int filial) {
        String sql = "UPDATE Veiculo SET (placa = ?, cor = ?, filial = ?) WHERE idVeiculo = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, placa);
                        stmt.setString(2, cor);
                        stmt.setInt(3, filial);
			stmt.setInt(4, codVei);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaVeiculo(int codVei) {
        String sql = "DELETE FROM Veiculo WHERE idVeiculo = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, codVei);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Veiculo buscaVeiculo(int codVei) {        
        Veiculo veic = new Veiculo();
        String sql = "SELECT * FROM Veiculo WHERE idVeiculo = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, codVei);
            ResultSet rs = stmt.executeQuery();
            veic.setCodVei(rs.getInt("idVeiculo"));
            veic.setChassi(rs.getString("chassi"));
            veic.setPlaca(rs.getString("placa"));
            veic.setModelo(rs.getString("modelo"));
            veic.setCor(rs.getString("cor"));
            veic.setAno(rs.getString("ano"));
            veic.setCodFilial(rs.getInt("filial"));
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return veic;
    }
}

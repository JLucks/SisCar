/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Vendedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOvendedor {
    private Conexao conn = new Conexao();
    
    public DAOvendedor(){}
    
    public void adicionaVendedor(Vendedor vnd) {
		String sql = "INSERT INTO Vendedor(idiomas,meta,funcionario) VALUES(?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, vnd.getIdiomas());
                        stmt.setInt(2, vnd.getMeta());
                        stmt.setInt(3, vnd.getCodFunc());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Vendedor> recuperaVendedores() {
      String sql = "select * from Vendedor";
      List<Vendedor> vnds = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Vendedor vnd = new Vendedor();
                     vnd.setCodVend(rs.getInt("idVendedor"));
                     vnd.setIdiomas(rs.getString("idiomas"));
                     vnd.setMeta(rs.getInt("meta"));
                     vnd.setCodFunc(rs.getInt("funcionario"));
                     vnds.add(vnd);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return vnds;
	}
       
    public void atualizaVendedor(int id, String idiomas, int meta) {
        String sql = "UPDATE Vendedor SET (idiomas= ?, meta= ?) WHERE idVendedor = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, idiomas);
			stmt.setInt(2, meta);
                        stmt.setInt(3, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaVendedor(int id) {
        String sql = "DELETE FROM Vendedor WHERE idVendedor = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Vendedor buscaVendedor(int id) {        
        Vendedor vnd = new Vendedor();
        String sql = "SELECT * FROM Vendedor WHERE idVendedor = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                vnd.setCodVend(rs.getInt("idVendedor"));
                vnd.setIdiomas(rs.getString("idiomas"));
                vnd.setMeta(rs.getInt("meta"));
                vnd.setCodFunc(rs.getInt("funcionario"));
            }
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return vnd;
    }
    
}

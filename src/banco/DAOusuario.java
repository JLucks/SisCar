/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOusuario {
    private Conexao conn = new Conexao();
	
	public DAOusuario(){}
	
	public void adicionaUsuario(Usuario usu) {
		String sql = "INSERT INTO Usuario(idUsuario,senha,funcionario) VALUES(?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, usu.getIdUsuario());
			stmt.setString(2, usu.getSenha());
                        stmt.setInt(3, usu.getCodFunc());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Usuario> recuperaUsuarios() {
      String sql = "select * from Usuario";
      List<Usuario> usrs = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Usuario usu = new Usuario();
                     usu.setIdUsuario(rs.getInt("idUsuario"));
                     usu.setSenha(rs.getString("senha"));
                     usu.setCodFunc(rs.getInt("funcionario"));
                     usrs.add(usu);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return usrs;
	}
       
    public void atualizaUsuario(int id, String senha) {
        String sql = "UPDATE Usuario SET senha= ? WHERE idUsuario = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, senha);
			stmt.setInt(2, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaUsuario(int id) {
        String sql = "DELETE FROM Usuario WHERE idUsuario = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Usuario buscaUsuario(int id) {        
        Usuario usu = new Usuario();
        String sql = "SELECT * FROM Usuario WHERE idUsuario = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            usu.setIdUsuario(rs.getInt("idUsuario"));
            usu.setSenha(rs.getString("senha"));
            usu.setCodFunc(rs.getInt("funcionario"));
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return usu;
    }
}

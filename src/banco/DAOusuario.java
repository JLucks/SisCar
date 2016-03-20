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
			stmt.setString(1, usu.getIdUsuario());
			stmt.setString(2, usu.getSenha());
                        stmt.setInt(3, usu.getCodFun());
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
                     usu.setIdUsuario(rs.getString("idUsuario"));
                     usu.setSenha(rs.getString("senha"));
                     usu.setCodFun(rs.getInt("funcionario"));
                     usrs.add(usu);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return usrs;
	}
       
    public void atualizaUsuario(String id, String senha) {
        String sql = "UPDATE Usuario SET senha= ? WHERE idUsuario = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, senha);
			stmt.setString(2, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaUsuario(String id) {
        String sql = "DELETE FROM Usuario WHERE idUsuario = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, id);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Usuario buscaUsuario(String id) {        
        Usuario usu = new Usuario();
        String sql = "SELECT * FROM Usuario WHERE idUsuario = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                usu.setIdUsuario(rs.getString("idUsuario"));
                usu.setSenha(rs.getString("senha"));
                usu.setCodFun(rs.getInt("funcionario"));
            }
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return usu;
    }
}

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
public class DAOusuarioRoot {
    private Conexao conn = new Conexao();
	
	public DAOusuarioRoot(){}
	
	public void adicionaUsuario(Usuario usu) {
		String sql = "INSERT INTO UsuarioRoot(idUsuario,senha) VALUES(?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, usu.getIdUsuario());
			stmt.setString(2, usu.getSenha());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Usuario> recuperaUsuarios() {
      String sql = "select * from UsuarioRoot";
      List<Usuario> usrs = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Usuario usu = new Usuario();
                     usu.setIdUsuario(rs.getString("idUsuario"));
                     usu.setSenha(rs.getString("senha"));
                     usrs.add(usu);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return usrs;
	}
    
    public Usuario buscaUsuario(String id) {        
        Usuario usu = new Usuario();
        String sql = "SELECT * FROM UsuarioRoot WHERE idUsuario = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                usu.setIdUsuario(rs.getString("idUsuario"));
                usu.setSenha(rs.getString("senha"));
            }
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return usu;
    }
}

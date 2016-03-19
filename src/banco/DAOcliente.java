/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DAOcliente {
    private Conexao conn = new Conexao();
	
    public DAOcliente(){}

    public void adicionaCliente(Cliente cli) {
            String sql = "INSERT INTO Cliente(nome,endereco,telefone,cpf) VALUES(?,?,?,?)";
            try {
                    PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
                    stmt.setString(1, cli.getNome());
                    stmt.setString(2, cli.getEndereco());
                    stmt.setString(3, cli.getTelefone());
                    stmt.setString(4, cli.getCPF());
                    stmt.execute();
                    stmt.close();
            } catch (SQLException u) {
                    throw new RuntimeException(u);
            }
    }
	
    public List<Cliente> recuperaClientes() {
      String sql = "select * from Cliente";
      List<Cliente> clientes = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Cliente cli = new Cliente();
                     cli.setCodCli(rs.getInt("idCliente"));
                     cli.setNome(rs.getString("nome"));
                     cli.setEndereco(rs.getString("endereco"));
                     cli.setTelefone(rs.getString("telefone"));
                     cli.setCPF(rs.getString("cpf"));
                     clientes.add(cli);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return clientes;
	}
       
    public void atualizaEnderecoCliente(int codCli, String enderec) {
        String sql = "UPDATE Cliente SET endereco= ? WHERE idCliente = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, enderec);
			stmt.setInt(2, codCli);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void atualizaTelefoneCliente(int codCli, String tel) {
        String sql = "UPDATE Cliente SET telefone= ? WHERE idCliente = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, tel);
			stmt.setInt(2, codCli);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
     public void atualizaNomeCliente(int codCli, String nome) {
        String sql = "UPDATE Cliente SET nome= ? WHERE idCliente = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setInt(2, codCli);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaCliente(int codCliente) {
        String sql = "DELETE FROM Cliente WHERE idCliente = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, codCliente);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Cliente buscaCliente(String cpf) {        
        Cliente cli = new Cliente();
        String sql = "SELECT * FROM Cliente WHERE cpf = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                cli.setCodCli(rs.getInt("idCliente"));
                cli.setNome(rs.getString("nome"));
                cli.setEndereco(rs.getString("endereco"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCPF(rs.getString("cpf"));
            }
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return cli;
    }
}

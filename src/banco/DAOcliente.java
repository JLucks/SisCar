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
		String sql = "INSERT INTO Cliente(codCli,nome,endereco,Telefone,CPF) VALUES(?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, cli.getCodCli());
			stmt.setString(2, cli.getNome());
                        stmt.setString(3, cli.getEndereco());
                        stmt.setString(4, cli.getTelefone());
                        stmt.setString(5, cli.getCPF());
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
                     cli.setCodCli(rs.getInt("codCli"));
                     cli.setNome(rs.getString("nome"));
                     cli.setEndereco(rs.getString("endereco"));
                     cli.setTelefone(rs.getString("Telefone"));
                     cli.setCPF(rs.getString("CPF"));
                     clientes.add(cli);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return clientes;
	}
       
    public void atualizaEnderecoCliente(int codCli, String enderec) {
        String sql = "UPDATE Cliente SET endereco= ? WHERE codCli = ?";
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
        String sql = "UPDATE Cliente SET Telefone= ? WHERE codCli = ?";
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
    
    public void deletaCliente(int codCliente) {
        String sql = "DELETE FROM Cliente WHERE codCli = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, codCliente);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Cliente buscaCliente(int codCliente) {        
        Cliente cli = new Cliente();
        String sql = "SELECT * FROM Cliente WHERE codCli = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, codCliente);
            ResultSet rs = stmt.executeQuery();
            cli.setCodCli(rs.getInt("codCli"));
            cli.setNome(rs.getString("nome"));
            cli.setEndereco(rs.getString("endereco"));
            cli.setTelefone(rs.getString("Telefone"));
            cli.setCPF(rs.getString("CPF"));
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return cli;
    }
}

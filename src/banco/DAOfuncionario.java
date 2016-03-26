/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import base.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class DAOfuncionario {
    private Conexao conn = new Conexao();
	
	public DAOfuncionario(){}
	
	public void adicionaFuncionario(Funcionario veic) {
		String sql = "INSERT INTO Funcionario(nome, endereco, telefone, cpf, genero, nascimento, "
                        + "salario, cargaH, admissao, filial) VALUES(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, veic.getNome());
                        stmt.setString(2, veic.getEndereco());
                        stmt.setString(3, veic.getTelefone());
                        stmt.setString(4, veic.getCpf());
                        stmt.setString(5, String.valueOf(veic.getGenero()));
                        stmt.setString(6, veic.getNascimento());
                        stmt.setFloat(7, veic.getSalario());
                        stmt.setInt(8, veic.getCargaH());
                        stmt.setString(9, veic.getAdmissao());
                        stmt.setInt(10, veic.getCodFilial());
			stmt.execute();
			stmt.close();
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
	}
	
    public List<Funcionario> recuperaFuncionarios() {
      String sql = "select * from Funcionario";
      List<Funcionario> funcs = new ArrayList<>();
 	  try {
            PreparedStatement stmt =  this.conn.getCon().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                     Funcionario func = new Funcionario();
                     func.setCodFunc(rs.getInt("idFuncionario"));
                     func.setNome(rs.getString("nome"));
                     func.setCpf(rs.getString("cpf"));
                     func.setEndereco(rs.getString("endereco"));
                     func.setTelefone(rs.getString("telefone"));
                     func.setGenero(rs.getString("genero").charAt(0));
                     func.setNascimento(rs.getString("nascimento"));
                     func.setSalario(rs.getFloat("salario"));
                     func.setCargaH(rs.getInt("cargaH"));
                     func.setAdmissao(rs.getString("admissao"));
                     func.setCodFilial(rs.getInt("filial"));
                     funcs.add(func);
            }       			
            stmt.close();
            } catch (SQLException u) {
       		throw new RuntimeException(u);
            }
 	  return funcs;
	}
       
    public void atualizaFuncionario(Funcionario func) {
        String sql = "UPDATE Funcionario SET (endereco = ?, telefone = ?, genero = ?, salario = ?, "
                + "cargaH = ?, filial = ?) WHERE idFuncionario = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, func.getEndereco());
                        stmt.setString(2, func.getTelefone());
                        stmt.setString(3, String.valueOf(func.getGenero()));
                        stmt.setFloat(4, func.getSalario());
                        stmt.setInt(5, func.getCargaH());
                        stmt.setInt(6, func.getCodFilial());
			stmt.setInt(7, func.getCodFunc());
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public void deletaFuncionario(int codFunc) {
        String sql = "DELETE FROM Funcionario WHERE idFuncionario = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, codFunc);
			stmt.execute();
			stmt.close();	
		} catch (SQLException u) {
			throw new RuntimeException(u);
		}
    }
    
    public Funcionario buscaFuncionario(String cpf) {        
        Funcionario func = new Funcionario();
        String sql = "SELECT * FROM Funcionario WHERE cpf = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                func.setCodFunc(rs.getInt("idFuncionario"));
                func.setNome(rs.getString("nome"));
                func.setCpf(rs.getString("cpf"));
                func.setEndereco(rs.getString("endereco"));
                func.setTelefone(rs.getString("telefone"));
                func.setGenero(rs.getString("genero").charAt(0));
                func.setNascimento(rs.getString("nascimento"));
                func.setSalario(rs.getFloat("salario"));
                func.setCargaH(rs.getInt("cargaH"));
                func.setAdmissao(rs.getString("admissao"));
                func.setCodFilial(rs.getInt("filial"));
            }
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return func;
    }
    
    public Funcionario buscaFuncionario(int id) {        
        Funcionario func = new Funcionario();
        String sql = "SELECT * FROM Funcionario WHERE idFuncionario = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                func.setCodFunc(rs.getInt("idFuncionario"));
                func.setNome(rs.getString("nome"));
                func.setCpf(rs.getString("cpf"));
                func.setEndereco(rs.getString("endereco"));
                func.setTelefone(rs.getString("telefone"));
                func.setGenero(rs.getString("genero").charAt(0));
                func.setNascimento(rs.getString("nascimento"));
                func.setSalario(rs.getFloat("salario"));
                func.setCargaH(rs.getInt("cargaH"));
                func.setAdmissao(rs.getString("admissao"));
                func.setCodFilial(rs.getInt("filial"));
            }
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return func;
    }
}

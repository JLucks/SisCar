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
		String sql = "INSERT INTO Funcionario(idFuncionario, nome, endereco, telefone, cpf, genero, nascimento, "
                        + "salario, cargaH, admissao, filial) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setInt(1, veic.getCodFunc());
			stmt.setString(2, veic.getNome());
                        stmt.setString(3, veic.getEndereco());
                        stmt.setString(4, veic.getTelefone());
                        stmt.setString(5, veic.getCpf());
                        stmt.setString(6, String.valueOf(veic.getGenero()));
                        stmt.setString(6, veic.getNascimento());
                        stmt.setFloat(6, veic.getSalario());
                        stmt.setInt(6, veic.getCargaH());
                        stmt.setString(6, veic.getAdmissao());
                        stmt.setInt(7, veic.getCodFilial());
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
       
    public void atualizaFuncionario(int codFunc, String endereco, String telefone, char genero, Float salario, int cargaH, String admissao, int filial) {
        String sql = "UPDATE Funcionario SET (endereco = ?, telefone = ?, genero = ?, salario = ?, "
                + "cargaH = ?, admissao = ?, filial = ?) WHERE idFuncionario = ?";
		try {
			PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);
			stmt.setString(1, endereco);
                        stmt.setString(2, telefone);
                        stmt.setString(3, String.valueOf(genero));
                        stmt.setFloat(4, salario);
                        stmt.setInt(5, cargaH);
                        stmt.setString(6, admissao);
                        stmt.setInt(7, filial);
			stmt.setInt(8, codFunc);
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
    
    public Funcionario buscaFuncionario(int codFunc) {        
        Funcionario func = new Funcionario();
        String sql = "SELECT * FROM Funcionario WHERE idFuncionario = ?";
        try {
            PreparedStatement stmt = this.conn.getCon().prepareStatement(sql);                      
            stmt.setInt(1, codFunc);
            ResultSet rs = stmt.executeQuery();
            func.setCodFunc(rs.getInt("idFuncionario"));
            func.setNome(rs.getString("nome"));
            func.setEndereco(rs.getString("endereco"));
            func.setTelefone(rs.getString("telefone"));
            func.setGenero(rs.getString("genero").charAt(0));
            func.setNascimento(rs.getString("nascimento"));
            func.setSalario(rs.getFloat("salario"));
            func.setCargaH(rs.getInt("cargaH"));
            func.setAdmissao(rs.getString("admissao"));
            func.setCodFilial(rs.getInt("filial"));
            stmt.close();	
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return func;
    }
}

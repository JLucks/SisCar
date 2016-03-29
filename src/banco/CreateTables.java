/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jorge
 */
public class CreateTables {
    private Conexao conn;
    private Statement stm ;

    public CreateTables(){
            this.conn = new Conexao();
    }

    public boolean criarTabelas(){
        try{
            stm = this.conn.getCon().createStatement();
            stm.execute("create table if not exists Filial(idFilial INT IDENTITY PRIMARY KEY NOT NULL , "
                    + "matricula VARCHAR(15) NOT NULL UNIQUE, endereco VARCHAR(50) NOT NULL)");
            
            stm.execute("create table if not exists Cliente(idCliente INT IDENTITY PRIMARY KEY NOT NULL, "
                    + "nome VARCHAR(45) NOT NULL, endereco VARCHAR(45) NOT NULL, "
                    + "telefone VARCHAR(15) NOT NULL, cpf VARCHAR(15) NOT NULL UNIQUE)");
            
            stm.execute("create table if not exists Veiculo(idVeiculo INT IDENTITY PRIMARY KEY NOT NULL, "
                    + "chassi VARCHAR(20) NOT NULL UNIQUE, placa VARCHAR(15) NOT NULL, "
                    + "modelo VARCHAR(45) NOT NULL, cor VARCHAR(15) NOT NULL, "
                    + "ano VARCHAR(4) NOT NULL, filial INT NOT NULL, "
                    + "FOREIGN KEY(filial) REFERENCES Filial(idFilial))");
            
            stm.execute("create table if not exists Funcionario(idFuncionario INT IDENTITY PRIMARY KEY NOT NULL, "
                    + "nome VARCHAR(45) NOT NULL, endereco VARCHAR(45) NOT NULL, "
                    + "telefone VARCHAR(15) NOT NULL, cpf VARCHAR(15) NOT NULL UNIQUE, "
                    + "genero VARCHAR(1) NOT NULL, nascimento VARCHAR(12) NOT NULL, "
                    + "salario FLOAT NOT NULL, cargaH INT NOT NULL, "
                    + "admissao VARCHAR(12) NOT NULL, filial INT NOT NULL, "
                    + "FOREIGN KEY(filial) REFERENCES Filial(idFilial))");
            
            stm.execute("create table if not exists Vendedor(idVendedor INT IDENTITY PRIMARY KEY NOT NULL, "
                    + "idiomas VARCHAR(60) NOT NULL, meta INT NOT NULL, funcionario INT NOT NULL UNIQUE, "
                    + "FOREIGN KEY(funcionario) REFERENCES Funcionario(idFuncionario))");
            
            stm.execute("create table if not exists Gerente(idGerente INT IDENTITY PRIMARY KEY NOT NULL, "
                    + "experiencias VARCHAR(60) NOT NULL, funcionario INT NOT NULL UNIQUE, "
                    + "FOREIGN KEY(funcionario) REFERENCES Funcionario(idFuncionario))");
            
            stm.execute("create table if not exists Administrador(idAdministrador INT IDENTITY PRIMARY KEY NOT NULL, "
                    + "especializacoes VARCHAR(60) NOT NULL, funcionario INT NOT NULL UNIQUE, "
                    + "FOREIGN KEY(funcionario) REFERENCES Funcionario(idFuncionario))");
            
            stm.execute("create table if not exists Usuario(idUsuario VARCHAR(16) PRIMARY KEY NOT NULL, "
                    + "senha VARCHAR(32) NOT NULL, funcionario INT NOT NULL UNIQUE, "
                    + "FOREIGN KEY(funcionario) REFERENCES Funcionario(idFuncionario))");
            
            stm.execute("create table if not exists UsuarioRoot(idUsuario VARCHAR(16) PRIMARY KEY NOT NULL, "
                    + "senha VARCHAR(32) NOT NULL)");
            
            stm.execute("create table if not exists ReceitasDespesa(id INT IDENTITY PRIMARY KEY NOT NULL, "
                    + "descricao VARCHAR(100) NOT NULL, valor FLOAT NOT NULL, filial INT NOT NULL,"
                    + "FOREIGN KEY(filial) REFERENCES Filial(idFilial))");
            
            stm.execute("create table if not exists Manutenção(id INT IDENTITY PRIMARY KEY NOT NULL, "
                    + "descricao VARCHAR(100) NOT NULL, valor FLOAT NOT NULL, veiculo INT NOT NULL,"
                    + "FOREIGN KEY(veiculo) REFERENCES Filial(idVeiculo))");
            
            stm.execute("create table if not exists Aluguel(numOrdem INT IDENTITY PRIMARY KEY NOT NULL, "
                    + "cliente INT NOT NULL, vendedor INT NOT NULL, "
                    + "veiculo INT NOT NULL, tempo INT NOT NULL, "
                    + "preco VARCHAR(10) NOT NULL, desconto INT NOT NULL, "
                    + "multa VARCHAR(10) NOT NULL, total VARCHAR(15) NOT NULL, "
                    + "dataAluguel VARCHAR(12) NOT NULL, dataDevol VARCHAR(12) NOT NULL, "
                    + "FOREIGN KEY(cliente) REFERENCES Cliente(idCliente), "
                    + "FOREIGN KEY(veiculo) REFERENCES Veiculo(idVeiculo), "
                    + "FOREIGN KEY(vendedor) REFERENCES Vendedor(idVendedor))");
            return true;
        }catch(SQLException e){
            System.err.println("Erro de Sql:" +e);
            e.printStackTrace();
        }
        return false;
    }

    public boolean limparTabelas(){
        try{
            stm.execute("TRUNCATE TABLE Aluguel");
            stm.execute("TRUNCATE TABLE Usuario");
            stm.execute("TRUNCATE TABLE Administrador");
            stm.execute("TRUNCATE TABLE Gerente");
            stm.execute("TRUNCATE TABLE Vendedor");
            stm.execute("TRUNCATE TABLE Funcionario");
            stm.execute("TRUNCATE TABLE Veiculo");
            stm.execute("TRUNCATE TABLE Cliente");
            stm.execute("TRUNCATE TABLE Filial");
            stm.execute("TRUNCATE TABLE ReceitasDespesa");
            stm.execute("TRUNCATE TABLE Manutencao");
            return true;
        }catch(SQLException e){
            System.err.println("Erro de Sql:" +e);
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean limparTabelaRoot(){
        try{
            stm.execute("TRUNCATE TABLE UsuarioRoot");
            return true;
        }catch(SQLException e){
            System.err.println("Erro de Sql:" +e);
            e.printStackTrace();
        }
        return false;
    }
}

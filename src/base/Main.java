/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import banco.CreateTables;
import banco.DAOfilial;
import banco.DAOusuarioRoot;
import interfaces.Login;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */

public class Main {
    public static final String nome = "SisCar";	//Nome da janela
    private static CreateTables Bct = new CreateTables();
    public static JFrame janela = new JFrame(nome);
        
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String url = this.getClass().getResource("/outros/icon_locacaoveiculos.png").getPath();
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
                janela.setIconImage(imagemTitulo);
                criarBanco();
                janela.setSize(640,560);    //Tamalho da janela
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Função Close da janela
                janela.add(new Login()); //Adiciona painel Home
                janela.setLocationRelativeTo(null); //Centraliza janela
                janela.setVisible(true);    //Mostra janela
            }
        });
    }
    
    public static void criarBanco(){
        if(!Bct.criarTabelas()){
            System.err.println("Erro não foi possivel criar o banco!");
        }else{
            DAOusuarioRoot dao = new DAOusuarioRoot();
            if(dao.recuperaUsuarios().isEmpty()){
                String user;
                String password;
                String confirmPassword;
                user = JOptionPane.showInputDialog(null, "Digite o novo usuario Root:");
                while(user.equals(String.valueOf(JOptionPane.CANCEL_OPTION))||user.equals(String.valueOf(JOptionPane.CLOSED_OPTION)))
                    user = JOptionPane.showInputDialog(null, "Digite o novo usuario Root:");
                do{
                    password = JOptionPane.showInputDialog(null, "Digite a senha:");
                    while(password.equals(String.valueOf(JOptionPane.CANCEL_OPTION))||password.equals(String.valueOf(JOptionPane.CLOSED_OPTION)))
                        password = JOptionPane.showInputDialog(null, "Digite a senha:");
                    confirmPassword = JOptionPane.showInputDialog(null, "Digite a senha novamente:");
                    while(confirmPassword.equals(String.valueOf(JOptionPane.CANCEL_OPTION))||confirmPassword.equals(String.valueOf(JOptionPane.CLOSED_OPTION)))
                        confirmPassword = JOptionPane.showInputDialog(null, "Digite a senha novamente:");
                }while(!password.equals(confirmPassword));
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(user);
                usuario.setSenha(Encrypt.encrypt(user, password));
                dao.adicionaUsuario(usuario);
            }
            DAOfilial daof = new DAOfilial();
            if(daof.recuperaFilial().isEmpty()){
                String matricula;
                String endereco;
                matricula = JOptionPane.showInputDialog(null, "Digite a matricula da Filial Matriz:");
                while(matricula.equals(String.valueOf(JOptionPane.CANCEL_OPTION))||matricula.equals(String.valueOf(JOptionPane.CLOSED_OPTION)))
                    matricula = JOptionPane.showInputDialog(null, "Digite a matricula da Filial Matriz:");
                endereco = JOptionPane.showInputDialog(null, "Digite o endereço:");
                while(endereco.equals(String.valueOf(JOptionPane.CANCEL_OPTION))||endereco.equals(String.valueOf(JOptionPane.CLOSED_OPTION)))
                    endereco = JOptionPane.showInputDialog(null, "Digite o endereço:");
                Filial filial = new Filial();
                filial.setMatricula(matricula);
                filial.setEndereco(endereco);
                daof.adicionaFilial(filial);
            }
        }
    }
    
    public static void deletarBanco(){
        if(!Bct.limparTabelas()){
            System.err.println("Erro não foi possivel deletar o banco!");
        }
    }
    
    public static void deletarRoot(){
        if(!Bct.limparTabelaRoot()){
            System.err.println("Erro não foi possivel deletar o tabela!");
        }
    }
}

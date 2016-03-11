/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import interfaces.Login;
import javax.swing.JFrame;

/**
 *
 * @author Jorge
 */

public class Main {
    public static final String nome = "SisCar";	//Nome da janela
    public static JFrame janela = new JFrame(nome); //Cria Janela
    
    public static void main(String[] args) {
        janela.setSize(640,560);    //Tamalho da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Função Close da janela
        janela.add(new Login()); //Adiciona painel Home
        janela.setLocationRelativeTo(null); //Centraliza janela
        janela.setVisible(true);    //Mostra janela
    }
}

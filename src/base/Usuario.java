/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

/**
 *
 * @author Jorge
 */
public class Usuario implements Comparable<Usuario>{
    private String idUsuario;
    private String senha;
    private int codFun;

    /**
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the codFun
     */
    public int getCodFun() {
        return codFun;
    }

    /**
     * @param codFun the codFun to set
     */
    public void setCodFun(int codFun) {
        this.codFun = codFun;
    }

    @Override
    public int compareTo(Usuario o) {
        if(this.getCodFun() > o.getCodFun())
            return 1;
        else if(this.getCodFun() < o.getCodFun())
            return -1;
        return 0;
    }
}

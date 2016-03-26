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
public class Administrador implements Comparable<Administrador>{
    private int id;
    private String especializacoes;
    private int codFunc;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the especializacoes
     */
    public String getEspecializacoes() {
        return especializacoes;
    }

    /**
     * @param especializacoes the especializacoes to set
     */
    public void setEspecializacoes(String especializacoes) {
        this.especializacoes = especializacoes;
    }

    /**
     * @return the codFunc
     */
    public int getCodFunc() {
        return codFunc;
    }

    /**
     * @param codFunc the codFunc to set
     */
    public void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }

    @Override
    public int compareTo(Administrador o) {
        if(this.getCodFunc() > o.getCodFunc())
            return 1;
        else if(this.getCodFunc() < o.getCodFunc())
            return -1;
        return 0;
    }
}

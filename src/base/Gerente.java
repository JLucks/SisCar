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
public class Gerente {
    private int codGerente;
    private String experiencias;
    private int codFunc;

    /**
     * @return the codGerente
     */
    public int getCodGerente() {
        return codGerente;
    }

    /**
     * @param codGerente the codGerente to set
     */
    public void setCodGerente(int codGerente) {
        this.codGerente = codGerente;
    }

    /**
     * @return the esperiencias
     */
    public String getExperiencias() {
        return experiencias;
    }

    /**
     * @param esperiencias the esperiencias to set
     */
    public void setExperiencias(String experiencias) {
        this.experiencias = experiencias;
    }

    /**
     * @return the codFun
     */
    public int getCodFunc() {
        return codFunc;
    }

    /**
     * @param codFun the codFun to set
     */
    public void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }
}

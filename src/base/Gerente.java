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
public class Gerente implements Comparable<Gerente>{
    private int codGerente;
    private String esperiencias;
    private int codFun;

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
    public String getEsperiencias() {
        return esperiencias;
    }

    /**
     * @param esperiencias the esperiencias to set
     */
    public void setEsperiencias(String esperiencias) {
        this.esperiencias = esperiencias;
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
    public int compareTo(Gerente o) {
        if(this.getCodFun() > o.getCodFun())
            return 1;
        else if(this.getCodFun() < o.getCodFun())
            return -1;
        return 0;
    }
}

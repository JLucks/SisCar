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
public class Vendedor {
    private int codVend;
    private String idiomas;
    private int meta;
    private int codFunc;

    /**
     * @return the codVend
     */
    public int getCodVend() {
        return codVend;
    }

    /**
     * @param codVend the codVend to set
     */
    public void setCodVend(int codVend) {
        this.codVend = codVend;
    }

    /**
     * @return the idiomas
     */
    public String getIdiomas() {
        return idiomas;
    }

    /**
     * @param idiomas the idiomas to set
     */
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    /**
     * @return the meta
     */
    public int getMeta() {
        return meta;
    }

    /**
     * @param meta the meta to set
     */
    public void setMeta(int meta) {
        this.meta = meta;
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
}

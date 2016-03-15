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
public class Aluguel {
    private int numOrdem;
    private int codCli;
    private int codVen;
    private int codVei;
    private int tempo;
    private float preco;
    private int desconto;
    private float multa;
    private float total;

    /**
     * @return the numOrdem
     */
    public int getNumOrdem() {
        return numOrdem;
    }

    /**
     * @param numOrdem the numOrdem to set
     */
    public void setNumOrdem(int numOrdem) {
        this.numOrdem = numOrdem;
    }

    /**
     * @return the codCli
     */
    public int getCodCli() {
        return codCli;
    }

    /**
     * @param codCli the codCli to set
     */
    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    /**
     * @return the codVen
     */
    public int getCodVen() {
        return codVen;
    }

    /**
     * @param codVen the codVen to set
     */
    public void setCodVen(int codVen) {
        this.codVen = codVen;
    }

    /**
     * @return the codVei
     */
    public int getCodVei() {
        return codVei;
    }

    /**
     * @param codVei the codVei to set
     */
    public void setCodVei(int codVei) {
        this.codVei = codVei;
    }

    /**
     * @return the tempo
     */
    public int getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the desconto
     */
    public int getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the multa
     */
    public float getMulta() {
        return multa;
    }

    /**
     * @param multa the multa to set
     */
    public void setMulta(float multa) {
        this.multa = multa;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }
}

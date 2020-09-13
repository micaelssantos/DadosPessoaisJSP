package br.sp.senac.tads.dsw.model;

/**
 *
 * @author Micael Santos
 */
public class Idioma {

    // Idiomas
    private String leitura;
    private String escrita;
    private String conversacao;

    public Idioma() {
    }

    public Idioma(String leitura, String escrita, String conversacao) {
        this.leitura = leitura;
        this.escrita = escrita;
        this.conversacao = conversacao;
    }

    public String getLeitura() {
        return leitura;
    }

    public void setLeitura(String leitura) {
        this.leitura = leitura;
    }

    public String getEscrita() {
        return escrita;
    }

    public void setEscrita(String escrita) {
        this.escrita = escrita;
    }

    public String getConversacao() {
        return conversacao;
    }

    public void setConversacao(String conversacao) {
        this.conversacao = conversacao;
    }

}

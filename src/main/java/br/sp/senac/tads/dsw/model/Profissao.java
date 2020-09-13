package br.sp.senac.tads.dsw.model;

import java.time.LocalDate;

/**
 *
 * @author Micael Santos
 */
public class Profissao {

    private String nomeEmpresa;
    private String cargo;
    private String detalhe;
    private LocalDate dataInicio;

    public Profissao() {
    }

    public Profissao(String nomeEmpresa, String cargo, String detalhe, LocalDate dataInicio) {
        this.nomeEmpresa = nomeEmpresa;
        this.cargo = cargo;
        this.detalhe = detalhe;
        this.dataInicio = dataInicio;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

}

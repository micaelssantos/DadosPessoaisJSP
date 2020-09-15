package br.sp.senac.tads.dsw.model;

import java.time.LocalDate;

/**
 *
 * @author Micael Santos
 */
public class Pessoa {

    // Dados Pessoais
    private String imagemPerfil;
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private String telefone;
    private String estado;
    // Experiencia Profissional
    private String nomeEmpresa;
    private String cargo;
    private String detalhe;
    private LocalDate dataInicioEmpresa;
    // Formação
    private String nomeInstituicao;
    private LocalDate dataInicio;
    private String grade;
    private String graduacao;
    // Conhecimentos
    private String conhecimentos;
    //Idioma
    private String idioma;
    private String leitura;
    private String escrita;
    private String conversacao;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
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

    public LocalDate getDataInicioEmpresa() {
        return dataInicioEmpresa;
    }

    public void setDataInicioEmpresa(LocalDate dataInicioEmpresa) {
        this.dataInicioEmpresa = dataInicioEmpresa;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
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

    public String getImagemPerfil() {
        return imagemPerfil;
    }

    public void setImagemPerfil(String imagemPerfil) {
        this.imagemPerfil = imagemPerfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getConhecimentos() {
        return conhecimentos;
    }

    public void setConhecimentos(String conhecimentos) {
        this.conhecimentos = conhecimentos;
    }

}

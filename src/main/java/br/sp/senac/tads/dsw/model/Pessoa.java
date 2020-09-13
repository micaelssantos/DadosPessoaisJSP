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

    public Pessoa() {
    }

    public Pessoa(String imagemPerfil, String nome, String email, LocalDate dataNascimento, String telefone, String estado) {
        this.imagemPerfil = imagemPerfil;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.estado = estado;
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
    
}

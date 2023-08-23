/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
public class Cliente {

    /**
     * Declaração dos atributos do Cliente
     */
    private String CPF;
    private String Nome;
    private String Nascimento;
    private String Rua;
    private String Bairro;
    private String CEP;
    private String Cidade;
    private String UF;
    private String Telefone;
    private String TelefoneOpc;
    private String Email;
    private String Genero;
    private String EstadoCivil;

    /**
     * Construtores do Cliente para serem instanciados de acordo com a
     * necessitade
     */
    public Cliente() {

    }

    public Cliente(String CPF, String Nome, String Nascimento, String Rua, String Bairro, String CEP, String Cidade, String UF, String Telefone, String TelefoneOpc, String Email, String Genero, String EstadoCivil) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Nascimento = Nascimento;
        this.Rua = Rua;
        this.Bairro = Bairro;
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.UF = UF;
        this.Telefone = Telefone;
        this.TelefoneOpc = TelefoneOpc;
        this.Email = Email;
        this.Genero = Genero;
        this.EstadoCivil = EstadoCivil;
    }

    /**
     * Getter e Setters (Retornos e Definições) para os atributos
     */
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getTelefoneOpc() {
        return TelefoneOpc;
    }

    public void setTelefoneOpc(String TelefoneOpc) {
        this.TelefoneOpc = TelefoneOpc;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }
}

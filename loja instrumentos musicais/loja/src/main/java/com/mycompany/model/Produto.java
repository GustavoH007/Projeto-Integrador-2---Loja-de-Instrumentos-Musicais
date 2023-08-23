/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
public class Produto {

    /**
     * Declaração dos atributos do Cliente
     */
    private int Id;
    private String Nome;
    private String Categoria;
    private String Descricao;
    private String Cor;
    private double ValorCusto;
    private double ValorVenda;
    private int Quantidade;

    /**
     * Construtores do Cliente para serem instanciados de acordo com a
     * necessitade
     */
    public Produto() {

    }

    public Produto(String Nome, String Categoria, String Descricao, String Cor, double ValorCusto, double ValorVenda, int Quantidade) {
        this.Nome = Nome;
        this.Categoria = Categoria;
        this.Descricao = Descricao;
        this.Cor = Cor;
        this.ValorCusto = ValorCusto;
        this.ValorVenda = ValorVenda;
        this.Quantidade = Quantidade;
    }

    public Produto(int Id, String Nome, String Categoria, String Descricao, String Cor, double ValorCusto, double ValorVenda, int Quantidade) {
        this.Id = Id;
        this.Nome = Nome;
        this.Categoria = Categoria;
        this.Descricao = Descricao;
        this.Cor = Cor;
        this.ValorCusto = ValorCusto;
        this.ValorVenda = ValorVenda;
        this.Quantidade = Quantidade;
    }

    /**
     * Getter e Setters (Retornos e Definições) para os atributos
     */
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public double getValorCusto() {
        return ValorCusto;
    }

    public void setValorCusto(double ValorCusto) {
        this.ValorCusto = ValorCusto;
    }

    public double getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(double ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
}

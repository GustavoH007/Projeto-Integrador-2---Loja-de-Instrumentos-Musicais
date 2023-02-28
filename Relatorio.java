/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
public class Relatorio {

    /**
     * Declaração dos atributos do Cliente
     */
    private int IDRelatorio;
    private int IDVenda;
    private int IDProduto;
    private String NomeProduto;
    private int QuantidadeProduto;
    private double ValorProduto;
    private double ValorTotalProduto;

    /**
     * Construtores do Cliente para serem instanciados de acordo com a
     * necessitade
     */
    public Relatorio() {

    }

    public Relatorio(int IDVenda, int IDProduto, int QuantidadeProduto, double ValorProduto) {
        this.IDVenda = IDVenda;
        this.IDProduto = IDProduto;
        this.QuantidadeProduto = QuantidadeProduto;
        this.ValorProduto = ValorProduto;
    }

    public Relatorio(int IDProduto, String NomeProduto, int QuantidadeProduto, double ValorProduto) {
        this.IDProduto = IDProduto;
        this.NomeProduto = NomeProduto;
        this.QuantidadeProduto = QuantidadeProduto;
        this.ValorProduto = ValorProduto;
        this.ValorTotalProduto = QuantidadeProduto * ValorProduto;
    }

    /**
     * Getter e Setters (Retornos e Definições) para os atributos
     */
    public int getIDRelatorio(int IDRelatorio) {
        return IDRelatorio;
    }

    public void setIDRelatorio(int IDRelatorio) {
        this.IDRelatorio = IDRelatorio;
    }

    public int getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(int IDVenda) {
        this.IDVenda = IDVenda;
    }

    public int getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto = IDProduto;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public int getQuantidadeProduto() {
        return QuantidadeProduto;
    }

    public void setQuantidadeProduto(int QuantidadeProduto) {
        this.QuantidadeProduto = QuantidadeProduto;
    }

    public double getValorProduto() {
        return ValorProduto;
    }

    public void setValorProduto(double ValorProduto) {
        this.ValorProduto = ValorProduto;
    }

    public double getValorTotalProduto() {
        return ValorTotalProduto;
    }

    public void setValorTotalProduto(double ValorTotalProduto) {
        this.ValorTotalProduto = ValorTotalProduto;
    }
}

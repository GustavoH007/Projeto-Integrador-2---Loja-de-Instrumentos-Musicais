/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
public class Venda {

    /**
     * Declaração dos atributos do Cliente
     */
    private int IDVenda;
    private String CPFCliente;
    private String NomeCliente;
    private double ValorTotal;
    private String DataVenda;

    /**
     * Construtores do Cliente para serem instanciados de acordo com a
     * necessitade
     */
    public Venda() {

    }

    public Venda(String CPFCliente, double ValorTotal, String DataVenda) {
        this.CPFCliente = CPFCliente;
        this.ValorTotal = ValorTotal;
        this.DataVenda = DataVenda;
    }

    public Venda(int IDVenda, String CPFCliente, String NomeCliente, double ValorTotal, String DataVenda) {
        this.IDVenda = IDVenda;
        this.CPFCliente = CPFCliente;
        this.NomeCliente = NomeCliente;
        this.ValorTotal = ValorTotal;
        this.DataVenda = DataVenda;
    }

    /**
     * Getter e Setters (Retornos e Definições) para os atributos
     */
    public int getIDVenda() {
        return IDVenda;
    }

    public void setIDVenda(int IDVenda) {
        this.IDVenda = IDVenda;
    }

    public String getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(String CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public String getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(String DataVenda) {
        this.DataVenda = DataVenda;
    }
}

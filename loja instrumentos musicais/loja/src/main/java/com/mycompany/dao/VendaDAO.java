/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

/**
 * Importa os dados de conexão com o banco de dados e as classes acessoras
 */
import static com.mycompany.dao.DAO.cmdSQL;
import static com.mycompany.dao.DAO.connect;
import static com.mycompany.dao.DAO.path;
import static com.mycompany.dao.DAO.pwd;
import static com.mycompany.dao.DAO.url;
import static com.mycompany.dao.DAO.user;
import com.mycompany.model.Venda;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
public class VendaDAO {

    /**
     * Realiza a venda 
     */
    public static int efetuarVenda(Venda objVenda) {

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("INSERT INTO Venda (CPF_Cliente, Valor_Total, Data_Venda) VALUES (?, ?, ?);", Statement.RETURN_GENERATED_KEYS);

            cmdSQL.setString(1, objVenda.getCPFCliente());
            cmdSQL.setDouble(2, objVenda.getValorTotal());
            cmdSQL.setString(3, objVenda.getDataVenda());

            int rows = cmdSQL.executeUpdate();
            if (rows > 0) {

                ResultSet rs = cmdSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objVenda.setIDVenda(rs.getInt(1));
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return objVenda.getIDVenda();
    }

    /**
     * Retorna um conjunto de Vendas já realizadas 
     */
    public static ArrayList<Venda> listarVendas() {
        ArrayList<Venda> listaDeVendas = new ArrayList<Venda>();

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT ID_Venda, CPF_Cliente, Nome, Valor_Total, Data_Venda FROM Venda INNER JOIN Cliente ON CPF = CPF_Cliente ORDER BY ID_Venda;");

            ResultSet rs = cmdSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Venda venda = new Venda();

                    venda.setIDVenda(rs.getInt(1));
                    venda.setCPFCliente(rs.getString(2));
                    venda.setNomeCliente(rs.getString(3));
                    venda.setValorTotal(rs.getDouble(4));
                    venda.setDataVenda(rs.getString(5));

                    listaDeVendas.add(venda);
                }
            } else {
                return null;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listaDeVendas;
    }

    /**
     * Retorna um conjunto de Vendas já realizadas por período
     */
    public static ArrayList<Venda> listarVendasPorPeriodo(String dataInicio, String dataFim) {
        ArrayList<Venda> listaDeVendas = new ArrayList<Venda>();

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT ID_Venda, CPF_Cliente, Nome, Valor_Total, Data_Venda FROM Venda INNER JOIN Cliente ON CPF = CPF_Cliente WHERE Data_venda BETWEEN ? AND ? ORDER BY ID_Venda;");

            cmdSQL.setString(1, dataInicio);
            cmdSQL.setString(2, dataFim);

            ResultSet rs = cmdSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Venda venda = new Venda();

                    venda.setIDVenda(rs.getInt(1));
                    venda.setCPFCliente(rs.getString(2));
                    venda.setNomeCliente(rs.getString(3));
                    venda.setValorTotal(rs.getDouble(4));
                    venda.setDataVenda(rs.getString(5));

                    listaDeVendas.add(venda);
                }
            } else {
                return null;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listaDeVendas;
    }
}

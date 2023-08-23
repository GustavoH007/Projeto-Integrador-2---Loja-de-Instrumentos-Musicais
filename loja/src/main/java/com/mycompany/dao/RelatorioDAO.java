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
import com.mycompany.model.Relatorio;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
public class RelatorioDAO {

    /**
     * Realiza a Relatório
     */
    public static boolean efetuarRelatorio(Relatorio objRelatorio) {

        boolean retorno = false;

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("INSERT INTO Relatorio (ID_Venda, ID_Produto, QTD_Produto, Valor_Produto) VALUES (?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS);

            cmdSQL.setInt(1, objRelatorio.getIDVenda());
            cmdSQL.setInt(2, objRelatorio.getIDProduto());
            cmdSQL.setInt(3, objRelatorio.getQuantidadeProduto());
            cmdSQL.setDouble(4, objRelatorio.getValorProduto());

            int rows = cmdSQL.executeUpdate();
            if (rows > 0) {
                retorno = true;
                int qtdEstoque = 0;

                cmdSQL = connect.prepareStatement("SELECT Quantidade FROM Produto WHERE ID = ?;");
                cmdSQL.setInt(1, objRelatorio.getIDProduto());
                ResultSet rs = cmdSQL.executeQuery();
                if (rs != null) {
                    if (rs.next()) {
                        qtdEstoque = rs.getInt(1);
                    }
                }

                qtdEstoque -= objRelatorio.getQuantidadeProduto();

                cmdSQL = connect.prepareStatement("UPDATE Produto SET Quantidade = ? WHERE ID = ?;");
                cmdSQL.setInt(1, qtdEstoque);
                cmdSQL.setInt(2, objRelatorio.getIDProduto());

                cmdSQL.executeUpdate();

                rs = cmdSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objRelatorio.setIDRelatorio(rs.getInt(1));
                    }
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }

    /**
     * Retorna um conjunto de informações da Venda realizada com base no valor
     * informado
     */
    public static ArrayList<Relatorio> listarRelatorio(int IDVenda) {
        ArrayList<Relatorio> listaDeRelatorios = new ArrayList<Relatorio>();

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT ID_Produto, Nome, QTD_Produto, Valor_produto FROM Relatorio INNER JOIN Produto ON ID = ID_Produto WHERE ID_Venda = ?;");
            cmdSQL.setInt(1, IDVenda);

            ResultSet rs = cmdSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Relatorio relatorio = new Relatorio(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4));

                    listaDeRelatorios.add(relatorio);
                }
            } else {
                return null;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listaDeRelatorios;
    }
}

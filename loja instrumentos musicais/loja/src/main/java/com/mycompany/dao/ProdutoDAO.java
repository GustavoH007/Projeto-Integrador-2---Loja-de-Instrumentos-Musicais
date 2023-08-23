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
import com.mycompany.model.Produto;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
public class ProdutoDAO {

    /**
     * Realiza o cadastro de um novo Produto
     */
    public static boolean cadastrarProduto(Produto objProduto) {

        boolean retorno = false;

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("INSERT INTO Produto (Nome, Categoria, Descricao, Cor, Valor_Custo, Valor_Venda, Quantidade) VALUES (?, ?, ?, ?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS);

            cmdSQL.setString(1, objProduto.getNome());
            cmdSQL.setString(2, objProduto.getCategoria());
            cmdSQL.setString(3, objProduto.getDescricao());
            cmdSQL.setString(4, objProduto.getCor());
            cmdSQL.setDouble(5, objProduto.getValorCusto());
            cmdSQL.setDouble(6, objProduto.getValorVenda());
            cmdSQL.setInt(7, objProduto.getQuantidade());

            int rows = cmdSQL.executeUpdate();
            if (rows > 0) {
                retorno = true;

                ResultSet rs = cmdSQL.getGeneratedKeys();
                if (rs != null) {
                    if (rs.next()) {
                        objProduto.setId(rs.getInt(1));
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
     * Realiza a alteração de um Produto
     */
    public static boolean alterarProduto(Produto objProduto) {
        boolean retorno = false;

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("UPDATE Produto SET Nome = ?, Categoria = ?, Descricao = ?, Cor = ?, Valor_Custo = ?, Valor_Venda = ?, Quantidade = ? WHERE ID = ?;");

            cmdSQL.setString(1, objProduto.getNome());
            cmdSQL.setString(2, objProduto.getCategoria());
            cmdSQL.setString(3, objProduto.getDescricao());
            cmdSQL.setString(4, objProduto.getCor());
            cmdSQL.setDouble(5, objProduto.getValorCusto());
            cmdSQL.setDouble(6, objProduto.getValorVenda());
            cmdSQL.setInt(7, objProduto.getQuantidade());

            cmdSQL.setInt(8, objProduto.getId());

            int rows = cmdSQL.executeUpdate();
            if (rows > 0) {
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }

    /**
     * Realiza a exclusão de um Produto
     */
    public static boolean excluirProduto(int ID) {
        boolean retorno = false;

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("DELETE FROM Produto WHERE ID = ?;");

            cmdSQL.setInt(1, ID);

            int rows = cmdSQL.executeUpdate();
            if (rows > 0) {
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }

    /**
     * Retorna uma conjunto de Produto armazenados no banco de dados
     */
    public static ArrayList<Produto> listarProdutos() {
        ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT * FROM Produto;");

            ResultSet rs = cmdSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Produto produto = new Produto();

                    produto.setId(rs.getInt("Id"));
                    produto.setNome(rs.getString("Nome"));
                    produto.setCategoria(rs.getString("Categoria"));
                    produto.setDescricao(rs.getString("Descricao"));
                    produto.setCor(rs.getString("Cor"));
                    produto.setValorCusto(rs.getDouble("Valor_Custo"));
                    produto.setValorVenda(rs.getDouble("Valor_Venda"));
                    produto.setQuantidade(rs.getInt("Quantidade"));

                    listaDeProdutos.add(produto);
                }
            } else {
                return null;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listaDeProdutos;
    }

    /**
     * Realiza a busca de um Produto por ID
     */
    public static Produto buscarPorId(int ID) {
        Produto produto = new Produto();

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT * FROM Produto WHERE ID = ?;");
            cmdSQL.setInt(1, ID);

            ResultSet rs = cmdSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    produto.setId(rs.getInt("ID"));
                    produto.setNome(rs.getString("Nome"));
                    produto.setCategoria(rs.getString("Categoria"));
                    produto.setDescricao(rs.getString("Descricao"));
                    produto.setCor(rs.getString("Cor"));
                    produto.setValorCusto(rs.getDouble("Valor_Custo"));
                    produto.setValorVenda(rs.getDouble("Valor_Venda"));
                    produto.setQuantidade(rs.getInt("Quantidade"));
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return produto;
    }

    /**
     * Realiza a busca de um Produto por Categoria
     */
    public static ArrayList<Produto> buscarPorCategoria(String Categoria) {
        ArrayList<Produto> listaPorCategoria = new ArrayList<Produto>();

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT * FROM Produto WHERE Categoria = ?;");
            cmdSQL.setString(1, Categoria);

            ResultSet rs = cmdSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Produto produto = new Produto();

                    produto.setId(rs.getInt("ID"));
                    produto.setNome(rs.getString("Nome"));
                    produto.setCategoria(rs.getString("Categoria"));
                    produto.setDescricao(rs.getString("Descricao"));
                    produto.setCor(rs.getString("Cor"));
                    produto.setValorCusto(rs.getDouble("Valor_Custo"));
                    produto.setValorVenda(rs.getDouble("Valor_Venda"));
                    produto.setQuantidade(rs.getInt("Quantidade"));

                    listaPorCategoria.add(produto);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listaPorCategoria;
    }
}

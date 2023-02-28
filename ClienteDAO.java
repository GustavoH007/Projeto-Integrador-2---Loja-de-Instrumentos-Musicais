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
import com.mycompany.model.Cliente;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
public class ClienteDAO {

    /**
     * Realiza o cadastro de um novo Cliente
     */
    public static boolean cadastrarCliente(Cliente objCliente) {

        boolean retorno = false;

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("INSERT INTO Cliente (CPF, Nome, Nascimento, Rua, Bairro, CEP, Cidade, UF, Telefone, Telefone_Opc, Email, Genero, Estado_Civil) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);", Statement.RETURN_GENERATED_KEYS);

            cmdSQL.setString(1, objCliente.getCPF());
            cmdSQL.setString(2, objCliente.getNome());
            cmdSQL.setString(3, objCliente.getNascimento());
            cmdSQL.setString(4, objCliente.getRua());
            cmdSQL.setString(5, objCliente.getBairro());
            cmdSQL.setString(6, objCliente.getCEP());
            cmdSQL.setString(7, objCliente.getCidade());
            cmdSQL.setString(8, objCliente.getUF());
            cmdSQL.setString(9, objCliente.getTelefone());
            cmdSQL.setString(10, objCliente.getTelefoneOpc());
            cmdSQL.setString(11, objCliente.getEmail());
            cmdSQL.setString(12, objCliente.getGenero());
            cmdSQL.setString(13, objCliente.getEstadoCivil());

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
     * Realiza a alteração de um Cliente
     */
    public static boolean alterarCliente(Cliente objCliente) {
        boolean retorno = false;

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("UPDATE Cliente SET Nome = ?, Nascimento = ?, Rua = ?, Bairro = ?, CEP = ?, Cidade = ?, UF = ?, Telefone = ?, Telefone_Opc = ?, Email = ?, Genero = ?, Estado_Civil = ? WHERE CPF = ?;");

            cmdSQL.setString(1, objCliente.getNome());
            cmdSQL.setString(2, objCliente.getNascimento());
            cmdSQL.setString(3, objCliente.getRua());
            cmdSQL.setString(4, objCliente.getBairro());
            cmdSQL.setString(5, objCliente.getCEP());
            cmdSQL.setString(6, objCliente.getCidade());
            cmdSQL.setString(7, objCliente.getUF());
            cmdSQL.setString(8, objCliente.getTelefone());
            cmdSQL.setString(9, objCliente.getTelefoneOpc());
            cmdSQL.setString(10, objCliente.getEmail());
            cmdSQL.setString(11, objCliente.getGenero());
            cmdSQL.setString(12, objCliente.getEstadoCivil());

            cmdSQL.setString(13, objCliente.getCPF());

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
     * Realiza a exclusão de um Cliente
     */
    public static boolean excluirCliente(String CPF) {
        boolean retorno = false;

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("DELETE FROM Cliente WHERE CPF = ?;");

            cmdSQL.setString(1, CPF);

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
     * Retorna uma conjunto de Cliente armazenados no banco de dados
     */
    public static ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT * FROM Cliente;");

            ResultSet rs = cmdSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setCPF(rs.getString("CPF"));
                    cliente.setNome(rs.getString("Nome"));
                    cliente.setNascimento(rs.getString("Nascimento"));
                    cliente.setRua(rs.getString("Rua"));
                    cliente.setBairro(rs.getString("Bairro"));
                    cliente.setCEP(rs.getString("CEP"));
                    cliente.setCidade(rs.getString("Cidade"));
                    cliente.setUF(rs.getString("UF"));
                    cliente.setTelefone(rs.getString("Telefone"));
                    cliente.setTelefoneOpc(rs.getString("Telefone_Opc"));
                    cliente.setEmail(rs.getString("Email"));
                    cliente.setGenero(rs.getString("Genero"));
                    cliente.setEstadoCivil(rs.getString("Estado_Civil"));

                    listaDeClientes.add(cliente);
                }
            } else {
                return null;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listaDeClientes;
    }

    /**
     * Realiza a busca de um Cliente por CPF
     */
    public static Cliente buscarPorCPF(String CPF) {
        Cliente cliente = new Cliente();

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT * FROM Cliente WHERE CPF = ?;");
            cmdSQL.setString(1, CPF);

            ResultSet rs = cmdSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    cliente.setCPF(rs.getString("CPF"));
                    cliente.setNome(rs.getString("Nome"));
                    cliente.setNascimento(rs.getString("Nascimento"));
                    cliente.setRua(rs.getString("Rua"));
                    cliente.setBairro(rs.getString("Bairro"));
                    cliente.setCEP(rs.getString("CEP"));
                    cliente.setCidade(rs.getString("Cidade"));
                    cliente.setUF(rs.getString("UF"));
                    cliente.setTelefone(rs.getString("Telefone"));
                    cliente.setTelefoneOpc(rs.getString("Telefone_Opc"));
                    cliente.setEmail(rs.getString("Email"));
                    cliente.setGenero(rs.getString("Genero"));
                    cliente.setEstadoCivil(rs.getString("Estado_Civil"));
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return cliente;
    }
    
    /**
     * Realiza a busca de um Cliente por Nome
     */
    public static ArrayList<Cliente> buscarPorNome(String Nome) {
        ArrayList<Cliente> listaPorNome = new ArrayList<Cliente>();

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT * FROM Cliente WHERE Nome like (?);");
            cmdSQL.setString(1, Nome + "%");

            ResultSet rs = cmdSQL.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Cliente cliente = new Cliente();

                    cliente.setCPF(rs.getString("CPF"));
                    cliente.setNome(rs.getString("Nome"));
                    cliente.setNascimento(rs.getString("Nascimento"));
                    cliente.setRua(rs.getString("Rua"));
                    cliente.setBairro(rs.getString("Bairro"));
                    cliente.setCEP(rs.getString("CEP"));
                    cliente.setCidade(rs.getString("Cidade"));
                    cliente.setUF(rs.getString("UF"));
                    cliente.setTelefone(rs.getString("Telefone"));
                    cliente.setTelefoneOpc(rs.getString("Telefone_Opc"));
                    cliente.setEmail(rs.getString("Email"));
                    cliente.setGenero(rs.getString("Genero"));
                    cliente.setEstadoCivil(rs.getString("Estado_Civil"));

                    listaPorNome.add(cliente);
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return listaPorNome;
    }

    /**
     * Verifica se há outro Cliente com o mesmo CPF para realizar o cadastro
     */
    public static boolean validarCPF(String CPF) {
        boolean retorno = false;

        try {
            Class.forName(path);

            connect = DriverManager.getConnection(url, user, pwd);

            cmdSQL = connect.prepareStatement("SELECT * FROM Cliente WHERE CPF = ?;");
            cmdSQL.setString(1, CPF);

            ResultSet rs = cmdSQL.executeQuery();
            if (rs == null) {
                retorno = true;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }
}

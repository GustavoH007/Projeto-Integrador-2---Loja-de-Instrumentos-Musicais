/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Gustavo Horikochi, Gustavo Leme, Igor Camilo & Lucas de Jesus
 */
/**
 * Valores base para conexão com o banco de dados
 */
public class DAO {

    public static String path = "com.mysql.cj.jdbc.Driver";
    public static String url = "jdbc:mysql://localhost:3306/lojainstrumentosmusicais";
    public static String user = "root";
    public static String pwd = "";

    public static Connection connect = null;
    public static PreparedStatement cmdSQL = null;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author monica
 */
public class ConexaoBD {
    private static Connection conexao;
    
    private static Connection conectar(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3307/siscoor?zeroDateTimeBehavior=convertToNull",
                    "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco...");
            e.printStackTrace();
            return null;
        }
    }
    public static Connection getConexao(){
        try {
            if (conexao==null || conexao.isClosed()){
                conexao = conectar();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }
}

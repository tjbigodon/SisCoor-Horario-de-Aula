package utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe responsável pela conexão do sistema com o DB.
 * @author Tarcísio
 */
public class ConexaoBD {
    private static Connection conexao;
    
    /**
     * Método responsável por conectar o sistema ao DB.
     * @return objeto da classe Connection se for bem sucedido, ou null, caso seja malsucedido.
     */
    private static Connection conectar(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/siscoor?zeroDateTimeBehavior=convertToNull",
                    "root", "");
        } catch (SQLException e) {
            System.out.println("Erro na conexão com o banco...");
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Método responsável pela verificação da existência da conexão, e caso não esteja conectado, tenta fazer essa conexão.
     * @return objeto da classe Connection.
     */
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

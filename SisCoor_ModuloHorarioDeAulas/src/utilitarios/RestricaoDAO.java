/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Classe responsável pelo gerenciamento do DB referente à tabela que diz respeito à área de atuação.
 * @author Tarcísio
 */
public class RestricaoDAO {
    /**
     * Método responsável pela inserção de uma nova área de atuação no DB.
     * @param areaAtuacao objeto de AreaAtuacao.
     */
    public void inserir(Restricao restricao){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "insert into restricao " +
                     "(dia, turno, codProf) VALUES (?,?,?)");
            pstmt.setString(1, restricao.getDia());
            pstmt.setString(2, restricao.getTurno());
            pstmt.setInt(3, restricao.getCodProf());
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Método que retorna um ArrayList contendo todas as informações sobre todas as áreas de atuação no DB.
     * @return todos os registros de áreas de atuação no DB.
     */
    public ArrayList<Restricao> listar(){
        Connection con = ConexaoBD.getConexao();
        ArrayList<Restricao> res = new ArrayList<Restricao>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from restricao");
            while (rs.next()){
                Restricao restricao = new Restricao();
                restricao.setDia(rs.getString("nome"));
                area.setCod(rs.getInt("cod"));
                res.add(area);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar tabela..." + e);
        }
        return res;
    }
}

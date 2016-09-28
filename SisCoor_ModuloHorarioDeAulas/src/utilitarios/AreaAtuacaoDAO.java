/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFGoiano-Admin
 */
public class AreaAtuacaoDAO {
    public void inserir(AreaAtuacao aa){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "insert into areaatuacao " +
                     "(nome) VALUES (?)");
            pstmt.setString(1, aa.getNomeArea());
            
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<AreaAtuacao> listar(){
        Connection con = ConexaoBD.getConexao();
        ArrayList<AreaAtuacao> res = new ArrayList<AreaAtuacao>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from areaatuacao");
            while (rs.next()){
                AreaAtuacao area = new AreaAtuacao();
                area.setNomeArea(rs.getString("nome"));
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

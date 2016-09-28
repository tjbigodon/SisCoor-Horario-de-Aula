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
 * @author livre
 */
public class ProfessorDAO {
    public void inserir(Professor prof){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "insert into professor " +
                     "(nome,userName,email,senha,areaAtuacao) VALUES (?,?,?,?,?)");
            pstmt.setString(1, prof.getNome());
            pstmt.setString(2, prof.getUsername());
            pstmt.setString(3, prof.getEmail());
            pstmt.setString(4, prof.getSenha());
            pstmt.setInt(5, prof.getAreaAtuacao());
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Professor> listar(){
        Connection con = ConexaoBD.getConexao();
        ArrayList<Professor> res = new ArrayList<Professor>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select nome,userName,email,senha,areaAtuacao from professor");
            while (rs.next()){
                Professor prof = new Professor();
                prof.setNome(rs.getString("nome"));
                prof.setUsername(rs.getString("userName"));
                prof.setEmail(rs.getString("email"));
                prof.setSenha(rs.getString("senha"));
                prof.setAreaAtuacao(rs.getInt("areaAtuacao"));
                res.add(prof);
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

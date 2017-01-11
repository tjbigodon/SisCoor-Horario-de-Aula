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
 * Classe responsável pelo gerenciamento do DB referente à tabela que diz respeito ao professor.
 * @author Tarcísio
 */
public class ProfessorDAO {
    /**
     * Método responsável pela inserção no DB de um novo professor.
     * @param prof objeto da classe Professor.
     */
    public void inserir(Professor prof){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "insert into professor " +
                     "(nome,userName,email,senha,areaAtuacao,status) VALUES (?,?,?,?,?,?)");
            pstmt.setString(1, prof.getNome());
            pstmt.setString(2, prof.getUsername());
            pstmt.setString(3, prof.getEmail());
            pstmt.setString(4, prof.getSenha());
            pstmt.setInt(5, prof.getAreaAtuacao());
            pstmt.setString(6, "");
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Metodo que marca o professor logado como ativo
     */
    public void ativar_Professor(String nome){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "UPDATE professor SET status=? WHERE userName=?");
            pstmt.setString(1, "ATIVO");
            pstmt.setString(2, nome);
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Metodo que desmarca o professor deslogado
     */
    public void desativar_Professor(){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "UPDATE professor SET status=? WHERE status=?");
            pstmt.setString(1, "");
            pstmt.setString(2, "ATIVO");
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Método que retorna um ArrayList contendo todas as informações sobre todos os professores no DB.
     * @return todos os registros de professores no DB.
     */
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
    
    /**
     * Metodo responsavel por retornar o codigo do professor que esta logado no momento.
     * @return Retorna o codigo do professor ativo no momento
     */
    public int buscar_Ativo()
    {
        Connection con = ConexaoBD.getConexao();
        int cod=0;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT cod FROM professor WHERE status='ATIVO'");
            Professor prof = new Professor();
            while(rs.next())
            {         
                prof.setCod(rs.getInt("cod"));
                cod=prof.getCod();
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar tabela..."+e);   
        }
        return cod;
    }
}

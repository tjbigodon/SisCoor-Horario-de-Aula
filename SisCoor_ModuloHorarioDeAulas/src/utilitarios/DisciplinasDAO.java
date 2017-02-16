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
 *
 * @author Diego
 */
public class DisciplinasDAO {
    
    public void inserir(Disciplinas disciplina){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "insert into disciplina " +
                     "(nome, cargaHoraria) VALUES (?,?)");
            pstmt.setString(1, disciplina.getNome());
            pstmt.setInt(2, disciplina.getCargaHoraria());
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Disciplinas> listar(){
        Connection con = ConexaoBD.getConexao();
        ArrayList<Disciplinas> res = new ArrayList<Disciplinas>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select cod, nome,cargahoraria from disciplina");
            while (rs.next()){
                Disciplinas disciplina = new Disciplinas();
                disciplina.setCod(rs.getInt("cod"));
                disciplina.setNome(rs.getString("nome"));
                disciplina.setCargaHoraria(rs.getInt("cargaHoraria"));
                res.add(disciplina);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar tabela..." + e);
        }
        return res;
    }
    
    public boolean buscar_Repeticao(Disciplinas disciplinas)
    {
        Connection con = ConexaoBD.getConexao();
        
        boolean existe = false;
          
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome , cargaHoraria FROM disciplina");
            Disciplinas disciplina = new Disciplinas();
            while(rs.next())
            {         
                disciplina.setNome(rs.getString("nome"));
                disciplina.setCargaHoraria(rs.getInt("cargaHoraria"));
                
                if(disciplina.getNome().equals(disciplinas.getNome()) && disciplina.getCargaHoraria()==disciplinas.getCargaHoraria())
                {
                    existe=true;
                }
            }
            
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar tabela..."+e);   
        }
        return existe;
    }
    
    public int buscar(Disciplinas disciplina)
    {
        Connection con = ConexaoBD.getConexao();
        String nome;
        int cod=0, cargaHoraria;
        try {
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT cod, nome, cargaHoraria FROM disciplina");
            while(rs.next())
            {
                nome=(rs.getString("nome"));
                cargaHoraria=(rs.getInt("cargaHoraria"));
                
                if(disciplina.getNome().equals(nome) && disciplina.getCargaHoraria()==cargaHoraria)
                {
                    cod=rs.getInt("cod");
                }
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar tabela..."+e);   
        }
        return cod;
    }
    
     public void deletar(Disciplinas disciplinas){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "DELETE FROM disciplina " +
                     " WHERE cod=?");
            pstmt.setInt(1, disciplinas.getCod());
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

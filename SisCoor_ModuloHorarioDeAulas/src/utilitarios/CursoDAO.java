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
public class CursoDAO 
{
    public boolean buscar_Repeticao(Curso curso)
    {
        Connection con = ConexaoBD.getConexao();
        
        boolean existe = false;
          
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nome FROM curso");
            Curso cursor = new Curso();
            while(rs.next())
            {         
                cursor.setNome(rs.getString("nome"));
                
                if(cursor.getNome().equals(curso.getNome()))
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
    
    public void deletar(Curso curso){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "DELETE FROM curso " +
                     " WHERE cod=?");
            pstmt.setInt(1, curso.getCod());
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Curso> listar(){
        Curso curs = new Curso();
        Connection con = ConexaoBD.getConexao();
        ArrayList<Curso> cur = new ArrayList<Curso>();
        try {
            int i = 0;
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select nome, turno, profCoord,numPeriodos from curso ");
            Curso curso = new Curso();
            while (rs.next())
            {
                curso = new Curso();
                curso.setProfCoord(rs.getInt("profCoord"));
                curso.setNome(rs.getString("nome"));
                curso.setTurno(rs.getString("turno"));
                curso.setNumPeriodos(rs.getInt("numPeriodos"));
                cur.add(curso);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar tabela..." + e);
        }
        return cur;
    }
    
    public void inserir(Curso curso){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "insert into curso " +
                     "(nome, turno, profCoord,numPeriodos) VALUES (?,?,?,?)");
            pstmt.setString(1, curso.getNome());
            pstmt.setString(2, curso.getTurno());
            pstmt.setInt(3, curso.getProfCoord());
            pstmt.setInt(4, curso.getNumPeriodos());
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void atualizar(Curso curso){
         Connection con = ConexaoBD.getConexao();
         try {
            PreparedStatement pstmt = con.prepareStatement(
                    "UPDATE curso SET nome=? , turno=? WHERE cod=? AND profCoord=?");
            pstmt.setString(1, curso.getNome());
            pstmt.setString(2, curso.getTurno());
            pstmt.setInt(3, curso.getCod());
            pstmt.setInt(4, curso.getProfCoord());
            pstmt.execute();
            pstmt.close();
            con.close();
             
         } catch (Exception e) {
             System.out.println("Não foi possível consultar tabela...");
         }   
    }
    
    public int buscarCodCurso(Curso curso)
    {
        Connection con = ConexaoBD.getConexao();
        String Name;
        int cod=0, profCoord;
        try {
            Statement stmt =  con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT cod, nome, profCoord FROM Curso");
            while(rs.next())
            {
                Name=(rs.getString("nome"));
                profCoord=(rs.getInt("profCoord"));
                
                if(curso.getNome().equals(Name) && curso.getProfCoord()==profCoord)
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
    
    public static Curso buscarCurso(String nomeCurso)
    {
        Curso cso = new Curso();
        Connection con = ConexaoBD.getConexao();
        String nome;
        int cod=0, profCoord;
        try {
            PreparedStatement pstmt =  con.prepareStatement("SELECT cod, nome, profCoord, numPeriodos, turno FROM Curso WHERE nome = ?");
            pstmt.setString(1, nomeCurso);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next())
            {
                cso = new Curso();
                cso.setNome((rs.getString("nome")));
                cso.setProfCoord(rs.getInt("profCoord"));
                cso.setCod(rs.getInt("cod"));
                cso.setNumPeriodos(rs.getInt("numPeriodos"));
                cso.setTurno(rs.getString("turno"));
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar tabela..."+e);   
        }
        
        return cso;
    }
}

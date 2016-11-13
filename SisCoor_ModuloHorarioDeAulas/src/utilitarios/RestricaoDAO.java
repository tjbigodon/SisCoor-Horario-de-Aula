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
 * Classe responsável pelo gerenciamento do DB referente à tabela que diz respeito as Restrições dos Professores.
 * @author Diego
 */
public class RestricaoDAO {
    /**
     * Método responsável pela inserção de uma nova restrição no DB.
     * @param restricao objeto de Restrição.
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
     * Método que retorna um ArrayList contendo todas as informações sobre todas as Restrições no DB.
     * @return todos os registros de restrições no DB.
     */
    public ArrayList<Restricao> listar(){
        Connection con = ConexaoBD.getConexao();
        ArrayList<Restricao> res = new ArrayList<Restricao>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select cod, dia, turno from restricao");
            while (rs.next()){
                Restricao restricao = new Restricao();
                restricao.setDia(rs.getString("dia"));
                restricao.setCod(rs.getInt("cod"));
                restricao.setTurno(rs.getString("turno"));
                res.add(restricao);
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
     * Metodo que deleta uma determinada restrição no banco de dados.
     * @param cod codigo da restrição que será deletada
     */
    public void deletar(int cod){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "DELETE FROM restricao " +
                     " WHERE cod=?");
            pstmt.setInt(1, cod);
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * Metodo que atualiza uma restrição presente no banco de dados.
     * @param dia dia em que acontece a restrição   
     * @param turno turno em que acontece a restrição
     * @param cod codigo da restrição
     */
    public void atualizar(String dia, String turno, int cod){
         Connection con = ConexaoBD.getConexao();
         try {
            PreparedStatement pstmt = con.prepareStatement(
                    "UPDATE restricao SET dia=? , turno=? WHERE cod=?");
            pstmt.setString(1, dia);
            pstmt.setString(2, turno);
            pstmt.setInt(3, cod);
            pstmt.execute();
            pstmt.close();
            con.close();
             
         } catch (Exception e) {
             System.out.println("Não foi possível consultar tabela...");
         }   
    }
    
    /**
     * Metodo que busca uma determinada restrição do banco de dados 
     * @param cod codigo da restrição
     */
    public void buscar(String dia_Turno, int codProf, int a)
    {
        Connection con = ConexaoBD.getConexao();
         try{
            if(a==1)
            {
                PreparedStatement pstmt = con.prepareStatement("SELECT cod, dia, turno FROM  restricao WHERE cod=? AND codProf=?");

                    pstmt.setInt(1, Integer.parseInt(dia_Turno));
                    pstmt.setInt(2, codProf);
                    pstmt.execute();
                    pstmt.close();
                    con.close();
            }
            if(a==0)
            {
                if(dia_Turno.equals("Matutino") || dia_Turno.equals("Vespertino") || dia_Turno.equals("Noturno"))
                {
                    PreparedStatement pstmt = con.prepareStatement("SELECT cod, dia, turno FROM  restricao WHERE turno=? AND codProf=?");

                    pstmt.setString(1, dia_Turno);
                    pstmt.setInt(2, codProf);
                    pstmt.execute();
                    pstmt.close();
                    con.close();
                }
                else
                {
                    PreparedStatement pstmt = con.prepareStatement("SELECT cod, dia, turno FROM  restricao WHERE dia=? AND codProf=?");

                    pstmt.setString(1, dia_Turno);
                    pstmt.setInt(2, codProf);
                    pstmt.execute();
                    pstmt.close();
                    con.close();
                }
            }
         } catch (Exception e) {
             System.out.println("Não foi possível consultar tabela...");   
         }
    }
    
    /**
     * Metodo responsavel por verificar a existencia de uma restrição ja existente no banco de dados
     * @param dia dia da restrição
     * @param turno turno da restrição
     * @param codProf codigo do professor referente a restrição
     * @return retorna um valor booleano indicando true caso a restrição ja exista e caso contrario false.
     */
    public boolean buscar_Repeticao(String dia, String turno, int codProf)
    {
        Connection con = ConexaoBD.getConexao();
        
        boolean existe = false;
          
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT dia, turno, codProf FROM restricao");
            Restricao restricao = new Restricao();
            while(rs.next())
            {         
                restricao.setDia(rs.getString("dia"));
                restricao.setTurno(rs.getString("turno"));
                restricao.setCodProf(rs.getInt("codProf"));
                
                if(dia.equals(restricao.getDia()) && turno.equals(restricao.getTurno()) && codProf==restricao.getCodProf())
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
}

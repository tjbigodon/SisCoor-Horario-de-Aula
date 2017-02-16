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
public class PeriodoDAO {
    
     public ArrayList<Periodo> listar(){
        Connection con = ConexaoBD.getConexao();
        ArrayList<Periodo> res = new ArrayList<Periodo>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select periodo, codDiscip, codCurso from periodo");
            while (rs.next()){
                Periodo periodo = new Periodo();
                periodo.setPeriodo(rs.getInt("periodo"));
                periodo.setCodDiscip(rs.getInt("codDiscip"));
                periodo.setCodCurso(rs.getInt("codCurso"));
                res.add(periodo);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar tabela..." + e);
        }
        return res;
    }
     
     public void inserir(Periodo periodo){
        Connection con = ConexaoBD.getConexao();
        try {
            PreparedStatement pstmt = con.prepareStatement(
                    "insert into periodo " +
                     "(periodo, codDiscip, codCurso) VALUES (?,?,?)");
            pstmt.setInt(1, periodo.getPeriodo());
            pstmt.setInt(2, periodo.getCodDiscip());
            pstmt.setInt(3, periodo.getCodCurso());
            pstmt.execute();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

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
public class PerguntasDAO 
{
    public ArrayList<Perguntas> listar(){
        Connection con = ConexaoBD.getConexao();
        ArrayList<Perguntas> res = new ArrayList<Perguntas>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from perguntas");
            while (rs.next()){
                Perguntas perg = new Perguntas();
                perg.setPergunta(rs.getString("pergunta"));
                perg.setCod(rs.getInt("codPergunta"));
                res.add(perg);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível consultar tabela..." + e);
        }
        return res;
    }
    
     public int buscar(String pergunta)
    {
        Connection con = ConexaoBD.getConexao();
        int cod=0;
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT codPergunta, pergunta FROM perguntas");
            while(rs.next())
            {
                if(pergunta.equals(rs.getString("pergunta")))
                {
                    cod=rs.getInt("codPergunta");
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
}

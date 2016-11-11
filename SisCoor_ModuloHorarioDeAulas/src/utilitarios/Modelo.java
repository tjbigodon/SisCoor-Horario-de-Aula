/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilitarios;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author monica
 */
public class Modelo extends AbstractTableModel{
    private ResultSet rs;
    protected ResultSetMetaData rsmd;
    private Statement stmt;
    protected ArrayList cache;

    public Modelo(String query) {
        Connection con = ConexaoBD.getConexao();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            rsmd = rs.getMetaData();
            cache = new ArrayList();
            // os dados da consulta são armazenados no cache.
            while (rs.next()){
                Object [] row = new Object[rsmd.getColumnCount()];
                for (int j=0; j<row.length;j++)
                    row[j] = rs.getObject(j+1);
                cache.add(row);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Erro: construtor ResultSetTableModel");
        } 
    }
    public int getRowCount(){
        return cache.size();
    }
    public String getColumnName(int c){
        try {
            return rsmd.getColumnLabel(c+1);
        } catch (SQLException e) {
            System.out.println("Erro: ResultSetTableModel.getColumnName " + e);
            return "";
        }
    }
    public int getColumnCount(){
        try {
            return rsmd.getColumnCount();
        } catch (SQLException e) {
            System.out.println("Erro: ResultSetTableModel.getColumnCount " + e);
            return 0;
        }
    }
    public Object getValueAt(int r, int c){
        if (r<cache.size())
            return ((Object[]) cache.get(r))[c];
        else
            return null;
    }
    
    
}

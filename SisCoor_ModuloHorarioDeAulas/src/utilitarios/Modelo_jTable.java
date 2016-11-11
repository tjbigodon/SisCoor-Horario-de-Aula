/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utilitarios;

/**
 *
 * @author monica
 */
public class Modelo_jTable extends Modelo{
    private RestricaoDAO restricao_DAO = new RestricaoDAO();
    private Restricao restricao = new Restricao();
            
    public Modelo_jTable(String query) {
        super(query);
    }
    public boolean isCellEditable(int row, int col){
        return true;
    }
    public void setValueAt(Object aValue, int r, int c){
        if (r<cache.size()){
            ((Object[])cache.get(r))[c] = aValue;
            // copiar cache.get(r) para Author
            restricao.setCod(Integer.parseInt(getValueAt(r,0).toString()));
            //autor.setFirstName(""+((Object[])cache.get(r))[1]);
            restricao.setDia(getValueAt(r,1).toString());
            restricao.setTurno(getValueAt(r,2).toString());
//            restricao_DAO.atualizar(item);
        }
        fireTableCellUpdated(r, c);
    }
    
    
}

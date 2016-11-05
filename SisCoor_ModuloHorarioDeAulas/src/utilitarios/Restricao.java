/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 * Classe responsavel pela criação e operações referentes à restrição dos professores
 * @author Diego
 */
public class Restricao 
{
    private int cod;
    private String dia;
    private String turno;
    private int codProf;

    /**
     * Metodo que retorna o codigo do professor pertencente a restrição
     * @return codigo do professor que a restrição pertence
     */
    public int getCodProf() {
        return codProf;
    }

    /**
    * Método que retorna o codigo da restriçao. 
    * @return Codigo da restrição
    */
    public int getCod() {
        return cod;
    }

    /**
     * Metodo que retorna o dia da restrição.
     * @return Dia da restrição
     */
    public String getDia() {
        return dia;
    }

    /**
     * Método que modifica o dia da restrição
     * @param dia dia da restrição
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Metodo que retorna o turno da restrição 
     * @return Retorna o turno da restrição
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Metodo que modifica o codigo da restrição
     * @param cod codigo da restricao
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * Metodo que modifica o codigo do professor 
     * @param codProf codigo do professor
     */
    public void setCodProf(int codProf) {
        this.codProf = codProf;
    }
    
    /**
     * Metodo que modifica o turno da restrição
     * @param turno turno da restrição indicada pelo professor
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * Metodo construtor da classe
     * @param cod Codigo da restrição 
     * @param turno Turno em que acontede a restrição
     * @param codProf Codigo do professor pertencente a restrição
     */
    public Restricao(String dia, String turno, int codProf) {
        this.dia = dia;
        this.turno = turno;
        this.codProf=codProf;
    }

    /**
     * Metodo contrutor da classe
     */
    public Restricao() {
    }
}

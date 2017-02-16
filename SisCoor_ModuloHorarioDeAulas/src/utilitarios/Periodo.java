/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 *
 * @author Diego
 */
public class Periodo {
    
    private int periodo;
    private int codDiscip;
    private int codCurso;

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getCodDiscip() {
        return codDiscip;
    }

    public void setCodDiscip(int codDiscip) {
        this.codDiscip = codDiscip;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public Periodo(int periodo, int codDiscip, int codCurso) {
        this.periodo = periodo;
        this.codDiscip = codDiscip;
        this.codCurso = codCurso;
    }

    public Periodo(int periodo, int codDiscip) {
        this.periodo = periodo;
        this.codDiscip = codDiscip;
    }
    
    public Periodo() {
    }
    
    
    
}

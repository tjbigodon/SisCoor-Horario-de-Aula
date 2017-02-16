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
public class Curso 
{
    private int cod;
    private String nome;
    private String turno; 
    private int profCoord;
    private int numPeriodos;

    public int getNumPeriodos() {
        return numPeriodos;
    }

    public void setNumPeriodos(int numPeriodos) {
        this.numPeriodos = numPeriodos;
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getProfCoord() {
        return profCoord;
    }

    public void setProfCoord(int profCoord) {
        this.profCoord = profCoord;
    }

    public Curso(int cod, String nome, String turno, int profCoord,int numPeriodos) {
        this.cod = cod;
        this.nome = nome;
        this.turno = turno;
        this.profCoord = profCoord;
        this.numPeriodos = numPeriodos;
    }
    
    public Curso(String nome){
        this.nome = nome;
    }

    public Curso() {
    }
    
    
}

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
public class Disciplinas {
    
    private int cod;
    private String nome;
    private int cargaHoraria;

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplinas(int cod, String nome, int cargaHoraria) {
        this.cod = cod;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }
    
    public Disciplinas(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplinas() {
    }
    
    
}

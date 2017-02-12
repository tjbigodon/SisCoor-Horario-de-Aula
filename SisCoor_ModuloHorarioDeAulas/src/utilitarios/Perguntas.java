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
public class Perguntas 
{
    private int cod;
    private String pergunta;

    public Perguntas() {
    }

    public Perguntas(int cod, String pergunta) {
        this.cod = cod;
        this.pergunta = pergunta;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    
    
}

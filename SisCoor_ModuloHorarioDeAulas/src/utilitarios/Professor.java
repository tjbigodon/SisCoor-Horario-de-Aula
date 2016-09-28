/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 *
 * @author livre
 */
public class Professor {
    private int cod;
    private String nome;
    private String username;
    private String senha;
    private String email;
    private int areaAtuacao;

    public Professor(String nome, String username, String senha, String email, int areaAtuacao) {
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.email = email;
        this.areaAtuacao = areaAtuacao;
    }

    public Professor() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(int areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
    
    
}

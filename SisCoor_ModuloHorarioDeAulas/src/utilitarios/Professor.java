/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 * Classe responsável pela criação e operações referentes a um professor.
 * @author Tarcísio
 */
public class Professor {
    private int cod;
    private String nome;
    private String username;
    private String senha;
    private String email;
    private int areaAtuacao;
    
    /**
     * Método construtor com atributos.
     * @param nome nome do professor.
     * @param username username do professor.
     * @param senha senha do professor.
     * @param email e-mail do professor.
     * @param areaAtuacao área de atuacao do professor.
     */
    public Professor(String nome, String username, String senha, String email, int areaAtuacao) {
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.email = email;
        this.areaAtuacao = areaAtuacao;
    }
    
    /**
     * Método construtor sem atributos.
     */
    public Professor() {
    }

    /**
     * Método que retorna o código do professor.
     * @return código do professor.
     */
    public int getCod() {
        return cod;
    }
    
    /**
     * Método que modifica o código do professor.
     * @param cod código do professor.
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    /**
     * Método que retorna o nome do professor.
     * @return nome do professor.
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Método que modifica o nome do professor.
     * @param nome nome do professor.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que retorna o username do professor.
     * @return username do professor.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Método que modifica o username do professor.
     * @param username username do professor.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Método que retorna a senha do professor.
     * @return senha do professor.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Método que modifica a senha do professor.
     * @param senha senha do professor.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Método que retorna o e-mail do professor.
     * @return e-mail do professor.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que modifica o e-mail do professor.
     * @param email e-mail do professor.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método que retorna a área de atuação do professor.
     * @return área de atuação do professor.
     */
    public int getAreaAtuacao() {
        return areaAtuacao;
    }

    /**
     * Método que modifica a área de atuação do professor.
     * @param areaAtuacao área de atuação do professor.
     */
    public void setAreaAtuacao(int areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    } 
}

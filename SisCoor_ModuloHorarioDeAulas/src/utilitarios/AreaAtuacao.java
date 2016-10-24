package utilitarios;
/**
 * Classe responsável pela criação e operações referentes à área de atuação.
 * @author Tarcísio
 */
public class AreaAtuacao {
    private String nomeArea;
    private int cod;

    /**
     * Método construtor da classe.
     * @param nomeArea nome da área de atuação.
     * @param cod código da área de atuação.
     */
    public AreaAtuacao(String nomeArea, int cod) {
        this.nomeArea = nomeArea;
        this.cod = cod;
    }
    /**
     * Método construtor da classe.
     */
    public AreaAtuacao() {
    }

    /**
     * Método que retorna o nome da área de atuação.
     * @return nome da área de atuação.
     */
    public String getNomeArea() {
        return nomeArea;
    }
    
    /**
     * Método que modifica o nome da área de atuação.
     * @param nomeArea nome da área de atuação.
     */
    public void setNomeArea(String nomeArea) {
        this.nomeArea = nomeArea;
    }
    
    /**
     * Método que retorna o código da área de atuação.
     * @return código da área de atuação.
     */
    public int getCod() {
        return cod;
    }
    
    /**
     * Método que modifica o código da área de atuação.
     * @param cod código da área de atuação.
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
}

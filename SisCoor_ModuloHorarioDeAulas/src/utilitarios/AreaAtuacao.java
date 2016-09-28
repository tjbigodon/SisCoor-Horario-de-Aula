package utilitarios;

public class AreaAtuacao {
    private String nomeArea;
    private int cod;

    public AreaAtuacao(String nomeArea, int cod) {
        this.nomeArea = nomeArea;
        this.cod = cod;
    }

    public AreaAtuacao() {
    }

    public String getNomeArea() {
        return nomeArea;
    }

    public void setNomeArea(String nomeArea) {
        this.nomeArea = nomeArea;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    
}

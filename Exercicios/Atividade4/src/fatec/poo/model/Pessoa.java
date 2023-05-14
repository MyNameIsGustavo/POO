package fatec.poo.model;

/* @author Gustavo */

public abstract class Pessoa{
    
    private String Nome;
    private int AnoInscricao;
    private double TotalCompras;

    public Pessoa(String Nome, int AnoInscricao) {
        this.Nome = Nome;
        this.AnoInscricao = AnoInscricao;
    }
    
    abstract public double calcBonus(int anoAtual);
    
    public void addCompras(double valorCompra){
        TotalCompras += valorCompra;
    }

    public String getNome() {
        return Nome;
    }

    public int getAnoInscricao() {
        return AnoInscricao;
    }

    public double getTotalCompras() {
        return TotalCompras;
    }
}

package fatec.poo.model;

/* @author Gustavo */

public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;
    
    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        situacao = false;
    }
    
    public void reservar(int numRG){
        this.numRG = numRG;
        situacao = true;
    }
    
    public double liberar(int numDias){
       double valorHospedagem;
       
       valorHospedagem = valorDiaria * numDias;
       numRG = 0;
       situacao = false;
       totalFaturado += valorHospedagem;
       return valorHospedagem;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public int getNumQuarto() {
        return numQuarto;
    }
}
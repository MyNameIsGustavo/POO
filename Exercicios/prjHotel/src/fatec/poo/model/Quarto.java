package fatec.poo.model;

/* @author Gustavo */
public class Quarto {
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;
    private double totalFaturado;

    public Quarto(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
        
        situacao = false;
    }

    public void reservar(int numRG){
        this.numRG = numRG;
        situacao = true;
    }
    
    public double liberar(int numDias){
        double valorPago;
        valorPago = valorDiaria * numDias;
        totalFaturado += valorPago;
        numRG = 0;
        situacao = false;
        return valorPago;
    }
    
    public boolean isSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
}
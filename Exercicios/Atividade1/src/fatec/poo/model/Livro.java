package fatec.poo.model;

/* @author Gustavo */

public class Livro {
    private int identificacao;
    private boolean situacao;
    private double valMultaDiaria;
    private double totalMultas;
    
    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }

    public boolean getSituacao() {
        return situacao;
    }
    
    public void emprestar(){
        situacao = true;
    }
    
    public double devolver(int diasAtraso){
        double multa;
        situacao = false;
        multa = valMultaDiaria * diasAtraso;
        totalMultas += multa;
        return multa;
    }

    public double getTotalMultas() {
        return totalMultas;
    }
}

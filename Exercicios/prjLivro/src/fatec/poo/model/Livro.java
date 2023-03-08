package fatec.poo.model;

/*  @author Gustavo Rocha   */

public class Livro {
    private int identificacao;
    private boolean situacao;
    private double valMultaDiaria;

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
        if(diasAtraso <= 0)
            diasAtraso = 1;
        situacao = false;
        return valMultaDiaria * diasAtraso;
    } 
}

package fatec.poo.model;

/* @author Gustavo */

public class PessoaFisica extends Pessoa{
    private String CPF;
    private double base;

    public PessoaFisica(String nome, String cpf, int anoInscricao) {
        super(nome, anoInscricao);
        this.CPF = cpf;
    }
    
    @Override
    public double calcBonus(int anoAtual){
        int diferencaAno;
        
        if(super.getTotalCompras() > 12000.00){
            diferencaAno = anoAtual - super.getAnoInscricao();
            return (diferencaAno * base);
        }
        else
            return 0;
    }

    public String getCPF() {
        return CPF;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }
}
package fatec.poo.model;

/* @author Gustavo */

public class PessoaFisica extends Pessoa{
    private String CPF;
    private double Base;

    public PessoaFisica(String CPF, String Nome, int AnoInscricao) {
        super(Nome, AnoInscricao);
        this.CPF = CPF;
    }
    
    @Override
    public double calcBonus(int anoAtual){
        if(getTotalCompras() > 12.000){
            return (anoAtual - getAnoInscricao()) * Base;
        }
        else{
            return 0;
        }
    }

    public String getCPF() {
        return CPF;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getBase() {
        return Base;
    }
}

package fatec.poo.model;

/* @author Gustavo */

public class PessoaJuridica extends Pessoa{
    private String CGC;
    private double taxaIncentivo;

    public PessoaJuridica(String nome, String CGC,  int anoInscricao) {
        super(nome, anoInscricao);
        this.CGC = CGC;
    }
    
    @Override
    public double calcBonus(int anoAtual){
        int diferencaAno;
        diferencaAno = anoAtual - super.getAnoInscricao();
        return (((taxaIncentivo / 100) * super.getTotalCompras()) * diferencaAno);
    }

    public void setTaxaIncentivo(double taxaIncentivo) {
        this.taxaIncentivo = taxaIncentivo;
    }

    public String getCGC() {
        return CGC;
    }

    public double getTaxaIncentivo() {
        return taxaIncentivo;
    }
}

package fatec.poo.model;

/* @author Gustavo */

public class PessoaJuridica extends Pessoa{
    private String CGC;
    private double TaxaIncentivo;

    public PessoaJuridica(String CGC, String Nome, int AnoInscricao) {
        super(Nome, AnoInscricao);
        this.CGC = CGC;
    }
    
    @Override
    public double calcBonus(int anoAtual){
        return(TaxaIncentivo / 100 * super.getTotalCompras()) * (anoAtual - super.getAnoInscricao());
    }

    public void setTaxaIncentivo(double TaxaIncentivo) {
        this.TaxaIncentivo = TaxaIncentivo;
    }

    public String getCGC() {
        return CGC;
    }

    public double getTaxaIncentivo() {
        return TaxaIncentivo;
    }
}

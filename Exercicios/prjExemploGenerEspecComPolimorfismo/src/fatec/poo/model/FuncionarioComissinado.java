package fatec.poo.model;

/* @author Gustavo */

public class FuncionarioComissinado extends Funcionario {
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissinado(int registro, String nome, String dtAdmissao, double taxaComissao) {
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas(double venda){
        totalVendas += venda; 
    }
    
    @Override
    public double calcSalBruto(){
        return salBase + (taxaComissao / 100 * totalVendas);
    }
    
    public double calcGratificacao(){
        if(totalVendas <= 5.000)
            return 0;
        else if(totalVendas > 5.000 && totalVendas <= 10.000)
            return(calcSalBruto() * 0.03);
        else
            return(calcSalBruto() * 0.05);
    }
    
    @Override
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}

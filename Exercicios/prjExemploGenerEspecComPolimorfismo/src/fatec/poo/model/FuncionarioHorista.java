package fatec.poo.model;

/* @author Gustavo */

public class FuncionarioHorista extends Funcionario{
    private double valHoraTrab;
    private double qtdeHoraTrab;

    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHoraTrab) {
        super(registro, nome, dtAdmissao);
        this.valHoraTrab = valHoraTrab;
    }

    public void setQtdeHoraTrab(double qtdeHoraTrab) {
        this.qtdeHoraTrab = qtdeHoraTrab;
    }
    
    @Override
    public double calcSalBruto(){
        return(valHoraTrab * qtdeHoraTrab);
    }
    
    public double calcGratificacao(){
        return(calcSalBruto() * 0.075);
    }
    
    @Override
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}

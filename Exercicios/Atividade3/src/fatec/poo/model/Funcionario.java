package fatec.poo.model;

/* @author Gustavo */

public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;

    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return (0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() - calcDesconto());
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDtAdmissao() {
        return dtAdmissao;
    }
}

package fatec.poo.model;

/**
 *
 * @author dimas
 */
public abstract class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    private Departamento departamento; //Indicando a multiplicidade 1;
        
    public Funcionario(int registro, String nome, String dtAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    //Definição de um método abstrato
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    //Retorna o endereço de um objeto da classe departamento.
    public Departamento getDepartamento() {
        return departamento;
    }
    //Tem como parametro de entrada o endereço de um objeto da classe departamento.
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}

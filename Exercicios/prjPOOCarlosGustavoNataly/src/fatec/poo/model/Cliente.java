package fatec.poo.model;
import java.util.ArrayList;

/* 
@authors Carlos,
@authors Gustavo,
@authors Nataly;
 */

public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido>pedidos;
    
    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
        this.pedidos = new ArrayList<Pedido>();
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p);
        p.setCliente(this);
    }
    
    /*  Nao existe na modelagem,mas foi necessario para atender o tópico 3.5.3;*/
    public void setLimiteDisp(double limiteDisp) {
       this.limiteDisp = limiteDisp;
    }
}

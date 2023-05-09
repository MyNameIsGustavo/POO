package fatec.poo.model;

/* 
@authors Carlos,
@authors Gustavo,
@authors Nataly;
 */

public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        
        limiteCred = limiteDisp;
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
}

import fatec.poo.model.Cliente;
import fatec.poo.model.Instrutor;
import java.text.DecimalFormat;

/* @author Gustavo */
public class Aplic {
    public static void main(String[] args) {    
        DecimalFormat df = new DecimalFormat("0.00");
        
        Cliente objCliente =  new Cliente("000.000.000-00", "Gustavo", "99818-4850");
        objCliente.setAltura(1.50);
        objCliente.setPeso(80.0);
        System.out.println("--- SUBCLASSE: Cliente. ---");
        System.out.println("Nome: " + objCliente.getNome());
        System.out.println("Telefone: " + objCliente.getTelefone());
        System.out.println("CPF: " + objCliente.getCpf());
        System.out.println("Peso: " + objCliente.getPeso());
        System.out.println("Altura: " + objCliente.getAltura());
        System.out.println("IMC: " + df.format(objCliente.calcImc()));
       
        Instrutor objInstrutor =  new Instrutor(123, "Cristiano", "99818-9999");
        objInstrutor.setAreaAtuacao("Jogador de futsal.");
        System.out.println("\n--- SUBCLASSE: Instrutor. ---");
        System.out.println("Nome: " + objInstrutor.getNome());
        System.out.println("Telefone: " + objInstrutor.getTelefone());
        System.out.println("ID: " + objInstrutor.getIdentificacao());
        System.out.println("Area de atuação: " + objInstrutor.getAreaAtuacao());
    }
}

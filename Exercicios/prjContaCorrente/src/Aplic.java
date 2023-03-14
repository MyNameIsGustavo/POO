import fatec.poo.model.ContaCorrente;
import java.util.Scanner;

/*  @author Gustavo */
public class Aplic {
    public static void main(String[] args) {
        int digNumero, opcao;
        double valorDeposito, valorSaque;
        double digSaldo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o numero da sua conta: ");
        digNumero = entrada.nextInt();
        
        System.out.print("Digite o saldo da sua conta: ");
        digSaldo = entrada.nextDouble();
        
        ContaCorrente objCC = new ContaCorrente(digNumero, digSaldo);
        
        do{
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("\n\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            
            switch (opcao){
                case 1:                             
                    System.out.println("O valor da conta atual: " + objCC.getSaldo());
                    System.out.print("Digite o valor de deposito: ");
                    
                    valorDeposito = entrada.nextDouble();
                    objCC.depositar(valorDeposito);
                    
                    System.out.println("O valor da conta após o deposito: " + objCC.getSaldo());
                    break;

                case 2:                             
                    System.out.println("O valor da conta atual: " + objCC.getSaldo());
                    System.out.print("Digite o valor de saque: ");
                     
                    valorSaque = entrada.nextDouble();
                    
                    if(valorSaque > objCC.getSaldo()){
                        System.out.println("Saldo Insuficiente");
                    }else{
                        objCC.sacar(valorSaque);
                    
                        System.out.println("O valor da conta após o deposito: " + objCC.getSaldo());
                    }
                    break;
                case 3:                            
                    System.out.println("O valor da conta atual: " + objCC.getSaldo());
                    break;
            }
        } while (opcao < 4);
    }
        
}
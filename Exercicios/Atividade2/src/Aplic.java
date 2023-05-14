import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/* @author Gustavo */

public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat ptrFormat = new DecimalFormat("#,##0.00");
        ContaCorrente[] objCC = new ContaCorrente[3];
        int opcao, auxFor, numero;
        double saldo, saque, deposito;
        
        for(auxFor = 0; auxFor < objCC.length; auxFor++){
            System.out.print("Informe o numero da conta: ");
            numero = entrada.nextInt();
            System.out.print("Informe o saldo da conta: ");
            saldo = entrada.nextDouble();
            objCC[auxFor] = new ContaCorrente(numero, saldo);
        }
        
        while(true)
        {   System.out.println("\n\t --- MENU BANCO ---");
            System.out.println("1 - Sacar.");
            System.out.println("2 - Depositar.");
            System.out.println("3 - Consultar saldo.");
            System.out.println("4 - Listar contas.");
            System.out.println("5 - Sair.");
            
            System.out.println("\n\t Digite a opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao)
            {   case 1:
                    System.out.println("Informe o numero da conta: ");
                    numero = entrada.nextInt();
                    for(auxFor = 0; auxFor < objCC.length; auxFor++){
                        if(objCC[auxFor].getNumero() == numero){
                            break;
                        }
                    }
                    if(auxFor == objCC.length){
                        System.out.println("Conta nao cadastrada.");
                    }
                    else{
                        System.out.println("Informe o valor de saque");
                        saque = entrada.nextDouble();
                        if(objCC[auxFor].getSaldo() < saque){
                            System.out.println("Saldo insuficiente.");
                        }
                        else{
                            objCC[auxFor].sacar(saque);
                            System.out.println("Saque realizado com sucesso!");
                        }
                    }
                break;
                case 2:
                    System.out.println("Informe o numero da conta: ");
                    numero = entrada.nextInt();
                    for(auxFor = 0; auxFor < objCC.length; auxFor++){
                        if(objCC[auxFor].getNumero() == numero){
                            break;
                        }
                    }
                    if(auxFor == objCC.length){
                        System.out.println("Conta nao cadastrada.");
                    }
                    else{
                        System.out.println("Informe o valor de deposito: ");
                        deposito = entrada.nextDouble();
                        objCC[auxFor].depositar(deposito);
                        System.out.println("Deposito realizado com sucesso!");
                    }
                break;
                case 3:
                    System.out.println("Informe o numero da conta: ");
                    numero = entrada.nextInt();
                    for(auxFor = 0; auxFor < objCC.length; auxFor++){
                        if(objCC[auxFor].getNumero() == numero){
                            break;
                        }
                    }
                    if(auxFor == objCC.length){
                        System.out.println("Conta nao cadastrada.");
                    }
                    else{
                        System.out.println("O saldo da conta: R$" + ptrFormat.format(objCC[auxFor].getSaldo()));
                    }
                break;
                case 4:
                    for(auxFor = 0; auxFor < objCC.length; auxFor++){
                        System.out.println("\n\tContas: " + objCC[auxFor].getNumero());
                        System.out.println("\tSaldo: R$" + ptrFormat.format(objCC[auxFor].getSaldo()));
                        
                    }
                break;
                case 5:
                    System.out.println("Encerrando o processamento.");
                break;
                default:
                    System.out.println("Informe uma opcao valida.");
                break;
            }
            if(opcao == 5){
                break;
            }
        }
    }
}

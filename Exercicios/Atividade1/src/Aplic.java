import fatec.poo.model.Livro;
import java.text.DecimalFormat;
import java.util.Scanner;

/* @author Gustavo */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat ptrFormat = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        Livro objLivro = new Livro();
        int opcao, diasAtraso;
        double valMulta;
        
        System.out.print("Informe a identificacao do livro: ");
        objLivro.setIdentificacao(entrada.nextInt());
        System.out.print("Informe a multa diaria deste livro: ");
        objLivro.setValMultaDiaria(entrada.nextDouble());
        
        while(true)
        {   System.out.println("\t--- Menu Livro ---");
            System.out.println("1 - Consultar livro.");
            System.out.println("2 - Emprestar livro.");
            System.out.println("3 - Devolver livro.");
            System.out.println("4 - Total de multas.");
            System.out.println("5 - Sair.");
            
            System.out.println("\tDigite a opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao)
            {   case 1:
                    if(objLivro.getSituacao()){
                       System.out.println("O livro esta emprestado.");
                    }
                    else{
                        System.out.println("O livro esta disponivel.");
                    }
                    break;
                case 2:
                    if(objLivro.getSituacao()){
                        System.out.println("O livro esta emprestado.");
                    }
                    else{
                        objLivro.emprestar();
                        System.out.println("O livro foi emprestado com sucesso!");
                    }
                    break;
                case 3:
                    if(objLivro.getSituacao()){
                        System.out.print("Informe a quantidade de dias de atraso: ");
                        diasAtraso = entrada.nextInt();
                        valMulta = objLivro.devolver(diasAtraso);
                        System.out.println("O livro foi emprestado com sucesso!");
                        if(valMulta > 0){
                            System.out.println("Valor da multa: " + valMulta);
                        }
                    }
                    else{
                        System.out.println("O livro ja esta disponivel.");
                    }
                    break;
                case 4:
                    System.out.println("O valor total das multas: " + objLivro.getTotalMultas());
                    break;
                case 5:
                    System.out.println("Encerrando o processamento.");
                    break;
                default:
                    System.out.println("Informe uma opcao valida.");
                break;
            }
            if (opcao == 5){
                break;
            }
        }
    }
}

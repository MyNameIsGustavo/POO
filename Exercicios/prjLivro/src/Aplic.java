import fatec.poo.model.Livro;
import java.util.Scanner;

/*    @author Gustavo Rocha    */
public class Aplic {

    public static void main(String[] args) {
        double digValMultaDiaria;
        int digIdentificacao;
        int opcaoMenu = 0;
        int digAtraso = 0;
        
        Livro objLivro = new Livro();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a identificacao do livro: ");
        digIdentificacao = entrada.nextInt();
        System.out.print("Digite o valor da multa diaria: ");
        digValMultaDiaria = entrada.nextDouble();
        
        objLivro.setIdentificacao(digIdentificacao);
        objLivro.setValMultaDiaria(digValMultaDiaria);
        
        opcaoMenu = 0;
        while(opcaoMenu != 4)
        {   System.out.println("1 - Consultar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção: ");
            opcaoMenu = entrada.nextInt();
            
            if(opcaoMenu == 1){   
                if(objLivro.getSituacao() == true)
                    System.out.println("O livro: " + digIdentificacao + " esta indisponivel.");
                else
                    System.out.println("O livro: " + digIdentificacao + " esta disponivel.");
            }
            else if(opcaoMenu == 2){   
                if(objLivro.getSituacao() == true)
                    System.out.println("O livro ja está emprestado.");
                else
                {   System.out.println("Ok, o livro foi emprestado para você.");
                    objLivro.emprestar();
                }
            }
            else if(opcaoMenu == 3)
            {   System.out.print("Informe a quantidade de dias de atraso: ");
                digAtraso = entrada.nextInt();
                if(objLivro.getSituacao() == true && digAtraso > 0){
                    System.out.println("O valor da multa: " + objLivro.devolver(digAtraso));
                }
                else{
                    System.out.println("O valor do aluguel: " + objLivro.devolver(digAtraso));
                }
                System.out.println("O livro foi devolvido com sucesso!");
            }
            else if(opcaoMenu == 4){    
                break;           
            }
            
            else{
                System.out.println("Digite uma opcao valida");
            } 
        }       
    }
}

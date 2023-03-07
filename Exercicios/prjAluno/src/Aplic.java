import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author Gustavo Rocha;
 */
public class Aplic {
 
    public static void main(String[] args) {
        int entradaRA, opcao;
        double entradaProva1,entradaProva2, 
        entradaTrabalho1, entradaTrabalho2; 
        
        Scanner entrada = new Scanner(System.in);
        Aluno objAluno = new Aluno();
        
        System.out.println("Bem-vindo a calculadora de notas de POO");
        opcao = 0;
        while(opcao != 4)
        {   System.out.println("Exibir nota das provas/trabalhos.");
            entradaProva1 = entrada.nextDouble();
            
            System.out.println("Exibir nota das provas/trabalhos.");
            entradaProva2 = entrada.nextDouble();
        }
    }
    
}

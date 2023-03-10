import fatec.poo.model.Aluno;
import java.util.Scanner;

/*  @author Gustavo */
public class Aplic {
    public static void main(String[] args) {
        double digNotaProva1, digNotaProva2;
        double digNotaTrab1, digNotaTrab2;
        int ra, opcaoMenu;
        opcaoMenu = 0;
        
        Aluno objAluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe seu RA: ");
        ra = entrada.nextInt();
        
        System.out.print("Informe sua 1 nota de prova: ");
        digNotaProva1 = entrada.nextDouble();
        
        System.out.print("Informe sua 2 nota de prova: ");
        digNotaProva2 = entrada.nextDouble();
        
        System.out.print("Informe sua 1 nota de trabalho: ");
        digNotaTrab1 = entrada.nextDouble();
        
        System.out.print("Informe sua 2 nota de trabalho: ");
        digNotaTrab2 = entrada.nextDouble();
        
        objAluno.setNtPrv1(digNotaProva1);
        objAluno.setNtPrv2(digNotaProva2);
        objAluno.setNtTrab1(digNotaTrab1);
        objAluno.setNtTrab2(digNotaTrab2);
        
        while(opcaoMenu != 4){
            System.out.println("\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção:");
            opcaoMenu = entrada.nextInt();    
            
            if(opcaoMenu == 1){
                System.out.println("A nota da primeira prova eh: " + objAluno.getNtPrv1() +
                "\nA nota da segunda prova eh: " + objAluno.getNtPrv2() + "\nA nota do primeiro trabalho eh:" 
                + objAluno.getNtTrab1() + "\nA nota do segundo trabalho eh: " + objAluno.getNtTrab2());
            }   
            else if(opcaoMenu == 2){
                    System.out.println("A media dos trabalhos eh: " + objAluno.calcMediaTrab()
                    + "\nA média das provas eh: " + objAluno.calcMediaProva());
            }   else if(opcaoMenu == 3){
                System.out.println("A sua média final eh: " + objAluno.calcMediaFinal());
            }   else if(opcaoMenu == 4){
                    break;
            }   else{
                    System.out.println("Informe uma opção valida!");
            }    
        }                
    }
}
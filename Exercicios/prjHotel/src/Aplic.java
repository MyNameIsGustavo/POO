import fatec.poo.model.Quarto;
import java.text.DecimalFormat;
import java.util.Scanner;

/* @author Gustavo */

public class Aplic {
    public static void main(String[] args) {
        DecimalFormat objFormat = new DecimalFormat("#.##00.0");
        Quarto objQuarto = new Quarto(1, 150.00);
        Scanner entradaDados = new Scanner(System.in);
        Quarto[] matQuarto = new Quarto[3];
        
        int opcao;
        
        for(int i = 0; i < 3; i++){
            matQuarto[i] = new Quarto(1, 100.00);
            matQuarto[i] = new Quarto(2, 150.00);
            matQuarto[i] = new Quarto(3, 155.00);
        }
      
        while(true){
            System.out.println("Consultar quarto");
            System.out.println("Reservar quarto");
            System.out.println("Liberar quarto");
            System.out.println("Consultar faturamento quarto");
            System.out.println("Consultar faturamento hotel");
            
            System.out.println("\tDigite uma opcao: ");
            opcao = entradaDados.nextInt();
            
        }        
    }
}

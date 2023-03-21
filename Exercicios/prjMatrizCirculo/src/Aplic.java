import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/* @author Gustavo*/
public class Aplic {
    public static void main(String[] args) {
        double medRaio;
        int i;
        
        Scanner entrada = new Scanner(System.in);
        Circulo[] matCirc = new Circulo[10];
        DecimalFormat df = new DecimalFormat("0.00");
        
        for(i = 0; i < 10; i++){
            matCirc[i] = new Circulo();
            System.out.print("Digite a medida do raio na posicao " + i + " da matriz: ");
            matCirc[i].setRaio(entrada.nextDouble());
        }
        
        for(i = 0; i < 10; i++){
            System.out.println("\nO raio do circulo no elemento da: " + i + " eh igual a: " + df.format(matCirc[i].getRaio()));
            System.out.println("O diametro do circulo no elemento da: " + i + " eh igual a: " + df.format(matCirc[i].calcDiametro()));
            System.out.println("O perimetro do circulo no elemento da: " + i + " eh igual a: " + df.format(matCirc[i].calcPerimetro()));
            System.out.println("A area do circulo no elemento da: " + i + " eh igual a: " + df.format(matCirc[i].calcArea()));
        }
    }
}

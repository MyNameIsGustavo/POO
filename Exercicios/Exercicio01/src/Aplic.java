import fatec.poo.model.Circulo;
import java.util.Scanner;
/**
 *
 * @author 0030482121034
 */
public class Aplic {
    public static void main(String[] args) {
        double entradaRaio;
        
        Scanner entrada = new Scanner(System.in);
        Circulo objCir = new Circulo();
        
       System.out.print("Digite o raio do circulo: ");
       entradaRaio = entrada.nextDouble();
       
       objCir.setRaio(entradaRaio);
       
       System.out.println("A area do circulo eh: " + objCir.calcArea());
       System.out.println("O perimetro do circulo eh: " + objCir.calcPerimetro());
       System.out.println("O diametro do circulo eh: " + objCir.calcDiametro());
    }

}

import fatec.poo.model.QuartoHotel;
import java.text.DecimalFormat;
import java.util.Scanner;

/* @author Gustavo */

public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat ptrFormat = new DecimalFormat("#,##0.00"); 
        QuartoHotel[] matQuarto = new QuartoHotel[5];
        int opcao, numQuarto, numDias, numRG, auxFor;
        double valorDiaria, totalFaturamentoHotel = 0.00, totalHospedagem = 0.00;

        for(auxFor = 0; auxFor < matQuarto.length; auxFor++){
            System.out.print("\nDigite o numero do quarto: ");
            numQuarto = entrada.nextInt();
            System.out.print("Digite o valor da diaria: ");
            valorDiaria = entrada.nextDouble();
            matQuarto[auxFor] = new QuartoHotel(numQuarto, valorDiaria);
        }
        
        while(true)
        {   System.out.println("\n\t--- MENU HOTEL ---");
            System.out.println("1 - Consultar quarto.");
            System.out.println("2 - Reservar quarto.");
            System.out.println("3 - Liberar quarto.");
            System.out.println("4 - Consultar faturamento quarto.");
            System.out.println("5 - Consultar faturamento hotel.");
            System.out.println("6 - Sair.");
            System.out.println("\n\n\tDigite uma opcao: ");
            opcao = entrada.nextInt();
            
            switch(opcao)
            {   case 1:
                    System.out.println("Digite o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    for(auxFor = 0; auxFor < matQuarto.length; auxFor++){
                        if(matQuarto[auxFor].getNumQuarto() == numQuarto){
                            break;
                        }
                    }
                    if(auxFor == matQuarto.length){
                        System.out.println("Quarto não cadastrado.");
                    }
                    else{
                        if(matQuarto[auxFor].getSituacao()){
                            System.out.println("Quarto indisponivel.");
                        }
                        else{
                            System.out.println("Quarto disponivel.");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Digite o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    for(auxFor = 0; auxFor < matQuarto.length; auxFor++){
                        if(matQuarto[auxFor].getNumQuarto() == numQuarto){
                            break;
                        }
                    }
                    if(auxFor == matQuarto.length){
                        System.out.println("Quarto não cadastrado.");
                    }
                    else{
                        if(matQuarto[auxFor].getSituacao()){
                            System.out.println("O quarto ja foi reservado.");
                        }
                        else{
                            System.out.println("Informe o seu RG: ");
                            numRG = entrada.nextInt();
                            matQuarto[auxFor].reservar(numRG);
                            System.out.println("O quarto foi reservado com sucesso.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    for(auxFor = 0; auxFor < matQuarto.length; auxFor++){
                        if(matQuarto[auxFor].getNumQuarto() == numQuarto){
                            break;
                        }
                    }
                    if(auxFor == matQuarto.length){
                        System.out.println("Quarto não cadastrado.");
                    }
                    else{
                        if(matQuarto[auxFor].getSituacao()){
                            System.out.println("Informe o numero de dias hospedado: ");
                            numDias = entrada.nextInt();
                            System.out.println("O total da hospedagem: " + ptrFormat.format(matQuarto[auxFor].liberar(numDias)));
                          
                            System.out.println("Quarto liberado...");
                        }
                        else{
                            System.out.println("O quarto ja esta livre.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o numero do quarto: ");
                    numQuarto = entrada.nextInt();
                    for(auxFor = 0; auxFor < matQuarto.length; auxFor++){
                        if(matQuarto[auxFor].getNumQuarto() == numQuarto){
                            System.out.println("O total faturado por este quarto: " + ptrFormat.format(matQuarto[auxFor].getTotalFaturado()));
                            totalHospedagem = matQuarto[auxFor].getTotalFaturado();
                            totalFaturamentoHotel += totalHospedagem;
                            break;
                        }
                    }
                    if(auxFor == matQuarto.length){
                        System.out.println("Quarto não cadastrado.");
                    }
                    break;
                case 5:
                    System.out.println("O total faturado pelo hotel: " + ptrFormat.format(totalFaturamentoHotel));
                    break;
                case 6:
                    System.out.println("Encerrando o processamento.");
                    break;
                default:
                    System.out.println("Informe uma opcao valida.");
                    break;
            }
            break;
        }
    }
}

import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

/* @author Gustavo */

public class Aplic {
    public static void main(String[] args) {
        DecimalFormat ptrFormat = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        Calendar data = Calendar.getInstance();
        int ano = data.get(Calendar.YEAR);
        
        PessoaFisica objPF = new PessoaFisica("000.000.000-99",
                                              "Gustavo Rocha",
                                               2010);
        
        PessoaJuridica objPJ = new PessoaJuridica("12.102.103/0001-77",
                                                  "John S.A",
                                                  2015);
        
        objPF.setBase(150);
        objPF.addCompras(5000);
        objPF.addCompras(4500);
        objPF.addCompras(6500);
        System.out.println("\n\t --- Dados: Pessoa Fisica. ---");
        System.out.println("Nome: " + objPF.getNome());
        System.out.println("CPF: " + objPF.getCPF());
        System.out.println("Val. Base: R$" + ptrFormat.format(objPF.getBase()));
        System.out.println("Ano Inscricao: " + objPF.getAnoInscricao());
        System.out.println("Total de vendas: R$" + ptrFormat.format(objPF.getTotalCompras()));
        System.out.println("Val. Bonus: R$" + ptrFormat.format(objPF.calcBonus(ano)));
        
        objPJ.setTaxaIncentivo(1);
        objPJ.addCompras(1000);
        objPJ.addCompras(2000);
        objPJ.addCompras(3000);
        objPJ.addCompras(4000);
        System.out.println("\n\t --- Dados: Pessoa Juridica. ---");
        System.out.println("Nome: " + objPJ.getNome());
        System.out.println("CGC: " + objPJ.getCGC());
        System.out.println("Taxa Inc.: " + ptrFormat.format(objPJ.getTaxaIncentivo()) + "%");
        System.out.println("Ano Inscricao: " + objPJ.getAnoInscricao());
        System.out.println("Total de vendas: R$" + ptrFormat.format(objPJ.getTotalCompras()));
        System.out.println("Val. Bonus: R$" + ptrFormat.format(objPJ.calcBonus(ano)));
    }
}

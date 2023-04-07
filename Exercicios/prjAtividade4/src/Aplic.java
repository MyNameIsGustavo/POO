import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;

/* @author Gustavo */

public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        PessoaFisica objPessoaFisica = new PessoaFisica("Gustavo Rocha",
                                                        "000.000.000-00",
                                                        2003);
        objPessoaFisica.setBase(1000);
        objPessoaFisica.addCompras(13000);
        System.out.println("\t---PESSOA FISICA---");
        System.out.println("Nome: " + objPessoaFisica.getNome());
        System.out.println("CPF: " + objPessoaFisica.getCPF());
        System.out.println("Ano de inscrição: " + objPessoaFisica.getAnoInscricao());
        System.out.println("Base: " + df.format(objPessoaFisica.getBase()));
        System.out.println("Total compras: " + df.format(objPessoaFisica.getTotalCompras()));
        System.out.println("Bonus: " + df.format(objPessoaFisica.calcBonus(2005)));
        
        PessoaJuridica objPessoaJuridica = new PessoaJuridica("Gustavo Maia",
                                                              "000.000.000-99",
                                                              2003);
        
        objPessoaJuridica.setTaxaIncentivo(10);
        objPessoaJuridica.addCompras(2000);
        System.out.println("\n\t---PESSOA JURIDICA---");
        System.out.println("Nome: " + objPessoaJuridica.getNome());
        System.out.println("CGC: " + objPessoaJuridica.getCGC());
        System.out.println("Ano de inscrição: " + objPessoaJuridica.getAnoInscricao());
        System.out.println("Taxa de incentivo: " + objPessoaJuridica.getTaxaIncentivo() + "%");
        System.out.println("Total compras: " + df.format(objPessoaJuridica.getTotalCompras()));
        System.out.println("Bonus: " + df.format(objPessoaJuridica.calcBonus(2005)));
    }
}
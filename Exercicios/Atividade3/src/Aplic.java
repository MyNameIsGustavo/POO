import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/* @author Gustavo */

public class Aplic {
    public static void main(String[] args) {
        DecimalFormat ptrFormat = new DecimalFormat("#,##0.00");
        FuncionarioHorista objFH = new FuncionarioHorista(123, 
                                                          "Gustavo Rocha",
                                                          "12/03/2003",
                                                          150.0);
        
        FuncionarioMensalista objFM = new FuncionarioMensalista(105,
                                                                "Rocha Maia",
                                                                "10/02/2021",
                                                                1500.0);
        
        FuncionarioComissionado objFC = new FuncionarioComissionado(100,
                                                                   "Maia Gustavo",
                                                                   "20/12/2023",
                                                                   10);
        
        objFH.setCargo("Programador Java");
        objFH.setQtdeHorTrab(20);
        System.out.println("\t --- Funcionario Horista ---");
        System.out.println("Nome: " + objFH.getNome());
        System.out.println("Registro: " + objFH.getRegistro());
        System.out.println("Data de admissao: " + objFH.getDtAdmissao());
        System.out.println("Cargo: " + objFH.getCargo());
        System.out.println("Sal. Bruto: " + ptrFormat.format(objFH.calcSalBruto()));
        System.out.println("Desconto: " + ptrFormat.format(objFH.calcDesconto()));
        System.out.println("Gratificacao: " + ptrFormat.format(objFH.calcGratificacao()));
        System.out.println("Sal. Liquido: " + ptrFormat.format(objFH.calcSalLiquido()));
        
        objFM.setCargo("Programador Python");
        objFM.setNumSalMin(2.5);
        System.out.println("\n\t --- Funcionario Mensalista ---");
        System.out.println("Nome: " + objFM.getNome());
        System.out.println("Registro: " + objFM.getRegistro());
        System.out.println("Data de admissao: " + objFM.getDtAdmissao());
        System.out.println("Cargo: " + objFM.getCargo());
        System.out.println("Sal. Bruto: " + ptrFormat.format(objFM.calcSalBruto()));
        System.out.println("Desconto: " + ptrFormat.format(objFM.calcDesconto()));
        System.out.println("Sal. Liquido: " + ptrFormat.format(objFM.calcSalLiquido()));
        
        objFC.setCargo("Programador C#");
        objFC.setSalBase(1500.0);
        objFC.addVendas(900);
        objFC.addVendas(1000);
        objFC.addVendas(3000);
        objFC.addVendas(4000);
        
        System.out.println("\n\t --- Funcionario Comissionado ---");
        System.out.println("Nome: " + objFC.getNome());
        System.out.println("Registro: " + objFC.getRegistro());
        System.out.println("Data de admissao: " + objFC.getDtAdmissao());
        System.out.println("Cargo: " + objFC.getCargo());
        System.out.println("Sal. Base: " + ptrFormat.format(objFC.getSalBase()));
        System.out.println("Total Vendas: " + ptrFormat.format(objFC.getTotalVendas()));
        System.out.println("Comissao: " + objFC.getTaxaComissao() + "%");
        System.out.println("Sal. Bruto: " + ptrFormat.format(objFC.calcSalBruto()));
        System.out.println("Desconto: " + ptrFormat.format(objFC.calcDesconto()));
        System.out.println("Gratificacao: " + ptrFormat.format(objFC.calcGratificacao()));
        System.out.println("Sal. Liquido: " + ptrFormat.format(objFC.calcSalLiquido()));
    }
}

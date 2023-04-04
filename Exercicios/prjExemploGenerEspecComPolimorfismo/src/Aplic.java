import fatec.poo.model.FuncionarioComissinado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;

/* @author Gustavo */

public class Aplic {
    public static void main(String[] args) {
       DecimalFormat df = new DecimalFormat("#,##0.00");
       FuncionarioHorista funcHor = new FuncionarioHorista(1010, 
                                                           "Pedro Silveira.", 
                                                           "14/05/1978", 
                                                           15.80);
       funcHor.setQtdeHoraTrab(90);
       funcHor.setCargo("Programador Java.");
       System.out.println("\t---FUNCIONARIO HORISTA---");
       System.out.println("Registro: " + funcHor.getRegistro());
       System.out.println("Data de admissao: " + funcHor.getDtAdmissao());
       System.out.println("Nome: " + funcHor.getNome());
       System.out.println("Cargo: " + funcHor.getCargo());
       System.out.println("Salario bruto: " + df.format(funcHor.calcSalBruto()));
       System.out.println("Desconto: " + df.format(funcHor.calcDesconto()));
       System.out.println("Gratificação: " + df.format(funcHor.calcGratificacao()));
       System.out.println("Salario liquido: " + df.format(funcHor.calcSalLiquido()));
       
       
       
       
       FuncionarioMensalista funcMen = new FuncionarioMensalista(1515, 
                                                                 "Gustavo Rocha.", 
                                                                 "12/03/2003", 
                                                                 600.00);
       funcMen.setNumSalMin(4);
       funcMen.setCargo("Programador Flutter.");
       System.out.println("\n\t---FUNCIONARIO MENSALISTA---");
       System.out.println("Registro: " + funcMen.getRegistro());
       System.out.println("Data de admissao: " + funcMen.getDtAdmissao());
       System.out.println("Nome: " + funcMen.getNome());
       System.out.println("Cargo: " + funcMen.getCargo());
       System.out.println("Salario bruto: " + df.format(funcMen.calcSalBruto()));
       System.out.println("Desconto: " + df.format(funcMen.calcDesconto()));
       System.out.println("Salario liquido: " + df.format(funcMen.calcSalLiquido()));
   
       FuncionarioComissinado funcComi = new FuncionarioComissinado(1520, "Gustavo Maia", "12/03/2005", 10.0);
       
       funcComi.setSalBase(6000);
       funcComi.setCargo("Programador Python.");
       System.out.println("\n\t---FUNCIONARIO COMISSIONADO---");
       System.out.println("Registro: " + funcComi.getRegistro());
       System.out.println("Data de admissao: " + funcComi.getDtAdmissao());
       System.out.println("Nome: " + funcComi.getNome());
       System.out.println("Cargo: " + funcComi.getCargo());
       System.out.println("Salario bruto: " + df.format(funcComi.calcSalBruto()));
       System.out.println("Desconto: " + df.format(funcComi.calcDesconto()));
       System.out.println("Salario liquido: " + df.format(funcComi.calcSalLiquido()));
       System.out.println("Taxa Comissao: " + funcComi.getTaxaComissao());
    }
}

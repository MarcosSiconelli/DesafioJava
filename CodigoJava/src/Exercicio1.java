import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        double valorBruto, valorAdicional, valorFinal, valorSemImposto;

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Escreva o valor Bruto do salário ");
        valorBruto = leitor.nextDouble();
        System.out.println("Escreva o valor do adicional ");
        valorAdicional = leitor.nextDouble();

        valorSemImposto = valorBruto - imposto(valorBruto);
        
        valorFinal= valorSemImposto+valorAdicional;
        System.out.println("valor do salário vai ser de: R$ " + valorFinal);


    
}


static double imposto(double valorBruto){
    double valorImposto=0;

    if (valorBruto >= 0 && valorBruto <= 1100.0) {
        valorImposto = (valorBruto * 0.05 );
    }
    if(valorBruto>1100.0 && valorBruto<2500.0){
        valorImposto = (valorBruto* 0.1);
    }
    else{
        valorImposto = (valorBruto*0.15);
    }
        return valorImposto;
}
    }

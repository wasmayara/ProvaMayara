import java.util.Scanner;

public class MainCalculaSalario {

	/* Faça um programa que receba 5 salários brutos de funcionários, sabendo-se que são descontados Imposto de Renda e INSS, calcule e mostre o total do salário líquido no referido mês.

Obs.: Salário Bruto - Descontos = Salário Líquido.

A saída do programa deve fornecer as seguintes informações:

Salário bruto.
Quanto pagou ao INSS.
Quanto pagou de Imposto de Renda.
Salário líquido.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    FolhaMes f = new FolhaMes();
		for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o seu salário Bruto " + i + ": ");
            double salarioBruto = sc.nextDouble();
		    double descontoINSS = f.calcularINSS(salarioBruto);
		    double descontoIR = f.calcularImpostR(salarioBruto);
            double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

	              
	                
	                System.out.printf("Salário Bruto:  %.2f\n", salarioBruto);
	                System.out.printf("Quanto pagou ao INSS: %.2f\n", descontoINSS);
	                System.out.printf("Quanto pagou de Imposto de Renda: %.2f\n", descontoIR);
	                System.out.printf(" O valor do Salário Líquido:  %.2f\n", salarioLiquido);
	                
	            }
	        }

		
	
}


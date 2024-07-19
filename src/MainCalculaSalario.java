import java.util.Scanner;

public class MainCalculaSalario {

	/* Fa�a um programa que receba 5 sal�rios brutos de funcion�rios, sabendo-se que s�o descontados Imposto de Renda e INSS, calcule e mostre o total do sal�rio l�quido no referido m�s.

Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.

A sa�da do programa deve fornecer as seguintes informa��es:

Sal�rio bruto.
Quanto pagou ao INSS.
Quanto pagou de Imposto de Renda.
Sal�rio l�quido.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    FolhaMes f = new FolhaMes();
		for (int i = 1; i <= 5; i++) {
            System.out.print("Informe o seu sal�rio Bruto " + i + ": ");
            double salarioBruto = sc.nextDouble();
		    double descontoINSS = f.calcularINSS(salarioBruto);
		    double descontoIR = f.calcularImpostR(salarioBruto);
            double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

	              
	                
	                System.out.printf("Sal�rio Bruto:  %.2f\n", salarioBruto);
	                System.out.printf("Quanto pagou ao INSS: %.2f\n", descontoINSS);
	                System.out.printf("Quanto pagou de Imposto de Renda: %.2f\n", descontoIR);
	                System.out.printf(" O valor do Sal�rio L�quido:  %.2f\n", salarioLiquido);
	                
	            }
	        }

		
	
}



public class FolhaMes {
	 double taxaInss;
	 double ImpostodeRenda;
	 
	 /*Calcule os descontos e o sal�rio l�quido com base nas tabelas abaixo:

Sal�rio	% Desconto INSS
at� 1.212,00	7,5%
de 1212,01 at� 2.427,35	9%
de 2.427,36 at� 3.641,03	12%
de 3.641,04 	14%
Sal�rio	% Desconto Imposto de Renda
at� 1.903,98	0%
de 1.903,99 at� 2.826,65	7,5%
de 2.826,66 at� 3.751,05	15%
de 3.751,06 at� 4.664,68	22,50%
Acima de 4.664,68	27,50%*/
	 
	 public static double calcularINSS(double salario) {
	        double desconto;
	        if (salario <= 1212.00) {
	            desconto = salario * 0.075;
	        } else if (salario <= 2427.35) {
	            desconto = salario * 0.09;
	        } else if (salario <= 3641.03) {
	            desconto = salario * 0.12;
	        } else if (salario >= 3641.04) {
	            desconto = salario * 0.14;
	        } else {
	            desconto = 3641.04 * 0.14; 
	        }
	        return desconto;
	    }

	    public static double calcularImpostR(double salario) {
	        double desconto;
	        if (salario <= 1903.98) {
	            desconto = 0.0;
	        } else if (salario <= 2826.65) {
	            desconto = (salario - 1903.98) * 0.075;
	        } else if (salario <= 3751.05) {
	            desconto = (salario - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
	        } else if (salario <= 4664.68) {
	            desconto = (salario - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
	        } else {
	            desconto = (salario - 4664.68) * 0.275 + (4664.68 - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
	        }
	        return desconto;
	    }
	

	        

}


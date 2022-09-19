package desafio;

import java.util.Locale;
import java.util.Scanner;

public class CalculoImpostoDeRendaMensal {

	public static void main(String[] args) {

		// Variável

		String valor;
		double salario = 0, imposto_inss = 0, salarioDesconto = 0, imposto_irpf = 0, dependente_desconto = 0;
		int numero_depedente = 0;

		// Entrada

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("------------------------------------");
		System.out.println(" Calculo do Imposto de Renda Mensal");
		System.out.println("------------------------------------");
		System.out.print("Informe o salario: ");
		valor = teclado.next().replace(",", ".");
		salario = Double.parseDouble(valor);

		while (salario <= 0) {
			System.out.println("Imposto impossivel de calcular \nSalario dever ser superior a 0");
			System.out.println("------------------------------------");
			System.out.print("Informe o salario:");
			valor = teclado.next().replace(",", ".");
			salario = Double.parseDouble(valor);
		}

		System.out.print("Informe quantidade de depedente: ");
		numero_depedente = teclado.nextInt();

		// Processamento

		if (salario <= 0) {
			System.out.println("Imposto impossível de calcular \nSalario dever ser maior que 0 (zero)");
		}
		if (salario <= 1751.81) {
			imposto_inss = salario * 0.08;
		} else if (salario <= 2919.72) {
			imposto_inss = salario * 0.09;
		} else if (salario <= 5839.45) {
			imposto_inss = salario * 0.11;
		} else if (salario > 5839.45) {
			imposto_inss = 642.34;
		}

		dependente_desconto = numero_depedente * 189.59;
		salarioDesconto = salario - dependente_desconto;

		if (salarioDesconto <= 1903.98) {
			imposto_irpf = 0;
		} else if ((salarioDesconto) <= 2826.65) {
			imposto_irpf = (salarioDesconto * 0.075 - 142.80);

		} else if (salarioDesconto <= 3751.05) {
			imposto_irpf = (salarioDesconto * 0.15 - 354.80);

		} else if (salarioDesconto <= 4664.68) {
			imposto_irpf = (salarioDesconto * 0.225 - 636.13);

		} else if (salarioDesconto > 4664.68) {
			imposto_irpf = (salarioDesconto * 0.275 - 869.36);
		}
		int n1 = numero_depedente;
		// Saida

		System.out.println("\nDescontos dos impostos\n");
		System.out.printf("Desconto do imposto INSS R$ %.2f \n", imposto_inss);
		System.out.printf("Desconto do imposto IRPF R$ %.2f \n", imposto_irpf);
		System.out.printf("Desconto total R$ %.2f \n", (imposto_irpf + imposto_inss));
		System.out.printf("Salario liquido R$ %.2f \n ", salario - (imposto_irpf + imposto_inss));
		String i = Integer.toString(numero_depedente);
		System.out.printf("%s + ", i);
		for (int n12 ; n1) {
			int ae = n12;
			System.out.println(ae);
		}
		teclado.close();
				
	}

}

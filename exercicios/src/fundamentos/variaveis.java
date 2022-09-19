package fundamentos;

//import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class variaveis {

	public static void main(String[] args) {
	
		
		// numero pra string
		
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("10" + num2).length());
		
		// string para numero
		
		String valor1 = JOptionPane.showInputDialog
				("Digite o primiero numero");
		String valor2 = JOptionPane.showInputDialog
				("Digite o primiero numero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("soma é " + soma);
		System.out.println("Media é " + soma / 2);
		
		//BigDecimal para consegui uma precisao maior
		
		
		
		
		
		
		
		
		
	}
}

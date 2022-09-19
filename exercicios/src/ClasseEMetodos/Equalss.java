package ClasseEMetodos;

import java.util.Date;

public class Equalss {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Jailson Roth";
		u1.email = "jailsonroth13@gmail.com";

		Usuario u2 = new Usuario();
		u2.nome = "Jailson Roth";
		u2.email = "jailsonroth13@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		System.out.println(u2.equals(new Date()));
		
	}

}

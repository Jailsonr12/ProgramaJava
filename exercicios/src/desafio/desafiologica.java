package desafio;

public class desafiologica {

	public static void main(String[] args) {
		// 2 trabalho terça e quinta
		// terça (v ou F)
		// quatya (v ou f)
		// 2 V = 55 poli
		// 1 V = 32 poli
		// 55 ou 32 = sorvete
		// 0 V = fica em casa.

		Boolean trabalho1 =	false;
		Boolean trabalho2 = false;

		if ((trabalho2 == true) && (trabalho1 == true)) {
			System.out.println("tv de 55 é sorvete");
		} else if ((trabalho2 == true) ^ (trabalho1 == true)) {
			System.out.println("tv de 32 é sorvete");
		} else if ((trabalho2 == false) && (trabalho1 == false)) {
			System.out.println("sem sorvete");
		}

	}

}

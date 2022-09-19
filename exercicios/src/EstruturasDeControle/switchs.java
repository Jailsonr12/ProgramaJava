package EstruturasDeControle;

public class switchs {
	//switch sem brack
	
	public static void main(String[] args) {
		
		
		//if (bool) ....
		//while (bool) ....
		//for (;bool;) ....
		
		//switch
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei Heian Godan");
		case "verde":
			System.out.println("Sei Heian Yodan");
		case "lajanra":
			System.out.println("Sei Heian Sandan");
		case "vermelha":
			System.out.println("Sei Heian Nidan");
		case "amarela":
			System.out.println("Sei Heian Shodan");
			break;
		default: //nesse caso nao faz sentido 
			System.out.println("Nao sei nada");
		}
		
		System.out.println("Fim");
		
		int idade= 3;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe pular");
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe chorar");
		
		}
			
	}
	
}

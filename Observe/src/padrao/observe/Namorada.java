package padrao.observe;

public class Namorada implements ChegadaAniversarianteObservador {
 
	public void chegou (EventoChegadaAniversariante evento) {
		System.out.println("Aviser os convidados...");
		System.out.println("Apagar as luzes..");
		System.out.println("Esperar um pouco");
		System.out.println("e... Supresa!!!");
	}
}
	
	


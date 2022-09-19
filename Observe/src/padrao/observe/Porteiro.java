package padrao.observe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ChegadaAniversarianteObservador> observadores = new ArrayList<>();

	public void registratObservador(ChegadaAniversarianteObservador observador) {
		observadores.add(observador);
	}

	public void monitorar() {
		Scanner teclado = new Scanner(System.in);
		String valor = "";
		while (!"sair".equalsIgnoreCase(valor)) {

			System.out.println("Aniverriente chegou");
			valor = teclado.nextLine();
			if ("sim".equalsIgnoreCase(valor)) {
				//criar evento
				EventoChegadaAniversariante evento = 
						new EventoChegadaAniversariante(new Date());
					
				
				// notitificar os observadores
				observadores.stream()
				.forEach(o -> o.chegou(evento ));
				valor = "sair";
			}else {
				System.out.println("Alarme falso");
			}
		}

	teclado.close();
	}
}

package padrao.observe;

public class AniversarioSupresa {
	
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registratObservador(namorada);
		porteiro.monitorar();
		
		
	}

}

package Generic;

public class CaixaObjeto {
	
	private Object coisa;
	
	public void guarda(Object coisa) {
		this.coisa = coisa;
	}
	
	public Object abrir () {
		return coisa;
	}
	

}

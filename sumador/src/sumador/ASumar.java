package sumador;

public class ASumar {

	private String valor_inicial;

	public ASumar(String string) {
		
		this.valor_inicial = string;
	}

	public String mostrar() {
		String numero = valor_inicial;
        if (numero.length() == 1) {
        return (numero + " = " + numero);
        }
        return numero;
	}


}

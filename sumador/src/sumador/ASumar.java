package sumador;

public class ASumar {

	/**
	 * String en el que realizaremos las modificaciones del valor hasta obtener el resultado final
	 */
	private String valor_inicial;

	
	/**
	 * Constructor en el que creamos un objeto ASumar con un valor inicial de String
	 * @param string Número elegido 
	 */
	public ASumar(String string) {
		
		this.valor_inicial = string;
	}

	/**
	 * Muestra el resultado final del sumatorio de las cifras del número pasado en el constructor.
	 * @return Resultado final del sumatorio.
	 */
	public String mostrar() {
		String numero = valor_inicial;
        if (numero.length() == 1) {
        return (numero + " = " + numero);
        }
        else if(Integer.parseInt(numero) < 0) {
        	return "";
        }
  
        String sumas = sumas();
        String total = String.valueOf(total());
        
        return sumas + "= " + total;
	}

	

}

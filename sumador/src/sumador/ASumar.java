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

	
	/**
	 * Método que representa en consola la suma de cada cifra del número pasado.
	 * @return String que muestra suma de cifras.
	 */
	private String sumas() {
		
		StringBuffer sB = new StringBuffer();
		
		for (int i = 0; i < valor_inicial.length(); i++) {
            sB.append(valor_inicial.charAt(i));
            
            sB.append(" ");
            
            if(i!=valor_inicial.length()-1) {
            sB.append("+");
            sB.append(" ");
            }
        }
		
		return sB.toString();
	}

	
	/**
	 * Cantidad total de la suma de dígitos del valor_inicial.
	 * @return Suma de dígitos de valor_inicial.
	 */
	public int total() {
        int suma = 0;

        for (int i = 0; i < valor_inicial.length(); i++) {
            // Cadena de un dígito.
            String digito = String.valueOf(valor_inicial.charAt(i));
            suma = suma + Integer.parseInt(digito);
        }
        return suma;
    }

	

}

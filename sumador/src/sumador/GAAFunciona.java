package sumador;

public class GAAFunciona {

	public static void main(String[] args) {
		

		ASumar sumi;
		
		
		for(String str: args) {
			
			sumi = new ASumar(str);
			
			System.out.println(sumi.mostrar());
		}
		

	}

}

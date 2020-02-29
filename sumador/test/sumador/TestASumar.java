package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar("5");
        String resultado = sumi.mostrar();
        assertEquals("5 = 5",resultado);
    }
	
	
	@Test
    public void testNegativos() {
        ASumar sumi = new ASumar("-5");
        String resultado = sumi.mostrar();
        assertEquals("",resultado);
    }
	
	
	@Test
    public void testMasUnaCifra() {
        ASumar sumi = new ASumar("1234");
        String resultado = sumi.mostrar();
        assertEquals("1 + 2 + 3 + 4 = 10",resultado);
    }

} 

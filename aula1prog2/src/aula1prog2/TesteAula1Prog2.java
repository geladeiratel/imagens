package aula1prog2;
/**
 * 
 * All tests in the folder "test" are executed 
 * when the "Test" action is invoked.
 * 
 */


//No eclipse: JUnit: Properties -> Java Build Path -> Libraries -> Add Library -> JUnit -> Junit 3/4


import static org.junit.Assert.*;
import org.junit.Test;


public class TesteAula1Prog2 {

    @Test
    public final void teste1() {
    	int numero=1;
    	String gabarito="Ola\n\'Engenharia\nde\nComputacao\'";
    	
        Main obj = new Main();
        String resposta = obj.toString();
        
        assertTrue("Teste"+numero+": Separadores" , gabarito.equals(resposta));
    }
    
    @Test
    public final void teste2() {
    	int numero=2;
    	String gabarito="SIM";
    	
        Main obj = new Main();
        String resposta = obj.imprimir("Engenharia de Computacao");
        
        assertTrue("Teste"+numero+": Separadores" , gabarito.equals(resposta));
    }
    
}
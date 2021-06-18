package aula1prog1;
/**
 * 
 * All tests in the folder "test" are executed 
 * when the "Test" action is invoked.
 * 
 */


//No eclipse: JUnit: Properties -> Java Build Path -> Libraries -> Add Library -> JUnit -> Junit 3/4


import static org.junit.Assert.*;
import org.junit.Test;


public class TesteAula1Prog1 {

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
    
    @Test
    public final void teste3() {
    	int numero=3;
    	float gabarito=7.5f;
    	
        Main obj = new Main();
        float resposta=obj.calcular();
        
        assertTrue("Teste"+numero+": Operadores" , gabarito==resposta);
    }
    
    @Test
    public final void teste4() {
    	int numero=4;
    	int gabarito=2;
    	
        Main obj = new Main();
        int resposta=obj.comparar(1.2f,1.3f);
        
        assertTrue("Teste"+numero+": Operadores" , gabarito==resposta);
    }
    
    @Test
    public final void teste5() {
    	int numero=5;
    	double gabarito=1.2f;
    	
        Main obj = new Main();
        obj.atribuir(1.2f);
        
        assertTrue("Teste"+numero+": Operadores" , gabarito==obj.variavelInstancia);
    }
    
}
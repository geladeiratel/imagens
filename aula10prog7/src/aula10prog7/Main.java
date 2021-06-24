package aula10prog7;

public class Main {

	public static void main(String[] args) {
		
		Integer a = new Integer(1);
		Double b = new Double(2);
		String c = new String("ABC");
		Float d = new Float(3);
		Character e = new Character('a');
		
		//Metodo static: metodo de Classe, nao eh necessario instanciar objetos
		Integer.compare(2, 3);
		
		Object [] obj = { a,b,c,d,e };
		for(int i=0; i<obj.length; i++)
			System.out.println(obj[i]);

	}

}

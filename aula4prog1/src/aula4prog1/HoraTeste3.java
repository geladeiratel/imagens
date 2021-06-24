package aula4prog1;

public class HoraTeste3 {

	public static void main(String [] args){
		
		Hora3 h1 = new Hora3();
		//h1.setHora(1, 59, 59);
				
		while(true){
			System.out.println(h1);
			h1.setSegundo(h1.getSegundo()+1);			
			if(h1.getSegundo()==0){				
				h1.setSegundo(0);
				h1.setMinuto(h1.getMinuto()+1);				
				if(h1.getMinuto()==0){					
					h1.setHora(h1.getHora()+1);
					if(h1.getHora()==0)
						h1.setHora(0, 0, 0);
				}
			}
			
			try{				
				Thread.sleep(1000);
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
}

package aula10prog6;

import java.text.DecimalFormat;

public class Hora3 {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Hora3() {
		setHora(0,0,0);
	}
	
	public Hora3(int h) {
		setHora(h,0,0);
	}
	
	public Hora3(int h, int m) {
		setHora(h,m,0);
	}
	
	public Hora3(int h, int m, int s) {
		setHora(h,m,s);
	}
	
	public Hora3(Hora3 hora) {
		setHora(hora.getHora(),hora.getMinuto(),hora.getSegundo());
	}
	
	public void setHora(int h){
		this.hora = ((h>=0 && h<24) ? h:0 );
	}
	
	public void setMinuto(int m){
		this.minuto = ((m>=0 && m<=59) ? m:0 );
	}
	
	public void setSegundo(int s){
		this.segundo = ((s>=0 && s<=59) ? s:0 );
	}
	
	public int getHora(){
		return this.hora;
	}
	
	public int getMinuto(){
		return this.minuto;
	}
	
	public int getSegundo(){
		return this.segundo;
	}

	public void setHora(int h, int m, int s){
		
		setHora(h);
		setMinuto(m);
		setSegundo(s);		
		
	}
	
	public String converterHora(){
		
		DecimalFormat doisDigitos = new DecimalFormat("00");
		return doisDigitos.format(this.hora) + " : " +
			   doisDigitos.format(this.minuto) + " : " +
			   doisDigitos.format(this.segundo);
				
	}
	
	public String toString(){
		DecimalFormat doisDigitos = new DecimalFormat("00");
				
		return ((hora==12 || hora==0)?12:hora%12)+" : "+		
			   doisDigitos.format(this.minuto) + " : " +
			   doisDigitos.format(this.segundo) + 
			   (hora < 12 ? " AM" : " PM");		
	}

}

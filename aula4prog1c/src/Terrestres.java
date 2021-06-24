

/**
 * Class Terrestres
 */
public class Terrestres extends Animais {

  //
  // Fields
  //

  protected String quantidadePelos = "pouco";
  
  //
  // Constructors
  //
  public Terrestres () {
	  
	  System.out.println(nome);
	  
	  //Public: quantidadeEscamas	  
	  //System.out.println(new Anfibios().quantidadeEscamas);
	  
	  //Protected: quantidadeEscamas
	  //Sem Acesso
	  //System.out.println(quantidadeEscamas);
	  //System.out.println(new Anfibios().quantidadeEscamas);
	  
	  //Private: quantidadeEscamas
	  //Sem acesso
	  //System.out.println(new Anfibios().quantidadeEscamas);
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of quantidadePelos
   * @param newVar the new value of quantidadePelos
   */
  public void setQuantidadePelos (String newVar) {
    quantidadePelos = newVar;
  }

  /**
   * Get the value of quantidadePelos
   * @return the value of quantidadePelos
   */
  public String getQuantidadePelos () {
    return quantidadePelos;
  }

  //
  // Other methods
  //

}

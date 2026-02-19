

/**
 * Class CuentaBancaria
 */
public class CuentaBancaria {

  //
  // Fields
  //

  private double saldo;
  
  //
  // Constructors
  //
  public CuentaBancaria () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of saldo
   * @param newVar the new value of saldo
   */
  public void setSaldo (double newVar) {
    saldo = newVar;
  }

  /**
   * Get the value of saldo
   * @return the value of saldo
   */
  public double getSaldo () {
    return saldo;
  }

  //
  // Other methods
  //

  /**
   * @param        CuentaBancaria
   */
  public CuentaBancaria(double CuentaBancaria)
  { this. saldo = cuentaBancaria;
	  system.out.println("Saldo inicial"+saldo);

  }


  /**
   * @return       double
   */


  /**
   * @param        cantidad
   */
  public void depositar(double cantidad)
  {
	  int deposito = cantidad;
	  system.out.pintln("deposito "+deposito);



  }


  /**
   * @param        cantRetiro
   */
  public void retirar(double cantRetiro)
  {
	  
	  system.out.println("Retirando "+cantRetiro);
	  if(cantRetiro>saldo){
		  system.out.println("Saldo insuficiente");
	  }else{
		  system.out.println("Retirando "+cantRetiro);
	  }

  }


}

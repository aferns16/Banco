
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private CuentaBancaria miCuenta;
    /*
     * Constructor for objects of class Persona
     */
    public Persona(String s)
    {
       nombre = s;
    }
    /* La persona saluda*/
    public void saludar()
    {
        System.out.println("Hola, me llamo " +nombre);    
    }
    /* Abrirse una cuenta*/
    public void abrirCuentaBancaria()
    {
        miCuenta = new CuentaBancaria(this);    
    }
    /*Meter dinero en la cuenta*/
    public void ingresarDinero(double cantidad)
    {
        miCuenta.introducirDinero(cantidad);
    }
    /*Sacar dinero de la cuenta*/
    public void sacarDinero(double cantidad)
    {
        miCuenta.sacarDinero(cantidad);
    }            
    /*Para consultar el saldo*/
    public void consultarExtracto()
    {
        miCuenta.consultarExtracto();
        
        
    }

        
        
        
        

    
    
        
        
        
        
    
    
   
    
        
        
        
        
        
    
}

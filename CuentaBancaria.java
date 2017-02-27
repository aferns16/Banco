
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria
{

    private double saldo;
    private Persona propietario;

    /**
     * Constructor for objects of class CuentaBancaria
     */
    public CuentaBancaria(Persona p)
    {
        saldo = 0.0;
        propietario = p;
    }
    
    /*Para ingersar dinero*/
   
    public void introducirDinero(double cantidad)
    {
        saldo = saldo + cantidad;
        /* Se puede poner como saldo+=cantidad*/ 
        
    
        
        
        
        
        
    }
    
    /* Para sacar dinero*/
    
    public void sacarDinero(double cantidad)
    {
       saldo = saldo - cantidad; 
        
        
        
        
        
    }
    /*Para consultar el saldo*/
    public void consultarExtracto()
    {
        System.out.println(saldo);
        
        
    }
    
    
}

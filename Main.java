
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[])
    {
      Persona yo=new Persona("Andrea Fernández");
      
      yo.saludar();
      yo.abrirCuentaBancaria();
      yo.ingresarDinero(3000.0);
      yo.sacarDinero(2000.0);
      yo.consultarExtracto();
      
    }      
}

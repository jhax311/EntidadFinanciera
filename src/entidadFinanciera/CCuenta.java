
package entidadFinanciera;

/**
 * 
 * @author Jhoel Alexander Narváez Valarezo
 */
public class CCuenta {

    /**
     * datos de la cuenta y titular
     * 
     */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private final String ERRORCANTIDADNEGATIVA= "No se puede ingresar una cantidad negativa.";
/**
 * constructor por defecto
 */
    public CCuenta()
    {
    }
/**
 * 
 * @param nom nombre de titular
 * @param cue cuenta de titular
 * @param sal saldo de cuenta
 * @param tipo tipo de cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * metodo que devuelve el saldo
     * @return cantidad del saldo
     */
    public double estado(){
        return this.saldo;
    }
    /**
     * metodo para ingresar dinero
     * @param cantidad cantidad a ingresar
     * @throws Exception que no se puede ingresar uan cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * metodo para retirar dinero
     * @param cantidad cantida a retirar
     * @throws Exception  no se puede ingresar una cantidad negativa
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    /**
     * 
     * @return nombre titular
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre apellidos titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return cuenta titular
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * 
     * @param cuenta ingresar cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * 
     * @return cantidad del saldo
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * 
     * @param saldo ingresa saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * 
     * @return devuelve el tipo de interes
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * 
     * @param tipoInterés  ingresa el tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
}

package entidadFinanciera;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class Main {

    public static void main(String[] args) {
        CCuenta objetocuenta;
        double saldoActual;

        objetocuenta = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = objetocuenta.estado();
        System.out.println("El saldo actual es" + saldoActual);

    }

    public static void probarIngresar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception {
        try {
            c.ingresar(cantidad);
System.out.println(c.getSaldo() != cantidadEsperada ? "La cantidad no es la esperada, inténtelo de nuevo." : "Su dinero se ha ingresado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void probarRetirar(CCuenta c, int cantidad, double cantidadEsperada) throws Exception {
        try {
            c.retirar(cantidad);
            System.out.println(c.getSaldo() != cantidadEsperada ? "La cantidad no es la esperada, inténtelo de nuevo." : "Su dinero se ha retirado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

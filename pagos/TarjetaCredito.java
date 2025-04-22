
public class TarjetaCredito extends MetodoPago {
    public boolean procesar(double monto) throws Exception {
        if (monto > 5000) throw new Exception("Límite de crédito.");
        System.out.println("💳 Pago con tarjeta aprobado.");
        return true;
    }

    public double calcularTotal(double monto) {
        return monto * 1.02;
    }
}

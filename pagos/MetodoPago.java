
public abstract class MetodoPago implements ProcesadorPago {
    protected int intentos = 0;

    public boolean intentarPago(double monto) {
        try {
            intentos++;
            return procesar(monto);
        } catch (Exception e) {
            System.out.println("⛔ Pago fallido: " + e.getMessage());
            if (intentos < 2) {
                System.out.println("🔁 Reintentando...");
                return intentarPago(monto);
            }
            return false;
        }
    }
}

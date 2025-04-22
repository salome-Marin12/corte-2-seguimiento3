
public class Cripto extends MetodoPago {
    public boolean procesar(double monto) throws Exception {
        if (monto < 100) throw new Exception("Monto demasiado bajo.");
        System.out.println("🪙 Cripto pagado.");
        return true;
    }

    public double calcularTotal(double monto) {
        return monto * 1.05;
    }
}

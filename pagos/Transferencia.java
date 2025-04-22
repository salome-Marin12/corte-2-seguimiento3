
public class Transferencia extends MetodoPago {
    public boolean procesar(double monto) throws Exception {
        if (Math.random() < 0.3) throw new Exception("Red caída.");
        System.out.println("🏦 Transferencia exitosa.");
        return true;
    }

    public double calcularTotal(double monto) {
        return monto * 1.01;
    }
}

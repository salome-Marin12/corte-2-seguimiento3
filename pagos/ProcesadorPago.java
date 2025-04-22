
public interface ProcesadorPago {
    boolean procesar(double monto) throws Exception;
    double calcularTotal(double monto);
}

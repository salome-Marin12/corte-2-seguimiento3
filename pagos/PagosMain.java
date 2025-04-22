
public class PagosMain {
    public static void main(String[] args) {
        MetodoPago tarjeta = new TarjetaCredito();
        MetodoPago transferencia = new Transferencia();
        MetodoPago cripto = new Cripto();

        System.out.println("🧾 Total tarjeta: $" + tarjeta.calcularTotal(3000));
        tarjeta.intentarPago(3000);

        System.out.println("\n🧾 Total transferencia: $" + transferencia.calcularTotal(2000));
        transferencia.intentarPago(2000);

        System.out.println("\n🧾 Total cripto: $" + cripto.calcularTotal(50));
        cripto.intentarPago(50);
    }
}

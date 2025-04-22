
public class Telefono extends Dispositivo implements Recargable {
    private int bateria;

    public Telefono(int bateria) {
        this.bateria = bateria;
    }

    public void encender() throws Exception {
        if (bateria <= 0) throw new Exception("📴 Sin batería.");
        encendido = true;
    }

    public String estado() {
        return "Teléfono - Batería: " + bateria + "% - Encendido: " + encendido;
    }

    public void recargar() throws Exception {
        if (encendido) throw new Exception("⚠️ Apaga el teléfono para recargar.");
        bateria = 100;
    }
}

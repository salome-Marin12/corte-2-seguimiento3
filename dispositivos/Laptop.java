
public class Laptop extends Dispositivo implements Recargable {
    private int bateria;

    public Laptop(int bateria) {
        this.bateria = bateria;
    }

    public void encender() throws Exception {
        if (bateria <= 0) throw new Exception("🔋 Batería agotada.");
        encendido = true;
    }

    public String estado() {
        return "Laptop - Batería: " + bateria + "% - Encendido: " + encendido;
    }

    public void recargar() throws Exception {
        if (encendido) throw new Exception("⚠️ No se puede recargar encendida.");
        bateria = 100;
    }
}

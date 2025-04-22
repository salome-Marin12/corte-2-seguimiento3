
public class Bombilla extends Dispositivo {
    private int intensidad;

    public Bombilla(int intensidad) {
        this.intensidad = intensidad;
    }

    public void encender() {
        encendido = true;
    }

    public String estado() {
        return "💡 Bombilla - Intensidad: " + intensidad + " - Encendida: " + encendido;
    }
}

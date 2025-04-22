
public abstract class Dispositivo implements Encendible {
    protected boolean encendido;

    public void apagar() {
        encendido = false;
    }

    public boolean estaEncendido() {
        return encendido;
    }
}

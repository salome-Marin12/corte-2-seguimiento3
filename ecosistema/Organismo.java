
public abstract class Organismo implements Interactuable {
    protected int energia;

    public Organismo(int energiaInicial) {
        this.energia = energiaInicial;
    }

    public boolean estaVivo() {
        return energia > 0;
    }

    public int getEnergia() {
        return energia;
    }

    protected void modificarEnergia(int cantidad) {
        energia += cantidad;
        if (energia < 0) energia = 0;
    }
}

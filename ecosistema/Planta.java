
public class Planta extends Organismo {
    public Planta(int energiaInicial) {
        super(energiaInicial);
    }

    public void interactuar(Organismo otro) {
        this.modificarEnergia(10);
        System.out.println("🌿 Planta genera energía solar.");
    }
}

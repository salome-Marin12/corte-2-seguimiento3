
public class Herbivoro extends Organismo {
    public Herbivoro(int energiaInicial) {
        super(energiaInicial);
    }

    public void interactuar(Organismo otro) {
        if (otro instanceof Planta && otro.estaVivo()) {
            this.modificarEnergia(15);
            otro.modificarEnergia(-15);
            System.out.println("🐰 Herbívoro come planta.");
        }
    }
}

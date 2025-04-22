
public class Carnivoro extends Organismo {
    public Carnivoro(int energiaInicial) {
        super(energiaInicial);
    }

    public void interactuar(Organismo otro) {
        if (otro instanceof Herbivoro && otro.estaVivo()) {
            this.modificarEnergia(20);
            otro.modificarEnergia(-20);
            System.out.println("🦁 Carnívoro caza herbívoro.");
        }
    }
}


public class EcosistemaMain {
    public static void main(String[] args) {
        Planta planta = new Planta(30);
        Herbivoro herbivoro = new Herbivoro(40);
        Carnivoro carnivoro = new Carnivoro(50);

        for (int ciclo = 1; ciclo <= 5; ciclo++) {
            System.out.println("\n🌎 Ciclo " + ciclo + ":");
            planta.interactuar(null);
            herbivoro.interactuar(planta);
            carnivoro.interactuar(herbivoro);

            System.out.println("Energía Planta: " + planta.getEnergia());
            System.out.println("Energía Herbívoro: " + herbivoro.getEnergia());
            System.out.println("Energía Carnívoro: " + carnivoro.getEnergia());

            if (!planta.estaVivo() || !herbivoro.estaVivo()) {
                System.out.println("⚠️ Alguien ha muerto. Fin de la simulación.");
                break;
            }
        }
    }
}

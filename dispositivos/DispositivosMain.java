
public class DispositivosMain {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(20);
        Telefono telefono = new Telefono(0);
        Bombilla bombilla = new Bombilla(75);

        try {
            laptop.encender();
            bombilla.encender();
            telefono.recargar();
            telefono.encender();
        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }

        System.out.println(laptop.estado());
        System.out.println(telefono.estado());
        System.out.println(bombilla.estado());
    }
}

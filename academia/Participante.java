
public abstract class Participante implements Evaluable {
    protected String nombre;
    protected int id;

    public Participante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
}

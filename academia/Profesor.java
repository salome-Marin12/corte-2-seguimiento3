
public class Profesor extends Participante {
    private double salario;
    private String[] cursos;

    public Profesor(String nombre, int id, double salario, String[] cursos) {
        super(nombre, id);
        this.salario = salario;
        this.cursos = cursos;
    }

    public String evaluarDesempeno() {
        return "👨‍🏫 Profesor " + nombre + " - Cursos: " + cursos.length + " - Salario: $" + salario;
    }
}


public class Administrativo extends Participante {
    private double salario;
    private String departamento;

    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id);
        this.salario = salario;
        this.departamento = departamento;
    }

    public String evaluarDesempeno() {
        return "🗂️ Administrativo " + nombre + " - Departamento: " + departamento + " - Salario: $" + salario;
    }
}

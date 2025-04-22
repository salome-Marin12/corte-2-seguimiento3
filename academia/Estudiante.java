
public class Estudiante extends Participante {
    private double[] calificaciones;

    public Estudiante(String nombre, int id, double[] calificaciones) {
        super(nombre, id);
        for (double c : calificaciones)
            if (c < 0) throw new IllegalArgumentException("❌ Calificación negativa.");
        this.calificaciones = calificaciones;
    }

    public String evaluarDesempeno() {
        double suma = 0;
        for (double c : calificaciones) suma += c;
        double promedio = suma / calificaciones.length;
        return "🎓 Estudiante " + nombre + " - Promedio: " + promedio;
    }
}

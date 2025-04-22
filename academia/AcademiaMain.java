
public class AcademiaMain {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Sofía", 1, new double[]{4.5, 5.0, 3.8});
        Profesor profesor = new Profesor("Carlos", 2, 3500, new String[]{"POO", "Estructuras"});
        Administrativo admin = new Administrativo("Laura", 3, 3000, "Finanzas");

        System.out.println(estudiante.evaluarDesempeno());
        System.out.println(profesor.evaluarDesempeno());
        System.out.println(admin.evaluarDesempeno());
    }
}

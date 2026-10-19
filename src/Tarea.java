public class Tarea {

    // Atributos publicos
    public String titulo;
    public String responsable;

    // Atributos con acceso por defecto
    double horasEstimadas;
    boolean completada;

    // Métodos publicos
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo +
                "\nResponsable: " + responsable +
                "\nHoras estimadas: " + horasEstimadas +
                "\nCompletada: " + completada);
    }

    public void completar() {
        completada = true;
        System.out.println("Tarea " + titulo + " completada.");
    }

    // Métodos con acceso por defecto
    void mostrarResponsable() {
        System.out.println("Responsable: " + responsable);
    }

    void mostrarEstado() {
        if (completada) {
            System.out.println("Estado " + titulo + ": Completada.");
        } else {
            System.out.println("Estado " + titulo + ": Pendiente.");
        }
    }
}
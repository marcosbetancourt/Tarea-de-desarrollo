void main() {

    Tarea t1 = new Tarea();
    Tarea t2 = new Tarea();
    Tarea t3 = new Tarea();

    t1.titulo = "Definir requisitos";
    t1.responsable = "Marco";
    t1.horasEstimadas = 12.5;
    t1.completada = false;

    t2.titulo = "Implementar login";
    t2.responsable = "Juan";
    t2.horasEstimadas = 8.0;
    t2.completada = false;

    // Configurar Tarea 3
    t3.titulo = "Pruebas unitarias";
    t3.responsable = "Ana";
    t3.horasEstimadas = 6.0;
    t3.completada = false;

    t1.completar();
    t2.completar();
    t3.completar();

    t1.mostrarInformacion();
    t2.mostrarInformacion();
    t3.mostrarInformacion();
}
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia del sistema de clasificación de atletas
        JuegosPanamericanos juegosPanamericanos = new JuegosPanamericanos();

        int opcion;
        do {
            // Menú
            System.out.println("----- Menú Principal -----");
            System.out.println("1. Agregar Atleta");
            System.out.println("2. Eliminar Atleta");
            System.out.println("3. Agregar Disciplina");
            System.out.println("4. Eliminar Disciplina");
            System.out.println("5. Agregar Equipo");
            System.out.println("6. Eliminar Equipo");
            System.out.println("7. Agregar Evento");
            System.out.println("8. Eliminar Evento");
            System.out.println("9. Mostrar Información");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después del número

            // Realizar la acción según la opción seleccionada
            switch (opcion) {
                case 1:
                    // Agregar Atleta
                    juegosPanamericanos.agregarAtleta();
                    break;
                case 2:
                    // Eliminar Atleta
                    juegosPanamericanos.eliminarAtleta();
                    break;
                case 3:
                    // Agregar Disciplina
                    juegosPanamericanos.agregarDisciplina();
                    break;
                case 4:
                    // Eliminar Disciplina
                    juegosPanamericanos.eliminarDisciplina();
                    break;
                case 5:
                    // Agregar Equipo
                    juegosPanamericanos.agregarEquipo();
                    break;
                case 6:
                    // Eliminar Equipo
                    juegosPanamericanos.eliminarEquipo();
                    break;
                case 7:
                    // Agregar Evento
                    juegosPanamericanos.agregarEvento();
                    break;
                case 8:
                    // Eliminar Evento
                    juegosPanamericanos.eliminarEvento();
                    break;
                case 9:
                    // Mostrar Información
                    juegosPanamericanos.mostrarInformacion();
                    break;
                case 0:
                    // Salir
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}

class JuegosPanamericanos {
    private ArrayList<Atleta> listaAtletas;
    private ArrayList<Disciplina> listaDisciplinas;
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Evento> listaEventos;

    // Constructor
    public JuegosPanamericanos() {
        this.listaAtletas = new ArrayList<>();
        this.listaDisciplinas = new ArrayList<>();
        this.listaEquipos = new ArrayList<>();
        this.listaEventos = new ArrayList<>();
    }

    // Métodos para agregar y eliminar atletas, disciplinas, equipos y eventos
    // (implementar según sea necesario)

    // Método para mostrar información
    public void mostrarInformacion() {
        // Implementar lógica para mostrar información detallada del sistema
        // (puedes utilizar los métodos toString() de las clases y otras lógicas según sea necesario)
    }
}

// Clases Atleta, Disciplina, Equipo y Evento (como las definiste en tu enunciado)
// ...


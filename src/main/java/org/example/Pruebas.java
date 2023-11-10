

    import java.util.Date;

    public class Pruebas {

        public static void main(String[] args) {
            // Crear instancias de JuegosPanamericanos
            JuegosPanamericanos juegosPanamericanos = new JuegosPanamericanos();

            // Crear algunos objetos Atleta
            Atleta atleta1 = new Atleta("Juan", "Pérez", 25, "Argentina");
            Atleta atleta2 = new Atleta("Maria", "Gomez", 28, "Mexico");
            Atleta atleta3 = new Atleta("Carlos", "Rodriguez", 23, "Colombia");

            // Agregar Atletas a JuegosPanamericanos
            juegosPanamericanos.agregarAtleta(atleta1);
            juegosPanamericanos.agregarAtleta(atleta2);
            juegosPanamericanos.agregarAtleta(atleta3);

            // Crear algunos objetos Disciplina
            Disciplina disciplina1 = new Disciplina("Natación", 50, 1.30, "individual");
            Disciplina disciplina2 = new Disciplina("Atletismo", 100, 9.58, "individual");

            // Agregar Disciplinas a JuegosPanamericanos
            juegosPanamericanos.agregarDisciplina(disciplina1);
            juegosPanamericanos.agregarDisciplina(disciplina2);

            // Crear algunos objetos Equipo
            Equipo equipo1 = new Equipo("Equipo A", disciplina1);
            Equipo equipo2 = new Equipo("Equipo B", disciplina2);

            // Agregar Equipos a JuegosPanamericanos
            juegosPanamericanos.agregarEquipo(equipo1);
            juegosPanamericanos.agregarEquipo(equipo2);

            // Crear algunos objetos Evento
            Evento evento1 = new Evento("Evento 1", disciplina1, new Date());
            Evento evento2 = new Evento("Evento 2", disciplina2, new Date());

            // Agregar Eventos a JuegosPanamericanos
            juegosPanamericanos.agregarEvento(evento1);
            juegosPanamericanos.agregarEvento(evento2);

            // Agregar Atletas a Disciplinas y Equipos
            disciplina1.agregarAtletaAtleta(atleta1);
            disciplina2.agregarAtletaAtleta(atleta2);
            equipo1.agregarAtletaEquipo(atleta3);

            // Mostrar información
            juegosPanamericanos.mostrarInformacion();
        }
    }



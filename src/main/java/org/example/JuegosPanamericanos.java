import java.util.ArrayList;
package org.example;

public class JuegosPanamericanos {
	private ArrayList<Atleta> listaAtletas;
	private ArrayList<Disciplina> listaDisciplinas;
	private ArrayList<Equipo> listaEquipos;
	private ArrayList<Evento> listaEventos;
	public ArrayList<Evento> evento = new ArrayList<Evento>();

	public JuegosPanamericanos(ArrayList<Atleta> listaAtletas, ArrayList<Disciplina> listaDisciplinas, ArrayList<Equipo> listaEquipos, ArrayList<Evento> listaEventos) {
		this.listaAtletas = listaAtletas;
		this.listaDisciplinas = listaDisciplinas;
		this.listaEquipos = listaEquipos;
		this.listaEventos = listaEventos;
	}

	public ArrayList<Atleta> getListaAtletas() {
		return this.listaAtletas;
	}
	public void setListaAtletas(ArrayList<Atleta> listaAtletas) {
		this.listaAtletas = listaAtletas;
	}

	public ArrayList<Disciplina> getListaDisciplinas() {
		this.listaDisciplinas = listaDisciplinas;}


	public void setListaDisciplinas(ArrayList<Disciplina> listaDisciplinas) {
		this.listaDisciplinas = listaDisciplinas;
	}

	public ArrayList<Equipo> getListaEquipos() {
	return this.listaEquipos;
	}

	public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}

	public ArrayList<Evento> getListaEventos() {
		return this.listaEventos;
	}

	public void setListaEventos(ArrayList<Evento> listaEventos) {
	this.listaEventos = listaEventos;
	}

	public void agregarAtleta(Atleta atleta) {
	//metodo que agrega un atleta a la lista de atletas
		this.listaAtletas.add(atleta);
	}

	public void eliminarAtleta(Atleta atleta) {
	//metodo que elimina un atleta de la lista de atletas
		this.listaAtletas.remove(atleta);
	}

	public void agregarDisciplina(Disciplina disciplina) {
     //metodo que agrega una disciplina a la lista de disciplinas
		this.listaDisciplinas.add(disciplina);
	}

	public void eliminarDisciplina(Dsiciplina disciplina) {
	//metodo que elimina una disciplina de la lista de disciplinas
		this.listaDisciplinas.remove(disciplina);
	}

	public void agregarequipo(Equipo equipo) {
	//metodo que agrega un equipo a la lista de equipos
		this.listaEquipos.add(equipo);
	}


	public void eliminarEquipo(Equipo equipo) {
	//metodo que elimina un equipo de la lista de equipos
		this.listaEquipos.remove(equipo);
	}

	public void agregarEvento(Object evento) {
	//metodo que agrega un evento a la lista de eventos
		this.listaEventos.add(evento);
	}

	public void eliminarevento(Evento evento) {
	//metodo que elimina un evento de la lista de eventos
		this.listaEventos.remove(evento);
	}

	public void toStringJuegos(JuegosPanamericanos juegosPanamericanos) {
		//metodo que imprime la información de los juegos panamericanos
		System.out.println("Lista de atletas: " + this.listaAtletas);
		System.out.println("Lista de disciplinas: " + this.listaDisciplinas);
		System.out.println("Lista de equipos: " + this.listaEquipos);
		System.out.println("Lista de eventos: " + this.listaEventos);

	}

	//metodo menu

	public menu


}
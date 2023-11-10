import java.util.ArrayList;
package org.example;
import java.util.Date;

public class Evento {
	private String nombreEvento;
	private Disciplina disciplinaEvento;
	private Date fechaEvento;
	private ArrayList<Equipo> listaDeEquiposEvento;
	private ArrayList<Atleta> listaAtletasEvento;
	public Disciplina disicplina;
	public ArrayList<Equipo> equipo = new ArrayList<Equipo>();
	public ArrayList<Atleta> atleta = new ArrayList<Atleta>();

	public Evento(String nombreEvento, disciplina disciplinaEvento, Date fechaEvento) {
		this.nombreEvento = nombreEvento;
		this.disciplinaEvento = disciplinaEvento;
		this.fechaEvento = fechaEvento;
	}



	public String getNombreEvento() {
		return this.nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public Disciplina getDisciplinaEvento() {
		return this.disciplinaEvento;
	}

	public void setDisciplinaEvento(disciplina disciplinaEvento) {
		this.disciplinaEvento = disciplinaEvento;
	}

	public Date getFechaEvento() {
		return this.fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public ArrayList<Equipo> getListaDeEquiposEvento() {
		return this.listaDeEquiposEvento;

	public void setListaDeEquiposEvento(ArrayList<Equipo> listaDeEquiposEvento) {
		this.listaDeEquiposEvento = listaDeEquiposEvento;
	}

	public ArrayList<Atleta> getListaAtletasEvento() {
		return this.listaAtletasEvento;
	}

	public void setListaAtletasEvento(ArrayList<Atleta> listaAtletasEvento) {
	this.listaAtletasEvento = listaAtletasEvento;
	}


	public void eliminarEquipoEvento(Equipo equipo) {
	//metodo que elimina un equipo del evento
		this.listaDeEquiposEvento.remove(equipo);
	}

	public void agregarEquipoEvento(Equipo equipo) {
	//metodo que agrega un equipo al evento
		this.listaDeEquiposEvento.add(equipo);
	}

	public void eliminarAtletaEvento(Atleta atleta) {
	//metodo que elimina un atleta del evento
		this.listaAtletasEvento.remove(atleta);
	}

	public void agregarAtletaEvento(Atleta atleta) {
	//metodo que agrega un atleta al evento
		this.listaAtletasEvento.add(atleta);
	}

	public void toStringEvento(Evento evento) {
	//metodo que imprime la información del evento
		System.out.println("Nombre del evento: " + this.nombreEvento);
		System.out.println("Disciplina del evento: " + this.disciplinaEvento);
		System.out.println("Fecha del evento: " + this.fechaEvento);
		System.out.println("Lista de equipos del evento: " + this.listaDeEquiposEvento);
		System.out.println("Lista de atletas del evento: " + this.listaAtletasEvento);

	}
}
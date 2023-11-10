import java.util.ArrayList;
package org.example;

public class Equipo {
	private String nombreEquipo;
	private ArrayList<Atleta> listaAtletasEquipo;
	private Disciplina disciplinaEquipo;
	public ArrayList<Atleta> atleta = new ArrayList<Atleta>();

	public Equipo(String nombreEquipo, ArrayList<Atleta> listaAtletasEquipo, Disciplina disciplinaEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.listaAtletasEquipo = listaAtletasEquipo;
		this.disciplinaEquipo = disciplinaEquipo;
	}



	public String getNombreEquipo() {
		return this.nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public ArrayList<Atleta> getListaAtletasEquipo() {
		return this.listaAtletasEquipo;
	}

	public void setListaAtletasEquipo(ArrayList<Atleta> listaAtletasEquipo) {
		this.listaAtletasEquipo = listaAtletasEquipo;
	}

	public Disciplina getDisciplinaEquipo() {
		return this.disciplinaEquipo;
	}

	public void setDisciplinaEquipo(Disciplina disciplinaEquipo) {
		this.disciplinaEquipo = disciplinaEquipo;
	}



	public void agregarAtletaEquipo(Atleta atleta) {
		// metodo que agrega un atleta al equipo
		this.listaAtletasEquipo.add(atleta);
	}

	public void elimnarAtletaEquipo(Atleta atleta) {

		// metodo que elimina un atleta del equipo
		this.listaAtletasEquipo.remove(atleta);
	}

	public void toStringEquipo(Equipo) {
		// metodo que imprime la información del equipo
		System.out.println("Nombre del equipo: " + this.nombreEquipo);
	}
}
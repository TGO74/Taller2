import java.util.ArrayList;
package org.example;


public class Atleta {
	private String nombreAtleta;
	private String apellidoAtleta;
	private int edad;
	private String pais;
	private ArrayList<Disciplina> listaDeDisciplinas;
	public ArrayList<Disciplina> disciplina = new ArrayList<Disciplina>();

	public Atleta(String nombreAtleta, String apellidoAtleta, int edad, String pais) {
		this.nombreAtleta = nombreAtleta;
		this.apellidoAtleta = apellidoAtleta;
		this.edad = edad;
		this.pais = pais;
	}


	public String getNombreAtleta() {
		return this.nombreAtleta;
	}

	public void setNombreAtleta(String nombreAtleta) {
		this.nombreAtleta = nombreAtleta;
	}

	public String getApellidoAtleta() {
		return this.apellidoAtleta;
	}

	public void setApellidoAtleta(String apellidoAtleta) {
		this.apellidoAtleta = apellidoAtleta;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public ArrayList<Disciplina> getListaDeDisciplinas() {
		return this.listaDeDisciplinas;
	}

	public void setListaDeDisciplinas(ArrayList<Disciplina> listaDeDisciplinas) {
		this.listaDeDisciplinas = listaDeDisciplinas;
	}



	public void agregarDisciplinaAtleta(Disciplina disciplina) {

		//metodo que agrega disciplina a un atleta

    listaDeDisciplinas.add(disciplina);
	}

	public void eliminarDisciplinaAleta(Disciplina disciplina) {

		//metodo que elimina disciplina a un atleta

	listaDeDisciplinas.remove(disciplina);
	}

	public void toStringAtleta(Atleta atleta) {

			 //metodo que muestra los datos de un atleta

	 System.out.println("Nombre: " + nombreAtleta + " Apellido: " + apellidoAtleta + " Edad: " + edad + " Pais: " + pais);
	}
}
import java.util.ArrayList;
package org.example;

public class Disciplina {


	private String nombreDisciplina;
	private int numeroDeParticipantes;
	private double recordMundial;
	private String tipoDeDisciplina;
	public ArrayList<Atleta> atleta = new ArrayList<Atleta>();

	public Disciplina(String nombreDisciplina, int numeroDeParticipantes, double recordMundial, String tipoDeDisciplina) {
		this.nombreDisciplina = nombreDisciplina;
		this.numeroDeParticipantes = numeroDeParticipantes;
		this.recordMundial = recordMundial;
		this.tipoDeDisciplina = tipoDeDisciplina;
	}

	public String getNombreDisciplia() {
		return this.nombreDisciplina;
	}

	public void setNombreDisciplia(String nombreDisciplia) {
		this.nombreDisciplina = nombreDisciplia;
	}

	public int getNumeroDeParticipantes() {
		return this.numeroDeParticipantes;
	}

	public void setNumeroDeParticipantes(int numeroDeParticipantes) {
		this.numeroDeParticipantes = numeroDeParticipantes;
	}

	public double getRecordMundial() {
		return this.recordMundial;
	}

	public void setRecordMundial(double recordMundial) {
		this.recordMundial = recordMundial;
	}

	public String getTipoDeDisciplina() {
		return this.tipoDeDisciplina;
	}

	public void setTipoDeDisciplina(String tipoDeDisciplina) {
		this.tipoDeDisciplina = tipoDeDisciplina;
	}





	public void toStringDisciplina(Disciplina disciplina) {

		//Metodo que imprime la información de disciplina
		System.out.println("Nombre de la disciplina: " + this.nombreDisciplina);
	}
}
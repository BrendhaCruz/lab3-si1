package models;


//CREATOR: classe Cachorro registra objetos do tipo Osso; 

public class Disciplina {
	
	private String nomeDaDisciplina;
	private int creditos;

	public Disciplina(String nomeDaDisciplina, int creditos) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.creditos = creditos;
	}

	public String getNomeDaDisciplina() {
		return nomeDaDisciplina;
	}

	public int getCreditos() {
		return creditos;
	}

	@Override
	public String toString() {
		return nomeDaDisciplina;
	}

}


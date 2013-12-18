package classes;


//CREATOR: classe Disciplina registra objetos do tipo disciplica

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
		return this.getNomeDaDisciplina();
	}

}


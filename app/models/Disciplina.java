package models;

//CREATOR: classe Disciplina registra objetos do tipo disciplica
public class Disciplina {

	private String nomeDaDisciplina;
	private int creditos;
	private Disciplina[] preRequisitos;
	
	public Disciplina(String nomeDaDisciplina, int creditos, Disciplina[] preRequisitos) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.creditos = creditos;
		this.preRequisitos = preRequisitos;
	}

	@Override
	public boolean equals(Object obj) {
		Disciplina other = (Disciplina) obj;
		if (creditos != other.creditos)
			return false;
		if (!nomeDaDisciplina.equals(other.nomeDaDisciplina))
			return false;
		return true;
	}
	//INFORMATION EXPERT: a disciplina possui os proprios preRequisitos
	public Disciplina[] getPreRequisitos() {
		return preRequisitos;
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

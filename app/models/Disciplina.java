package models;

import java.util.Arrays;

//CREATOR: classe Disciplina registra objetos do tipo disciplica
public class Disciplina {

	public static final boolean DISCIPLINA_PENDENTE = false;
	public static final boolean DISCIPLINA_CONCLUIDA = true;
	private String nomeDaDisciplina;
	private int creditos;
	private boolean status;
	private Disciplina[] preRequisitos;

	public Disciplina(String nomeDaDisciplina, int creditos, Disciplina[] preRequisitos) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.creditos = creditos;
		this.status = DISCIPLINA_PENDENTE;
		this.preRequisitos = preRequisitos;
	}

	@Override
	public boolean equals(Object obj) {
		Disciplina other = (Disciplina) obj;
		if (creditos != other.creditos)
			return false;
		if (nomeDaDisciplina == null) {
			if (other.nomeDaDisciplina != null)
				return false;
		} else if (!nomeDaDisciplina.equals(other.nomeDaDisciplina))
			return false;
		if (!Arrays.equals(preRequisitos, other.preRequisitos))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Disciplina[] getPreRequisitos() {
		return preRequisitos;
	}

	public void setPreRequisitos(Disciplina[] preRequisitos) {
		this.preRequisitos = preRequisitos;
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

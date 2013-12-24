package models;

import java.util.Arrays;

//CREATOR: classe Disciplina registra objetos do tipo disciplica
public class Disciplina {

	public static final boolean DISCIPLINA_PENDENTE = false;
	public static final boolean DISCIPLINA_CONCLUIDA = true;
	private String nomeDaDisciplina;
	private int creditos;
	private boolean status = false;
	private Disciplina[] preRequisitos;
	private boolean alocada = false;
	public static final boolean DISCIPLINA_ALOCADA = true;
	public static final boolean DISCIPLINA_NAO_ALOCADA = false;

	public Disciplina(String nomeDaDisciplina, int creditos, Disciplina[] preRequisitos) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.creditos = creditos;
		this.status = DISCIPLINA_PENDENTE;
		this.preRequisitos = preRequisitos;
		this.alocada = DISCIPLINA_NAO_ALOCADA;
	}

	@Override
	public boolean equals(Object obj) {
		Disciplina other = (Disciplina) obj;
		if (creditos != other.creditos)
			return false;
		if (!nomeDaDisciplina.equals(other.nomeDaDisciplina))
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
	
	public String formataPreRequisitos(Disciplina[] lista) {
		String temp = "";
		for (int i = 0; i < lista.length; i++) {
			if (i == lista.length-1)
				temp += lista[i] + " ";
			else
				temp += lista[i] + ", ";
		}
		return temp;
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

	public boolean isAlocada() {
		return this.alocada;
	}

	public void setAlocada(boolean alocada) {
		this.alocada = alocada;
	}

	@Override
	public String toString() {
		return this.getNomeDaDisciplina();
	}

}

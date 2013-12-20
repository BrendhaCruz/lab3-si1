package models;

import javax.persistence.Entity;
import play.db.ebean.Model;


//CREATOR: classe Disciplina registra objetos do tipo disciplica
@Entity
public class Disciplina extends Model {
	
	public static final boolean DISCIPLINA_PENDENTE = false;
	public static final boolean DISCIPLINA_CONCLUÃDA = true;
	private String nomeDaDisciplina;
	private int creditos;
	private boolean status;
	private Disciplina[] preRequisitos;

	public Disciplina(String nomeDaDisciplina, int creditos, boolean status) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.creditos = creditos;
		this.status = status;
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


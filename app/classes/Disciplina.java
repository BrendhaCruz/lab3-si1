package classes;

import javax.persistence.Entity;

import play.db.ebean.Model;


//CREATOR: classe Disciplina registra objetos do tipo disciplica
@Entity
public class Disciplina extends Model {
	
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


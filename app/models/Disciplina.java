package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Disciplina extends Model {

	//CREATOR: A Disciplina conhece seu nome, creditos e preRequisitos

	@Constraints.Required
	@Column(unique = true, nullable = false)
	private String nomeDaDisciplina;
	
	@Id
	private Long id;
	
	@Column(name = "periodo_default")
	private int periodo;
	
	private int creditos;

	@ManyToMany(cascade = CascadeType.ALL)
	private Disciplina[] preRequisitos;
	
	/**
	 * Construtor da classe Disciplina, representando uma disciplina do curso de Ciência da Computacao.
	 * @param nomeDaDisciplina String com o nome da disciplina a ser criada
	 * @param creditos Número inteiro de créditos da disciplina
	 * @param preRequisitos Vetor de disciplinas que são pre-requisitos
	 */
	public Disciplina(String nomeDaDisciplina, int creditos, Disciplina[] preRequisitos) {
		this.nomeDaDisciplina = nomeDaDisciplina;
		this.creditos = creditos;
		this.preRequisitos = preRequisitos;
	}

	/**
	 * Compara duas Disciplinas, utilizando o nome e a quantidade de créditos como critérios.
	 */
	//INFORMATION EXPERT: A disciplina possui os proprios atributos de comparação.
	@Override
	public boolean equals(Object obj) {
		Disciplina other = (Disciplina) obj;
		if (creditos != other.creditos)
			return false;
		if (!nomeDaDisciplina.equals(other.nomeDaDisciplina))
			return false;
		return true;
	}

	/**
	 * Obtém um vetor contendo as disciplinas que são pre-Requisitos.
	 * @return Vetor de Disciplinas pre-requisitos.
	 */
	//INFORMATION EXPERT: A disciplina possui os proprios preRequisitos
	public Disciplina[] getPreRequisitos() {
		return this.preRequisitos;
	}
	
	/**
	 * Obtém uma String com os pre-requisitos de uma Disciplina.
	 * @return String contendo os pre-requisitos.
	 */
	//INFORMATION EXPERT: A disciplina possui os proprios preRequisitos
	public String preRequisitos(){
		String preRequisitos = "";
		for (int i = 0; i < this.preRequisitos.length; i++) {
			if (i < this.preRequisitos.length-1) {
				preRequisitos += this.preRequisitos[i] + ", ";	
			} else {
				preRequisitos += this.preRequisitos[i];
			}
		}
		return preRequisitos;
	}

	/**
	 * Obtém o nome da Disciplina.
	 * @return String contendo o nome da Disciplina.
	 */
	//CREATOR: A Disciplina conhece seu nome.
	public String getNomeDaDisciplina() {
		return nomeDaDisciplina;
	}

	/**
	 * Obtém os créditos da Disciplina.
	 * @return Número inteiro dos créditos da Disciplina.
	 */
	//CREATOR: A Disciplina conhece seus créditos.
	public int getCreditos() {
		return creditos;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	/**
	 * Retorna uma String representando a Disciplina. Nesse caso, o texto contém o nome da Disciplina.
	 */
	//CREATOR: A Disciplina conhece seu nome.
	@Override
	public String toString() {
		return this.getNomeDaDisciplina();
	}

}

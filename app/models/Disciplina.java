package models;


public class Disciplina {

	//CREATOR: A Disciplina conhece seu nome, creditos e preRequisitos
	private String nomeDaDisciplina;
	private int creditos;
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

	/**
	 * Retorna uma String representando a Disciplina. Nesse caso, o texto contém o nome da Disciplina.
	 */
	//CREATOR: A Disciplina conhece seu nome.
	@Override
	public String toString() {
		return this.getNomeDaDisciplina();
	}

}

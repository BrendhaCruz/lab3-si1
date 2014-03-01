package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Curriculo;
import models.Disciplina;
import models.Periodo;


//CONTROLLER: controlador do sistema
public class Planejamento{ 

	/**
     * Construtor da classe Planejamento, criando o gerenciador do sistema de Planejamento de Curso.
     * @param curriculo Curriculo utilizado no planejamento do curso do usuario.
     */
	// CREATOR: Classe planejamento regista a lista dos periodos.
    private List<Periodo> periodos;
	private static final int MINIMO_DE_CREDITOS = 16;
    private static final int MAXIMO_DE_CREDITOS = 28;
    private Curriculo curriculo;
    private Periodo primeiroPeriodo;
    private Periodo segundoPeriodo;
    private Periodo terceiroPeriodo;
    private Periodo quartoPeriodo;    
    private Periodo quintoPeriodo;
    private Periodo sextoPeriodo;
    private Periodo setimoPeriodo;
    private Periodo oitavoPeriodo;



    /**
     * Construtor da classe Planejamento, criando o gerenciador do sistema de Planejamento de Curso.
     * @param curriculo Curriculo utilizado no planejamento do curso do usuario.
     */
	public Planejamento(Curriculo curriculo) {
		periodos = new ArrayList<Periodo>();
		this.curriculo = curriculo;
		primeiroPeriodo = new Periodo();
		segundoPeriodo = new Periodo();
		terceiroPeriodo = new Periodo();
		quartoPeriodo = new Periodo();
		quintoPeriodo = new Periodo();
		sextoPeriodo = new Periodo();
		setimoPeriodo = new Periodo();
		oitavoPeriodo = new Periodo();

	}
	
	/**
	 * Adiciona o primeiro periodo na lista de Periodos.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaPrimeiroPeriodo() throws Exception{
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(0));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(1));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(2));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(3));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(4));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(5));
		this.periodos.add(primeiroPeriodo);
	}
	
	/**
	 * Adiciona o segundo periodo na lista de Periodos.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaSegundoPeriodo() throws Exception{
		segundoPeriodo.adicionaDisciplinas(curriculo.criaSegundoPeriodo().get(0));
		segundoPeriodo.adicionaDisciplinas(curriculo.criaSegundoPeriodo().get(1));
		segundoPeriodo.adicionaDisciplinas(curriculo.criaSegundoPeriodo().get(2));
		segundoPeriodo.adicionaDisciplinas(curriculo.criaSegundoPeriodo().get(3));
		segundoPeriodo.adicionaDisciplinas(curriculo.criaSegundoPeriodo().get(4));
		segundoPeriodo.adicionaDisciplinas(curriculo.criaSegundoPeriodo().get(5));
		segundoPeriodo.adicionaDisciplinas(curriculo.criaSegundoPeriodo().get(6));
		this.periodos.add(segundoPeriodo);
	}
	
	/**
	 * Adiciona o terceiro periodo na lista de Periodos.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaTerceiroPeriodo() throws Exception{
		terceiroPeriodo.adicionaDisciplinas(curriculo.criaTerceiroPeriodo().get(0));
		terceiroPeriodo.adicionaDisciplinas(curriculo.criaTerceiroPeriodo().get(1));
		terceiroPeriodo.adicionaDisciplinas(curriculo.criaTerceiroPeriodo().get(2));
		terceiroPeriodo.adicionaDisciplinas(curriculo.criaTerceiroPeriodo().get(3));
		terceiroPeriodo.adicionaDisciplinas(curriculo.criaTerceiroPeriodo().get(4));
		terceiroPeriodo.adicionaDisciplinas(curriculo.criaTerceiroPeriodo().get(5));
		terceiroPeriodo.adicionaDisciplinas(curriculo.criaTerceiroPeriodo().get(6));
		this.periodos.add(terceiroPeriodo);
	}
	
	/**
	 * Adiciona o quarto periodo na lista de Periodos.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaQuartoPeriodo() throws Exception{
		quartoPeriodo.adicionaDisciplinas(curriculo.criaQuartoPeriodo().get(0));
		quartoPeriodo.adicionaDisciplinas(curriculo.criaQuartoPeriodo().get(1));
		quartoPeriodo.adicionaDisciplinas(curriculo.criaQuartoPeriodo().get(2));
		quartoPeriodo.adicionaDisciplinas(curriculo.criaQuartoPeriodo().get(3));
		quartoPeriodo.adicionaDisciplinas(curriculo.criaQuartoPeriodo().get(4));
		quartoPeriodo.adicionaDisciplinas(curriculo.criaQuartoPeriodo().get(5));
		quartoPeriodo.adicionaDisciplinas(curriculo.criaQuartoPeriodo().get(6));
		this.periodos.add(quartoPeriodo);
	}
	
	/**
	 * Adiciona o quinto periodo na lista de Periodos.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaQuintoPeriodo() throws Exception{
		quintoPeriodo.adicionaDisciplinas(curriculo.criaQuintoPeriodo().get(0));
		quintoPeriodo.adicionaDisciplinas(curriculo.criaQuintoPeriodo().get(1));
		quintoPeriodo.adicionaDisciplinas(curriculo.criaQuintoPeriodo().get(2));
		quintoPeriodo.adicionaDisciplinas(curriculo.criaQuintoPeriodo().get(3));
		quintoPeriodo.adicionaDisciplinas(curriculo.criaQuintoPeriodo().get(4));
		quintoPeriodo.adicionaDisciplinas(curriculo.criaQuintoPeriodo().get(5));
		quintoPeriodo.adicionaDisciplinas(curriculo.criaQuintoPeriodo().get(6));
		this.periodos.add(quintoPeriodo);
	}
	
	/**
	 * Adiciona o sexto periodo na lista de Periodos.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaSextoPeriodo() throws Exception{
		sextoPeriodo.adicionaDisciplinas(curriculo.criaSextoPeriodo().get(0));
		sextoPeriodo.adicionaDisciplinas(curriculo.criaSextoPeriodo().get(1));
		sextoPeriodo.adicionaDisciplinas(curriculo.criaSextoPeriodo().get(2));
		sextoPeriodo.adicionaDisciplinas(curriculo.criaSextoPeriodo().get(3));
		sextoPeriodo.adicionaDisciplinas(curriculo.criaSextoPeriodo().get(4));
		sextoPeriodo.adicionaDisciplinas(curriculo.criaSextoPeriodo().get(5));
		sextoPeriodo.adicionaDisciplinas(curriculo.criaSextoPeriodo().get(6));
		sextoPeriodo.adicionaDisciplinas(curriculo.criaSextoPeriodo().get(7));
		this.periodos.add(sextoPeriodo);
	}
	
	/**
	 * Adiciona o setimo periodo na lista de Periodos.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaSetimoPeriodo() throws Exception{
		setimoPeriodo.adicionaDisciplinas(curriculo.criaSetimoPeriodo().get(0));
		setimoPeriodo.adicionaDisciplinas(curriculo.criaSetimoPeriodo().get(1));
		setimoPeriodo.adicionaDisciplinas(curriculo.criaSetimoPeriodo().get(2));
		setimoPeriodo.adicionaDisciplinas(curriculo.criaSetimoPeriodo().get(3));
		setimoPeriodo.adicionaDisciplinas(curriculo.criaSetimoPeriodo().get(4));
		setimoPeriodo.adicionaDisciplinas(curriculo.criaSetimoPeriodo().get(5));
		setimoPeriodo.adicionaDisciplinas(curriculo.criaSetimoPeriodo().get(6));
		this.periodos.add(setimoPeriodo);
	}
	
	/**
	 * Adiciona o oitavo periodo na lista de Periodos.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaOitavoPeriodo() throws Exception{
		oitavoPeriodo.adicionaDisciplinas(curriculo.criaOitavoPeriodo().get(0));
		oitavoPeriodo.adicionaDisciplinas(curriculo.criaOitavoPeriodo().get(1));
		oitavoPeriodo.adicionaDisciplinas(curriculo.criaOitavoPeriodo().get(2));
		oitavoPeriodo.adicionaDisciplinas(curriculo.criaOitavoPeriodo().get(3));
		oitavoPeriodo.adicionaDisciplinas(curriculo.criaOitavoPeriodo().get(4));
		oitavoPeriodo.adicionaDisciplinas(curriculo.criaOitavoPeriodo().get(5));
		this.periodos.add(oitavoPeriodo);
	}
	
	/**
	 * Adiciona um periodo sem disciplinas na lista de periodos.
	 * @throws Exception O sistema nao pode adicionar mais de 1 periodo.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaPeriodo() throws Exception{
		if (this.quantidadeDePeriodos() < 10)
			periodos.add(new Periodo());
		else
			throw new Exception("Nao pode adicionar mais periodos.");
	}
	
	/**
	 * Obtem a lista dos periodos alocados no Planejamento.
	 * @return Lista de Periodos alocados.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public List<Periodo> getPeriodos() {
        return this.periodos;
	}
	
	/**
	 * Modifica a lista de Periodos por outra passada como parametro.
	 * @param periodos Nova lista de Periodos.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos e pode modificalos.
    public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}
	
	/**
	 * Remove um período específico da lista de períodos.
	 * @param periodo Período a ser removido.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void removePeriodo(int i){
		this.periodos.remove(this.periodos.remove(i));
	}
	
	/**
	 * Informa o mínimo de Créditos necessário para um período.
	 * @return Número mínimo de créditos.
	 */
	// INFORMATION EXPERT: É o plano de curso e sabe o minimo de créditos possíveis.
	public int minimoDeCreditos() {
		return this.MINIMO_DE_CREDITOS;
	}
	
	/**
	 * Informa o máximo de Créditos necessário para um período.
	 * @return Número máximo de créditos.
	 */
	// INFORMATION EXPERT: É o plano de curso e sabe o máximo de créditos possíveis.
	public int maximoDeCreditos() {
		return this.MAXIMO_DE_CREDITOS;
	}
	
	/**
	 * Obtém a lista de Disciplinas de um Período específico.
	 * @param indicePeriodo Número do Período (a partir de zero) a se obter a lista de Disciplinas.
	 * @return Lista das Disciplinas do Período.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public List<Disciplina> getDisciplinasDadoPeriodo(int indicePeriodo) {
		return this.periodo(indicePeriodo).getListaDeDisciplinas();
	}

	/**
	 * Obtém uma Disciplina do Currículo dado o nome dessa Disciplina.
	 * @param nomeDaDisciplina String contendo o nome da Disciplina desejada.
	 * @return Disciplina com o mesmo nome passado como parâmetro.
	 */
	// INFORMATION EXPERT: Conhece curriculo e pode procurar uma disciplina nele.
	public Disciplina getDisciplinaCurriculo(String nomeDaDisciplina) throws Exception {
		return curriculo.pesquisaDisciplina(nomeDaDisciplina) ;
	}

	/**
	 * Adiciona uma Disciplina no Período indicado, pesquisando a mesma pelo nome no Currículo.
	 * @param indicePeriodo Número do Período (a partir de zero) a ser inserido a Disciplina.
	 * @param nome String contendo o nome da Disciplina desejada.
	 * @throws Exception Se a Disciplina já está alocada em algum Período.
	 */
	// CREATOR: Tem a lista de periodos e pode chamar o seu método adicionaDisciplinas se for correto.
	public void adicionaDisciplinaNoPeriodo(int indicePeriodo, String nome) throws Exception{
		Disciplina disciplina = curriculo.pesquisaDisciplina(nome);
		boolean verificaPreRequisitos = true;
		if (disciplina.getPreRequisitos().length > 0) {
			for (int i = 0; i < disciplina.getPreRequisitos().length; i++) {
				if (!this.estaAlocada(disciplina.getPreRequisitos()[i])) {
					verificaPreRequisitos = this.estaAlocada(disciplina.getPreRequisitos()[i]);
				}
			}	
		}
		
		if ((indicePeriodo != 0) && !this.estaAlocada(disciplina) && verificaPreRequisitos && (this.periodo(indicePeriodo).calculaTotalDeCreditos() + disciplina.getCreditos() <= maximoDeCreditos())) {
			this.periodo(indicePeriodo).adicionaDisciplinas(disciplina);
		} else{
			if(this.estaAlocada(disciplina))throw new Exception("Disciplina ja esta alocada");
			if(!verificaPreRequisitos) throw new Exception("Os pre Requisitos nao foram alocados.");
			if(this.periodo(indicePeriodo).calculaTotalDeCreditos() + disciplina.getCreditos() > maximoDeCreditos())throw new Exception("Vai ultrapassar o maximo de creditos.");
		}
			
	}
	
	/**
	 * Obtém o Currículo do Curso de Ciência da Computação com todas as suas Disciplinas.
	 * @return Um Currículo, do Curso de Ciência da Computação.
	 */
	// INFORMATION EXPERT: Conhece curriculo.
	public Curriculo getCurriculo(){
		return curriculo;
	}
	
	/**
	 * Remove uma Disciplina do Período indicado, pesquisando a mesma pelo nome no Currículo.
	 * @param periodo Número do Período (a partir de zero) que terá a Disciplina removida.
	 * @param nomeDaDisciplina String contendo o nome da Disciplina a ser removida.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos e pode chamar o removeDisciplina de um determinado periodo.
	public void removeDisciplinaDoPeriodo(int periodo, String nomeDaDisciplina) throws Exception {
		Disciplina disciplina = curriculo.pesquisaDisciplina(nomeDaDisciplina);
		this.periodo(periodo).removeDisciplina(disciplina);
			for (int i = periodo; i < getPeriodos().size(); i++) {
				for (int j = 0; j < periodo(i).getListaDeDisciplinas().size(); j++) {
					for (int k = 0; k < periodo(i).getListaDeDisciplinas().get(j).getPreRequisitos().length; k++) {
						if (periodo(i).getListaDeDisciplinas().get(j).getPreRequisitos()[k].equals(disciplina)) {
							removeDisciplinaDoPeriodo(i, periodo(i).getListaDeDisciplinas().get(j).getNomeDaDisciplina());
						}
					}
				}
			}
		
	}
	
	/**
	 * Procura por alocação de uma determinada disciplina em um Período.
	 * @param disciplina Disciplina que se deseja saber se está alocada ou não
	 * @return true se disciplina está alocada; caso contrário, false.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos e os periodos a lista de disciplinas, entao conhece quem esta alocada.
	public boolean estaAlocada(Disciplina disciplina){
		boolean resp = false;
		for (int i = 0; i < periodos.size(); i++) {
			for (int j = 0; j < periodos.get(i).getListaDeDisciplinas().size(); j++) {
				if(periodos.get(i).getListaDeDisciplinas().get(j).equals(disciplina)){
					resp = true;
				}
			}
		}
		return resp;
	}

	/**
	 * Obtém um Período específico a partir do índice na Lista de Períodos.
	 * @param periodo Número do Período desejado (a partir de zero)
	 * @return Período vindo da lista.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public Periodo periodo(int periodo) {
		return this.getPeriodos().get(periodo);
	}

	/**
	 * Obtém o total de Créditos de um Período específico a partir do índice na Lista de Períodos.
	 * @param periodo Número do Período desejado (a partir de zero)
	 * @return Número de Créditos de <u>periodo</u>
	 */
	// INFORMATION EXPERT: Tem a lista de periodos e pode chamar o calculaTotalDeCreditos para saber os creditos de um periodo.
	public int getCreditosDeUmPeriodo(int periodo) {
		return this.periodo(periodo).calculaTotalDeCreditos();
	}

	/**
	 * Obtém a quantidade de Períodos alocados.
	 * @return Tamanho da Lista de Períodos, correspondente a quantidade de Períodos alocados. 
	 */
	// INFORMATION EXPERT: Tem a lista de periodos.
	public int quantidadeDePeriodos() {
		return this.getPeriodos().size();
	}

	/**
	 * Obtém uma String formatada com o nome das Disciplinas de um determinado Período.
	 * @param periodo Período que se deseja a String formatada.
	 * @return String contendo uma lista de Disciplinas de <u>periodo</u>.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos e pode chamar o toString de um determinado periodo.
	public String toStringDeUmDeterminadoPeriodo(int periodo) {
		return getDisciplinasDadoPeriodo(periodo).toString();
	}

	/**
	 * Obtém a quantidade de Disciplinas de um determinado Período.
	 * @param periodo Periodo que se deseja saber a quantidade de Disciplinas.
	 * @return Tamanho da lista de Disciplinas de <u>periodo</u>.
	 */
	// INFORMATION EXPERT: Tem a lista de periodos e pode chamar getDisciplinasDadoPeriodo para saber quais disciplinas tem em um periodo e saber o seu tamanho.
	public int quantidadeDeDisciplinasNoPeriodo(int periodo) {
		return getDisciplinasDadoPeriodo(periodo).size();
	}
	
}


package models;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.Constraints.Required;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import play.db.ebean.Model;

@Entity
public class Periodo extends Model {
	
    @Required
    public int idPeriodo;
    
    
	// CREATOR: Periodo é feito de disciplinas
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "disciplina", joinColumns = { 
			@JoinColumn(name = "planejamento") }, inverseJoinColumns = { 
			@JoinColumn(name = "disciplina") })
	private List<Disciplina> listaDisciplinas;
    
    @Transient
	public static Model.Finder<Long, Periodo> find = new Finder<Long, Periodo>(
			Long.class, Periodo.class);

	/**
	 * Construtor da classe Período; cria um Periodo contendo um ArrayList para receber as Disciplinas a serem alocadas e uma instância de Currículo.
	 */
	public Periodo() {
		this.listaDisciplinas = new ArrayList<Disciplina>();
	}
	
	public void setIdPeriodo(int idPeriodo) {
       this.idPeriodo = idPeriodo;
   }
   public int getIdPeriodo() {
	   return idPeriodo;
   }
	
	public static void create(Periodo periodo) {
		periodo.save();
	}

	/**
	 * Aloca uma Disciplina no Período, respeitando o limite de créditos,o status da Disciplina e se ela já foi alocada em outro Período.
	 * @param disciplina Disciplina a ser alocada.
	 * @throws Exception Lança uma exceção se o limite de créditos for ultrapassado com a alocação da disciplina.
	 */
	// INFORMATION EXPERT: Pois é onde está a lista de disciplinas
	public void adicionaDisciplinas(Disciplina disciplina) throws Exception{
		listaDisciplinas.add(disciplina);
	}

	/**
	 * Obtém uma Lista com as Disciplinas alocadas no Período.
	 * @return List com as Disciplinas alocadas no Período.
	 */
	// CREATOR: A classe Periodo guarda objetos do tipo Disciplina
	public List<Disciplina> getListaDeDisciplinas() {
		return listaDisciplinas;
	}

	/**
	 * Modifica as disciplinas alocadas no Período a partir de uma Lista passada como parâmetro. 
	 * @param disciplinas Lista das novas disciplinas a serem alocadas.
	 */
	// CREATOR: A classe Periodo guarda objetos do tipo Disciplina e pode modificalas
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.listaDisciplinas = disciplinas;
	}

	/**
	 * Retorna uma String representando o Período. Nesse caso, a String é uma lista formatada de Disciplinas do Período.
	 */	
	// INFORMATION EXPERT: Tem a lista de disciplinas.
	@Override
	public String toString() {
		return listaDisciplinas.toString();
	}

	/**
	 * Calcula o total de créditos que está no período.
	 * @return Número de créditos do Período.
	 */
	// INFORMATION EXPERT: Tem a lista de disciplinas para calcular o total de creditos
	public int calculaTotalDeCreditos() {
		int result = 0;
		for (int i = 0; i < this.getListaDeDisciplinas().size(); i++) {
			result += getListaDeDisciplinas().get(i).getCreditos();
		}
		return result;
	}

	/**
	 * Informa os créditos de uma determinada Disciplina.
	 * @param disciplina Disciplina para consulta de seus créditos
	 * @return Número inteiro de créditos da disciplina.
	 */
	// INFORMATION EXPERT: Tem a lista de disciplinas e pode chamar o getCreditos de uma dada disciplina.
	public int creditosPorDisciplina(Disciplina disciplina) {
		return disciplina.getCreditos();
	}

	/**
	 * Remove uma Disciplina do Período.
	 * @param disciplina Disciplina a ser removida.
	 */
	// CREATOR: Tem a lista de disciplinas e pode remover uma dada disciplina.
	public void removeDisciplina(Disciplina disciplina) {
		this.getListaDeDisciplinas().remove(disciplina);
	}
}

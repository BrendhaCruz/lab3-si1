package controllers;

import java.util.ArrayList;
import java.util.List;
import models.Curriculo;
import models.Disciplina;
import models.Periodo;


//CONTROLLER: controlador do sistema
public class Planejamento{ 

	// CREATOR: Classe planejamento regista a lista dos periodos.
    private List<Periodo> periodos;
	private static final int MINIMO_DE_CREDITOS = 16;
    private static final int MAXIMO_DE_CREDITOS = 28;
    private Curriculo curriculo;
    private Periodo primeiroPeriodo;

	public Planejamento(Curriculo curriculo) {
		periodos = new ArrayList<Periodo>();
		this.curriculo = curriculo;
		primeiroPeriodo = new Periodo();
	}
	
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
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaPeriodo(){
		periodos.add(new Periodo());
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public List<Periodo> getPeriodos() {
        return this.periodos;
	}
	
    public void setPeriodos(List<Periodo> periodos) {
		this.periodos = periodos;
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void removePeriodo(int i){
		this.periodos.remove(this.periodos.remove(i));
	}
	
	public int minimoDeCreditos() {
		return this.MINIMO_DE_CREDITOS;
	}
	
	public int maximoDeCreditos() {
		return this.MAXIMO_DE_CREDITOS;
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public List<Disciplina> getDisciplinasDadoPeriodo(int indicePeriodo) {
		return this.periodo(indicePeriodo).getListaDeDisciplinas();
	}

	public Disciplina getDisciplinaCurriculo(String nomeDaDisciplina) throws Exception {
		return curriculo.pesquisaDisciplina(nomeDaDisciplina) ;
	}

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
		
		if ((indicePeriodo != 0) && !this.estaAlocada(disciplina) && verificaPreRequisitos && (this.periodo(indicePeriodo).calculaTotalDeCreditos() < maximoDeCreditos())) {
			this.periodo(indicePeriodo).adicionaDisciplinas(disciplina);
		} else{
			if(indicePeriodo == 0)throw new Exception("Nao pode adicionar disciplinas no primeiro periodo.");
			
			throw new Exception("Disciplina ja esta alocada ou os pre Requisitos nao foram alocados."); 
		}
			
	}
	
	public Curriculo getCurriculo(){
		return curriculo;
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void removeDisciplinaDoPeriodo(int periodo, String nomeDaDisciplina) throws Exception {
		List<Periodo> periodosBackup = this.getPeriodos();
		Disciplina disciplina = curriculo.pesquisaDisciplina(nomeDaDisciplina);
		this.periodo(periodo).removeDisciplina(disciplina);
		if(periodo != 0){
			if (periodo<(getPeriodos().size()) && (periodo!=0)){ 
				periodo +=1;
				for (int i = periodo; i < getPeriodos().size(); i++) {
					for (int j = 0; j < periodo(i).getListaDeDisciplinas().size(); j++) {
						for (int k = 0; k < periodo(i).getListaDeDisciplinas().get(j).getPreRequisitos().length; k++) {
							if (periodo(i).getListaDeDisciplinas().get(j).getPreRequisitos()[k].equals(disciplina)) {
								removeDisciplinaDoPeriodo(periodo, periodo(i).getListaDeDisciplinas().get(j).getNomeDaDisciplina());
								j--;
							}
						}
					}
				}
			}
		}else {
			throw new Exception("Nao pode remover disciplina do primeiro periodo.");
		}
		
	}
	
	
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

	public Periodo periodo(int periodo) {
		return this.getPeriodos().get(periodo);
	}

	public int getCreditosDeUmPeriodo(int periodo) {
		return this.periodo(periodo).calculaTotalDeCreditos();
	}

	public int quantidadeDePeriodos() {
		return this.getPeriodos().size();
	}

	public String toStringDeUmDeterminadoPeriodo(int periodo) {
		return getDisciplinasDadoPeriodo(periodo).toString();
	}

	public int quantidadeDeDisciplinasNoPeriodo(int periodo) {
		return getDisciplinasDadoPeriodo(periodo).size();
	}
	
}


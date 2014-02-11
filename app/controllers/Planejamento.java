package controllers;

import java.util.ArrayList;
import java.util.List;

import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;
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
	public void adicionaPrimeiroPeriodo(){
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(0));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(1));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(2));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(3));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(4));
		primeiroPeriodo.adicionaDisciplinas(curriculo.criaPrimeiroPeriodo().get(5));
		periodos.add(primeiroPeriodo);
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaPeriodo(){
		periodos.add(new Periodo());
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaPeriodo(Periodo periodo){
		this.periodos.add(periodo);
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public List<Periodo> getPeriodos() {
        return this.periodos;
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void removePeriodo(Periodo periodo){
		this.periodos.remove(this.periodos.remove(periodo));
	}
	
	public int minimoDeCreditos() {
		return this.MINIMO_DE_CREDITOS;
	}
	
	public int maximoDeCreditos() {
		return this.MAXIMO_DE_CREDITOS;
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public List<Disciplina> getDisciplinasDadoPeriodo(int indicePeriodo) {
		return getPeriodos().get(indicePeriodo).getListaDeDisciplinas();
	}

	public Disciplina getDisciplinaCurriculo(String nomeDaDisciplina) {
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
		
		if (!this.estaAlocada(disciplina) && verificaPreRequisitos) {
			this.getPeriodos().get(indicePeriodo).adicionaDisciplinas(disciplina);
		} else{
			throw new Exception("Disciplina ja esta alocada"); 
		}
			
	}
	
	public Curriculo getCurriculo(){
		return curriculo;
	}
	
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void removeDisciplinaDoPeriodo(int periodo, String nomeDaDisciplina) {
		Disciplina disciplina = curriculo.pesquisaDisciplina(nomeDaDisciplina);
		this.getPeriodos().get(periodo).removeDisciplina(disciplina);
		if (periodo<(getPeriodos().size())){ 
			periodo +=1;
			for (int i = periodo; i < getPeriodos().size(); i++) {
				for (int j = 0; j < getPeriodos().get(i).getListaDeDisciplinas().size(); j++) {
					for (int k = 0; k < getPeriodos().get(i).getListaDeDisciplinas().get(j).getPreRequisitos().length; k++) {
						if (getPeriodos().get(i).getListaDeDisciplinas().get(j).getPreRequisitos()[k].equals(disciplina)) {
							removeDisciplinaDoPeriodo(periodo, getPeriodos().get(i).getListaDeDisciplinas().get(j).getNomeDaDisciplina());
							j--;
						}
					}
				}
			}
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
	
}


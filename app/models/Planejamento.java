package models;

import java.util.ArrayList;
import java.util.List;


//CONTROLLER: controlador do sistema
public class Planejamento{ 

	// CREATOR: Classe planejamento regista a lista dos periodos.
    private List<Periodo> periodos;
    private Periodo periodo;
    private static final int MINIMO_DE_CREDITOS = 16;
    private static final int MAXIMO_DE_CREDITOS = 28;
    private Curriculo curriculo;

	public Planejamento() {
		periodos = new ArrayList<Periodo>();
		periodo = new Periodo();
		curriculo = Curriculo.getInstance();
	}
	// INFORMATION EXPERT: Tem a lista de periodos.
	public void adicionaPrimeiroPeriodo(){
		periodo.criaPrimeiroPeriodo();
		periodos.add(periodo);
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

	public Disciplina[] getListaDeDisciplina(){
		return curriculo.getListaDeDisciplinas();
	}

	public void adicionaDisciplinaNoPeriodo(int indicePeriodo, String nome){
		this.getPeriodos().get(indicePeriodo).adicionaDisciplinas(curriculo.pesquisaDisciplina(nome));
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
	
}


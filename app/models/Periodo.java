package models;

import java.util.ArrayList;
import java.util.List;

public class Periodo {

	// CREATOR: Periodo é feito de disciplinas
	private List<Disciplina> listaDisciplinas;
	private Curriculo curriculo;

	public Periodo() {
		this.listaDisciplinas = new ArrayList<Disciplina>();
		curriculo = Curriculo.getInstance();
	}

	// INFORMATION EXPERT: Pois é onde está a lista de disciplinas
	public void adicionaDisciplinas(Disciplina disciplina) {
		boolean resp = true;
		Disciplina[] preRequisitos = disciplina.getPreRequisitos();
		if (!disciplina.getStatus()) {
			if (this.calculaTotalDeCreditos() + disciplina.getCreditos() <= 28) {
				if (preRequisitos.length != 0) {
					for (int i = 0; i < preRequisitos.length; i++) {
						if (preRequisitos[i].getStatus() == Disciplina.DISCIPLINA_PENDENTE) {
							resp = false;
						}
					}
				} if (resp && !disciplina.isAlocada()) {
					disciplina.setAlocada(Disciplina.DISCIPLINA_ALOCADA);
					listaDisciplinas.add(disciplina);
				}
			}
		}
	}

	// CREATOR: a classe Periodo guarda objetos do tipo Disciplina
	public List<Disciplina> getListaDeDisciplinas() {
		return listaDisciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.listaDisciplinas = disciplinas;
	}

	public void criaPrimeiroPeriodo() {
		this.adicionaDisciplinas((curriculo.pesquisaDisciplina("Cálculo I")));
		this.adicionaDisciplinas((curriculo.pesquisaDisciplina("Programação I")));
		this.adicionaDisciplinas((curriculo.pesquisaDisciplina("Lab. de Programação I")));
		this.adicionaDisciplinas((curriculo.pesquisaDisciplina("Introdução a Computação")));
		this.adicionaDisciplinas((curriculo.pesquisaDisciplina("Leitura e Produção de Textos")));
		this.adicionaDisciplinas((curriculo.pesquisaDisciplina("Álgebra Vetorial e Geometria Analítica")));
	}
	
	@Override
	public String toString() {
		return listaDisciplinas.toString();
	}

	// INFORMATION EXPERT: tem a lista de disciplinas para calcular o total de
	// creditos
	public int calculaTotalDeCreditos() {
		int result = 0;
		for (int i = 0; i < this.getListaDeDisciplinas().size(); i++) {
			result += getListaDeDisciplinas().get(i).getCreditos();
		}
		return result;
	}

	public Object creditosPorDisciplina(Disciplina disciplina) {
		return disciplina.getCreditos();
	}

	public void removeDisciplina(Disciplina disciplina) {
		this.getListaDeDisciplinas().remove(disciplina);
		disciplina.setAlocada(Disciplina.DISCIPLINA_NAO_ALOCADA);
	}
}

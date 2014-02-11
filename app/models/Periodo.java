package models;

import java.util.ArrayList;
import java.util.List;

public class Periodo {

	// CREATOR: Periodo é feito de disciplinas
	private List<Disciplina> listaDisciplinas;

	public Periodo() {
		this.listaDisciplinas = new ArrayList<Disciplina>();
	}

	// INFORMATION EXPERT: Pois é onde está a lista de disciplinas
	public void adicionaDisciplinas(Disciplina disciplina) {
		if (this.calculaTotalDeCreditos() + disciplina.getCreditos() <= 28) {
				listaDisciplinas.add(disciplina);
		}
	}

	// CREATOR: a classe Periodo guarda objetos do tipo Disciplina
	public List<Disciplina> getListaDeDisciplinas() {
		return listaDisciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.listaDisciplinas = disciplinas;
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

	public int creditosPorDisciplina(Disciplina disciplina) {
		return disciplina.getCreditos();
	}

	public void removeDisciplina(Disciplina disciplina) {
		this.getListaDeDisciplinas().remove(disciplina);
	}
}

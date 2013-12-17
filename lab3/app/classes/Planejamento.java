package classes;

//CONTROLLER: controlador do sistema
public class Planejamento { 

	// CREATOR: Classe planejamento regista a lista das disciplina
	private Disciplina[] listaDisciplinas;

	public Planejamento() {
		listaDisciplinas = new Disciplina[6];
	}

	public Disciplina[] listaDeDisciplinas() {
		return listaDisciplinas;
	}
// INFORMATION EXPERT: tem a lista de disciplinas para calcular o total de creditos
	public int calculaTotalDeCreditos() {
		int result = 0;
		for (int i = 0; i < this.listaDeDisciplinas().length; i++) {
			result += listaDeDisciplinas()[i].getCreditos();
		}
		return result;
	}
// INFORMATION EXPERT: Pois é onde está a lista de disciplinas
	public void adicionaDisciplinas(Disciplina disciplina) {
		for (int i = 0; i < this.listaDeDisciplinas().length; i++) {
			if (this.listaDeDisciplinas()[i] == null) {
				listaDisciplinas[i] = disciplina;
				break;
			}
		}

	}

	public Object creditosPorDisciplina(Disciplina disciplina) {
		return disciplina.getCreditos();
	}

}


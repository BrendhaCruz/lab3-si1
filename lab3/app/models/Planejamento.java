package models;


public class Planejamento { 

	private Disciplina[] listaDisciplinas;

	public Planejamento() {
		listaDisciplinas = new Disciplina[6];
	}

	public Disciplina[] listaDeDisciplinas() {
		return listaDisciplinas;
	}

	public int calculaTotalDeCreditos() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void adicionaDisciplinas(Disciplina disciplina) {
		for (int i = 0; i < listaDisciplinas.length; i++) {
			if (listaDisciplinas[i] == null) {
				listaDisciplinas[i] = disciplina;
				break;
			}
		}

	}

}


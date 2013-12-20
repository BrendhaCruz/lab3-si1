package models;

public class Curriculo {
	
	Disciplina[] listaDeDisciplinas;
	//6 primeiros - new Disciplina[0]
	//new Disciplina[]{this.preRequisito("Cálculo I")}
	//new Disciplina[]{this.preRequisito("Programacao I"), this.preRequisito("Lab. de Programação I"), this.preRequisito("Introdução a Computação")}
	//new Disciplina[]{this.preRequisito("Programacao I"), this.preRequisito("Lab. de Programação I"), this.preRequisito("Introdução a Computação")}
	//new Disciplina[]{this.preRequisito("Programacao I"), this.preRequisito("Lab. de Programação I")}
	// 2 new Disciplina[0]
	// new Disciplina[]{this.preRequisito("Cálculo I"), this.preRequisito("Algebra Vetorial e Geometria Analítica")}
	//  new Disciplina[]{this.preRequisito("Programação II"), this.preRequisito("Lab. de Programação II"), this.preRequisito("Teoria dos Grafos")}
	//  new Disciplina[]{this.preRequisito("Programação II"), this.preRequisito("Lab. de Programação II"), this.preRequisito("Teoria dos Grafos")}
	// new Disciplina[]{this.preRequisito("Algebra Vetorial e Geometria Analítica")}
	// , new Disciplina[]{this.preRequisito("Cálculo II")}
	// new Disciplina[]{this.preRequisito("Introdução a Computação"), this.preRequisito("Matematica Discreta"), this.preRequisito("Teoria dos Grafos")}
	// new Disciplina[]{this.preRequisito("Cálculo II"), this.preRequisito("Fundamentos de Fisica Classica")}
	// new Disciplina[0]
	public Curriculo() {
		listaDeDisciplinas = new Disciplina[]{
			new Disciplina("Cálculo I", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Programação I", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Lab. de Programação I", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Introdução a Computação", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Leitura e Produção de Textos", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Algebra Vetorial e Geometria Analítica", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Cálculo II", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Programação II", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Lab. de Programação II", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Teoria dos Grafos", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Matematica Discreta", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Metodologia Cientifica", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Fundamentos de Fisica Classica", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Estrutura de Dados e Algoritmos", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Lab. de Estrutura de Dados e Algoritmos", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Algebra Linear", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Probabilidade e Estatistica", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Teoria da Computação", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Fundamentos de Fisica Moderna", 4, Disciplina.DISCIPLINA_PENDENTE),
			new Disciplina("Gerência da Informação", 4, Disciplina.DISCIPLINA_PENDENTE)
		};
		this.setaPreRequisitos();
	
	}
	
	public Disciplina[] getListaDeDisciplinas() {
		return this.listaDeDisciplinas;
	}

	public int quantDeDisciplinasCadastradas() {
		return this.listaDeDisciplinas.length;
	}

	public boolean contains(Disciplina disciplina) {
		boolean resp = false;
			for (int i = 0; i < listaDeDisciplinas.length; i++) {
				if (listaDeDisciplinas[i].getNomeDaDisciplina() == disciplina.getNomeDaDisciplina()) {
					resp = true;
				}
			}
		return resp;
	}
	
	public Disciplina preRequisito(String nomeDaDisciplina){
		for (int i = 0; i < this.quantDeDisciplinasCadastradas(); i++) {
			if (this.getListaDeDisciplinas()[i].getNomeDaDisciplina() == nomeDaDisciplina) {
				return this.getListaDeDisciplinas()[i];
			}
		}
		return null;
	}
	
	public void setaPreRequisitos(){
		for (int i = 0; i < this.quantDeDisciplinasCadastradas(); i++) {
			if(i == 0 |i ==  1 |i ==  2 |i ==  3 |i ==  4 |i ==  5 |i ==  10 |i ==  11 |i ==  19){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[0]);
			}
			if(i == 6){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[]{this.preRequisito("Cálculo I")});				
			}
			if(i == 7 |i == 8){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[]{this.preRequisito("Programação I"), this.preRequisito("Lab. de Programação I"), this.preRequisito("Introdução a Computação")});
			}
			if(i == 9){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[]{this.preRequisito("Programação I"), this.preRequisito("Lab. de Programação I")});
			}if (i == 12){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[]{this.preRequisito("Cálculo I"), this.preRequisito("Algebra Vetorial e Geometria Analítica")});
			}
			if (i == 13| i == 14){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[]{this.preRequisito("Programação II"), this.preRequisito("Lab. de Programação II"), this.preRequisito("Teoria dos Grafos")});
			}
			if( i ==15){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[]{this.preRequisito("Algebra Vetorial e Geometria Analítica")});
			}
			if (i == 16){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[]{this.preRequisito("Cálculo II")});
			}
			if (i == 17){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[]{this.preRequisito("Introdução a Computação"), this.preRequisito("Matematica Discreta"), this.preRequisito("Teoria dos Grafos")});
			}
			if (i == 18){
				this.getListaDeDisciplinas()[i].setPreRequisitos(new Disciplina[]{this.preRequisito("Cálculo II"), this.preRequisito("Fundamentos de Fisica Classica")});
			}
			
		}
	}

}

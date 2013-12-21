package models;


public class Curriculo {
	
	private Disciplina[] listaDeDisciplinas;
	private Disciplina calc1, prog1, labProg1, ic, lpt, vetorial, calc2, prog2,labProg2, discreta, grafos,metodologia, fisicaClassica,eda,leda,linear,prob,tc, fisicaModerna,gi;
	
	public Curriculo() {
		listaDeDisciplinas = new Disciplina[]{
			calc1 = new Disciplina("Cálculo I", 4, new Disciplina[0]),
			prog1 = new Disciplina("Programação I", 4, new Disciplina[0]),
			labProg1 = new Disciplina("Lab. de Programação I", 4, new Disciplina[0]),
			ic = new Disciplina("Introdução a Computação", 4, new Disciplina[0]),
			lpt = new Disciplina("Leitura e Produção de Textos", 4, new Disciplina[0]),
			vetorial = new Disciplina("Álgebra Vetorial e Geometria Analítica", 4, new Disciplina[0]),
			calc2 = new Disciplina("Cálculo II", 4, new Disciplina[]{calc1}),
			prog2 = new Disciplina("Programação II", 4, new Disciplina[]{prog1,labProg1,ic}),
			labProg2 = new Disciplina("Lab. de Programação II", 4, new Disciplina[]{prog1,labProg1,ic}),
			grafos = new Disciplina("Teoria dos Grafos", 2, new Disciplina[]{prog1,labProg1}),
			discreta = new Disciplina("Matemática Discreta", 4, new Disciplina[0]),
			metodologia = new Disciplina("Metodologia Científica", 4, new Disciplina[0]),
			fisicaClassica = new Disciplina("Fundamentos de Física Clássica", 4, new Disciplina[]{calc1, vetorial}),
			eda = new Disciplina("Estrutura de Dados e Algoritmos", 4,new Disciplina[]{prog2,labProg2,grafos}),
			leda = new Disciplina("Lab. de Estrutura de Dados e Algoritmos", 4, new Disciplina[]{prog2,labProg2,grafos}),
			linear = new Disciplina("Álgebra Linear", 4, new Disciplina[]{vetorial}),
			prob = new Disciplina("Probabilidade e Estatística", 4, new Disciplina[]{calc2}),
			tc = new Disciplina("Teoria da Computação", 4, new Disciplina[]{ic,discreta,grafos}),
			fisicaModerna = new Disciplina("Fundamentos de Física Moderna", 4, new Disciplina[]{fisicaClassica,calc2}),
			gi = new Disciplina("Gerência da Informação", 4, new Disciplina[0])
		};
	
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
	
	public Disciplina pesquisaDisciplina(String nomeDaDisciplina){
		for (int i = 0; i < this.quantDeDisciplinasCadastradas(); i++) {
			if (this.getListaDeDisciplinas()[i].getNomeDaDisciplina() == nomeDaDisciplina) {
				return this.getListaDeDisciplinas()[i];
			}
		}
		return null;
	}

}

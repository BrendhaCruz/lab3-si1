package models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

import play.db.ebean.Model;
import com.avaje.ebean.*;
import play.db.ebean.*;

@Entity
public class NovaGrade extends Model {

	private Disciplina[] novaListaDeDisciplinas;
	private List<Disciplina> disciplinasPrimeiroPeriodo;
	private List<Disciplina> disciplinasSegundoPeriodo;
	private List<Disciplina> disciplinasTerceiroPeriodo;
	private List<Disciplina> disciplinasQuartoPeriodo;
	private List<Disciplina> disciplinasQuintoPeriodo;
	private List<Disciplina> disciplinasSextoPeriodo;
	private List<Disciplina> disciplinasSetimoPeriodo;
	private List<Disciplina> disciplinasOitavoPeriodo;
	private List<Disciplina> disciplinasNonoPeriodo;

	private Disciplina matDisc1, prog1, labProg1, ic, matDisc2, calc1,
			vetorial, calc2, prog2, labProg2, grafos, metodologia,
			fisicaClassica, eda, leda, linear, prob, tc, fisicaModerna, ea,
			metodos, plp, logic, oac, loac, es, ps, atal, pc, direito,
			comp, redes, bd1, as, labEs, so, interRedes, LabInterRedes, bd2,
			ia, softNum, sistemasDiscretos, projeto1, projeto2, adm,
			sociologia, economia, futsal, basq, calc3, eqDif, ingles,
			didatica1, didatica2, sistemasDist, segurancaRedes, realidadeVirt,trabCon1, 
			trabCon2, empreendorismo, op1, op2, op3, op4, op5, op6, op7, op8, op9, op10,
			op11, op12, op13, op14;
	
	private static NovaGrade myGrade;

	/**
	 * Construtor da Classe NovaGrade, que contem todas as Disciplinas do Curso
	 * de Ciencia da Computacao.
	 */
	// CREATOR: Cria a lista das disciplinas.
	public NovaGrade() {
		novaListaDeDisciplinas = new Disciplina[] {
				matDisc1 = new Disciplina("Matematica Discreta I", 4,
						new Disciplina[0]),
				prog1 = new Disciplina("Programação I", 4, new Disciplina[0]),
				labProg1 = new Disciplina("Lab. de Programação I", 4,
						new Disciplina[0]),
				ic = new Disciplina("Introdução a Computação", 4,
						new Disciplina[0]),
				matDisc2 = new Disciplina("Matematica Discreta II", 4,
						new Disciplina[] { matDisc1 }),
				calc1 = new Disciplina("Cálculo I", 4, new Disciplina[0]),
				vetorial = new Disciplina(
						"Álgebra Vetorial e Geometria Analítica", 4,
						new Disciplina[0]),
				calc2 = new Disciplina("Cálculo II", 4,
						new Disciplina[] { calc1 }),
				prog2 = new Disciplina("Programação II", 4, new Disciplina[] {
						prog1, labProg1}),
				labProg2 = new Disciplina("Lab. de Programação II", 4,
						new Disciplina[] { prog1, labProg1}),
				grafos = new Disciplina("Teoria dos Grafos", 2,
						new Disciplina[0]),
				metodologia = new Disciplina("Metodologia Científica", 4,
						new Disciplina[0]),
				fisicaClassica = new Disciplina(
						"Fundamentos de Física Clássica", 4, new Disciplina[] {
								calc1, vetorial }),
				eda = new Disciplina("Estrutura de Dados e Algoritmos", 4,
						new Disciplina[] { prog2, labProg2}),
				leda = new Disciplina(
						"Lab. de Estrutura de Dados e Algoritmos", 4,
						new Disciplina[] { prog2, labProg2}),
				linear = new Disciplina("Álgebra Linear", 4,
						new Disciplina[] { matDisc1 }),
				prob = new Disciplina("Indrodução à Probabilidade", 4,
						new Disciplina[] { calc1, matDisc2 }),
				tc = new Disciplina("Teoria da Computação", 4,
						new Disciplina[] { plp}),
				fisicaModerna = new Disciplina("Fundamentos de Física Moderna",
						4, new Disciplina[] { fisicaClassica, calc2 }),
				ea = new Disciplina("Estatística Aplicada", 4,
						new Disciplina[]{prob}),
				metodos = new Disciplina("Métodos Estatísticos", 4,
						new Disciplina[0]),
				plp = new Disciplina("Paradigmas de Linguagens de Programação",
						2, new Disciplina[] { eda, leda, tc }),
				logic = new Disciplina("Lógica Matemática", 4,
						new Disciplina[] { matDisc1 }),
				oac = new Disciplina(
						"Organização e Arquitetura de Computadores", 4,
						new Disciplina[0]),
				loac = new Disciplina(
						"Lab. de Organizacao e Arquitetura de Computadores", 4,
						new Disciplina[0]),
				es = new Disciplina("Engenharia de Software 1", 4,
						new Disciplina[] { labProg2, prog2, prob }),
				ps = new Disciplina("Projeto de Software", 4,
						new Disciplina[0]),
				atal = new Disciplina("Análise e Tecnicas de Algoritmos", 4,
						new Disciplina[] { leda, eda, logic, calc2 }),
				pc = new Disciplina("Programação Concorrente", 4,
						new Disciplina[]{so}),
				direito = new Disciplina("Direito e Cidadania", 4,
						new Disciplina[0]),
				comp = new Disciplina("Compiladores", 4, new Disciplina[] {
						oac, loac, plp }),
				redes = new Disciplina("Redes de Computadores", 4,
						new Disciplina[] { oac, loac }),
				bd1 = new Disciplina("Banco de Dados 1", 4,
						new Disciplina[] { eda }),
				as = new Disciplina("Análise de Sistemas", 4,
						new Disciplina[0]),
				labEs = new Disciplina("Lab. de Engenharia de Software", 2,
						new Disciplina[] { es }),
				so = new Disciplina("Sistemas Operacionais", 4,
						new Disciplina[] { oac, loac }),
				interRedes = new Disciplina(
						"Interconexão de Redes de Computadores", 2,
						new Disciplina[] { redes }),
				LabInterRedes = new Disciplina(
						"Lab. Interconexão de Redes de Computadores", 2,
						new Disciplina[] { redes }),
				bd2 = new Disciplina("Banco de Dados 2", 4, new Disciplina[] {
						bd1}),
				ia = new Disciplina("Inteligência Artificial 1", 4,
						new Disciplina[] {tc}),
				softNum = new Disciplina("Métodos e Software Numericos", 4,
						new Disciplina[] { atal, linear }),
				sistemasDiscretos = new Disciplina(
						"Avaliação de Desempenho de Sistemas Discretos", 4,
						new Disciplina[] { prob }),
				projeto1 = new Disciplina("Projeto em Computação 1", 4,
						new Disciplina[] { metodologia, labEs }),
				projeto2 = new Disciplina("Projeto em Computação 2", 6,
						new Disciplina[] { projeto1 }),
				adm = new Disciplina("Administração", 4, new Disciplina[0]),
				sociologia = new Disciplina("Sociologia Industrial", 3,
						new Disciplina[0]),
				economia = new Disciplina("Economia", 4, new Disciplina[0]),
				futsal = new Disciplina("Futsal", 2, new Disciplina[0]),
				basq = new Disciplina("Basquete", 2, new Disciplina[0]),
				calc3 = new Disciplina("Cálculo III", 4, new Disciplina[] {
						calc1, vetorial }),
				eqDif = new Disciplina("Equações Diferenciais", 4,
						new Disciplina[] { linear }),
				ingles = new Disciplina("Inglês", 4, new Disciplina[0]),
				didatica1 = new Disciplina(
						"TECC (Didática Em Ciência Da Computação I)", 2,
						new Disciplina[0]),
				trabCon1  = new Disciplina(
						"Trabalho de Conclusão de Curso I", 4,
						new Disciplina[0]),
				trabCon2  = new Disciplina(
						"Trabalho de Conclusão de Curso II", 4,
						new Disciplina[0]),
				didatica2 = new Disciplina(
						"TECC (Didática Em Ciência Da Computação II)", 2,
						new Disciplina[] { didatica1 }),
				sistemasDist = new Disciplina("TECC (Sistemas Distribuidos)",
						4, new Disciplina[] { so }),
				segurancaRedes = new Disciplina(
						"TECC (Segurança de Redes de Computadores)", 4,
						new Disciplina[] { interRedes, LabInterRedes }),
				realidadeVirt = new Disciplina(
						"TECC (Fundamentos e Aplicações de Realidade Virtual)",
						4, new Disciplina[0]),
				empreendorismo = new Disciplina(
						"TECC (Empreendedorismo em Software)", 4,
						new Disciplina[0]),
				op1 = new Disciplina("Optativa Geral", 4, new Disciplina[0]),
				op2 = new Disciplina("Optativa Geral", 4, new Disciplina[0]),
				op3 = new Disciplina("Optativa Específica", 4, new Disciplina[0]),
				op4 = new Disciplina("Optativa Específica", 4, new Disciplina[0]),
				op5 = new Disciplina("Optativa Específica", 4, new Disciplina[0]),
				op6 = new Disciplina("Optativa Específica", 4, new Disciplina[0]),
				op7 = new Disciplina("Optativa Geral", 4, new Disciplina[0]),
				op8 = new Disciplina("Optativa Específica", 4, new Disciplina[0]),
				op9 = new Disciplina("Optativa Específica", 4, new Disciplina[0]),
				op10 = new Disciplina("Optativa Específica", 4, new Disciplina[0]),
				op11 = new Disciplina("Optativa Específica", 2, new Disciplina[0]),
	        	op12 = new Disciplina("Optativa Específica", 4, new Disciplina[0]),
	        	op13 = new Disciplina("Optativa Específica", 4, new Disciplina[0]),
	        	op14 = new Disciplina("Optativa Específica", 4, new Disciplina[0]) };

		disciplinasPrimeiroPeriodo = new ArrayList<Disciplina>();
		disciplinasSegundoPeriodo = new ArrayList<Disciplina>();
		disciplinasTerceiroPeriodo = new ArrayList<Disciplina>();
		disciplinasQuartoPeriodo = new ArrayList<Disciplina>();
		disciplinasQuintoPeriodo = new ArrayList<Disciplina>();
		disciplinasSextoPeriodo = new ArrayList<Disciplina>();
		disciplinasSetimoPeriodo = new ArrayList<Disciplina>();
		disciplinasOitavoPeriodo = new ArrayList<Disciplina>();
		disciplinasNonoPeriodo = new ArrayList<Disciplina>();

	}

	/**
	 * Retorna todas as disciplinas do Curso de Ciencia da Computacao.
	 * 
	 * @return Vetor de Disciplina contendo todas as disciplinas do Curso de
	 *         Ciencia da Computacao.
	 */
	// INFORMATION EXPERT: Possui a lista das disciplinas cadastradas
	public Disciplina[] getNovaListaDeDisciplinas() {
		return this.novaListaDeDisciplinas;
	}

	/**
	 * Informa quantas Disciplinas foram cadastradas no NovaGrade.
	 * 
	 * @return Numero de Disciplinas em NovaGrade.
	 */
	// INFORMATION EXPERT: Possui a lista das disciplinas cadastradas e deve
	// saber sua quantidade.
	public int quantDeDisciplinasCadastradas() {
		return this.novaListaDeDisciplinas.length;
	}

	/**
	 * Pesquisa se existe uma Disciplina em NovaGrade a partir de um objeto
	 * Disciplina.
	 * 
	 * @param disciplina
	 *            Disciplina a ser pesquisada.
	 * @return valor booleano true - se a Disciplina esta cadastrada no
	 *         NovaGrade ou false - caso contrario.
	 */
	// INFORMATION EXPERT: Contem a lista das disciplinas cadastradas e sabe as
	// disciplinas que estao contidas nela.
	public boolean contains(Disciplina disciplina) {
		boolean resp = false;
		for (int i = 0; i < this.getNovaListaDeDisciplinas().length; i++) {
			if (this.getNovaListaDeDisciplinas()[i].equals(disciplina)) {
				resp = true;
			}
		}
		return resp;
	}

	/**
	 * Adiciona em uma lista as disciplinas do primeiro periodo e retorna essa
	 * lista.
	 * 
	 * @return Uma lista de Disciplinas do primeiro periodo.
	 */
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde
	// contem as disciplinas do primeiro periodo.
	public List<Disciplina> criaPrimeiroPeriodo() {
		disciplinasPrimeiroPeriodo.add(matDisc1);
		disciplinasPrimeiroPeriodo.add(op1);
		disciplinasPrimeiroPeriodo.add(prog1);
		disciplinasPrimeiroPeriodo.add(ic);
		disciplinasPrimeiroPeriodo.add(labProg1);
		return disciplinasPrimeiroPeriodo;
	}

	/**
	 * Adiciona em uma lista as disciplinas do segundo periodo e retorna essa
	 * lista.
	 * 
	 * @return Uma lista de Disciplinas do segundo periodo.
	 */
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde
	// contem as disciplinas do segundo periodo.
	public List<Disciplina> criaSegundoPeriodo() {
		disciplinasSegundoPeriodo.add(calc1);
		disciplinasSegundoPeriodo.add(matDisc2);
		disciplinasSegundoPeriodo.add(prog2);
		disciplinasSegundoPeriodo.add(op2);
		disciplinasSegundoPeriodo.add(labProg2);
		return disciplinasSegundoPeriodo;
	}

	/**
	 * Adiciona em uma lista as disciplinas do terceiro periodo e retorna essa
	 * lista.
	 * 
	 * @return Uma lista de Disciplinas do terceiro periodo.
	 */
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde
	// contem as disciplinas do terceiro periodo.
	public List<Disciplina> criaTerceiroPeriodo() {
		disciplinasTerceiroPeriodo.add(linear);
		disciplinasTerceiroPeriodo.add(calc2);
		disciplinasTerceiroPeriodo.add(eda);
		disciplinasTerceiroPeriodo.add(grafos);
		disciplinasTerceiroPeriodo.add(logic);
		disciplinasTerceiroPeriodo.add(leda);
		return disciplinasTerceiroPeriodo;
	}

	/**
	 * Adiciona em uma lista as disciplinas do quarto periodo e retorna essa
	 * lista.
	 * 
	 * @return Uma lista de Disciplinas do quarto periodo.
	 */
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde
	// contem as disciplinas do quarto periodo.
	public List<Disciplina> criaQuartoPeriodo() {
		disciplinasQuartoPeriodo.add(prob);
		disciplinasQuartoPeriodo.add(plp);
		disciplinasQuartoPeriodo.add(oac);
		disciplinasQuartoPeriodo.add(bd1);
		disciplinasQuartoPeriodo.add(ps);
		disciplinasQuartoPeriodo.add(loac);
		return disciplinasQuartoPeriodo;
	}

	/**
	 * Adiciona em uma lista as disciplinas do quinto periodo e retorna essa
	 * lista.
	 * 
	 * @return Uma lista de Disciplinas do quinto periodo.
	 */
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde
	// contem as disciplinas do quinto periodo.
	public List<Disciplina> criaQuintoPeriodo() {
		disciplinasQuintoPeriodo.add(ea);
		disciplinasQuintoPeriodo.add(as);
		disciplinasQuintoPeriodo.add(es);
		disciplinasQuintoPeriodo.add(redes);
		disciplinasQuintoPeriodo.add(so);
		disciplinasQuintoPeriodo.add(tc);
		return disciplinasQuintoPeriodo;
	}

	/**
	 * Adiciona em uma lista as disciplinas do sexto periodo e retorna essa
	 * lista.
	 * 
	 * @return Uma lista de Disciplinas do sexto periodo.
	 */
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde
	// contem as disciplinas do sexto periodo.
	public List<Disciplina> criaSextoPeriodo() {
		disciplinasSextoPeriodo.add(metodologia);
		disciplinasSextoPeriodo.add(pc);
		disciplinasSextoPeriodo.add(ia);
		disciplinasSextoPeriodo.add(op3);
		disciplinasSextoPeriodo.add(op4);
		return disciplinasSextoPeriodo;
	}

	/**
	 * Adiciona em uma lista as disciplinas do setimo periodo e retorna essa
	 * lista.
	 * 
	 * @return Uma lista de Disciplinas do setimo periodo.
	 */
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde
	// contem as disciplinas do setimo periodo.
	public List<Disciplina> criaSetimoPeriodo() {
		disciplinasSetimoPeriodo.add(atal);
		disciplinasSetimoPeriodo.add(comp);
		disciplinasSetimoPeriodo.add(op7);
		disciplinasSetimoPeriodo.add(op5);
		disciplinasSetimoPeriodo.add(op6);
		return disciplinasSetimoPeriodo;
	}

	/**
	 * Adiciona em uma lista as disciplinas do oitavo periodo e retorna essa
	 * lista.
	 * 
	 * @return Uma lista de Disciplinas do oitavo periodo.
	 */
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde
	// contem as disciplinas do oitavo periodo.
	public List<Disciplina> criaOitavoPeriodo() {
		disciplinasOitavoPeriodo.add(projeto1);
		disciplinasOitavoPeriodo.add(op8);
		disciplinasOitavoPeriodo.add(op9);
		disciplinasOitavoPeriodo.add(op10);
		disciplinasOitavoPeriodo.add(trabCon1);
		return disciplinasOitavoPeriodo;
	}
	
	public List<Disciplina> criaNonoPeriodo() {
		disciplinasNonoPeriodo.add(projeto2);
		disciplinasNonoPeriodo.add(op11);
		disciplinasNonoPeriodo.add(op12);
		disciplinasNonoPeriodo.add(op13);
		disciplinasNonoPeriodo.add(op14);
		disciplinasNonoPeriodo.add(trabCon2);
		return disciplinasNonoPeriodo;
	}

	/**
	 * Pesquisa se existe uma Disciplina em NovaGrade a partir de um String.
	 * 
	 * @param disciplina
	 *            String da Disciplina a ser pesquisada.
	 * @return valor booleano true - se existe uma Disciplina com o mesmo nome
	 *         em NovaGrade ou false - caso contrario.
	 */
	// INFORMATION EXPERT: Pois eh onde esta a lista de disciplinas que podemos
	// pesquisar.
	public Disciplina pesquisaDisciplina(String nomeDaDisciplina)
			throws Exception {
		for (int i = 0; i < this.quantDeDisciplinasCadastradas(); i++) {
			if (this.getNovaListaDeDisciplinas()[i].getNomeDaDisciplina()
					.equalsIgnoreCase(nomeDaDisciplina)) {
				return this.getNovaListaDeDisciplinas()[i];
			}
		}
		throw new Exception("Nao existe essa disciplina");
	}

}

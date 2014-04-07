package models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

import play.db.ebean.Model;
import com.avaje.ebean.*;
import play.db.ebean.*;

@Entity
public class GradeComum extends Model {
	
	private Disciplina[] listaDeDisciplinas;
	private List<Disciplina> disciplinasPrimeiroPeriodo; 
	private List<Disciplina> disciplinasSegundoPeriodo; 
	private List<Disciplina> disciplinasTerceiroPeriodo; 
	private List<Disciplina> disciplinasQuartoPeriodo; 
	private List<Disciplina> disciplinasQuintoPeriodo; 
	private List<Disciplina> disciplinasSextoPeriodo; 
	private List<Disciplina> disciplinasSetimoPeriodo; 
	private List<Disciplina> disciplinasOitavoPeriodo; 
	private List<Disciplina> disciplinasNonoPeriodo; 


	private Disciplina calc1, prog1, labProg1, ic, lpt, vetorial, calc2, prog2, labProg2, discreta, grafos, metodologia, fisicaClassica, eda, leda, linear, prob, tc, fisicaModerna, gi,
	metodos, plp, logic, oac, loac, es, si1, atal, infosoc, direito, comp, redes, bd1, si2, labEs, so, interRedes, LabInterRedes, bd2, ia, softNum, sistemasDiscretos, projeto1, projeto2,
	adm, sociologia, economia, futsal, basq, calc3, eqDif, ingles, didatica1, didatica2, sistemasDist, segurancaRedes, realidadeVirt, empreendorismo, op1, op2, op3, op4, op5, op6, op7,
	op8, op9, op10, op11;
	private static GradeComum myCurriculo;

	/**
	 * Construtor da Classe GradeComum, que contem todas as Disciplinas do Curso de Ciencia da Computacao.
	 */
	// CREATOR: Cria a lista das disciplinas.
	public GradeComum() {
		listaDeDisciplinas = new Disciplina[] {
				calc1 = new Disciplina("Cálculo I", 4, new Disciplina[0]),
				prog1 = new Disciplina("Programação I", 4, new Disciplina[0]),
				labProg1 = new Disciplina("Lab. de Programação I", 4,
						new Disciplina[0]),
				ic = new Disciplina("Introdução a Computação", 4,
						new Disciplina[0]),
				lpt = new Disciplina("Leitura e Produção de Textos", 4,
						new Disciplina[0]),
				vetorial = new Disciplina(
						"Álgebra Vetorial e Geometria Analítica", 4,
						new Disciplina[0]),
				calc2 = new Disciplina("Cálculo II", 4,
						new Disciplina[] { calc1 }),
				prog2 = new Disciplina("Programação II", 4, new Disciplina[] {
						prog1, labProg1, ic }),
				labProg2 = new Disciplina("Lab. de Programação II", 4,
						new Disciplina[] { prog1, labProg1, ic }),
				grafos = new Disciplina("Teoria dos Grafos", 2,
						new Disciplina[] { prog1, labProg1 }),
				discreta = new Disciplina("Matemática Discreta", 4,
						new Disciplina[0]),
				metodologia = new Disciplina("Metodologia Científica", 4,
						new Disciplina[0]),
				fisicaClassica = new Disciplina(
						"Fundamentos de Física Clássica", 4, new Disciplina[] {
								calc1, vetorial }),
				eda = new Disciplina("Estrutura de Dados e Algoritmos", 4,
						new Disciplina[] { prog2, labProg2, grafos }),
				leda = new Disciplina(
						"Lab. de Estrutura de Dados e Algoritmos", 4,
						new Disciplina[] { prog2, labProg2, grafos }),
				linear = new Disciplina("Álgebra Linear", 4,
						new Disciplina[] { vetorial }),
				prob = new Disciplina("Probabilidade e Estatística", 4,
						new Disciplina[] { calc2 }),
				tc = new Disciplina("Teoria da Computação", 4,
						new Disciplina[] { ic, discreta, grafos }),
				fisicaModerna = new Disciplina("Fundamentos de Física Moderna",
						4, new Disciplina[] { fisicaClassica, calc2 }),
				gi = new Disciplina("Gerência da Informação", 4,
						new Disciplina[0]),
				metodos = new Disciplina("Métodos Estatísticos", 4,
						new Disciplina[] { linear, prob }),
				plp = new Disciplina("Paradigmas de Linguagens de Programação",
						2, new Disciplina[] { eda, leda, tc }),
				logic = new Disciplina("Lógica Matemática", 4,
						new Disciplina[] { tc }),
				oac = new Disciplina(
						"Organização e Arquitetura de Computadores", 4,
						new Disciplina[] { eda, leda, fisicaModerna }),
				loac = new Disciplina(
						"Lab. de Organizacao e Arquitetura de Computadores", 4,
						new Disciplina[] { eda, leda, fisicaModerna }),
				es = new Disciplina("Engenharia de Software 1", 4,
						new Disciplina[] { labProg2, prog2, prob }),
				si1 = new Disciplina("Sistemas de Informação 1", 4,
						new Disciplina[] { gi }),
				atal = new Disciplina("Análise e Tecnicas de Algoritmos", 4,
						new Disciplina[] { leda, eda, logic, calc2 }),
				infosoc = new Disciplina("Informática e Sociedade", 2,
						new Disciplina[0]),
				direito = new Disciplina("Direito e Cidadania", 4,
						new Disciplina[0]),
				comp = new Disciplina("Compiladores", 4, new Disciplina[] {
						oac, loac, plp }),
				redes = new Disciplina("Redes de Computadores", 4,
						new Disciplina[] { oac, loac }),
				bd1 = new Disciplina("Banco de Dados 1", 4,
						new Disciplina[] { si1 }),
				si2 = new Disciplina("Sistemas de Informação 2", 4,
						new Disciplina[] { si1 }),
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
						bd1, si2 }),
				ia = new Disciplina("Inteligência Artificial 1", 4,
						new Disciplina[] { atal, plp, metodos }),
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
				op1 = new Disciplina(
						"Optativa 1", 4,
						new Disciplina[0]), 
				op2 = new Disciplina(
						"Optativa 2", 4,
						new Disciplina[0]), 
				op3 = new Disciplina(
						"Optativa 3", 4,
						new Disciplina[0]), 
				op4 = new Disciplina(
						"Optativa 4", 4,
						new Disciplina[0]), 
				op5 = new Disciplina(
						"Optativa 5", 4,
						new Disciplina[0]), 
				op6 = new Disciplina(
						"Optativa 6", 4,
						new Disciplina[0]), 
				op7 = new Disciplina(
						"Optativa 7", 4,
						new Disciplina[0]), 
				op8 = new Disciplina(
						"Optativa 8", 4,
						new Disciplina[0]), 
				op9 = new Disciplina(
						"Optativa 9", 4,
						new Disciplina[0]),
				op10 = new Disciplina(
						"Optativa 10", 4,
						new Disciplina[0]), 
				op11 = new Disciplina(
						"Optativa 11", 2,
						new Disciplina[0]) 
				};


		
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
	 * @return Vetor de Disciplina contendo todas as disciplinas do Curso de Ciencia da Computacao.
	 */
	// INFORMATION EXPERT: Possui a lista das disciplinas cadastradas
	public Disciplina[] getListaDeDisciplinas() {
		return this.listaDeDisciplinas;
	}

	/**
	 * Informa quantas Disciplinas foram cadastradas no Curriculo.
	 * @return Numero de Disciplinas em Curriculo.
	 */
	// INFORMATION EXPERT: Possui a lista das disciplinas cadastradas e deve saber sua quantidade.
	public int quantDeDisciplinasCadastradas() {
		return this.listaDeDisciplinas.length;
	}
	
	/**
	 * Pesquisa se existe uma Disciplina em Curriculo a partir de um objeto Disciplina.
	 * @param disciplina Disciplina a ser pesquisada.
	 * @return valor booleano true - se a Disciplina esta cadastrada no Curriculo ou false - caso contrario.
	 */
	// INFORMATION EXPERT: Contem a lista das disciplinas cadastradas e sabe as disciplinas que estao contidas nela.
	public boolean contains(Disciplina disciplina) {
		boolean resp = false;
			for (int i = 0; i < this.getListaDeDisciplinas().length; i++) {
				if (this.getListaDeDisciplinas()[i].equals(disciplina)) {
					resp = true;
				}
			}
		return resp;
	}
	
	/**
	* Adiciona em uma lista as disciplinas do primeiro periodo e retorna essa lista.
	* @return Uma lista de Disciplinas do primeiro periodo.
	*/
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde contem as disciplinas do primeiro periodo.
	public List<Disciplina> criaPrimeiroPeriodo() {
		disciplinasPrimeiroPeriodo.add(calc1);
		disciplinasPrimeiroPeriodo.add(vetorial);
		disciplinasPrimeiroPeriodo.add(lpt);
		disciplinasPrimeiroPeriodo.add(prog1);
		disciplinasPrimeiroPeriodo.add(ic);
		disciplinasPrimeiroPeriodo.add(labProg1);
		return disciplinasPrimeiroPeriodo;
	}
	/**
	* Adiciona em uma lista as disciplinas do segundo periodo e retorna essa lista.
	* @return Uma lista de Disciplinas do segundo periodo.
	*/
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde contem as disciplinas do segundo periodo.
	public List<Disciplina> criaSegundoPeriodo() {
		disciplinasSegundoPeriodo.add(calc2);
		disciplinasSegundoPeriodo.add(discreta);
		disciplinasSegundoPeriodo.add(infosoc);
		disciplinasSegundoPeriodo.add(prog2);
		disciplinasSegundoPeriodo.add(grafos);
		disciplinasSegundoPeriodo.add(fisicaClassica);
		disciplinasSegundoPeriodo.add(labProg2);
		return disciplinasSegundoPeriodo;
	}
	
	/**
	* Adiciona em uma lista as disciplinas do terceiro periodo e retorna essa lista.
	* @return Uma lista de Disciplinas do terceiro periodo.
	*/
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde contem as disciplinas do terceiro periodo.
	public List<Disciplina> criaTerceiroPeriodo() {
		disciplinasTerceiroPeriodo.add(linear);
		disciplinasTerceiroPeriodo.add(prob);
		disciplinasTerceiroPeriodo.add(tc);
		disciplinasTerceiroPeriodo.add(eda);
		disciplinasTerceiroPeriodo.add(fisicaModerna);
		disciplinasTerceiroPeriodo.add(gi);
		disciplinasTerceiroPeriodo.add(leda);
		return disciplinasTerceiroPeriodo;
	}
	
	/**
	* Adiciona em uma lista as disciplinas do quarto periodo e retorna essa lista.
	* @return Uma lista de Disciplinas do quarto periodo.
	*/
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde contem as disciplinas do quarto periodo.
	public List<Disciplina> criaQuartoPeriodo() {
		disciplinasQuartoPeriodo.add(direito);
		disciplinasQuartoPeriodo.add(plp);
		disciplinasQuartoPeriodo.add(logic);
		disciplinasQuartoPeriodo.add(oac);
		disciplinasQuartoPeriodo.add(si1);
		disciplinasQuartoPeriodo.add(loac);
		return disciplinasQuartoPeriodo;
	}
	
	/**
	* Adiciona em uma lista as disciplinas do quinto periodo e retorna essa lista.
	* @return Uma lista de Disciplinas do quinto periodo.
	*/
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde contem as disciplinas do quinto periodo.
	public List<Disciplina> criaQuintoPeriodo() {
		disciplinasQuintoPeriodo.add(infosoc);
		disciplinasQuintoPeriodo.add(metodos);
		disciplinasQuintoPeriodo.add(atal);
		disciplinasQuintoPeriodo.add(es);
		disciplinasQuintoPeriodo.add(bd1);
		return disciplinasQuintoPeriodo;
	}
	
	/**
	* Adiciona em uma lista as disciplinas do sexto periodo e retorna essa lista.
	* @return Uma lista de Disciplinas do sexto periodo.
	*/
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde contem as disciplinas do sexto periodo.
	public List<Disciplina> criaSextoPeriodo() {
		disciplinasSextoPeriodo.add(metodologia);
		disciplinasSextoPeriodo.add(si2);
		disciplinasSextoPeriodo.add(redes);
		disciplinasSextoPeriodo.add(labEs);
		disciplinasSextoPeriodo.add(op1);
		disciplinasSextoPeriodo.add(op2);
		return disciplinasSextoPeriodo;
	}
	
	/**
	* Adiciona em uma lista as disciplinas do setimo periodo e retorna essa lista.
	* @return Uma lista de Disciplinas do setimo periodo.
	*/
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde contem as disciplinas do setimo periodo.
	public List<Disciplina> criaSetimoPeriodo() {
		disciplinasSetimoPeriodo.add(so);
		disciplinasSetimoPeriodo.add(interRedes);
		disciplinasSetimoPeriodo.add(LabInterRedes);
		disciplinasSetimoPeriodo.add(bd2);
		disciplinasSetimoPeriodo.add(op3);
		disciplinasSetimoPeriodo.add(op4);
		return disciplinasSetimoPeriodo;
	}
	
	/**
	* Adiciona em uma lista as disciplinas do oitavo periodo e retorna essa lista.
	* @return Uma lista de Disciplinas do oitavo periodo.
	*/
	// INFORMATION EXPERT: Pois eh onde estao a lista de disciplinas que eh onde contem as disciplinas do oitavo periodo.
	public List<Disciplina> criaOitavoPeriodo() {
		disciplinasOitavoPeriodo.add(comp);
		disciplinasOitavoPeriodo.add(ia);
		disciplinasOitavoPeriodo.add(softNum);
		disciplinasOitavoPeriodo.add(sistemasDiscretos);
		disciplinasOitavoPeriodo.add(projeto1);
		disciplinasOitavoPeriodo.add(op5);
		disciplinasOitavoPeriodo.add(op6);
		return disciplinasOitavoPeriodo;
	}
	
	public List<Disciplina> criaNonoPeriodo() {
		disciplinasNonoPeriodo.add(projeto2);
		disciplinasNonoPeriodo.add(op7);
		disciplinasNonoPeriodo.add(op8);
		disciplinasNonoPeriodo.add(op9);
		disciplinasNonoPeriodo.add(op10);
		disciplinasNonoPeriodo.add(op11);
		return disciplinasNonoPeriodo;
	}
	/**
	 * Pesquisa se existe uma Disciplina em Curriculo a partir de um String.
	 * @param disciplina String da Disciplina a ser pesquisada.
	 * @return valor booleano true - se existe uma Disciplina com o mesmo nome em Curriculo ou false - caso contrario.
	 */
	// INFORMATION EXPERT: Pois eh onde esta a lista de disciplinas que podemos pesquisar.
	public Disciplina pesquisaDisciplina(String nomeDaDisciplina) throws Exception{
		for (int i = 0; i < this.quantDeDisciplinasCadastradas(); i++) {
			if (this.getListaDeDisciplinas()[i].getNomeDaDisciplina().equalsIgnoreCase(nomeDaDisciplina)) {
				return this.getListaDeDisciplinas()[i];
			}
		}
		throw new Exception("Nao existe essa disciplina");
	}

}

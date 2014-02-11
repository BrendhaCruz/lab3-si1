import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import models.Curriculo;
import models.Disciplina;
import models.Periodo;

import org.junit.Before;
import org.junit.Test;

import controllers.Planejamento;


public class TestaPeriodo {

	private Periodo primeiroPeriodo, segundoPeriodo, terceiroPeriodo, quartoPeriodo;
	private Disciplina calculo1, programacao1, labprogramacao1, ic, lpt, vetorial;
    private List<Disciplina> listaDisciplinas;
    private Curriculo curriculo;
    private Planejamento planejamento;

	@Before
	public void setUp() throws Exception {
		listaDisciplinas = new ArrayList<Disciplina>();
		curriculo = new Curriculo();
		planejamento = new Planejamento(curriculo);
		primeiroPeriodo = new Periodo(); 
		segundoPeriodo = new Periodo();
		terceiroPeriodo = new Periodo();
		quartoPeriodo = new Periodo();
		calculo1 = new Disciplina("Cálculo I", 4, new Disciplina[0]);
		programacao1 = new Disciplina("Programação I", 4, new Disciplina[0]);
		labprogramacao1 = new Disciplina("Lab. de Programação I", 4,new Disciplina[0]);
		ic = new Disciplina("Introdução a Computação", 4, new Disciplina[0]);
		lpt = new Disciplina("Leitura e Produção de Textos", 4, new Disciplina[0]);
		vetorial = new  Disciplina("Álgebra Vetorial e Geometria Analítica", 4, new Disciplina[0]);
		listaDisciplinas.add(calculo1);
		listaDisciplinas.add(programacao1);
		listaDisciplinas.add(labprogramacao1);
		listaDisciplinas.add(ic);
		listaDisciplinas.add(lpt);
		listaDisciplinas.add(vetorial);
		planejamento.adicionaPrimeiroPeriodo();
		primeiroPeriodo = planejamento.getPeriodos().get(0);
	}

	
	@Test
	public void deveRetornarAsCaracteristicasDeUmaDisciplinaQuandoPedido(){
		assertEquals("Cálculo I", calculo1.getNomeDaDisciplina());
		assertEquals(4, calculo1.getCreditos());
		assertEquals(new Disciplina[0], calculo1.getPreRequisitos());
	}
	
	@Test
	public void deveCalcularCreditos() {
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(calculo1));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(programacao1));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(ic));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(lpt));
		 assertEquals(24, primeiroPeriodo.calculaTotalDeCreditos());
		 try {
			planejamento.adicionaDisciplinaNoPeriodo(0, "Cálculo I");
		} catch (Exception e) {
			e.getMessage();
		}
		 assertEquals(24, primeiroPeriodo.calculaTotalDeCreditos());
	}
	
	@Test
	public void deveRetornarOMaximoEOMinimoDeCreditosNecessariosQuandoPedido(){
		assertEquals(16, planejamento.minimoDeCreditos());
		assertEquals(28, planejamento.maximoDeCreditos());
	}
	
	@Test
	public void deveRetornarOsPeriodosCadastradosQuandoPedido(){
		assertEquals(1, planejamento.getPeriodos().size());
		planejamento.adicionaPeriodo(segundoPeriodo);
		assertEquals(2, planejamento.getPeriodos().size());
		planejamento.removePeriodo(primeiroPeriodo);
		assertEquals(1, planejamento.getPeriodos().size());
		planejamento.removePeriodo(segundoPeriodo);
		assertEquals(0, planejamento.getPeriodos().size());
		
	}

	@Test
	public void deveFornecerListaDeDisciplinasPrimeiroprimeiroPeriodo() {
		assertEquals(listaDisciplinas.toString(), primeiroPeriodo.getListaDeDisciplinas().toString());
		assertEquals(listaDisciplinas.toString(), planejamento.getDisciplinasDadoPeriodo(0).toString());
	}
	
	@Test
	public void deveAdicionarDisciplinasDoSegundoPeriodo() {

		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Matemática Discreta"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Metodologia Científica"));
		assertEquals(2, segundoPeriodo.getListaDeDisciplinas().size());
		

		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Cálculo II"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Programação II"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Lab. de Programação II"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Teoria dos Grafos"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Fundamentos de Física Clássica"));
		assertEquals(7, segundoPeriodo.getListaDeDisciplinas().size());
		assertEquals(26, segundoPeriodo.calculaTotalDeCreditos());
		
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Gerência da Informação"));
		assertEquals(26, segundoPeriodo.calculaTotalDeCreditos());
	}
	
	
	@Test
	public void deveAdicionarDisciplinasNoPeriodoSelecionado(){
		planejamento.adicionaPeriodo(segundoPeriodo);
		assertEquals(0, segundoPeriodo.calculaTotalDeCreditos());
		 try {
			 	planejamento.adicionaDisciplinaNoPeriodo(1, "Cálculo II");
				
		} catch (Exception e) {
			e.getMessage();
		}

		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Metodologia Científica");
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Gerência da Informação");
		} catch (Exception e) {
			e.getMessage();
		}
		
		assertEquals(12, segundoPeriodo.calculaTotalDeCreditos());
	}
	
	@Test
	public void deveRemoverDisciplinasNoPeriodoSelecionadoEAsDisciplinasAsQuaisSaoPreRequisitosDelasQuandoPedido(){
				

		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Programação II"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Lab. de Programação II"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Teoria dos Grafos"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Matemática Discreta"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Fundamentos de Física Clássica"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Cálculo II"));

		planejamento.adicionaPeriodo(segundoPeriodo);
		
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Estrutura de Dados e Algoritmos"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Lab. de Estrutura de Dados e Algoritmos"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Fundamentos de Física Moderna"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Probabilidade e Estatística"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Teoria da Computação"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Álgebra Linear"));
		
		planejamento.adicionaPeriodo(terceiroPeriodo);
		
		quartoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Lógica Matemática"));
		quartoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Organização e Arquitetura de Computadores"));
		quartoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Lab. de Organizacao e Arquitetura de Computadores"));
		quartoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Engenharia de Software 1"));
		quartoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Métodos Estatísticos"));

		planejamento.adicionaPeriodo(quartoPeriodo);
		
		assertEquals(24, planejamento.getPeriodos().get(0).calculaTotalDeCreditos());
		assertEquals(22, planejamento.getPeriodos().get(1).calculaTotalDeCreditos());
		assertEquals(24, planejamento.getPeriodos().get(2).calculaTotalDeCreditos());
		assertEquals(20, planejamento.getPeriodos().get(3).calculaTotalDeCreditos());
		
		planejamento.removeDisciplinaDoPeriodo(3, "Métodos Estatísticos");
		
		assertEquals(16, planejamento.getPeriodos().get(3).calculaTotalDeCreditos());
		
		planejamento.removeDisciplinaDoPeriodo(1, "Fundamentos de Física Clássica");
		assertEquals(18, planejamento.getPeriodos().get(1).calculaTotalDeCreditos());
		assertEquals(20, planejamento.getPeriodos().get(2).calculaTotalDeCreditos());
		assertEquals(8, planejamento.getPeriodos().get(3).calculaTotalDeCreditos()); 
	}
}

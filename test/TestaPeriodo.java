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

	private Periodo primeiroPeriodo;
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
	}

	
	@Test
	public void deveRetornarAsCaracteristicasDeUmaDisciplinaQuandoPedido(){
		assertEquals("Cálculo I", calculo1.getNomeDaDisciplina());
		assertEquals(4, calculo1.getCreditos());
		assertEquals(new Disciplina[0], calculo1.getPreRequisitos());
	}
	
	@Test
	public void deveCalcularCreditos() {
		primeiroPeriodo = planejamento.periodo(0);
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
		assertEquals(1, planejamento.quantidadeDePeriodos());
		planejamento.adicionaPeriodo();
		assertEquals(2, planejamento.quantidadeDePeriodos());
		planejamento.removePeriodo(0);
		assertEquals(1, planejamento.quantidadeDePeriodos());
		planejamento.removePeriodo(0);
		assertEquals(0, planejamento.quantidadeDePeriodos());
		
	}

	@Test
	public void deveFornecerCaracteristicasDoDisciplinasPrimeiroprimeiroPeriodo() {
		primeiroPeriodo = planejamento.periodo(0);
		assertEquals(listaDisciplinas.toString(), primeiroPeriodo.getListaDeDisciplinas().toString());
		assertEquals(listaDisciplinas.toString(), planejamento.toStringDeUmDeterminadoPeriodo(0));
		try {
			this.planejamento.adicionaDisciplinaNoPeriodo(0, "Cálculo II");
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void deveAdicionarDisciplinasDoSegundoPeriodo() {
			planejamento.adicionaPeriodo();
		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Matemática Discreta");
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Metodologia Científica");
		} catch (Exception e) {
			e.getMessage();
		}
		
		planejamento.getDisciplinasDadoPeriodo(1);
		assertEquals(2, planejamento.quantidadeDeDisciplinasNoPeriodo(1));
		
		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Cálculo II");
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Programação II");
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Lab. de Programação II");
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Teoria dos Grafos");
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Fundamentos de Física Clássica");
		} catch (Exception e) {
			e.getMessage();
		}

		assertEquals(7, planejamento.quantidadeDeDisciplinasNoPeriodo(1));
		assertEquals(26, planejamento.getCreditosDeUmPeriodo(1));
		
		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Gerência da Informação");
		} catch (Exception e) {
			e.getMessage();
		}
		
		assertEquals(26, planejamento.getCreditosDeUmPeriodo(1));
	}
	
	
	@Test
	public void deveAdicionarDisciplinasNoPeriodoSelecionado(){
		planejamento.adicionaPeriodo();
		planejamento.getDisciplinasDadoPeriodo(1);
		assertEquals(0, planejamento.getCreditosDeUmPeriodo(1));
		
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
		
		assertEquals(12, planejamento.getCreditosDeUmPeriodo(1));
	}
	
	@Test
	public void deveRemoverDisciplinasNoPeriodoSelecionadoEAsDisciplinasAsQuaisSaoPreRequisitosDelasQuandoPedido(){
				
		planejamento.adicionaPeriodo();

		try {
			planejamento.adicionaDisciplinaNoPeriodo(1, "Matemática Discreta");
			planejamento.adicionaDisciplinaNoPeriodo(1, "Metodologia Científica");
			planejamento.adicionaDisciplinaNoPeriodo(1, "Cálculo II");
			planejamento.adicionaDisciplinaNoPeriodo(1, "Programação II");
			planejamento.adicionaDisciplinaNoPeriodo(1, "Lab. de Programação II");
			planejamento.adicionaDisciplinaNoPeriodo(1, "Teoria dos Grafos");
			planejamento.adicionaDisciplinaNoPeriodo(1, "Fundamentos de Física Clássica");
		} catch (Exception e) {
			e.getMessage();
		}

		
		planejamento.adicionaPeriodo();
		
		try {
			planejamento.adicionaDisciplinaNoPeriodo(2, "Estrutura de Dados e Algoritmos");
			planejamento.adicionaDisciplinaNoPeriodo(2, "Lab. de Estrutura de Dados e Algoritmos");
			planejamento.adicionaDisciplinaNoPeriodo(2, "Fundamentos de Física Moderna");
			planejamento.adicionaDisciplinaNoPeriodo(2, "Probabilidade e Estatística");
			planejamento.adicionaDisciplinaNoPeriodo(2, "Gerência da Informação");
			planejamento.adicionaDisciplinaNoPeriodo(2, "Teoria da Computação");
			planejamento.adicionaDisciplinaNoPeriodo(2, "Álgebra Linear");
		} catch (Exception e) {
			e.getMessage();
		}
		
		planejamento.adicionaPeriodo();
		
		try {
			planejamento.adicionaDisciplinaNoPeriodo(3, "Lógica Matemática");
			planejamento.adicionaDisciplinaNoPeriodo(3, "Organização e Arquitetura de Computadores");
			planejamento.adicionaDisciplinaNoPeriodo(3, "Lab. de Organizacao e Arquitetura de Computadores");
			planejamento.adicionaDisciplinaNoPeriodo(3, "Engenharia de Software 1");
			planejamento.adicionaDisciplinaNoPeriodo(3, "Métodos Estatísticos");
			planejamento.adicionaDisciplinaNoPeriodo(3, "Paradigmas de Linguagens de Programação");
			planejamento.adicionaDisciplinaNoPeriodo(3, "Sistemas de Informação 1");
		} catch (Exception e) {
			e.getMessage();
		}
		
		assertEquals(24, planejamento.periodo(0).calculaTotalDeCreditos());
		assertEquals(26, planejamento.periodo(1).calculaTotalDeCreditos());
		assertEquals(28, planejamento.periodo(2).calculaTotalDeCreditos());
		assertEquals(26, planejamento.periodo(3).calculaTotalDeCreditos());
		
		try {
			planejamento.removeDisciplinaDoPeriodo(3, "Métodos Estatísticos");
		} catch (Exception e) {
			e.getMessage();
		}
		
		assertEquals(22, planejamento.getCreditosDeUmPeriodo(3));
		
		try {
			planejamento.removeDisciplinaDoPeriodo(1, "Fundamentos de Física Clássica");
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(22, planejamento.periodo(1).calculaTotalDeCreditos());
		assertEquals(24, planejamento.periodo(2).calculaTotalDeCreditos());
		assertEquals(14, planejamento.periodo(3).calculaTotalDeCreditos());
		
		try {
			planejamento.removeDisciplinaDoPeriodo(0, "Cálculo I");
		} catch (Exception e) {
			e.getMessage();
		}
		
		}
		
}

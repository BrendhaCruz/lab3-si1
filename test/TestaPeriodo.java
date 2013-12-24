import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.AssertTrue;

import models.Curriculo;
import models.Disciplina;
import models.Periodo;
import models.Planejamento;

import org.junit.Before;
import org.junit.Test;


public class TestaPeriodo {

	private Periodo primeiroPeriodo, segundoPeriodo, terceiroPeriodo, quartoPeriodo;
	private Disciplina calculo1, programacao1, labprogramacao1, ic, lpt, vetorial;
    private List<Disciplina> listaDisciplinas;
    private Curriculo curriculo;
    private Planejamento planejamento;

	@Before
	public void setUp() throws Exception {
		listaDisciplinas = new ArrayList<Disciplina>();
		curriculo = Curriculo.creatNewInstance();
		planejamento = new Planejamento();
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
		calculo1.setPreRequisitos(new Disciplina[0]);
		programacao1.setPreRequisitos(new Disciplina[0]);
		labprogramacao1.setPreRequisitos(new Disciplina[0]);
		ic.setPreRequisitos(new Disciplina[0]);
		lpt.setPreRequisitos(new Disciplina[0]);
		vetorial.setPreRequisitos(new Disciplina[0]);
		listaDisciplinas.add(calculo1);
		listaDisciplinas.add(programacao1);
		listaDisciplinas.add(labprogramacao1);
		listaDisciplinas.add(ic);
		listaDisciplinas.add(lpt);
		listaDisciplinas.add(vetorial);
	}

	
	@Test
	public void deveRetornarAsCaracteristicasDeUmaDisciplinaQuandoPedido(){
		assertEquals("Cálculo I", calculo1.getNomeDaDisciplina());
		assertEquals(4, calculo1.getCreditos());
		assertEquals(new Disciplina[0], calculo1.getPreRequisitos());
		
		labprogramacao1.setStatus(true);
		assertEquals(true, labprogramacao1.getStatus());
	}
	
	@Test
	public void deveCalcularCreditos() {
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(calculo1));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(programacao1));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(ic));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(lpt));
		 primeiroPeriodo.criaPrimeiroPeriodo();
		 assertEquals(24, primeiroPeriodo.calculaTotalDeCreditos());
		 primeiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Cálculo I"));
		 assertEquals(24, primeiroPeriodo.calculaTotalDeCreditos());
	}
	
	@Test
	public void deveRetornarOMaximoEOMinimoDeCreditosNecessariosQuandoPedido(){
		assertEquals(16, planejamento.minimoDeCreditos());
		assertEquals(28, planejamento.maximoDeCreditos());
	}
	
	@Test
	public void deveRetornarOsPeriodosCadastradosQuandoPedido(){
		planejamento.adicionaPeriodo(primeiroPeriodo);
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
		primeiroPeriodo.criaPrimeiroPeriodo();
		planejamento.adicionaPeriodo(primeiroPeriodo);
		assertEquals(listaDisciplinas.toString(), primeiroPeriodo.getListaDeDisciplinas().toString());
		assertEquals(listaDisciplinas.toString(), planejamento.getDisciplinasDadoPeriodo(0).toString());
	}
	
	@Test
	public void deveAdicionarDisciplinasDoSegundoPeriodo() {
		curriculo.pesquisaDisciplina("Cálculo I").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Álgebra Vetorial e Geometria Analítica").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Lab. de Programação I").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Programação I").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Leitura e Produção de Textos").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Introdução a Computação").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		
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
		curriculo.pesquisaDisciplina("Cálculo I").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Álgebra Vetorial e Geometria Analítica").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Lab. de Programação I").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Programação I").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Leitura e Produção de Textos").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Introdução a Computação").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		planejamento.adicionaPeriodo(primeiroPeriodo);
		planejamento.adicionaPeriodo(segundoPeriodo);
		assertEquals(0, segundoPeriodo.calculaTotalDeCreditos());
		planejamento.adicionaDisciplinaNoPeriodo(1, "Cálculo II");
		planejamento.adicionaDisciplinaNoPeriodo(1, "Metodologia Científica");
		planejamento.adicionaDisciplinaNoPeriodo(1, "Gerência da Informação");
		
		assertEquals(12, segundoPeriodo.calculaTotalDeCreditos());
	}
	
	@Test
	public void deveRemoverDisciplinasNoPeriodoSelecionadoEAsDisciplinasAsQuaisSaoPreRequisitosDelasQuandoPedido(){
		

		planejamento.adicionaPrimeiroPeriodo();
		
		curriculo.pesquisaDisciplina("Cálculo I").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Álgebra Vetorial e Geometria Analítica").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Lab. de Programação I").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Programação I").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Leitura e Produção de Textos").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Introdução a Computação").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Programação II"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Lab. de Programação II"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Teoria dos Grafos"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Matemática Discreta"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Fundamentos de Física Clássica"));
		segundoPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Cálculo II"));
		
		curriculo.pesquisaDisciplina("Cálculo II").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Programação II").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Lab. de Programação II").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Teoria dos Grafos").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Fundamentos de Física Clássica").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Matemática Discreta").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		
		planejamento.adicionaPeriodo(segundoPeriodo);
		
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Estrutura de Dados e Algoritmos"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Lab. de Estrutura de Dados e Algoritmos"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Fundamentos de Física Moderna"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Probabilidade e Estatística"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Teoria da Computação"));
		terceiroPeriodo.adicionaDisciplinas(curriculo.pesquisaDisciplina("Álgebra Linear"));
		
		curriculo.pesquisaDisciplina("Álgebra Linear").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Estrutura de Dados e Algoritmos").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Lab. de Estrutura de Dados e Algoritmos").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Fundamentos de Física Moderna").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Probabilidade e Estatística").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		curriculo.pesquisaDisciplina("Teoria da Computação").setStatus(Disciplina.DISCIPLINA_CONCLUIDA);
		
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

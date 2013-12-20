import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import models.Disciplina;
import models.Periodo;
import models.Planejamento;

import org.junit.Before;
import org.junit.Test;


public class TestaPeriodo {

	private Periodo primeiroPeriodo;
	private Disciplina calculo1;
	private Disciplina programacao1;
	private Disciplina labprogramacao1;
	private Disciplina ic;
	private Disciplina lpt;
	private Disciplina vetorial;
    private List<Disciplina> listaDisciplinas;
    private Planejamento planejamento;

	@Before
	public void setUp() throws Exception {
		planejamento = new Planejamento();
		listaDisciplinas = new ArrayList<Disciplina>();
		primeiroPeriodo = new Periodo();
		calculo1 = new Disciplina("Cálculo I", 4, false);
		programacao1 = new Disciplina("Programacao I", 4, true);
		labprogramacao1 = new Disciplina("Lab. de Programação I", 4, true);
		ic = new Disciplina("Introdução a Computação", 4, false);
		lpt = new Disciplina("Leitura e Produção de Textos", 4, false);
		vetorial = new  Disciplina("Álgebra Vetorial e Geometria Analítica", 4, false);
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
	public void deveFornecerListaDeDisciplinasPrimeiroprimeiroPeriodo() {
		primeiroPeriodo.adicionaDisciplinas(calculo1);
		primeiroPeriodo.adicionaDisciplinas(programacao1);
		primeiroPeriodo.adicionaDisciplinas(labprogramacao1);
		primeiroPeriodo.adicionaDisciplinas(ic);
		primeiroPeriodo.adicionaDisciplinas(lpt);
		primeiroPeriodo.adicionaDisciplinas(vetorial);

		assertEquals(listaDisciplinas, primeiroPeriodo.getListaDeDisciplinas());

	}
	@Test
	public void deveRetornarAsCaracteristicasDeUmaDisciplinaQuandoPedido(){
		assertEquals("Cálculo I", calculo1.getNomeDaDisciplina());
		assertEquals(4, calculo1.getCreditos());
		assertEquals(new Disciplina[0], calculo1.getPreRequisitos());
		assertEquals(true, labprogramacao1.getStatus());
	}
	
	@Test
	public void deveCalcularCreditos() {
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(calculo1));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(programacao1));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(ic));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, primeiroPeriodo.creditosPorDisciplina(lpt));
		 primeiroPeriodo.adicionaDisciplinas(calculo1);
		 primeiroPeriodo.adicionaDisciplinas(programacao1);
		 primeiroPeriodo.adicionaDisciplinas(labprogramacao1);
		 primeiroPeriodo.adicionaDisciplinas(ic);
		 primeiroPeriodo.adicionaDisciplinas(lpt);
		 primeiroPeriodo.adicionaDisciplinas(vetorial);
		 assertEquals(24, primeiroPeriodo.calculaTotalDeCreditos());
	}
	
	@Test
	public void deveRetornarOMaximoEOMinimoDeCreditosNecessariosQuandoPedido(){
		assertEquals(16, planejamento.minimoDeCreditos());
		assertEquals(28, planejamento.maximoDeCreditos());
	}
	
	@Test
	public void deveRetornarOsPeriodosCadastradosQuandoPedido(){
		assertEquals(0, planejamento.getPeriodos().size());
		planejamento.adicionaPeriodo(primeiroPeriodo);
		assertEquals(1, planejamento.getPeriodos().size());
		planejamento.removePeriodo(primeiroPeriodo);
		assertEquals(0, planejamento.getPeriodos().size());
	}

}

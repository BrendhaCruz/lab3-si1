

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import classes.Disciplina;
import classes.Planejamento;

public class TestaPlanejamento {

	private Planejamento sistema;
	private Disciplina calculo1;
	private Disciplina programacao1;
	private Disciplina labprogramacao1;
	private Disciplina ic;
	private Disciplina lpt;
	private Disciplina vetorial;
	private Disciplina[] listaDisciplinas;

	@Before
	public void setUp() throws Exception {
		sistema = new Planejamento();
		calculo1 = new Disciplina("calculo1", 4);
		programacao1 = new Disciplina("programacao1", 4);
		labprogramacao1 = new Disciplina("labprogramacao1", 4);
		ic = new Disciplina("ic", 4);
		lpt = new Disciplina("lpt", 4);
		vetorial = new Disciplina("vetorial", 4);
		listaDisciplinas = new Disciplina[] { calculo1, programacao1,
				labprogramacao1, ic, lpt, vetorial };
	}

	@Test
	public void deveFornecerListaDeDisciplinasPrimeiroPeriodo() {
		sistema.adicionaDisciplinas(calculo1);
		sistema.adicionaDisciplinas(programacao1);
		sistema.adicionaDisciplinas(labprogramacao1);
		sistema.adicionaDisciplinas(ic);
		sistema.adicionaDisciplinas(lpt);
		sistema.adicionaDisciplinas(vetorial);

		assertArrayEquals(listaDisciplinas, sistema.listaDeDisciplinas());

	}

	@Test
	public void deveCalcularCreditos() {
		// assertEquals("Erro na quantidade de creditos da disciplina!", 4,
		// sistema.creditosPorDisciplina(calculo1));
		// assertEquals(24, sistema.calculaTotalDeCreditos());

	}

}

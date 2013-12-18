import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import classes.Disciplina;
import classes.Periodo;

public class TestaPlanejamento {

	private Periodo sistema1;
	private Disciplina calculo1;
	private Disciplina programacao1;
	private Disciplina labprogramacao1;
	private Disciplina ic;
	private Disciplina lpt;
	private Disciplina vetorial;
    private List<Disciplina> listaDisciplinas;

	@Before
	public void setUp() throws Exception {
	    sistema1 = new Periodo();
		calculo1 = new Disciplina("Cálculo I", 4);
		programacao1 = new Disciplina("Programacao I", 4);
		labprogramacao1 = new Disciplina("Lab. de Programação I", 4);
		ic = new Disciplina("Introdução a Computação", 4);
		lpt = new Disciplina("Leitura e Produção de Textos", 4);
		vetorial = new  Disciplina("Álgebra Vetorial e Geometria Analítica", 4);
		
	}

	@Test
	public void deveFornecerListaDeDisciplinasPrimeiroPeriodo() {
		sistema1.adicionaDisciplinas(calculo1);
		sistema1.adicionaDisciplinas(programacao1);
		sistema1.adicionaDisciplinas(labprogramacao1);
		sistema1.adicionaDisciplinas(ic);
		sistema1.adicionaDisciplinas(lpt);
		sistema1.adicionaDisciplinas(vetorial);

		assertEquals(listaDisciplinas, sistema1.getListaDeDisciplinas());

	}

	
	@Test
	public void deveCalcularCreditos() {
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, sistema1.creditosPorDisciplina(calculo1));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, sistema1.creditosPorDisciplina(programacao1));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, sistema1.creditosPorDisciplina(ic));
		 assertEquals("Erro na quantidade de creditos da disciplina!", 4, sistema1.creditosPorDisciplina(lpt));
		 sistema1.adicionaDisciplinas(calculo1);
		 sistema1.adicionaDisciplinas(programacao1);
		 sistema1.adicionaDisciplinas(labprogramacao1);
		 sistema1.adicionaDisciplinas(ic);
		 sistema1.adicionaDisciplinas(lpt);
		 sistema1.adicionaDisciplinas(vetorial);
		 assertEquals(24, sistema1.calculaTotalDeCreditos());

	}

}

import static org.junit.Assert.*;

import models.Curriculo;
import models.Disciplina;

import org.junit.Before;
import org.junit.Test;


public class TestaCurriculo {
	
	private Curriculo curriculo;
	private Disciplina calculo1, gi, calculo2;
	
	@Before
	public void criaCurriculo(){
		curriculo = new Curriculo();
		calculo1 = new Disciplina("Cálculo I", 4, new Disciplina[0]);
		gi = new Disciplina("Gerência da Informação", 4, new Disciplina[0]);
		calculo2 = new Disciplina("Cálculo II", 4, new Disciplina[]{calculo1});
	}

	@Test
	public void testaElementosDoCurriculo() {
		assertEquals(69, curriculo.quantDeDisciplinasCadastradas());
		assertEquals(69, curriculo.getListaDeDisciplinas().length);
		assertTrue(curriculo.contains(calculo1));
		try {
			assertEquals(calculo1, curriculo.pesquisaDisciplina("Cálculo I"));
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			assertTrue(curriculo.contains(curriculo.pesquisaDisciplina("Paradigmas de Linguagens de Programação")));
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			assertEquals(gi, curriculo.pesquisaDisciplina("Gerência da Informação"));
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			assertTrue(curriculo.contains(curriculo.pesquisaDisciplina("Sistemas de Informação 1")));
		} catch (Exception e) {
			e.getMessage();
		}		
		assertEquals(6,curriculo.criaPrimeiroPeriodo().size());
		assertEquals(7,curriculo.criaSegundoPeriodo().size());
		assertEquals(7,curriculo.criaTerceiroPeriodo().size());
		assertEquals(7,curriculo.criaQuartoPeriodo().size());
		assertEquals(7,curriculo.criaQuintoPeriodo().size());
		assertEquals(8,curriculo.criaSextoPeriodo().size());
		assertEquals(7,curriculo.criaSetimoPeriodo().size());
		assertEquals(6,curriculo.criaOitavoPeriodo().size());


	}

}

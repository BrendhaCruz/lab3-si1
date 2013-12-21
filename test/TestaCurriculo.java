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
		assertEquals(20, curriculo.quantDeDisciplinasCadastradas());
		assertEquals(true, curriculo.contains(calculo1));
		
		assertEquals(calculo1, curriculo.pesquisaDisciplina("Cálculo I"));
		
		assertEquals(gi, curriculo.pesquisaDisciplina("Gerência da Informação"));
	}

}

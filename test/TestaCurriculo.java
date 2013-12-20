import static org.junit.Assert.*;

import models.Curriculo;
import models.Disciplina;

import org.junit.Before;
import org.junit.Test;


public class TestaCurriculo {
	
	private Curriculo curriculo;
	private Disciplina calculo1, gi, prog2;
	
	@Before
	public void criaCurriculo(){
		curriculo = new Curriculo();
		calculo1 = new Disciplina("Cálculo I", 4, false);
		gi = new Disciplina("Gerência da Informação", 4, Disciplina.DISCIPLINA_PENDENTE);
		prog2 = new Disciplina("Programação II", 4, Disciplina.DISCIPLINA_PENDENTE);
		prog2.setPreRequisitos(new Disciplina[]{curriculo.preRequisito("Programação I"), curriculo.preRequisito("Lab. de Programação I"), curriculo.preRequisito("Introdução a Computação")});
	}

	@Test
	public void testaElementosDoCurriculo() {
		assertEquals(20, curriculo.quantDeDisciplinasCadastradas());
		assertEquals(true, curriculo.contains(calculo1));
		assertEquals(calculo1.getNomeDaDisciplina(), curriculo.preRequisito("Cálculo I").toString());
		assertEquals(gi.getNomeDaDisciplina(), curriculo.preRequisito("Gerência da Informação").toString());
		assertEquals(new Disciplina[0] ,curriculo.getListaDeDisciplinas()[0].getPreRequisitos());
		assertEquals(prog2.getPreRequisitos(), curriculo.getListaDeDisciplinas()[8].getPreRequisitos());
	}

}

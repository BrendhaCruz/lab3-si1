package classes;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;


import play.db.ebean.Model;
import play.db.ebean.Model.Finder;

//CONTROLLER: controlador do sistema
@Entity
public class Planejamento extends Model { 

	// CREATOR: Classe planejamento regista a lista das disciplina
    private List<Periodo> periodos;

	public Planejamento() {
		periodos = new ArrayList<Periodo>();
		criaDisciplinasPrimeiroPeriodo();
	}
	
	private void criaDisciplinasPrimeiroPeriodo() {
		Periodo  p = new Periodo ();
        p.adicionaDisciplinas(new Disciplina("Programacao I", 4));
        p.adicionaDisciplinas(new Disciplina("Lab. de Programação I", 4));
        p.adicionaDisciplinas(new Disciplina("Introdução a Computação", 4));
        p.adicionaDisciplinas(new Disciplina("Leitura e Produção de Textos", 4));
        p.adicionaDisciplinas(new Disciplina("Cálculo I", 4));
        p.adicionaDisciplinas(new Disciplina("Álgebra Vetorial e Geometria Analítica", 4));
        periodos.add(p);
	}
	
	public List<Periodo> getPeriodos() {
        return periodos;
}
	public void setPeriodos(List<Periodo> periodos) {
        this.periodos = periodos;
}


}


package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import play.db.ebean.Model;

@Entity
public class Periodo extends Model {
	
	// CREATOR: Periodo é feito de disciplinas
    private List<Disciplina> listaDisciplinas;
    private static final int CREDITOS_MINIMOS = 16;
    private static final int CREDITOS_MAXIMOS = 28;
    
    public Periodo(){
    	listaDisciplinas = new ArrayList<Disciplina>();
    }
    
 // INFORMATION EXPERT: Pois é onde está a lista de disciplinas
    public void adicionaDisciplinas(Disciplina disciplina) {
    	listaDisciplinas.add(disciplina);
    }
    
    //CREATOR: a classe Periodo guarda objetos do tipo Disciplina
    public List<Disciplina> getListaDeDisciplinas() {
		return listaDisciplinas;
	}
    
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.listaDisciplinas = disciplinas;
}
    
	
 // INFORMATION EXPERT: tem a lista de disciplinas para calcular o total de creditos
 	public int calculaTotalDeCreditos() {
 		int result = 0;
 		for (int i = 0; i < this.getListaDeDisciplinas().size(); i++) {
 			result += getListaDeDisciplinas().get(i).getCreditos();
 		}
 		return result;
 	}

	public Object creditosPorDisciplina(Disciplina disciplina) {
		return disciplina.getCreditos();
	}
	
	public int minimoDeCreditosPermitidos(){
		return CREDITOS_MINIMOS;
	}

}

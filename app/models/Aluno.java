package models;

import java.util.ArrayList;
import java.util.List;
import controllers.*;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;



public class Aluno extends Usuario {

	private static final long serialVersionUID = 7507028957989504099L;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Periodo> periodos;
	private int periodoAtual;

	
	public Aluno() {
	
	}

	public List<Periodo> getPeriodos() {
	        return this.periodos;
		}

	public int getPeriodoAtual() {
		return periodoAtual;
	}

	
}

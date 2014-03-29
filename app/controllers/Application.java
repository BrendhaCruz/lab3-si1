package controllers;

import models.*;
import play.mvc.*;
import play.data.*;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;


public class Application extends Controller {

	static Curriculo curriculo = new Curriculo();
	static NovaGrade novaGrade = new NovaGrade();
	static Planejamento sistemaPlanejamento = new Planejamento(curriculo);
	static NovoPlanejamento sistemaNovoPlanejamento = new NovoPlanejamento(novaGrade);
	static Form<Task> formTask = Form.form(Task.class);
	
	static String message = "";
	static Periodo periodo = new Periodo();


	public static Result index() {
				//if (session("sistema_planejamento_id") == null) {
				//	return redirect(routes.Acesso.login());
				//}
				//sistemaPlanejamento = Planejamento.find.byId(Long.parseLong(session("sistema_planejamento_id")));
				if (sistemaPlanejamento == null) {
					session().clear();
					return redirect(routes.Application.planejamentoDeCurso());
				}
				return redirect(routes.Application.planejamentoDeCurso());
		
	}

	public static Result planejamentoDeCurso() {
		if (sistemaPlanejamento.quantidadeDePeriodos() == 0) {
			try {
				sistemaPlanejamento.adicionaPrimeiroPeriodo();
				sistemaPlanejamento.adicionaSegundoPeriodo();
				sistemaPlanejamento.adicionaTerceiroPeriodo();
				sistemaPlanejamento.adicionaQuartoPeriodo();
				sistemaPlanejamento.adicionaQuintoPeriodo();
				sistemaPlanejamento.adicionaSextoPeriodo();
				sistemaPlanejamento.adicionaSetimoPeriodo();
				sistemaPlanejamento.adicionaOitavoPeriodo();
				message = "";
			} catch (Exception e) {
				message = e.getMessage();
			}
		}
		return ok(views.html.index.render(sistemaPlanejamento, formTask,
				message));
	}
	
	public static Result planejamentoDeCursoNovo() {
		if (sistemaNovoPlanejamento.quantidadeDePeriodos() == 0) {
			try {
				sistemaNovoPlanejamento.adicionaPrimeiroPeriodo();
				sistemaNovoPlanejamento.adicionaSegundoPeriodo();
				sistemaNovoPlanejamento.adicionaTerceiroPeriodo();
				sistemaNovoPlanejamento.adicionaQuartoPeriodo();
				sistemaNovoPlanejamento.adicionaQuintoPeriodo();
				sistemaNovoPlanejamento.adicionaSextoPeriodo();
				sistemaNovoPlanejamento.adicionaSetimoPeriodo();
				sistemaNovoPlanejamento.adicionaOitavoPeriodo();
				sistemaNovoPlanejamento.adicionaNonoPeriodo();
				message = "";
			} catch (Exception e) {
				message = e.getMessage();
			}
		}
		return ok(views.html.indexNovo.render(sistemaNovoPlanejamento, formTask,
				message));
	}
	
	public static Result grade() {
	     return ok(views.html.grade.render());
	    }
	
	public static Result planoNovo() {
		return redirect(routes.Application.planejamentoDeCursoNovo());
	    }
	
	public static Result mostraDisciplinas() {
	     return ok(views.html.disciplinas.render(sistemaPlanejamento));
	    }

	public static Result criaPeriodo() {
		try {
			if (sistemaPlanejamento.getPeriodos().size() >= 1) {
				sistemaPlanejamento.adicionaPeriodo();
			}
			message = "";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return redirect(routes.Application.planejamentoDeCurso());
	}

	public static Result adicionaDisciplinaEmPeriodo() throws Exception {
		Form<Task> form = formTask.bindFromRequest();
		int idPeriodo = form.get().getIdPeriodo();
		try {
			sistemaPlanejamento.adicionaDisciplinaNoPeriodo(idPeriodo, form
					.get().getInsereDisciplina());
			message = "";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return redirect(routes.Application.planejamentoDeCurso());
	}

	public static Result removeDisciplinaPeriodo() throws Exception {
		Form<Task> form = formTask.bindFromRequest();
		try {
			for (int i = 0; i < sistemaPlanejamento.getPeriodos().size(); i++) {
				if (sistemaPlanejamento.getDisciplinasDadoPeriodo(i).contains(sistemaPlanejamento.getCurriculo().pesquisaDisciplina(form.get().getInsereDisciplina()))) {
					sistemaPlanejamento.removeDisciplinaDoPeriodo(i, form.get().getInsereDisciplina());
				}
			}
			message = "";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return redirect(routes.Application.planejamentoDeCurso());
	}

}
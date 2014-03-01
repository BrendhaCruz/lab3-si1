package controllers;

import models.*;
import play.mvc.*;
import play.data.*;

public class Application extends Controller {

	static Curriculo curriculo = new Curriculo();
	static Planejamento sistemaPlanejamento = new Planejamento(curriculo);
	static Form<Task> formTask = Form.form(Task.class);
	static Periodo periodo = new Periodo();
	static String message = "";

	public static Result index() {
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
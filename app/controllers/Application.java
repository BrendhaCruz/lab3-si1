package controllers;

import models.*;
import play.mvc.*;
import play.data.*;

public class Application extends Controller {

	static Planejamento sistemaPlanejamento = new Planejamento();
	static Form<Task> formTask = Form.form(Task.class);
	static Periodo periodo = new Periodo();

	public static Result index() {
		return redirect(routes.Application.planejamentoDeCurso());
	}

	public static Result planejamentoDeCurso() {
		return ok(views.html.index.render(sistemaPlanejamento, formTask,
				sistemaPlanejamento.getPeriodos()));
	}

	public static Result criaPeriodo() {
		sistemaPlanejamento.adicionaPrimeiroPeriodo();
		if (sistemaPlanejamento.getPeriodos().size() >= 1) {
			sistemaPlanejamento.adicionaPeriodo();
		}
		return redirect(routes.Application.planejamentoDeCurso());
	}

	public static Result adicionaDisciplinaEmPeriodo() {
		Form<Task> form = formTask.bindFromRequest();
		int idPeriodo = form.get().getIdPeriodo() - 1;
		try {
		sistemaPlanejamento.adicionaDisciplinaNoPeriodo(idPeriodo, form.get()
				.getInsereDisciplina());
		}catch(Exception e) {
		     e.getMessage();
	     }
		return redirect(routes.Application.planejamentoDeCurso());
	}

}
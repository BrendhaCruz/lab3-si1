package controllers;

import models.*;
import play.mvc.*;
import play.data.*;

public class Application extends Controller {
	
    static Curriculo curriculo = new Curriculo();
	static Planejamento sistemaPlanejamento = new Planejamento(curriculo);
	static Form<Task> formTask = Form.form(Task.class);
	static Periodo periodo = new Periodo();

	public static Result index() {
		return redirect(routes.Application.planejamentoDeCurso());
	}

	public static Result planejamentoDeCurso() {
		try {
			sistemaPlanejamento.adicionaPrimeiroPeriodo();
		} catch (Exception e) {
			e.getMessage();
		}
		return ok(views.html.index.render(sistemaPlanejamento, formTask));
	}

	public static Result criaPeriodo() {
		try {
			if (sistemaPlanejamento.getPeriodos().size() >= 1) {
				sistemaPlanejamento.adicionaPeriodo();
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		return redirect(routes.Application.planejamentoDeCurso());
	}

	public static Result adicionaDisciplinaEmPeriodo()throws Exception {
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
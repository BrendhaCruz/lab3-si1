package controllers;

import models.*;
import play.mvc.*;
import play.data.*;

public class Application extends Controller {

        static Planejamento sistemaPlanejamento = new Planejamento();
        
        public static Result index() {
                return redirect(routes.Application.planejamentoDeCurso());
        }
        
        public static Result planejamentoDeCurso(){
                return ok(views.html.index.render(sistemaPlanejamento.getPeriodos()));
                
        }

}
package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.data.validation.Constraints.Required;
import static play.data.Form.*;
import play.db.ebean.Model.Finder;
import com.avaje.ebean.Ebean;



public class Acesso extends Controller {

   public static class Login {
       public String email;
        public String senha;
               
    }
	
	public static class Cadastro {
		private String email;
		private String nome;
		private String senha;
		
	}
			
	public static Result cadastro() {
		return ok(views.html.cadastraUsuario.render(Form.form(Cadastro.class)));
	}

		public static Result login() {
			return ok(views.html.logado.render(Form.form(Login.class)));
		}

		public static Result logout() {
		    session().clear();
		    flash("success", "Você não está mais logado!");
		    return redirect(routes.Acesso.login());
		}	
		
		public static Result authenticate() {
			Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
			if (loginForm.hasErrors()) {
				return badRequest(views.html.logado.render(loginForm));
			} else {
			session().clear();
			Usuario user = Usuario.findEmail(loginForm.get().email);
			if (user.getSistemaPlanejamento() == null) {
				session().clear();
			    flash("success", "Login Inválido!");
			    return redirect(routes.Acesso.login());
			}
            session("email", loginForm.get().email);
			session("sistema_planejamento_id", String.valueOf(user.getSistemaPlanejamento().getId()));
            return redirect(routes.Application.index());
        }
    }
		
		public static Result criaUsuario() {
			Form<Usuario> formUser = Form.form(Usuario.class).bindFromRequest();
			Usuario us = new Usuario(formUser.bindFromRequest().get().getEmail(), formUser.bindFromRequest().get().getNome(), 
	        formUser.bindFromRequest().get().getSenha());
			us.save();
			flash("sucesso", "cadastrou!");
			return redirect(routes.Application.index());
		}
		
		public static Result cadastraUsuario() {
			return ok(views.html.cadastraUsuario.render(Form.form(Cadastro.class)));
		}
		
		private static void cadastraVariosUsuarios(){

			if (Usuario.getFinder().all().isEmpty()) {
				int valor = 1;

				while (valor <= 30){
					
					String email = "user" + valor + "@email.com"; 
					String nome = "User " + valor;
					String senha = "senha" + valor;
					
					Usuario novoAluno =	new Usuario(nome, email, senha);
					novoAluno.setEmail(email);
					novoAluno.setNome(nome);
					novoAluno.setSenha(senha);
					
					novoAluno.save();

					valor ++;
				}
			}
		}
		
}

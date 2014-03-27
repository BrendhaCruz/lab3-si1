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

				
	public String validate() {
	    
	    return null;
	}
}
	
	public static class Cadastro {
		private String email;
		private String senha;
		private String nome;
		
	}


		public static Result login() {
			return ok(views.html.logado.render(Form.form(Login.class)));
		}

		public static Result authenticate() {
		    Form<Login> loginForm = form(Login.class).bindFromRequest();
		   // if (loginForm.hasErrors()) {
		   //    return badRequest(views.html.logado.render(loginForm));
		    //} else {
		        session().clear();
		        session("email", loginForm.get().email);
		        return redirect(routes.Application.index());
		   // }
		}

		public static Result logout() {
		    session().clear();
		    flash("success", "You've been logged out");
		    return redirect(routes.Acesso.login());
		}	
		
		public static Result criaUsuario() {
			Form<Cadastro> cadastroForm = Form.form(Cadastro.class).bindFromRequest();
			
			if (cadastroForm.hasErrors()) {
				return badRequest(views.html.cadastraUsuario.render(cadastroForm));
			} else {
				Usuario novoAluno =	new Usuario();
				novoAluno.setEmail(cadastroForm.get().email);
				novoAluno.setSenha(cadastroForm.get().senha);
				novoAluno.setNome(cadastroForm.get().nome);
				Ebean.save(novoAluno);
				return redirect(routes.Application.index());
			}
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
					
					Usuario novoAluno =	new Usuario();
					novoAluno.setEmail(email);
					novoAluno.setNome(nome);
					novoAluno.setSenha(senha);
					
					Ebean.save(novoAluno);

					valor ++;
				}
			}
		}
		
}

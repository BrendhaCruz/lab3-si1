package controllers;

import javax.persistence.*;
import javax.persistence.Table;
import play.db.ebean.*;
import controllers.*;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;


import com.avaje.ebean.*;

@Entity
@Table(name = "usuario")
public class Usuario extends Model {

    @Id
    @Constraints.Required
	@Formats.NonEmpty
    public  String email;
	@Constraints.Required
    public  String nome;
	@Constraints.Required
    public  String senha;
	
    public static Model.Finder<String,Usuario> find = new Finder<String,Usuario>(String.class, Usuario.class); 
    
    public  Usuario authenticate(String email, String senha) {
        return find.where().eq("email", email).eq("senha", senha).findUnique();
    }
    
    public static Finder<String, Usuario> getFinder() {
		return find;
	}
    
    public  Usuario findEmail(String email) {
		return find.where().eq("email", email).findUnique();
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == email) ? 0 : email.hashCode());
		result = prime * result + ((senha == senha) ? 0 : senha.hashCode());
		return result;
	}
	
}

package controllers;

import javax.persistence.*;
import javax.persistence.Table;
import play.db.ebean.*;
import controllers.*;
import models.*;
import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import com.avaje.ebean.*;

@Entity
public class Usuario extends Model implements Comparable <Usuario>{

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
    
	//@Required
    private  String email;
	
    //@Required
    private String nome;
	
    //@Required
    private String senha;
    //@OneToOne(cascade = CascadeType.ALL)	
    
	private Curriculo curriculo;// = new Curriculo();
    	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Planejamento sistemaPlanejamento;// = new Planejamento(curriculo);

	
    public static Model.Finder<String,Usuario> find = new Finder<String,Usuario>(String.class, Usuario.class); 
    //public static Finder<String,Usuario> find = new Finder<String,Usuario>(String.class, Usuario.class);
    
    public Usuario(String email, String nome, String senha) {
		this.email = email;
    	this.nome = nome;
		this.senha = senha;
		curriculo = new Curriculo();
		sistemaPlanejamento = new Planejamento();
	} 
	
	public Usuario() {
		
	} 
    
    public  Usuario authenticate(String email, String senha) {
        return find.where().eq("email", email).eq("senha", senha).findUnique();
    }
    
    public static Finder<String, Usuario> getFinder() {
		return find;
	}
    
    public static Usuario findEmail(String email) {
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
	
	public Planejamento getSistemaPlanejamento() {
		return sistemaPlanejamento;
	}

	public void getSistemaPlanejamento(Planejamento sistemaPlanejamento) {
		this.sistemaPlanejamento = sistemaPlanejamento;
	}
	
	public static void create(Usuario user) {
		user.save();
	}

    
	//public static void delete(String email) {
		//find.ref(email).delete();
	//}

    public static void atualizar(String email) {
		Usuario user = find.ref(email);
		user.update();
	}
	
	@Override
	public int compareTo(Usuario outro) {
		return getNome().compareTo(outro.getNome());
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

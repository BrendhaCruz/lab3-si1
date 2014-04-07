package models;

import play.data.validation.Constraints.Required;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.Entity;
import play.db.ebean.Model;
import com.avaje.ebean.*;
import play.db.ebean.*;

@Entity
public class Task extends Model {
    @Required
    public String inputNameDisc;
    
    @Required
    public int idPeriodo;
    
    public void setIdPeriodo(int idPeriodo) {
            this.idPeriodo = idPeriodo;
    }
    public int getIdPeriodo() {
            return idPeriodo;
    }
    
    public void setInsereDisciplina(String inputNameDisc) {
            this.inputNameDisc = inputNameDisc;
    }
    
    public String getInsereDisciplina() {
            return inputNameDisc;
    }
    
    


}

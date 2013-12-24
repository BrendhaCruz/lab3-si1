package models;

import play.data.validation.Constraints.Required;

public class Task {
    @Required
    private String Nomedisciplina;
    
    @Required
    private int idPeriodo;
    
    public void setIdPeriodo(int idPeriodo) {
            this.idPeriodo = idPeriodo;
    }
    public int getIdPeriodo() {
            return idPeriodo;
    }
    
    public void setInsereDisciplina(String insereDisciplina) {
            this.Nomedisciplina = insereDisciplina;
    }
    
    public String getInsereDisciplina() {
            return Nomedisciplina;
    }
    
    


}

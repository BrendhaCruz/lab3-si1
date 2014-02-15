package models;

import play.data.validation.Constraints.Required;

public class Task {
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

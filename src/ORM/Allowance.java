package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Allowance generated by hbm2java
 */
public class Allowance  implements java.io.Serializable {


     private Integer idAllowance;
     private String type;
     private Set allowanceHasEmployeeses = new HashSet(0);

    public Allowance() {
    }

    public Allowance(String type, Set allowanceHasEmployeeses) {
       this.type = type;
       this.allowanceHasEmployeeses = allowanceHasEmployeeses;
    }
   
    public Integer getIdAllowance() {
        return this.idAllowance;
    }
    
    public void setIdAllowance(Integer idAllowance) {
        this.idAllowance = idAllowance;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set getAllowanceHasEmployeeses() {
        return this.allowanceHasEmployeeses;
    }
    
    public void setAllowanceHasEmployeeses(Set allowanceHasEmployeeses) {
        this.allowanceHasEmployeeses = allowanceHasEmployeeses;
    }




}



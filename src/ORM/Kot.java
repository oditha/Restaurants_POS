package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Kot generated by hbm2java
 */
public class Kot  implements java.io.Serializable {


     private Integer idKot;
     private Invoice invoice;
     private String kotno;
     private String date;
     private String createdBy;
     private String isDelete;
     private Set kotitemses = new HashSet(0);

    public Kot() {
    }

	
    public Kot(Invoice invoice) {
        this.invoice = invoice;
    }
    public Kot(Invoice invoice, String kotno, String date, String createdBy, String isDelete, Set kotitemses) {
       this.invoice = invoice;
       this.kotno = kotno;
       this.date = date;
       this.createdBy = createdBy;
       this.isDelete = isDelete;
       this.kotitemses = kotitemses;
    }
   
    public Integer getIdKot() {
        return this.idKot;
    }
    
    public void setIdKot(Integer idKot) {
        this.idKot = idKot;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public String getKotno() {
        return this.kotno;
    }
    
    public void setKotno(String kotno) {
        this.kotno = kotno;
    }
    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public Set getKotitemses() {
        return this.kotitemses;
    }
    
    public void setKotitemses(Set kotitemses) {
        this.kotitemses = kotitemses;
    }




}


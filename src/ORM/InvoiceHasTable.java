package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1



/**
 * InvoiceHasTable generated by hbm2java
 */
public class InvoiceHasTable  implements java.io.Serializable {


     private Integer idIt;
     private Invoice invoice;
     private Table table;

    public InvoiceHasTable() {
    }

    public InvoiceHasTable(Invoice invoice, Table table) {
       this.invoice = invoice;
       this.table = table;
    }
   
    public Integer getIdIt() {
        return this.idIt;
    }
    
    public void setIdIt(Integer idIt) {
        this.idIt = idIt;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public Table getTable() {
        return this.table;
    }
    
    public void setTable(Table table) {
        this.table = table;
    }




}


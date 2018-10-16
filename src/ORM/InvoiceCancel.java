package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1



/**
 * InvoiceCancel generated by hbm2java
 */
public class InvoiceCancel  implements java.io.Serializable {


     private Integer idInvoiceCance;
     private Invoice invoice;
     private String cancelDate;
     private String cancelTime;
     private String reson;
     private String createdBy;
     private String isDelete;

    public InvoiceCancel() {
    }

	
    public InvoiceCancel(Invoice invoice) {
        this.invoice = invoice;
    }
    public InvoiceCancel(Invoice invoice, String cancelDate, String cancelTime, String reson, String createdBy, String isDelete) {
       this.invoice = invoice;
       this.cancelDate = cancelDate;
       this.cancelTime = cancelTime;
       this.reson = reson;
       this.createdBy = createdBy;
       this.isDelete = isDelete;
    }
   
    public Integer getIdInvoiceCance() {
        return this.idInvoiceCance;
    }
    
    public void setIdInvoiceCance(Integer idInvoiceCance) {
        this.idInvoiceCance = idInvoiceCance;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public String getCancelDate() {
        return this.cancelDate;
    }
    
    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }
    public String getCancelTime() {
        return this.cancelTime;
    }
    
    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime;
    }
    public String getReson() {
        return this.reson;
    }
    
    public void setReson(String reson) {
        this.reson = reson;
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




}



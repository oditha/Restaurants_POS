package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1



/**
 * InvoiceDailyOrderNo generated by hbm2java
 */
public class InvoiceDailyOrderNo  implements java.io.Serializable {


     private Integer idInvoiceDailyOrderNo;
     private Invoice invoice;
     private String daliyNo;
     private String invoiceDate;
     private String isDelete;

    public InvoiceDailyOrderNo() {
    }

	
    public InvoiceDailyOrderNo(Invoice invoice) {
        this.invoice = invoice;
    }
    public InvoiceDailyOrderNo(Invoice invoice, String daliyNo, String invoiceDate, String isDelete) {
       this.invoice = invoice;
       this.daliyNo = daliyNo;
       this.invoiceDate = invoiceDate;
       this.isDelete = isDelete;
    }
   
    public Integer getIdInvoiceDailyOrderNo() {
        return this.idInvoiceDailyOrderNo;
    }
    
    public void setIdInvoiceDailyOrderNo(Integer idInvoiceDailyOrderNo) {
        this.idInvoiceDailyOrderNo = idInvoiceDailyOrderNo;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public String getDaliyNo() {
        return this.daliyNo;
    }
    
    public void setDaliyNo(String daliyNo) {
        this.daliyNo = daliyNo;
    }
    public String getInvoiceDate() {
        return this.invoiceDate;
    }
    
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }




}



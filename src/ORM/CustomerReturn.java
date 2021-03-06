package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1



/**
 * CustomerReturn generated by hbm2java
 */
public class CustomerReturn  implements java.io.Serializable {


     private Integer idCustomerReturn;
     private Customer customer;
     private Invoice invoice;
     private InvoiceItems invoiceItems;
     private String returnDate;
     private String returnTime;
     private String returnReson;
     private String qty;
     private String returnTerm;
     private String isDelete;
     private String createdBy;

    public CustomerReturn() {
    }

	
    public CustomerReturn(Customer customer, Invoice invoice, InvoiceItems invoiceItems) {
        this.customer = customer;
        this.invoice = invoice;
        this.invoiceItems = invoiceItems;
    }
    public CustomerReturn(Customer customer, Invoice invoice, InvoiceItems invoiceItems, String returnDate, String returnTime, String returnReson, String qty, String returnTerm, String isDelete, String createdBy) {
       this.customer = customer;
       this.invoice = invoice;
       this.invoiceItems = invoiceItems;
       this.returnDate = returnDate;
       this.returnTime = returnTime;
       this.returnReson = returnReson;
       this.qty = qty;
       this.returnTerm = returnTerm;
       this.isDelete = isDelete;
       this.createdBy = createdBy;
    }
   
    public Integer getIdCustomerReturn() {
        return this.idCustomerReturn;
    }
    
    public void setIdCustomerReturn(Integer idCustomerReturn) {
        this.idCustomerReturn = idCustomerReturn;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public InvoiceItems getInvoiceItems() {
        return this.invoiceItems;
    }
    
    public void setInvoiceItems(InvoiceItems invoiceItems) {
        this.invoiceItems = invoiceItems;
    }
    public String getReturnDate() {
        return this.returnDate;
    }
    
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public String getReturnTime() {
        return this.returnTime;
    }
    
    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }
    public String getReturnReson() {
        return this.returnReson;
    }
    
    public void setReturnReson(String returnReson) {
        this.returnReson = returnReson;
    }
    public String getQty() {
        return this.qty;
    }
    
    public void setQty(String qty) {
        this.qty = qty;
    }
    public String getReturnTerm() {
        return this.returnTerm;
    }
    
    public void setReturnTerm(String returnTerm) {
        this.returnTerm = returnTerm;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }




}



package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Supplier generated by hbm2java
 */
public class Supplier  implements java.io.Serializable {


     private Integer idSupplier;
     private String supplierName;
     private String contactNo1;
     private String contactNo2;
     private String address1;
     private String address2;
     private String city;
     private String isDelete;
     private Set rowItemGrnPayments = new HashSet(0);
     private Set rawGrns = new HashSet(0);
     private Set supplierReturns = new HashSet(0);

    public Supplier() {
    }

    public Supplier(String supplierName, String contactNo1, String contactNo2, String address1, String address2, String city, String isDelete, Set rowItemGrnPayments, Set rawGrns, Set supplierReturns) {
       this.supplierName = supplierName;
       this.contactNo1 = contactNo1;
       this.contactNo2 = contactNo2;
       this.address1 = address1;
       this.address2 = address2;
       this.city = city;
       this.isDelete = isDelete;
       this.rowItemGrnPayments = rowItemGrnPayments;
       this.rawGrns = rawGrns;
       this.supplierReturns = supplierReturns;
    }
   
    public Integer getIdSupplier() {
        return this.idSupplier;
    }
    
    public void setIdSupplier(Integer idSupplier) {
        this.idSupplier = idSupplier;
    }
    public String getSupplierName() {
        return this.supplierName;
    }
    
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getContactNo1() {
        return this.contactNo1;
    }
    
    public void setContactNo1(String contactNo1) {
        this.contactNo1 = contactNo1;
    }
    public String getContactNo2() {
        return this.contactNo2;
    }
    
    public void setContactNo2(String contactNo2) {
        this.contactNo2 = contactNo2;
    }
    public String getAddress1() {
        return this.address1;
    }
    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    public String getAddress2() {
        return this.address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public Set getRowItemGrnPayments() {
        return this.rowItemGrnPayments;
    }
    
    public void setRowItemGrnPayments(Set rowItemGrnPayments) {
        this.rowItemGrnPayments = rowItemGrnPayments;
    }
    public Set getRawGrns() {
        return this.rawGrns;
    }
    
    public void setRawGrns(Set rawGrns) {
        this.rawGrns = rawGrns;
    }
    public Set getSupplierReturns() {
        return this.supplierReturns;
    }
    
    public void setSupplierReturns(Set supplierReturns) {
        this.supplierReturns = supplierReturns;
    }




}



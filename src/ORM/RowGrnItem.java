package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * RowGrnItem generated by hbm2java
 */
public class RowGrnItem  implements java.io.Serializable {


     private Integer idRowGrnItem;
     private RawGrn rawGrn;
     private RawItems rawItems;
     private Double rowItemQty;
     private Double grossPrice;
     private Double rowItemTotal;
     private String rowGrnItemUnit;
     private Set supplierReturns = new HashSet(0);

    public RowGrnItem() {
    }

	
    public RowGrnItem(RawGrn rawGrn, RawItems rawItems) {
        this.rawGrn = rawGrn;
        this.rawItems = rawItems;
    }
    public RowGrnItem(RawGrn rawGrn, RawItems rawItems, Double rowItemQty, Double grossPrice, Double rowItemTotal, String rowGrnItemUnit, Set supplierReturns) {
       this.rawGrn = rawGrn;
       this.rawItems = rawItems;
       this.rowItemQty = rowItemQty;
       this.grossPrice = grossPrice;
       this.rowItemTotal = rowItemTotal;
       this.rowGrnItemUnit = rowGrnItemUnit;
       this.supplierReturns = supplierReturns;
    }
   
    public Integer getIdRowGrnItem() {
        return this.idRowGrnItem;
    }
    
    public void setIdRowGrnItem(Integer idRowGrnItem) {
        this.idRowGrnItem = idRowGrnItem;
    }
    public RawGrn getRawGrn() {
        return this.rawGrn;
    }
    
    public void setRawGrn(RawGrn rawGrn) {
        this.rawGrn = rawGrn;
    }
    public RawItems getRawItems() {
        return this.rawItems;
    }
    
    public void setRawItems(RawItems rawItems) {
        this.rawItems = rawItems;
    }
    public Double getRowItemQty() {
        return this.rowItemQty;
    }
    
    public void setRowItemQty(Double rowItemQty) {
        this.rowItemQty = rowItemQty;
    }
    public Double getGrossPrice() {
        return this.grossPrice;
    }
    
    public void setGrossPrice(Double grossPrice) {
        this.grossPrice = grossPrice;
    }
    public Double getRowItemTotal() {
        return this.rowItemTotal;
    }
    
    public void setRowItemTotal(Double rowItemTotal) {
        this.rowItemTotal = rowItemTotal;
    }
    public String getRowGrnItemUnit() {
        return this.rowGrnItemUnit;
    }
    
    public void setRowGrnItemUnit(String rowGrnItemUnit) {
        this.rowGrnItemUnit = rowGrnItemUnit;
    }
    public Set getSupplierReturns() {
        return this.supplierReturns;
    }
    
    public void setSupplierReturns(Set supplierReturns) {
        this.supplierReturns = supplierReturns;
    }




}



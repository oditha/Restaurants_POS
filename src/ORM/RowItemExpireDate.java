package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1



/**
 * RowItemExpireDate generated by hbm2java
 */
public class RowItemExpireDate  implements java.io.Serializable {


     private Integer idRowItemExpireDate;
     private RawItems rawItems;
     private String expireDate;
     private String manufactureDate;
     private String batchNo;
     private String isDelete;

    public RowItemExpireDate() {
    }

	
    public RowItemExpireDate(RawItems rawItems) {
        this.rawItems = rawItems;
    }
    public RowItemExpireDate(RawItems rawItems, String expireDate, String manufactureDate, String batchNo, String isDelete) {
       this.rawItems = rawItems;
       this.expireDate = expireDate;
       this.manufactureDate = manufactureDate;
       this.batchNo = batchNo;
       this.isDelete = isDelete;
    }
   
    public Integer getIdRowItemExpireDate() {
        return this.idRowItemExpireDate;
    }
    
    public void setIdRowItemExpireDate(Integer idRowItemExpireDate) {
        this.idRowItemExpireDate = idRowItemExpireDate;
    }
    public RawItems getRawItems() {
        return this.rawItems;
    }
    
    public void setRawItems(RawItems rawItems) {
        this.rawItems = rawItems;
    }
    public String getExpireDate() {
        return this.expireDate;
    }
    
    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    public String getManufactureDate() {
        return this.manufactureDate;
    }
    
    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public String getBatchNo() {
        return this.batchNo;
    }
    
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }




}


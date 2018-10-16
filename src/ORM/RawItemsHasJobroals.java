package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1



/**
 * RawItemsHasJobroals generated by hbm2java
 */
public class RawItemsHasJobroals  implements java.io.Serializable {


     private Integer id;
     private Jobroals jobroals;
     private RawItems rawItems;
     private Double commisonPerItem;
     private String isDelete;

    public RawItemsHasJobroals() {
    }

	
    public RawItemsHasJobroals(Jobroals jobroals, RawItems rawItems) {
        this.jobroals = jobroals;
        this.rawItems = rawItems;
    }
    public RawItemsHasJobroals(Jobroals jobroals, RawItems rawItems, Double commisonPerItem, String isDelete) {
       this.jobroals = jobroals;
       this.rawItems = rawItems;
       this.commisonPerItem = commisonPerItem;
       this.isDelete = isDelete;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Jobroals getJobroals() {
        return this.jobroals;
    }
    
    public void setJobroals(Jobroals jobroals) {
        this.jobroals = jobroals;
    }
    public RawItems getRawItems() {
        return this.rawItems;
    }
    
    public void setRawItems(RawItems rawItems) {
        this.rawItems = rawItems;
    }
    public Double getCommisonPerItem() {
        return this.commisonPerItem;
    }
    
    public void setCommisonPerItem(Double commisonPerItem) {
        this.commisonPerItem = commisonPerItem;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }




}



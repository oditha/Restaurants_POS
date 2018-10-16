package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1



/**
 * PromotionItems generated by hbm2java
 */
public class PromotionItems  implements java.io.Serializable {


     private Integer idPromotionItems;
     private Promotion promotion;
     private RawItems rawItems;
     private String isDelete;

    public PromotionItems() {
    }

	
    public PromotionItems(Promotion promotion, RawItems rawItems) {
        this.promotion = promotion;
        this.rawItems = rawItems;
    }
    public PromotionItems(Promotion promotion, RawItems rawItems, String isDelete) {
       this.promotion = promotion;
       this.rawItems = rawItems;
       this.isDelete = isDelete;
    }
   
    public Integer getIdPromotionItems() {
        return this.idPromotionItems;
    }
    
    public void setIdPromotionItems(Integer idPromotionItems) {
        this.idPromotionItems = idPromotionItems;
    }
    public Promotion getPromotion() {
        return this.promotion;
    }
    
    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }
    public RawItems getRawItems() {
        return this.rawItems;
    }
    
    public void setRawItems(RawItems rawItems) {
        this.rawItems = rawItems;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }




}



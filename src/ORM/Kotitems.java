package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1



/**
 * Kotitems generated by hbm2java
 */
public class Kotitems  implements java.io.Serializable {


     private Integer idKotitems;
     private Kot kot;
     private RawItems rawItems;
     private String qty;

    public Kotitems() {
    }

	
    public Kotitems(Kot kot, RawItems rawItems) {
        this.kot = kot;
        this.rawItems = rawItems;
    }
    public Kotitems(Kot kot, RawItems rawItems, String qty) {
       this.kot = kot;
       this.rawItems = rawItems;
       this.qty = qty;
    }
   
    public Integer getIdKotitems() {
        return this.idKotitems;
    }
    
    public void setIdKotitems(Integer idKotitems) {
        this.idKotitems = idKotitems;
    }
    public Kot getKot() {
        return this.kot;
    }
    
    public void setKot(Kot kot) {
        this.kot = kot;
    }
    public RawItems getRawItems() {
        return this.rawItems;
    }
    
    public void setRawItems(RawItems rawItems) {
        this.rawItems = rawItems;
    }
    public String getQty() {
        return this.qty;
    }
    
    public void setQty(String qty) {
        this.qty = qty;
    }




}



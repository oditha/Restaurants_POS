package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Orders generated by hbm2java
 */
public class Orders  implements java.io.Serializable {


     private Integer idOrders;
     private Customer customer;
     private String orderDate;
     private String deliveryDate;
     private String orderNo;
     private Double orderTotal;
     private String isDelete;
     private Double advance;
     private Set orderItemses = new HashSet(0);
     private Set orderStatuses = new HashSet(0);

    public Orders() {
    }

	
    public Orders(Customer customer) {
        this.customer = customer;
    }
    public Orders(Customer customer, String orderDate, String deliveryDate, String orderNo, Double orderTotal, String isDelete, Double advance, Set orderItemses, Set orderStatuses) {
       this.customer = customer;
       this.orderDate = orderDate;
       this.deliveryDate = deliveryDate;
       this.orderNo = orderNo;
       this.orderTotal = orderTotal;
       this.isDelete = isDelete;
       this.advance = advance;
       this.orderItemses = orderItemses;
       this.orderStatuses = orderStatuses;
    }
   
    public Integer getIdOrders() {
        return this.idOrders;
    }
    
    public void setIdOrders(Integer idOrders) {
        this.idOrders = idOrders;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public String getOrderDate() {
        return this.orderDate;
    }
    
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public String getDeliveryDate() {
        return this.deliveryDate;
    }
    
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public String getOrderNo() {
        return this.orderNo;
    }
    
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    public Double getOrderTotal() {
        return this.orderTotal;
    }
    
    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public Double getAdvance() {
        return this.advance;
    }
    
    public void setAdvance(Double advance) {
        this.advance = advance;
    }
    public Set getOrderItemses() {
        return this.orderItemses;
    }
    
    public void setOrderItemses(Set orderItemses) {
        this.orderItemses = orderItemses;
    }
    public Set getOrderStatuses() {
        return this.orderStatuses;
    }
    
    public void setOrderStatuses(Set orderStatuses) {
        this.orderStatuses = orderStatuses;
    }




}


package edu.mum.productcrud.domin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
    @Id
    @Column(name="product_Id")
    String productId;
    @Column(name="product_name")
    String productName;
    Integer Quantity;
    @Column(name="product_price")
    Integer unitPrice;

    public Product() {

    }

    public Product(String productId, String productName, Integer quantity, Integer unitPrice) {
        this.productId = productId;
        this.productName = productName;
        Quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", Quantity=" + Quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

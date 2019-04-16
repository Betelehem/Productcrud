package edu.mum.productcrud.domin;

import javax.persistence.*;

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

    @OneToOne
    @JoinColumn(name="category_id")
    Category category;

    public Product() {

    }

    public Product(String productId, String productName, Integer quantity, Integer unitPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        Quantity = quantity;
        this.unitPrice = unitPrice;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

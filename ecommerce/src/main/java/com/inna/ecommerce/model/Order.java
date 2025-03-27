package com.inna.ecommerce.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date orderDate;

    @ElementCollection
    private List<String> productList;

    private double totalAmount;

    private String status;

    // Costruttore vuoto richiesto da JPA
    public Order() {
    }

    // Costruttore completo
    public Order(Date orderDate, List<String> productList, double totalAmount, String status) {
        this.orderDate = orderDate;
        this.productList = productList;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString()
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", productList=" + productList +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}

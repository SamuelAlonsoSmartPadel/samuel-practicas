package org.example.proyectozara_smartpadel.domain.model;

import java.time.LocalDateTime;

public class Price {
    private Long brandId;
    private int priceList;
    private LocalDateTime startDate;
    private Long productId;
    private int priority;
    private LocalDateTime endDate;
    private double price;
    private String curr;

    public Price(Long brandId, int priceList, LocalDateTime startDate, Long productId, int priority, LocalDateTime endDate, double price, String curr) {
        this.brandId = brandId;
        this.priceList = priceList;
        this.startDate = startDate;
        this.productId = productId;
        this.priority = priority;
        this.endDate = endDate;
        this.price = price;
        this.curr = curr;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public int getPriceList() {
        return priceList;
    }

    public void setPriceList(int priceList) {
        this.priceList = priceList;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr;
    }
}

package com.chui.tmall.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @ManyToOne
    @JoinColumn(name = "cid")
    private Category category;

    private String name;
    private String subTitle;
    private float originalPrice;
    private float promotePrice;
    private int stock;
    private Date createDate;
    private int onSale;


    @Transient //忽略此字段，不做映射
    private ProductImage firstProductImage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public float getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(float promotePrice) {
        this.promotePrice = promotePrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public ProductImage getFirstProductImage() {
        return firstProductImage;
    }

    public void setFirstProductImage(ProductImage firstProductImage) {
        this.firstProductImage = firstProductImage;
    }

    public int getOnSale() {
        return onSale;
    }

    public void setOnSale(int onSale) {
        this.onSale = onSale;
    }
}

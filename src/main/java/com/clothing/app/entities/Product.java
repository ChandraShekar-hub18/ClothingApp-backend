package com.clothing.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Set;


@Entity
public class Product {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(name = "\"description\"", columnDefinition = "longtext")
    private String description;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal price;

    @Column
    private Integer stock;

    @Column
    private OffsetDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private Set<Orderitem> productOrderitems;

    @OneToMany(mappedBy = "product")
    private Set<Productimage> productProductimages;

    @OneToMany(mappedBy = "product")
    private Set<Review> productReviews;

    @OneToMany(mappedBy = "product")
    private Set<Shoppingcart> productShoppingcarts;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(final Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(final Integer stock) {
        this.stock = stock;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(final Category category) {
        this.category = category;
    }

    public Set<Orderitem> getProductOrderitems() {
        return productOrderitems;
    }

    public void setProductOrderitems(final Set<Orderitem> productOrderitems) {
        this.productOrderitems = productOrderitems;
    }

    public Set<Productimage> getProductProductimages() {
        return productProductimages;
    }

    public void setProductProductimages(final Set<Productimage> productProductimages) {
        this.productProductimages = productProductimages;
    }

    public Set<Review> getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(final Set<Review> productReviews) {
        this.productReviews = productReviews;
    }

    public Set<Shoppingcart> getProductShoppingcarts() {
        return productShoppingcarts;
    }

    public void setProductShoppingcarts(final Set<Shoppingcart> productShoppingcarts) {
        this.productShoppingcarts = productShoppingcarts;
    }

}

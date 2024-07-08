package com.clothing.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.time.OffsetDateTime;
import java.util.Set;


@Entity
public class User {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(length = 50)
    private String firstName;

    @Column(length = 50)
    private String lastName;

    @Column(columnDefinition = "tinyint", length = 1)
    private Boolean isAdmin;

    @Column
    private OffsetDateTime createdAt;

    @OneToMany(mappedBy = "user")
    private Set<Order> userOrders;

    @OneToMany(mappedBy = "user")
    private Set<Review> userReviews;

    @OneToMany(mappedBy = "user")
    private Set<Shippingaddress> userShippingaddresses;

    @OneToMany(mappedBy = "user")
    private Set<Shoppingcart> userShoppingcarts;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(final Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(final Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(final OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Set<Order> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(final Set<Order> userOrders) {
        this.userOrders = userOrders;
    }

    public Set<Review> getUserReviews() {
        return userReviews;
    }

    public void setUserReviews(final Set<Review> userReviews) {
        this.userReviews = userReviews;
    }

    public Set<Shippingaddress> getUserShippingaddresses() {
        return userShippingaddresses;
    }

    public void setUserShippingaddresses(final Set<Shippingaddress> userShippingaddresses) {
        this.userShippingaddresses = userShippingaddresses;
    }

    public Set<Shoppingcart> getUserShoppingcarts() {
        return userShoppingcarts;
    }

    public void setUserShoppingcarts(final Set<Shoppingcart> userShoppingcarts) {
        this.userShoppingcarts = userShoppingcarts;
    }

}

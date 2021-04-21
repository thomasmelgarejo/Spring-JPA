package com.JPA.model;

import javax.persistence.*;

@Entity
public class Description {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id") //product_id
    private Product product;

    public Description() {
    }

    public Description(Long id, String description, Product product) {
        this.id = id;
        this.description = description;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

//    @Override
//    public String toString() {
//        return "Description{" +
//                "id=" + id +
//                ", description='" + description + '\'' +
//                ", product=" + product +
//                '}';
//    }
}

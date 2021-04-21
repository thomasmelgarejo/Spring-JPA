package com.JPA.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL) //one company can have many products
    @JoinColumn(name = "id")
    private Set<Product> product;

    public Company() {
    }

    public Company(long id, String name, Set<Product> product) {
        this.id = id;
        this.name = name;
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProduct() {
        return product;
    }

    public void setProduct(Set<Product> product) {
        this.product = product;
    }

//    @Override
//    public String toString() {
//        return "Company{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", product=" + product +
//                '}';
//    }
}

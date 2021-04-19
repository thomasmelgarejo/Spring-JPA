package com.JPA.model;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double price;

    @OneToOne(cascade = CascadeType.ALL)
    private Description description;

    @ManyToOne(cascade = CascadeType.ALL) //many products per company
    private Company company;

    public Product() {
    }

    public Product(long id, String name, double price, Description description, Company company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.company = company;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description=" + description +
                ", company=" + company +
                '}';
    }
}

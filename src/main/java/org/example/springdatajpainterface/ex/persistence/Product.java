package org.example.springdatajpainterface.ex.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

    // getters, setters, constructors
}

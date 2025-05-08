package org.example.springdatajpainterface.ex.persistence;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "stores")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}

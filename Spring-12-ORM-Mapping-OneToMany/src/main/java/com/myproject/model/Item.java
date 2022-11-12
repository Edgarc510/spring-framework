package com.myproject.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "items")
public class Item {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String code;

    @ManyToMany(mappedBy = "itemList")
    private List <Cart> cart;


    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }
}

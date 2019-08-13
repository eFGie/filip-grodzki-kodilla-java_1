package com.kodilla.hibernate.invoice;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int ID;
    private String name;
    private Item item;

    @OneToMany (
            targetEntity = Item.class,
            mappedBy = "Product",
            cascade =  CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Product() {

    }
    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getID() {
        return ID;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    private void setID(int ID) {
        this.ID = ID;
    }

    private void setName(String name) {
        this.name = name;
    }
}

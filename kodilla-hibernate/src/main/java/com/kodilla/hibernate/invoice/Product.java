package com.kodilla.hibernate.invoice;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int ID;
    private String name;
    private List<Item> itemList;

    @OneToMany (
            targetEntity = Item.class,
            mappedBy = "product",
            cascade =  CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
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

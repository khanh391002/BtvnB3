package com.example.Shopping;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    int id;
    @Column(name = "name_product")
    private String nameProduct;
    @Column(name = "price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "cart", referencedColumnName="cart_name")
    private Cart cart;

    public Product() {
    }

    public Product(int id, String nameProduct, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public Product(int id, String nameProduct, int price, String nameCart) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.cart.setCartName(nameCart);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", cart=" + cart.getCartName() +
                '}';
    }
}

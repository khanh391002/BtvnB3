package com.example.Shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService implements ICartService{
    @Autowired
    ICartReponsitory cartReponsitory;


    @Override
    public void save() {
        cartReponsitory.save(new Cart("giohang3",3));
    }

    @Override
    public Cart findAllByNameCart(String cartName) {
        return cartReponsitory.findAllByNameCart(cartName);
    }

}

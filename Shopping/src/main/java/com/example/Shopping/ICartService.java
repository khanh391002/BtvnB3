package com.example.Shopping;

public interface ICartService {
    void save();
    Cart findAllByNameCart(String cartName);

}

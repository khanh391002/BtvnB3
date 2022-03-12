package com.example.Shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ShoppingApplication implements CommandLineRunner {
	@Autowired
	IProductService productService;

	@Autowired
	ICartService cartService;

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
//		productService.save();
//		cartService.save();
		Cart cart = cartService.findAllByNameCart("giohang1");
		List<Product> productList = cart.getProductList();
		for (int i = 0; i< productList.size(); i++){
			System.out.println(productList.get(i).toString());
		}
	}
}

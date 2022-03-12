package com.example.Shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{
    @Autowired
    IProductReponsitory productReponsitory;

    @Override
    public void save() {
        productReponsitory.save(new Product(2,"Quần đùi hoa",150000, "giohang2"));
    }
}

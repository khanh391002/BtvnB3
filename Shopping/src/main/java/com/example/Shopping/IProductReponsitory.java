package com.example.Shopping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductReponsitory extends JpaRepository<Product,String> {

}

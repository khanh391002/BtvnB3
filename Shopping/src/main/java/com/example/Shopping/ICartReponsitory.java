package com.example.Shopping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartReponsitory extends JpaRepository<Cart, String> {
    @Query("select c from Cart c where c.cartName =:name")
    Cart findAllByNameCart(@Param("name") String nameCart);

}

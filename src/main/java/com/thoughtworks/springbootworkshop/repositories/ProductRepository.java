package com.thoughtworks.springbootworkshop.repositories;

import com.thoughtworks.springbootworkshop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}

package com.digitalinnovationone.catalogoprodutos.repository;

import com.digitalinnovationone.catalogoprodutos.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
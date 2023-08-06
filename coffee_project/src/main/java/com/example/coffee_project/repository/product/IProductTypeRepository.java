package com.example.coffee_project.repository.product;
import com.example.coffee_project.model.product.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductTypeRepository extends JpaRepository<ProductType, Integer> {
}

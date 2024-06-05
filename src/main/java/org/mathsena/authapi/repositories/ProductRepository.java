package org.mathsena.authapi.repositories;

import org.mathsena.authapi.models.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}

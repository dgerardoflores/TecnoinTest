package com.tecnoin.products.repositories;

import com.tecnoin.products.entities.ProductsEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends PagingAndSortingRepository<ProductsEntity,Integer> {
}

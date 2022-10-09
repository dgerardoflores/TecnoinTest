package com.tecnoin.products.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Producto")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, length = 8)
    private Long id;

    @Column(name = "codigo", length = 20)
    private String code;

    @Column(name = "nombre", length = 200)
    private String name;
}

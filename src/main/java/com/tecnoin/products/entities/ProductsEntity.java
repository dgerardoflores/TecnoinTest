package com.tecnoin.products.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Producto")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String codigo;

    private String nombre;
}

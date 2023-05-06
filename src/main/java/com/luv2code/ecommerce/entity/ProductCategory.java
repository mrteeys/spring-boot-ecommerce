package com.luv2code.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter
@Setter
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private Set<Product> products;
}

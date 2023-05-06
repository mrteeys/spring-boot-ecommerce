package com.luv2code.ecommerce.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name ="product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private ProductCategory category;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("unit_price")
    private BigDecimal unitPrice;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("active")
    private boolean active;

    @JsonProperty("units_in_stock")
    private int unitsInStock;

    @JsonProperty("date_created")
    @CreationTimestamp
    private Date dateCreated;

    @JsonProperty("last_updated")
    @UpdateTimestamp
    private Date lastUpdated;
}

package org.epsi.catalogue.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Catalogues")
public class Catalogue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(name = "product_name", nullable = false, length = 100)
    private String productName;

    @Column(name = "product_category", nullable = false, length = 50)
    private String productCategory;

    @Column(name = "product_stock", nullable = false)
    private Integer productStock;

    @Column(name = "product_price", nullable = false)
    private Double productPrice;

    @Column(name = "product_image", length = 255)
    private String productImage;

    @Column(name = "product_discount")
    private Double productDiscount;

    @Column(name = "product_rating")
    private Double productRating;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "user_id")
    private Long userId;

}

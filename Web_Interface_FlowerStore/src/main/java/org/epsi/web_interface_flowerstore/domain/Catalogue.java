package org.epsi.web_interface_flowerstore.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Catalogue {

    private Long productId;
    private String productName;
    private String productCategory;
    private Integer productStock;
    private Double productPrice;
    private String productImage;
    private Double productDiscount;
    private Double productRating;
    private String description;
    private Long userId;

    // Getters and Setters
    // (Omettez les méthodes @Data si vous utilisez lombok dans le Web
}

package kr.ecommerce.domain.product;

import jakarta.persistence.*;
import kr.ecommerce.domain.support.jpa.BaseEntityDateAggregate;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product extends BaseEntityDateAggregate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "price", nullable = false)
    private int price = 0;

    @Column(name = "stock", nullable = false)
    private int stock = 0;
}

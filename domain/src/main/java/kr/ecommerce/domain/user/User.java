package kr.ecommerce.domain.user;

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
public class User extends BaseEntityDateAggregate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "name", nullable = false, length = 20)
    private String name;
}

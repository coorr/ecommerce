package kr.ecommerce.domain.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {
    PENDING("대기"),
    PROCESSING("진행중"),
    COMPLETED("완료");

    private final String description;
}

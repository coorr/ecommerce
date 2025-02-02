package kr.ecommerce.application.api.support.error;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException {
    private final String message;

    public NotFoundException(String message) {
        this.message = message;
    }
}

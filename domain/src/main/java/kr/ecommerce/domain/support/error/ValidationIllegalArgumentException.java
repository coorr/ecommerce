package kr.ecommerce.domain.support.error;

import lombok.Getter;
import org.springframework.validation.Errors;

@Getter
public class ValidationIllegalArgumentException extends IllegalArgumentException {
    private final Errors errors;

    public ValidationIllegalArgumentException(String s, Errors errors) {
        this.errors = errors;
    }
}

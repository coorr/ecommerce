package kr.ecommerce.application.api.support.error;

import lombok.Getter;

@Getter
public class SimpleMessageIllegalArgumentException extends IllegalArgumentException {
    private final String message;
    private final String field;
    private final Object[] parameters;

    public SimpleMessageIllegalArgumentException(String message) {
        this(message, null);
    }

    public SimpleMessageIllegalArgumentException(String message, String field) {
        this(message, field, null);
    }

    public SimpleMessageIllegalArgumentException(String message, String field, Object[] parameters) {
        this.message = message;
        this.field = field;
        this.parameters = parameters;
    }
}

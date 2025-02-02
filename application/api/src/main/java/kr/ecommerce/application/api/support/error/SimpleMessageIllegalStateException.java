package kr.ecommerce.application.api.support.error;

import lombok.Getter;

@Getter
public class SimpleMessageIllegalStateException extends IllegalStateException {
    private final String message;
    private final String field;
    private final Object[] parameters;

    public SimpleMessageIllegalStateException(String message) {
        this(message, null);
    }

    public SimpleMessageIllegalStateException(String message, String field) {
        this(message, field, null);
    }

    public SimpleMessageIllegalStateException(String message, String field, Object[] parameters) {
        this.message = message;
        this.field = field;
        this.parameters = parameters;
    }
}

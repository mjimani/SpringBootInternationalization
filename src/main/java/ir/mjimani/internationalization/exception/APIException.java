package ir.mjimani.internationalization.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class APIException extends RuntimeException {

    private String message;

    public APIException(String message) {
        this.message = message;
    }

}
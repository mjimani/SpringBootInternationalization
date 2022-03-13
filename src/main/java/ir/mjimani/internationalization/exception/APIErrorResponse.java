package ir.mjimani.internationalization.exception;


import ir.mjimani.internationalization.domain.Response;

import java.util.Collections;
import java.util.List;

public class APIErrorResponse extends Response {

    public APIErrorResponse(String message) {
        success = false;
        messages = Collections.singletonList(message);
    }

    public APIErrorResponse(List<String> messages) {
        success = false;
        this.messages = messages;
    }
}
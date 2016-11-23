package io.github.d1v1nation.tmdb.loader;

/**
 * Kind of bad, incorrect or unexpected response from API.
 */
public class BadResponseException extends Exception {

    public BadResponseException(String message) {
        super(message);
    }

    public BadResponseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadResponseException(Throwable cause) {
        super(cause);
    }
}
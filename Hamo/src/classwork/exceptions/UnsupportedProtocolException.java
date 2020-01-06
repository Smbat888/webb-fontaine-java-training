package classwork.exceptions;

/**
 * Created by: Hmayak Atayan on 17 December, 2019
 */
public class UnsupportedProtocolException extends RuntimeException {
    private String message;

    public UnsupportedProtocolException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("my exception, %s, %s,", getClass(), message);
    }
}

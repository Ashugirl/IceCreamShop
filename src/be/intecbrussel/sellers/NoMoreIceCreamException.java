package be.intecbrussel.sellers;

public class NoMoreIceCreamException extends IllegalArgumentException{
    public NoMoreIceCreamException() {
    }

    public NoMoreIceCreamException(String s) {
        super(s);
    }

    public NoMoreIceCreamException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoreIceCreamException(Throwable cause) {
        super(cause);
    }
    public void outOfStock() throws NoMoreIceCreamException {
        throw new NoMoreIceCreamException();
    }

}

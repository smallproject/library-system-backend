package nl.smallproject.www.librarysystembackend.exceptions;

public class RecordNotFoundException extends RuntimeException{

    public RecordNotFoundException() {
        super();
    }

    public RecordNotFoundException(String message) {
        super(message);
    }
}

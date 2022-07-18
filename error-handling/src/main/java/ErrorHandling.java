import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    void handleErrorByThrowingAnyCheckedException() throws Exception{
        throw new Exception();
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws Exception{
        throw new Exception(message);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    void handleErrorByThrowingAnyUncheckedException() {
        throw new RuntimeException();
        // Delete this statement and write your own implementation.
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new RuntimeException(message);

        // Delete this statement and write your own implementation.
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);

        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
     try {
      return Optional.of(Integer.parseInt(integer));
     } catch (NumberFormatException ex) {
      return Optional.empty();
    }
  
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}

package pokemon.demo.model.exceotion;

public class NotFoundException  extends RuntimeException{

  public NotFoundException(String message) {
    super(message);
  }
  
}

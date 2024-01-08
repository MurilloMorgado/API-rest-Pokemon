package pokemon.demo.model.exceotion;

public class InternalServerException extends RuntimeException{

  public InternalServerException(String message){
    super(message);
  }
}

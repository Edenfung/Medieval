import java.io.Serializable;

public class Shirt extends Armour implements Serializable{

  /* Class Variables */
  private static final long serialVersionID = 1L;


  /* Constructors */
  public Shirt(String name, int durability, int defenseRating) {
    super(name, durability, defenseRating);
  }
}
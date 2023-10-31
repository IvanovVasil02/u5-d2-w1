package ivanovvasil.u5d1w1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
public class Pizza extends MenuProduct{
private List<Topping> ingredients;

  public Pizza(String name, long cal, double price, List<Topping> ingredients) {
    super(name, cal, price);
    this.ingredients = ingredients;
  }

  @Override
  public String toString() {
    return this.getName() +
            " (" + ingredients +
            ") " + getCal() + " " + getPrice() + "\n";
  }
}

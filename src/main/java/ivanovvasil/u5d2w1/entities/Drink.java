package ivanovvasil.u5d1w1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
public class Drink extends MenuProduct{
  private double quantity;
  private double alcholPercent;

  public Drink(String name, long cal, double price, double quantity) {
    super(name, cal, price);
    this.quantity = quantity;
  }
  public Drink(String name, long cal, double price, double quantity, double alcholPercent) {
    super(name, cal, price);
    this.quantity = quantity;
    this.alcholPercent = alcholPercent;
  }

  @Override
  public String toString() {
    return this.getName() +
            "(" + quantity +
            "l, " + alcholPercent +
            "%) " + "\n";
  }
}

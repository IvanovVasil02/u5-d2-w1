package ivanovvasil.u5d1w1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
public abstract class MenuProduct {
  private String name;
  private long cal;
  private double price;

  @Override
  public String toString() {
    return name;
  }
}

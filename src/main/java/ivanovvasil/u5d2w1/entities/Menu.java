package ivanovvasil.u5d2w1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
@AllArgsConstructor
@Getter
public class Menu {
  private List<Pizza> listaPizze;
  private List<Topping> listaToppings;
  private List<Drink> listaDrink;

  @Override
  public String toString() {
    return "Menu" + "\n"+
            "Pizzas" +"\n"+ listaPizze +"\n"+
            "Toppings"+"\n" + listaToppings +"\n"+"\n"+
            "Drinks"+"\n" + listaDrink;
  }
}

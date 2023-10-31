package ivanovvasil.u5d1w1;

import ivanovvasil.u5d1w1.entities.Drink;
import ivanovvasil.u5d1w1.entities.Menu;
import ivanovvasil.u5d1w1.entities.Pizza;
import ivanovvasil.u5d1w1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfiguration {
 @Bean
  Topping tomato(){
   return new Topping("tomato", 92, 0.69);
 }
 @Bean
  Topping cheese(){
   return new Topping("cheese", 92, 0.69);
 }
 @Bean
  Topping ham(){
   return new Topping("ham", 35, 0.99);
 }
 @Bean
  Topping onion(){
   return new Topping("onion", 22, 0.69);
 }
 @Bean
  Topping pineapple(){
   return new Topping("pineapple", 24, 0.79);
 }
 @Bean
  Topping salami(){
   return new Topping("salami", 86, 0.99);
 }

 @Bean
  Pizza margheritaPizza(){
   List<Topping> toppings = Arrays.asList(tomato(), cheese());
   return new Pizza("Pizza Margherita", 1104, 4.99, toppings);
 }
 @Bean
  Pizza hawaiianPizza(){
   List<Topping> toppings = Arrays.asList(tomato(), cheese(), ham(), pineapple());
   return new Pizza("Hawaiian Pizza", 1024, 6.49, toppings);
 }
 @Bean
  Pizza salamiPizza(){
   List<Topping> toppings = Arrays.asList(tomato(), cheese(), salami());
   return new Pizza("Salami Pizza", 1160, 5.99, toppings);
 }

 @Bean
  Drink lemonade(){
   return new Drink("Lemonade", 128, 1.29 ,0.33);
 }
 @Bean
  Drink water(){
   return new Drink("Water", 0, 1.29 ,0.5);
 }
 @Bean
  Drink wine(){
   return new Drink("Wine", 607, 7.49 ,0.75, 13);
 }

 @Bean
  Menu getMenu (){
   List<Pizza> pizzaList = Arrays.asList(margheritaPizza(), hawaiianPizza(), salamiPizza());
   List<Topping> toppings = Arrays.asList(cheese(), ham(), onion(), pineapple(), salami());
   List<Drink> drinkList = Arrays.asList(lemonade(), water(), wine());

   return new Menu(pizzaList, toppings, drinkList);
 }

}

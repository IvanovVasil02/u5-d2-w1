package ivanovvasil.u5d2w1.entities;

import ivanovvasil.u5d2w1.enums.OrderStatus;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component("order_component")
@ToString
@Getter
@PropertySource("application.properties")
public class Order {
  private int ordernumber;
  private List<MenuProduct> order;
  private OrderStatus orderStatus;
  private int coversNumber;
  private LocalTime time;
  private double totalAmount;
  @Value("${cost.covered}")
  private int cover;

  public Order(List<MenuProduct> order) {
    this.order = order;
    this.orderStatus = OrderStatus.SERVED;
    this.coversNumber = 4;
    this.time = LocalTime.now();
    this.totalAmount = getAmount();
  }

  public double getAmount() {
    return this.order.stream().mapToDouble(MenuProduct::getPrice).sum() + (this.cover * coversNumber);
  }

}

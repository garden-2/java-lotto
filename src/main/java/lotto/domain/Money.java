package lotto.domain;

import java.util.List;
import java.util.Objects;

public class Money {
  private final int money;

  public Money(int money) {
    this.money = money;
  }

  public double calculateEarningRate(int total) {
    return total / (double)money;
  }

  public int divide(final int lottoPrice) {
    return money / lottoPrice;
  }

  public Money multiple(final Integer value) {
    return new Money(value * money);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Money)) {
      return false;
    }
    Money money1 = (Money) o;
    return money == money1.money;
  }

  @Override
  public int hashCode() {
    return Objects.hash(money);
  }

  public static int totalMonies(List<Money> monies) {
    return monies.stream()
        .mapToInt(money -> money.money)
        .sum();
  }
}
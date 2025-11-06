package visitor;

import toy.Car;
import toy.Doll;

public class PriceCalculatorVisitor implements ToyVisitor {
    private static final double taxRate = 0.15;

    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void visitDoll(Doll doll) {
        double price = doll.getBasePrice();
        if (doll.getRecommendedAge() < 3) {
            price *= 0.95;
        }
        totalPrice += price * (1 + taxRate);
    }

    @Override
    public void visitCar(Car car) {
        double price = car.getBasePrice();
        if (car.hasRemoteControl()) {
            price += 10.0;
        }
        totalPrice += price * (1 + taxRate);
    }
}



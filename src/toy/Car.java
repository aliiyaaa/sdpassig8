package toy;

import visitor.ToyVisitor;

public class Car implements Toy {
    private final String name;
    private final int recommendedAge;
    private final double basePrice;
    private final boolean hasRemoteControl;

    public Car(String name, int recommendedAge, double basePrice, boolean hasRemoteControl) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Car name must not be blank");
        }
        if (recommendedAge < 0) {
            throw new IllegalArgumentException("Recommended age must be non-negative");
        }
        if (basePrice < 0) {
            throw new IllegalArgumentException("Base price must be non-negative");
        }
        this.name = name;
        this.recommendedAge = recommendedAge;
        this.basePrice = basePrice;
        this.hasRemoteControl = hasRemoteControl;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean hasRemoteControl() {
        return hasRemoteControl;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRecommendedAge() {
        return recommendedAge;
    }

    @Override
    public void accept(ToyVisitor visitor) {
        visitor.visitCar(this);
    }
}



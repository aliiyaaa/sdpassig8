package toy;

import visitor.ToyVisitor;

public class Doll implements Toy {
    private final String name;
    private final int recommendedAge;
    private final double basePrice;

    public Doll(String name, int recommendedAge, double basePrice) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Doll name must not be blank");
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
    }

    public double getBasePrice() {
        return basePrice;
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
        visitor.visitDoll(this);
    }
}



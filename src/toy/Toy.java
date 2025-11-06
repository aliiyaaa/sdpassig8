package toy;

import visitor.ToyVisitor;

public interface Toy {
    String getName();
    int getRecommendedAge();
    void accept(ToyVisitor visitor);
}



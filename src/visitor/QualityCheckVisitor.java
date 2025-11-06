package visitor;

import toy.Car;
import toy.Doll;

public class QualityCheckVisitor implements ToyVisitor {
    private final StringBuilder text = new StringBuilder();

    public String getReport() {
        return text.toString();
    }

    @Override
    public void visitDoll(Doll doll) {
        text.append("[Doll] Name: ").append(doll.getName()).append('\n');
        text.append("- Age OK: ").append(doll.getRecommendedAge() >= 0).append('\n');
        text.append("- Small parts warning: ").append(doll.getRecommendedAge() >= 3).append('\n');
    }

    @Override
    public void visitCar(Car car) {
        text.append("[Car] Name: ").append(car.getName()).append('\n');
        text.append("- Age OK: ").append(car.getRecommendedAge() >= 0).append('\n');
        text.append("- Remote control tested: ").append(car.hasRemoteControl()).append('\n');
    }
}



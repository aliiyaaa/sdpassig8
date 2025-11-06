package visitor;

import toy.Car;
import toy.Doll;

public class PackagingVisitor implements ToyVisitor {
    private final StringBuilder text = new StringBuilder();

    public String getInstructionsText() {
        return text.toString();
    }

    @Override
    public void visitDoll(Doll doll) {
        text.append("Pack doll '").append(doll.getName()).append("' in soft wrap and small box.\n");
    }

    @Override
    public void visitCar(Car car) {
        text.append("Pack car '").append(car.getName()).append("' in protective foam");
        if (car.hasRemoteControl()) {
            text.append(" with RC compartment");
        }
        text.append('.').append('\n');
    }
}



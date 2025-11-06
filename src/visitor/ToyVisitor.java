package visitor;

import toy.Car;
import toy.Doll;

public interface ToyVisitor {
    void visitDoll(Doll doll);
    void visitCar(Car car);
}



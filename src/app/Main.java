package app;

import java.util.List;
import toy.Car;
import toy.Doll;
import toy.Toy;
import visitor.PackagingVisitor;
import visitor.PriceCalculatorVisitor;
import visitor.QualityCheckVisitor;

public class Main {
    public static void main(String[] args) {
        List<Toy> toys = List.of(
                new Doll("Sunny Doll", 2, 12.50),
                new Car("Speedster", 6, 19.99, true)
        );

        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();
        QualityCheckVisitor qualityVisitor = new QualityCheckVisitor();
        PackagingVisitor packagingVisitor = new PackagingVisitor();

        for (Toy toy : toys) {
            toy.accept(priceVisitor);
            toy.accept(qualityVisitor);
            toy.accept(packagingVisitor);
        }

        System.out.println("=== Price Summary ===");
        System.out.printf("Total with tax: $%.2f%n", priceVisitor.getTotalPrice());

        System.out.println("\n=== Quality Check ===");
        System.out.print(qualityVisitor.getReport());

        System.out.println("\n=== Packaging Instructions ===");
        System.out.print(packagingVisitor.getInstructionsText());
    }
}



## Visitor Pattern with Toys (Doll & Car)

### Overview
This project demonstrates the Visitor design pattern using simple products: `Doll` and `Car`. Visitors encapsulate operations that apply to these toys without changing the toy classes themselves. Implemented visitors: `PriceCalculatorVisitor`, `QualityCheckVisitor`, and `PackagingVisitor`.

### Why Visitor here?
- We want to add operations (pricing, quality checks, packaging) without modifying `Doll`/`Car` each time.
- Visitor keeps each operation isolated and testable.
- New toys or new operations can evolve independently.

### Structure
- `toy.Toy` (Element interface) with `accept(ToyVisitor)`.
- `toy.Doll`, `toy.Car` (Concrete elements).
- `visitor.ToyVisitor` (Visitor interface).
- `visitor.PriceCalculatorVisitor`, `visitor.QualityCheckVisitor`, `visitor.PackagingVisitor` (Concrete visitors).
- `app.Main` wires objects and runs visitors on a small list of toys.

### Clean Code Principles Applied
- Meaningful names: clear class/method names (`PriceCalculatorVisitor`, `getRecommendedAge`).
- Small, cohesive classes: each visitor does one thing.
- Guard clauses for constructor validation; no deep nesting.
- Avoid unnecessary comments; comments only where they add value.
- Immutability for domain data where sensible (`final` fields in `Doll`/`Car`).
- Clear public API: visitors expose getters like `getTotalPrice()` instead of leaking internal state.
- No premature generalization: scope limited to `Doll` and `Car` with easy extensibility.

### Extensibility
- Add a new toy (e.g., `Puzzle`): implement `Toy`, add `visitPuzzle(Puzzle)` to `ToyVisitor`, then implement handlers in each concrete visitor.
- Add a new operation (e.g., `InventoryVisitor`): create a new class implementing `ToyVisitor` and add logic per toy type.

### Sample Output (abridged)
```
=== Price Summary ===
Total with tax: $...

=== Quality Check ===
[Doll] Name: Sunny Doll
- Age OK: true
- Small parts warning: false
[Car] Name: Speedster
- Age OK: true
- Remote control tested: true

=== Packaging Instructions ===
Pack doll 'Sunny Doll' in soft wrap and small box.
Pack car 'Speedster' in protective foam with RC compartment.
```

### Testing Approach (manual)
- Construct a list with one `Doll` and one `Car`.
- Run all visitors; verify totals and strings match expectations.
- Edge cases: negative inputs are rejected by guard clauses.

### Notes and Trade-offs
- For simplicity (second-year level), persistence and DI are omitted.
- Visitor interface changes when adding new elements (known trade-off of the pattern).



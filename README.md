## Toy Visitor (Java)

Small Java project demonstrating the Visitor pattern with `Doll` and `Car`, applying Clean Code principles.

### Build & Run
Requires JDK 17+.

```bash
# from project root
javac -d out $(find src -name "*.java")
java -cp out app.Main
```

Or run the legacy entry (delegates to `app.Main`):

```bash
java -cp out Main
```

### Project Layout
- `src/toy`: elements (`Toy`, `Doll`, `Car`)
- `src/visitor`: visitors (`ToyVisitor`, pricing, quality, packaging)
- `src/app/Main.java`: demo client
- `REPORT.md`: brief write-up linking pattern to Clean Code

### GitHub Submission
```bash
git init
git add .
git commit -m "Implement Visitor pattern with Doll/Car and report"
git branch -M main
git remote add origin <YOUR_REPO_URL>
git push -u origin main
```

Replace `<YOUR_REPO_URL>` with your repository URL.



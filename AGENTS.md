# AGENTS.md

## Build & test
- Use Maven: `mvn -q -DskipTests=false test`
- Java: 17, JUnit 5 (tests live under `src/test/java`).

## Task scaffold contract
- If I say “Create task <id>-<slug>”, do ALL of the following:
  1) Create directory: `problems/<id>-<slug>/`
  2) Add a **README.md** with:
      - Problem title, clear statement, constraints, examples, and edge cases.
  3) Create template class in:
     `problems/<id>-<slug>/src/main/java/leetcode/p<id>/<ClassName>.java`
      - Package: `leetcode.p<id>`
      - The class should contain only public methods with signature(s) exactly as specified in the README.
      - The methods bodies should be `throw new UnsupportedOperationException("todo")`.
      - do not implement any logic inside the 
  4) Create JUnit 5 tests in:
     `problems/<id>-<slug>/src/test/java/leetcode/p<id>/<ClassName>Test.java`
      - Include example-based tests and at least 2 edge cases.
  5) Run: `mvn -q -DskipTests=false test` and summarize results.
- Else if I say "Give me a hint on task <id>-<slug>", do ALL of the following:
  1) review current implementation in `problems/<id>-<slug>/src/main/java/leetcode/p<id>/<ClassName>.java`
  2) check if the implementation completed and solve the task in `problems/<id>-<slug>/README.md`
      - if it is does not solve the task yet, try to understand the solution tried to be implemented in the class (if you need some clarification, ask the questions to the user)
        - then, if the current idea (try of solution) is driven to the dead end, try to roll the idea back to the point where the wrong decision had been made and kindly ask the user about the wrong decision, if there is another option (try to lead to the correct decision that will lead the idea to correct solution)
        - if the idea is on the correct path but the user can't proceed with it try to give him a small hint (maybe a general question about decision that should be made to proceed with the idea)
      - if the implementation is completed make a general review with comments and propositions to optimise the algorithm (if applicable)

## Conventions
- Keep existing signatures when updating tasks.
- Prefer minimal diffs and add tests for any bugfix.

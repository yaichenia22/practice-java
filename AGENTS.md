# AGENTS.md

## Build & test
- Use Maven: `mvn -q -DskipTests=false test`
- Java: 17, JUnit 5 (tests live under `src/test/java`).

## Task scaffold contract
When I say “Create task <id>-<slug>”, do ALL of the following:
1) Create directory: `problems/<id>-<slug>/`
2) Add a **README.md** with:
    - Problem title, clear statement, constraints, examples, and edge cases.
3) Create template class in:
   `problems/<id>-<slug>/src/main/java/leetcode/p<id>/<ClassName>.java`
    - Package: `leetcode.p<id>`
    - Public method signature(s) exactly as specified in the README.
    - Method bodies may be `throw new UnsupportedOperationException("todo")`.
4) Create JUnit 5 tests in:
   `problems/<id>-<slug>/src/test/java/leetcode/p<id>/<ClassName>Test.java`
    - Include example-based tests and at least 2 edge cases.
5) Run: `mvn -q -DskipTests=false test` and summarize results.

## Conventions
- Keep existing signatures when updating tasks.
- Prefer minimal diffs and add tests for any bugfix.

# practice-java

LeetCode-style Java practice repo (Maven + JUnit 5), ready for local IntelliJ work and CI.

## Quickstart
- **Prereqs:** JDK 17+, Maven 3.9+, Git.
- Import in IntelliJ: `File → New → Project from Existing Sources…` and select `pom.xml`.
- Run tests: `mvn -q -DskipTests=false test`

## Layout
```
problems/
  0001-two-sum/
    src/main/java/leetcode/p0001/TwoSum.java
    src/test/java/leetcode/p0001/TwoSumTest.java
```

## Add a new problem
1. Create a directory: `problems/<id>-<slug>/`
2. Add solution and tests under `src/main/java/...` and `src/test/java/...` with a package like `leetcode.p<id>`.
3. Run: `mvn -q test`

## How CI runs
GitHub Actions executes:
```bash
mvn -q -DskipTests=false test
```

## Use with automation/agents
Provide this one-liner to any automation tool that runs your checks:
```
Build & test: mvn -q -DskipTests=false test
```


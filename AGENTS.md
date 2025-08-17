# AGENTS.md

This repository is structured so automated code assistants can build, test, and suggest changes safely.

## Build & Test
- Use Maven: `mvn -q -DskipTests=false test`
- Java: 17
- Tests: JUnit 5 (under `src/test/java`)

## Conventions
- Keep existing method signatures.
- Prefer minimal diffs.
- When fixing a bug, add or update tests to cover it.
- Put each problem in `problems/<id>-<slug>/` with package `leetcode.p<id>`.

## Useful Tasks
- Run tests and summarize failures.
- Write additional tests for edge cases.
- Propose small refactors while keeping behavior.

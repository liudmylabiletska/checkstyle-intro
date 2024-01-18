# Checkstyle Introduction

In this repository, you will find code that has some code style issues. Your task is to identify and fix all the checkstyle issues.

First, try to review the code independently to detect the code style issues and fix them. When you are ready, you can execute the `mvn clean package` command. Observe the console output, where you will either see a message indicating that the build was successful, or a list of code style issues that need to be addressed.

Continue to fix all code style issues until you receive console output similar to this:
```text
...

[INFO] 
[INFO] --- maven-checkstyle-plugin:3.1.1:check (default) @ diamond ---
[INFO] Starting audit...
Audit done.
[INFO] You have 0 Checkstyle violations.
[INFO] 

...

-------------------------------------------------------
 T E S T S
-------------------------------------------------------

Results :

Tests run: 0, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ diamond ---
[INFO] Building jar: /home/runner/work/checkstyle-intro/checkstyle-intro/target/diamond-1.0-SNAPSHOT.jar
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.658 s
[INFO] Finished at: 2024-01-18T10:48:28Z
[INFO] ------------------------------------------------------------------------

... 

```

> NOTE: Some parts of the console log have been omitted and replaced with `...`.

> NOTE 2: Pay special attention to the lines `[INFO] You have 0 Checkstyle violations.` and `[INFO] BUILD SUCCESS`. These lines indicate the successful completion of our task.

Once you are ready, don't forget to create a PR with your solution and verify all GitHub checks passed.

Good luck!
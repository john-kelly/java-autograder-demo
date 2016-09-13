This directory has all the Java files that allow you to test the CodeHS
Autograder system on your local machine.

This sample has a grader file for a student Fibonacci program. The student
has written Fiboancci.java, which is the file we are grading. The teacher
has writen FibSolution.java, which has the reference solution.

Autograder.java is part of the autograder system scaffolding, which uses
Interceptor.java to capture output to system.out. Grader.java is the main
runner class.

json.jar and java-util.jar are libraries that help with handling JSON as well
as other helper utilities for our grader.

When you run a Grader.java program the result is a string printed out. The
sentinel is the string "__unittests__" which tells that JavaScript component
that everything after this is JSON representing the results of the student
code. This JSON is generated from the test cases, so shows the name of the
test, whether it passed, the studentOutput, solutionOutput, and a message.

In the full custom autograder version, all of these fields can be set by
the autograder author.

See the comments in Grader.java for how we wrote the autograder.

To compile:

$ javac -cp .:json.jar:java-util-1.19.3.jar *.java

To run it:

$ java -cp .:json.jar:java-util-1.19.3.jar Grader
1
1
2
3
5
8
13
21
34
55
1
1
2
3
5
8
13
21
34
__unittests__{"tests":[{"test":"Output test","success":false,"studentOutput":"1\n1\n2\n3\n5\n8\n13\n21\n34\n","message":"Not quite.","solutionOutput":"1\n1\n2\n3\n5\n8\n13\n21\n34\n55\n"}]}

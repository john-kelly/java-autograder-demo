import java.util.*;

/**
 * You can write autograded tests here.
 * Test format:
 *  * Autograder grader = new Autograder();
 * grader.assertEqual(String testName, T studentOutput,
 *     T solutionOutput, String messagePass, String messageFail)
 * Alternative test format:
 *  * boolean test = false;
 * grader.addTest(String testName, boolean testStatus,
 *     T studentOutput, T solutionOutput, String message);
 *
 * The autograder will automatically track and store all output from println and
 * print. This can be done with the following Autograder functions:
 *  * grader.getOutput(String className);
 * grader.getOutputArrayList(String className);
 *
 * If the main class extends ConsoleProgram, you can also set inputs as well.
 * This can be done with any class instance that extends ConsoleProgram:
 *  * MyProgram p1;
 * p1 = new MyProgram();
 * p1.setInputs(String[] inputs);
 *
 * Something of note, files in the autograder will overwrite files of the
 * same name in the student code. This can be useful if you want an alterantive
 * version of the master code for a particular file.
 *
 * You can find some example tests in the code below.
 * See documentation for further information.
 */
public class Grader
{
    public static void main(String [] args)
    {
        // Here we create an autograder object which lets us easily add tests to
        // the user interface and provides us a utility function for capturing output
        // to System.out (see Interceptor.java for details)
        Autograder grader = new Autograder();

        // Here we run the solution code (which is included in our code tree here)
        // We have no inputs for this program
        String[] input = {};
        FibSolution.main(input);

        // Here we run the student program. All of the students files are added to the code
        // tree and sent to the server with these autograder files. Note: you need to add
        // your solution code manually to the grader tree, but the student's code is added
        // automatically by the system.
        String[] input2 = {};
        Fibonacci.main(input2);

        String studentOutput = grader.getOutput("Fibonacci");
        String solutionOutput = grader.getOutput("FibSolution");
        grader.assertEqual("Output test", studentOutput, solutionOutput, "Great!", "Not quite.");

        System.out.println(grader);
    }
}

package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {

        //6.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ABC", "sample", (a, b) -> a + b);
        poemBeautifier.beautify("ABC", "sample", (a, b) -> b + a);
        poemBeautifier.beautify("abc", toUpperCase("cba"), (a, b) -> a + b);
        poemBeautifier.beautify(toLowerCase("ABC"), "CBA", (a, b) -> b + a);
        poemBeautifier.beautify(toLowerCase("ABCXYZ"),toUpperCase("xyz"), (a, b) -> b + a);


        //Examples form module 6.1
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        //processor.execute(() -> System.out.println("This is an example text"));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions whit lambda");
        expressionExecutor.executeExpression(10,5,(a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAtoB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);
    }
}

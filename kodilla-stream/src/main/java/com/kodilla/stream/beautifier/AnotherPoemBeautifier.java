package com.kodilla.stream.beautifier;

public class AnotherPoemBeautifier {

    public void beautifyAgain(String poem, AnotherPoemDecorator anotherPoemDecorator) {
        String result = anotherPoemDecorator.decorateAgain(poem);
        System.out.println(result);
    }
}

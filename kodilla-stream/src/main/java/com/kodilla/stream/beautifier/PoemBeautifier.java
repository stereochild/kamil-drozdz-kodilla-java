package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String a, String b, PoemDecorator poemDecorator) {
        String addon = poemDecorator.decorate(a, b);
        System.out.println("Decorated text: " + addon);
    }
}

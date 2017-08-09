package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class PoemMain {

    public static void main(String[] args) {
        //6.1 ver1.0
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ABC", "sample", (a, b) -> a + b);
        poemBeautifier.beautify("ABC", "sample", (a, b) -> b + a);
        poemBeautifier.beautify("abc", toUpperCase("cba"), (a, b) -> a + b);
        poemBeautifier.beautify(toLowerCase("ABC"), "CBA", (a, b) -> b + a);
        poemBeautifier.beautify(toLowerCase("ABCXYZ"),toUpperCase("xyz"), (a, b) -> b + a);

        //6.1 ver2.0
        AnotherPoemBeautifier anotherPoemBeutifier = new AnotherPoemBeautifier();
        anotherPoemBeutifier.beautifyAgain("There's a lady who's sure all that glitters is gold", poem -> poem + "...");
        anotherPoemBeutifier.beautifyAgain("And she's buying a stairway to heaven", poem -> "..." + poem + "...");
        anotherPoemBeutifier.beautifyAgain(toLowerCase("WHEN SHE GETS THERE SHE KNOWS, IF THE STORES ARE ALL CLOSED"), poem -> "..." + poem + "...");
        anotherPoemBeutifier.beautifyAgain("a word she can get what she came for.", poem -> "With" + poem);
        anotherPoemBeutifier.beautifyAgain(toUpperCase("and she's buying a stairway to heaven"), poem -> "OHH, OHH" + poem);
    }
}

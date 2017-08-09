package com.kodilla.stream.beautifier;

import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class PoemMain {

    public static void main(String[] args) {

        //6.1 ver2.0
        AnotherPoemBeautifier anotherPoemBeutifier = new AnotherPoemBeautifier();
        anotherPoemBeutifier.beautifyAgain("There's a lady who's sure all that glitters is gold", poem -> poem + "...");
        anotherPoemBeutifier.beautifyAgain("And she's buying a stairway to heaven", poem -> "..." + poem + "...");
        anotherPoemBeutifier.beautifyAgain("WHEN SHE GETS THERE SHE KNOWS, IF THE STORES ARE ALL CLOSED", poem -> "..." + toLowerCase(poem) + "...");
        anotherPoemBeutifier.beautifyAgain("a word she can get what she came for.", poem -> "With " + poem);
        anotherPoemBeutifier.beautifyAgain("and she's buying a stairway to heaven", poem -> "OHH, OHH " + toUpperCase(poem));
    }
}

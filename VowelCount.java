import java.util.*;

public class VowelCount {
    String[] vowels = { "a", "e", "i", "o", "u" };
    String word = "Sample";

    public static void checkVowel(String values) {
        char[] items = values.toCharArray();
        for (int i = 0; i < items.length; i++) {
            if
            System.out.println(items[i]);
        }
    }
    
    public static void main(String args[]) {
        String word = "Sample";
        checkVowel(word);
    }
}

// I was not able to complete in time so I'm just going to write the pseudocode to the solution

/*
Define an array of vowel characters
Create checkVowel() method that takes in a string.
Split the string to an array of characters
Check if any of the characters matches the array of vowel characters
if there is a match print the length of the matched characters
if not return zero
*/

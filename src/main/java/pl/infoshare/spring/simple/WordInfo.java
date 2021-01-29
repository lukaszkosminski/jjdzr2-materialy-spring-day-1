package pl.infoshare.spring.simple;

public class WordInfo {

    private final int numberOfLetters;
    private final boolean startsWithUppercase;
    private final boolean containsLetter;

    public WordInfo(int numberOfLetters, boolean startsWithUppercase, boolean containsLetter) {
        this.numberOfLetters = numberOfLetters;
        this.startsWithUppercase = startsWithUppercase;
        this.containsLetter = containsLetter;
    }

    public int getNumberOfLetters() {
        return numberOfLetters;
    }

    public boolean isStartsWithUppercase() {
        return startsWithUppercase;
    }

    public boolean isContainsLetter() {
        return containsLetter;
    }
}

import netflix.WordWithNearestRepetition;

public class Main {

    public static void main(String[] args) {

        WordWithNearestRepetition wordWithNearestRepetition = new WordWithNearestRepetition();

        wordWithNearestRepetition.printWordWithNearestRepetition("He has to conceal what he would most wish to make public, and make public what he would most wish to conceal. I like the word make so much that I use word make to keep on making things.");
        wordWithNearestRepetition.printWordWithNearestRepetition("He has he, to conceal what he would most wish to make public, and make public what he would most wish to conceal. I like the word make so much that I use word make to keep on making things.");
        wordWithNearestRepetition.printWordWithNearestRepetition("He has HE,, conceal what he would most wish to make public, and make public what he would most wish to conceal. I like the word make so much that I use word make to keep on making things.");
        wordWithNearestRepetition.printWordWithNearestRepetition("He has to conceal what he would most wish to public make public, and make public what he would most wish to conceal. I like the word make so much that I use word make to keep on making things.");
    }
}

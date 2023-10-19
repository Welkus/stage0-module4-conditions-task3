package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        System.out.println(
                Character.toString(character).matches("[AaEeIiOoUu]") ? "Vowel" :
                !Character.toString(character).matches("[a-zA-Z]") ? "wrong alphabet!" : "Consonant"

        );
    }
}

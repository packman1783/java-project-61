package hexlet.code.games;

import hexlet.code.Game;
import hexlet.code.GameData;
import hexlet.code.Random;

public final class Even implements Game {
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_VALUE_EVEN = 1;
    private static final int MAX_VALUE_EVEN = 100;

    @Override
    public String getRule() {
        return GAME_RULE;
    }

    @Override
    public GameData getQuestionAnswer() {
        int randomNumber = Random.getRandom(MIN_VALUE_EVEN, MAX_VALUE_EVEN);
        String answer = isEven(randomNumber) ? "yes" : "no";

        return new GameData(Integer.toString(randomNumber), answer);
    }

    public static boolean isEven(int randomNumber) {
        return (randomNumber % 2) == 0;
    }
}

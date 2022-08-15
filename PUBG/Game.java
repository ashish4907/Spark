package PUBG;

public class Game {
    Weapon pressButton(String playerName) {
        Weapon weapon = null;
        int score = ScoreReader.getScore(playerName);

        if (score >= 1000) {
            weapon = new Bomb();
        } else if (score >= 500) {
            weapon = new Gun();
        } else if (score >= 0) {
            weapon = new Knife();
        }
        return weapon;
    }
}

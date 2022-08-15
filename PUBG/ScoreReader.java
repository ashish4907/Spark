package PUBG;

import java.io.FileReader;
import java.util.Properties;

public class ScoreReader {
    public static int getScore(String playerName) {
        int score = -1;

        Properties properties = new Properties();

        try {
            FileReader fileReader = new FileReader("scores.properties");
            properties.load(fileReader);
        } catch (Exception e) {
            System.out.println("File Not Found");
            System.out.println(e.getMessage());
        }

        String scoreString = properties.getProperty(playerName);
        if (scoreString != null) {
            score = Integer.parseInt(scoreString);
        }

        return score;
    }
}

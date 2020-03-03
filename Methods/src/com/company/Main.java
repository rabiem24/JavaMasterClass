package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = false;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was" + highScore);

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);

        int player1Position = calculateHighScorePosition(1500);
        displayHighScorePosition("Player 1", player1Position);

        int player2Position = calculateHighScorePosition(900);
        displayHighScorePosition("Player 2", player2Position);

        int player3Position = calculateHighScorePosition(400);
        displayHighScorePosition("Player 3", player3Position);

        int player4Position = calculateHighScorePosition(50);
        displayHighScorePosition("Player 4", player4Position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition);
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; //assuming position 4 will be returned

        if (score >= 1000){
            position = 1;
        }
        else if (score >= 500){
            position = 2;
        }
        else if (score >= 100){
            position = 3;
        }

        return position;
    }
}

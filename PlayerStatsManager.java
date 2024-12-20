
import java.util.List;



public class PlayerStatsManager {



    private List<PlayerStat> playerData = PlayerStatsDownloader.readCsvFromUrl("NBA_2021.csv");
    public static boolean playerFound = false;

    public void  advancedStats(String nameInput) {
        playerFound = false;
        boolean detected = false;
        PlayerStat detectedPlayer = null;
        for (PlayerStat playerStat:playerData) {
            if(playerStat.getPlayerName().equalsIgnoreCase(nameInput)) {
                detected = true;
                detectedPlayer = playerStat;
                break;
            }
        }
        if (detected != true) {
            System.out.println("I'm sorry but this player's name isn't available on our database. This is possible because it only contains player carrer data per the 2021 season");
            playerFound = true;
  
        }
        if (detectedPlayer != null) {
            printAdvanced(detectedPlayer);


        }

 
    }

    public void normalStats(String nameInput) {
        playerFound = false;
        boolean detected = false;
        PlayerStat detectedPlayer = null;
        for (PlayerStat playerStat:playerData) {
            if(playerStat.getPlayerName().equalsIgnoreCase(nameInput)) {
                detected = true;
                detectedPlayer = playerStat;
                break;
            }
        }
        if (detected != true) {
            System.out.println("I'm sorry but this player's name isn't available on our database. This is possible because it only contains player carrer data per the 2021 season");
            playerFound = true;
        }
        if (detectedPlayer != null) {
            printNormal(detectedPlayer);


        }

 
    }

    public void ComparePlayers(String Aplayer, String Bplayer) {
        boolean detectedA = false;
        boolean detectedB = false;
        boolean detectedAB = false;
        int ScoreA = 0;
        int ScoreB = 0;
        PlayerStat detectedPlayerA = null;
        PlayerStat detectedPlayerB = null;
        for (PlayerStat playerStat:playerData) {
            if(playerStat.getPlayerName().equalsIgnoreCase(Aplayer)) {
                detectedA = true;
                detectedPlayerA = playerStat;

            }
            if(playerStat.getPlayerName().equalsIgnoreCase(Bplayer)) {
                detectedB = true;
                detectedPlayerB = playerStat;

            }

        }
        if (detectedA != true || detectedB != true) {
            System.out.println("I'm sorry but this player(s)'s name isn't available on our database. This is possible because it only contains player carrer data per the 2021 season");
        }
        else {
            detectedAB = true;
        }
        if (detectedAB) {
            printAdvanced(detectedPlayerA);
            printAdvanced(detectedPlayerB);
            if (detectedPlayerA.getPoints() > detectedPlayerB.getPoints()) {
                ScoreA += 1;
            }
            else {
                ScoreB += 1;
            }
            if (detectedPlayerA.getRebound() > detectedPlayerB.getRebound()) {
                ScoreA += 1;
            }
            else {
                ScoreB += 1;
            }
            if (detectedPlayerA.getAssists() > detectedPlayerB.getAssists()) {
                ScoreA += 1;
            }
            else {
                ScoreB += 1;
            }
            if (detectedPlayerA.getFieldGoalPercentage() > detectedPlayerB.getFieldGoalPercentage()) {
                ScoreA += 1;
            }
            else {
                ScoreB += 1;
            }
            if (detectedPlayerA.getThreePointPercentage() > detectedPlayerB.getThreePointPercentage()) {
                ScoreA += 1;
            }
            else {
                ScoreB += 1;
            }
            if (detectedPlayerA.getBlocks() > detectedPlayerB.getBlocks()) {
                ScoreA += 1;
            }
            else {
                ScoreB += 1;
            }
            if (detectedPlayerA.getSteals() > detectedPlayerB.getSteals()) {
                ScoreA += 1;
            }
            else {
                ScoreB += 1;
            }
            if (detectedPlayerA.getTurnovers() > detectedPlayerB.getTurnovers()) {
                ScoreB += 1;
            }
            else {
                ScoreA += 1;
            }
        }
        if (ScoreA > ScoreB) {
            System.out.println("");
            System.err.println("");
            System.out.println(Aplayer + " is a statistically better player than "+ Bplayer + " because he is a better overall player considering the categories scoring, rebounding, playmaking, defense and efficiency");
        }
        if (ScoreB > ScoreA) {
            System.out.println("");
            System.out.println("");
            System.out.println(Bplayer + " is a statistically better player than "+ Aplayer + " because he is a better overall player considering the categories scoring, rebounding, playmaking, defense and efficiency");
        }
        if (ScoreA == ScoreB && detectedAB) {
            System.out.println("");
            System.out.println("");
            System.out.println(Aplayer + " is a statistically as good as "+ Bplayer + " because they are almost the same overall player considering the categories scoring, rebounding, playmaking, defense and efficiency");
        }


    }



    private void printAdvanced(PlayerStat detectedPlayer) {
        System.out.println("");
        System.out.println("");
        System.out.println("Here are the advanced stats of "+detectedPlayer.getPlayerName());
        System.out.println("------------");
        System.out.println("Age: " + detectedPlayer.getAge());
        System.out.println("Position: " + detectedPlayer.getPosition());
        System.out.println("Points per game: " + detectedPlayer.getPoints());
        System.out.println("Rebounds per game: " + detectedPlayer.getRebound());
        System.out.println("Assists per game: " + detectedPlayer.getAssists());
        System.out.println("Field Goal Percentage: " + (detectedPlayer.getFieldGoalPercentage()*100) + "%");
        System.out.println("Three Point Percentage: " + (detectedPlayer.getThreePointPercentage()*100)+"%");
        System.out.println("Steals per game: " + detectedPlayer.getSteals());
        System.out.println("Blocks per game: " + detectedPlayer.getBlocks());
        System.out.println("Turnovers per game: " + detectedPlayer.getTurnovers());
    }

    private void printNormal(PlayerStat detectedPlayer) {
        System.out.println("");
        System.out.println("");
        System.out.println("Here are the normal stats of "+detectedPlayer.getPlayerName());
        System.out.println("------------");
        System.out.println("Age: " + detectedPlayer.getAge());
        System.out.println("Position: " + detectedPlayer.getPosition());
        System.out.println("Points per game: " + detectedPlayer.getPoints());
        System.out.println("Rebounds per game: " + detectedPlayer.getRebound());
        System.out.println("Assists per game: " + detectedPlayer.getAssists());
    }

    public static boolean isPlayerFound() {
        return playerFound;
    }


}

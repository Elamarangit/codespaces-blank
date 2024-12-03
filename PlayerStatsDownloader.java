import java.io.*;
import java.util.*;

public class PlayerStatsDownloader {

    public static List<PlayerStat> readCsvFromUrl(String urlString)  {            
            List<PlayerStat> records = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(urlString)))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(","); // Assuming comma-separated values
                    PlayerStat stat = new PlayerStat();
                    stat.setPlayerName(values[0]);
                    stat.setPosition(values[1]);
                    stat.setAge(values[2]);
                    stat.setRebound(values[22]);
                    stat.setPoints(values[28]);
                    stat.setAssists(values[23]);
                    stat.setFieldGoalPercentage(values[9]);
                    stat.setThreePointPercentage(values[12]);
                    stat.setSteals(values[24]);
                    stat.setBlocks(values[25]);
                    stat.setTurnovers(values[26]);

                    
                    records.add(stat);
                }
            } catch (IOException ex) {
                System.out.println("Unable to download player data due to "+ex);
            } 
            return records;
        }

}

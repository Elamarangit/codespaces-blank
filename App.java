import java.util.Scanner;
public class App {
   static String[] goodbye = {"Bye! Thanks for asking me questions!", "Goodbye, come again!", "Bye!"};


   public static void main(String[] args) throws Exception {
       Scanner in = new Scanner (System.in);
       boolean hasValue = true;
    
       while (true) {
           System.out.println("Hi! I am a chatbot that can tell you all things about basketball, including player stats, team stats, and more! What would you like to learn about today?");
           String userResp = in.nextLine();
           if (userResp.toLowerCase().equals("bye")) {
               System.out.println(goodbye[(int) (Math.random() * (goodbye.length-1))]);
           }
           if (userResp.contains("stat")) {
               System.out.println("Ok! Would you like to know about player stats or team stats?");
               String playerOrTeam = in.nextLine();
               while (hasValue != false) {
                   if (playerOrTeam.contains("team")) {
                       System.out.println("I got you buddy, enter the full name of your team:");
                       String teamInput = in.nextLine();
                       TeamStats team = new TeamStats();
                       team.TeamRecordStats(teamInput);

                   }
                   else if (playerOrTeam.contains("player")) {
                       System.out.println("I got you buddy, enter the full name of the player:");
                       String nameInput = in.nextLine();
                       PlayerStatsManager player = new PlayerStatsManager();
                       player.normalStats(nameInput);
                   } else {
                       System.out.println("Please enter in 'player' or 'team'");
                       String playerOrTeam2 = in.nextLine();
                   }
               }
        
           }
           if (userResp.contains("compare") || userResp.contains("better")) {
              System.err.println("Sure thing! Enter the full name of the first player you want to compare(You must capitalize the first letter of the first&last name):");
              String playerA = in.nextLine();
              System.out.println("Enter the full name of the Second player: ");
              String playerB = in.nextLine();
              PlayerStatsManager player = new PlayerStatsManager();
              player.ComparePlayers(playerA, playerB);
              
           }
           System.out.println("Would you like to know something else? (type 'bye' to quit)");
       }
      


   }






}


    

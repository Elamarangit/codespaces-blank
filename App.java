import java.util.Scanner;
public class App {
   static String[] goodbye = {"Bye! Thanks for asking me questions!", "Goodbye, come again!", "Bye!"};
   static String[] error = {"I'm sorry but I can't understand what you just said", "I didn't quite get that!", "Your request might be beyond my capabilities"};
   static String[] askName = {"I got you buddy, what's the name of the player?", "Got you covered, my guy. Who's the player we're scouting today?", "Say no more! Which player are we analysing today"};


   public static void main(String[] args) throws Exception {
       Scanner in = new Scanner (System.in);
       boolean continueConversation = true;
       boolean statement = false;
       boolean confusedUser = false;
    
       while (continueConversation) {
           if (statement && confusedUser == false) {
               System.out.println("");
               System.out.println("Is there anything else I can assist you with? You can say goodbye if you want to use me later");
           }
           else if (continueConversation && confusedUser) {
            System.out.println("I can show you induvidual player stats and compare any two nba players from the 2021 NBA season, which one would you like to try?");
           }
           else {
               System.out.println("");
               System.out.println("Hey! I'm your go-to NBA bot for player stats and player-to-player comparisons. Who we talking about today?");
           }
           String userResp = in.nextLine();
           if (userResp.toLowerCase().contains("bye") || userResp.toLowerCase().contains("that's it") || userResp.toLowerCase().contains("done") || userResp.toLowerCase().contains("goodbye")) {
               System.out.println(goodbye[(int) (Math.random() * (goodbye.length-1))]);
               continueConversation = false;
           }
           else if (userResp.toLowerCase().contains("hi ") || userResp.toLowerCase().contains("i'm ")) {
            System.out.println("Hey there hoops fan!");
            confusedUser = true;
           }
            else if (userResp.toLowerCase().contains("hi") && userResp.toLowerCase().contains("confused") || userResp.toLowerCase().contains("doubt")) {
             System.out.println("I'f you're confused, that's alright! I can show you induvidual player stats and compare any two nba players from the 2021 nba season, which one would you like to try?");
             confusedUser = true;
           }
           else if (userResp.contains("stat")) {
               boolean toContinue = false;
               confusedUser = false;
               while (toContinue != true) {
                    System.out.println("Sure thing! would you like to see the advanced stats of the player or normal stats of a player");
                    String normalOrAdvanced = in.nextLine();
                

                    if (normalOrAdvanced.toLowerCase().contains("advanced")) {
                        System.out.println(askName[(int) (Math.random() * (askName.length-1))]);
                        String nameInput = in.nextLine();
                        PlayerStatsManager player = new PlayerStatsManager();
                        player.advancedStats(nameInput);
                        while (PlayerStatsManager.isPlayerFound()) {
                            System.out.println("");
                            System.out.println("As you can see, that name was invalid. Would you like to try another name?");
                            String nameInput2 = in.nextLine();
                            PlayerStatsManager player2 = new PlayerStatsManager();
                            player2.advancedStats(nameInput2);
                        }
                        System.out.println("");
                        System.out.println("would you like to see the stats of another player?");
                        String choice = in.nextLine();
                        if (choice.toLowerCase().contains("no")) {
                            toContinue = true;

                        }
                    } 
                    else if (normalOrAdvanced.toLowerCase().contains("normal")){
                        System.out.println(askName[(int) (Math.random() * (askName.length-1))]);
                        String nameInput = in.nextLine();
                        PlayerStatsManager player = new PlayerStatsManager();
                        player.normalStats(nameInput);
                        while (PlayerStatsManager.isPlayerFound()) {
                            System.out.println("");
                            System.out.println("As you can see, that name was invalid. Would you like to try another name?");
                            String nameInput3 = in.nextLine();
                            PlayerStatsManager player3 = new PlayerStatsManager();
                            player3.advancedStats(nameInput3);
                        }
                        System.out.println("");
                        System.out.println("would you like to see the stats of another player?");
                        String choice = in.nextLine();
                        if (choice.toLowerCase().contains("no")) {
                            toContinue = true;

                        }
                    } 

                    else {
                        System.out.println("I'm sorry but that's not a stats type that I've heard of before");
                        System.err.println("");
                        System.out.println("would you like to see more stats? ");
                        String choice = in.nextLine();
                        if (choice.toLowerCase().contains("no")) {
                            toContinue = true;

                        }
                    }
                }
    
           }
           else if (userResp.contains("compare") || userResp.contains("better")) {
            boolean toStop = false;
            confusedUser = false;
            while (toStop != true) {
              System.err.println("Sure thing! What's the full name of the first player you want to compare? ");
              String playerA = in.nextLine();
              System.out.println("What's the full name of the Second player?");
              String playerB = in.nextLine();
              PlayerStatsManager player = new PlayerStatsManager();
              player.ComparePlayers(playerA, playerB);
              System.out.println("");
              System.out.println("would you like to compare more players? ");
              String choice = in.nextLine();
              if (choice.toLowerCase().contains("no")) {
                toStop = true;
              }

            }

              
           }

           else {
            System.out.println(error[(int) (Math.random() * (error.length-1))]);
           }
           statement = true;
       }
      


   }






}


    

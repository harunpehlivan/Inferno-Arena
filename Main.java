
import java.util.Scanner;
import java.lang.Thread;

public class Main {


	  // Font colors
	  public static final String Reset = "\u001B[0m";
	  public static final String Black = "\u001B[30m";
	  public static final String Red = "\u001B[31m";
	  public static final String Green = "\u001B[32m";
	  public static final String Yellow = "\u001B[33m";
	  public static final String Blue = "\u001B[34m";
	  public static final String Purple = "\u001B[35m";
	  public static final String Cyan = "\u001B[36m";
	  public static final String White = "\u001B[37m";
	  public static final String Orange = "\033[91m";
	  public static final String BrightMagenta = "\033[95m";
	  public static final String BrightYellow = "\033[93m";
	  public static final String BrightBlue = "\033[94m";
	  
    
    // ScreenTransition
    public static int ScreenTransition = 0;
	  
    // Player Stats
    public static int Gold = 60;
	  public static int DamagePerHit = 20;
    public static int ArmorDefense = 1;
    public static int LuckLevel = 0;
    public static int ItemsObtained = 0;
    public static String SwordStrength = "Wood";
    public static int OverallLevel = 1;
    public static int Health = 100;
	  
	  // Highlight colors
	  public static final String BackBlack = "\u001B[40m";
	  public static final String BackRed = "\u001B[41m";
	  public static final String BackGreen = "\u001B[42m";
	  public static final String BackYellow = "\u001B[43m";
	  public static final String BackBlue = "\u001B[44m";
	  public static final String BackPurple = "\u001B[45m";
	  public static final String BackCyan = "\u001B[46m";
	  public static final String BackWhite = "\u001B[47m";
	  



	  // SlowPrinter Command Creation (Thanks to EpicGamer007)
	  public static void SlowPrint(String toPrint, int delay) {
	    try {
	      for (char c: toPrint.toCharArray()) {
	        System.out.print(c);
	        Thread.sleep(delay);
	      }
	    } catch(InterruptedException e) {
	      e.printStackTrace();
	    }
	  }


	  // Java Methods
	  public static void screen1() {

	    // Console Setup
	    System.out.println("\033[H\033[2J");

	    // Scanner Setup
	    Scanner mainscnr = new Scanner(System.in);
	    
	    // Welcome Sign; Sys-Out Print Line
	    SlowPrint(Cyan + "Welcome to the ", 10);
	    try{Thread.sleep(1100);}catch(InterruptedException e){}
	    SlowPrint(Yellow + "\nInferno" + Orange + " Arena", 75);
	    try{Thread.sleep(1500);}catch(InterruptedException e){}
	    SlowPrint(BrightMagenta + "\n\nType the number [1] to start playing, also dont miscommand when in a fight, i reccommend u dont. \n:::  ", 18);
	  } // Welcome Screen

	  public static void screen2() {
	    
	    // Console Setup
	    System.out.println("\033[H\033[2J");
	    
	    // Scanner Setup
	    Scanner mainscnr = new Scanner(System.in);
	    
	    // Main
	    System.out.println(Green + "  [1] Play Game\n  [2] Read Rules\n\n\nType 1 or 2 > ");

	  } // Play Game or Read Rules

	  public static void screen3() {
	    
	    // Console Setup
	    System.out.println("\033[H\033[2J");

	    // Scanner Setup
	    Scanner mainscnr = new Scanner(System.in);

	    // Main
	    System.out.println(BrightBlue + "  [1] Fight\n  [2] Upgrade\n  [3] Heal");

	    System.out.println(BrightYellow + "\n\nGold = " + Gold + " Ingots");
	    System.out.println(Cyan + "Damage Per Hit = " + DamagePerHit);
	    System.out.println(Purple + "Armor Defense Level = " + ArmorDefense);
	    System.out.println(Orange + "Luck Level = " + LuckLevel);
	    System.out.println(Green + "Health = " + Health);
	    System.out.println(BrightMagenta + "Level = " + OverallLevel);
	    System.out.println(White + "\nItems Obtained = " + ItemsObtained + "\nSword Strength = " + SwordStrength);
	    System.out.println(BrightBlue + "\n\n[4] Inventory");
	    SlowPrint("\n\n\n:::  ", 150);
	  } // Lobby

	  public static void screen4() {
	    // Console Steup
	    System.out.println("\033[H\033[2J");
	    
	    // Scanner Setup
	    Scanner mainscnr = new Scanner(System.in);

	    // Main
	    int DevilNamesInt = (int)(Math.random() * 51);
	    String DevilNamesStr = BrightYellow + "the Corrupted Strider";
      
      
	    if(DevilNamesInt == 12) {DevilNamesStr = BrightYellow + "a Crimson Sage";}
	    if(DevilNamesInt == 13) {DevilNamesStr = BrightYellow + "a Triceratops";}
	    if(DevilNamesInt == 14) {DevilNamesStr = BrightYellow + "Professor Theif";}
	    if(DevilNamesInt == 15) {DevilNamesStr = BrightYellow + "a very Pesky Bird";}
	    if(DevilNamesInt == 16) {DevilNamesStr = BrightYellow + "a Dusty Bunny";}
	    if(DevilNamesInt == 17) {DevilNamesStr = BrightYellow + "a Yumility";}
	    if(DevilNamesInt == 18) {DevilNamesStr = BrightYellow + "a Fembuch";}
	    if(DevilNamesInt == 19) {DevilNamesStr = BrightYellow + "the Glerk";}
	    if(DevilNamesInt == 20) {DevilNamesStr = BrightYellow + "a Ripdrool";}
	    if(DevilNamesInt == 21) {DevilNamesStr = BrightYellow + "a Fisher";}
	    if(DevilNamesInt == 22) {DevilNamesStr = BrightYellow + "a Griffon";}
	    if(DevilNamesInt == 23) {DevilNamesStr = BrightYellow + "a Danish Goat";}
	    if(DevilNamesInt == 24) {DevilNamesStr = BrightYellow + "Prismatic";}
	    if(DevilNamesInt == 25) {DevilNamesStr = BrightYellow + "a Dire Bat";}
	    if(DevilNamesInt == 26) {DevilNamesStr = BrightYellow + "a Thinker";}
	    if(DevilNamesInt == 27) {DevilNamesStr = BrightYellow + "Celestial";}
	    if(DevilNamesInt == 28) {DevilNamesStr = BrightYellow + "Larva";}
	    if(DevilNamesInt == 29) {DevilNamesStr = BrightYellow + "a Berseker";}
	    if(DevilNamesInt == 30) {DevilNamesStr = BrightYellow + "an Andal";}
	    if(DevilNamesInt == 31) {DevilNamesStr = BrightYellow + "a Strangl";}
	    if(DevilNamesInt == 32) {DevilNamesStr = BrightYellow + "an Undea";}
	    if(DevilNamesInt == 33) {DevilNamesStr = BrightYellow + "the Vortex";}
	    if(DevilNamesInt == 34) {DevilNamesStr = BrightYellow + "Fiendy";}
	    if(DevilNamesInt == 35) {DevilNamesStr = BrightYellow + "Vagabil";}
	    if(DevilNamesInt == 36) {DevilNamesStr = BrightYellow + "a Limart";}
	    if(DevilNamesInt == 37) {DevilNamesStr = BrightYellow + "a Litharplic";}
	    if(DevilNamesInt == 38) {DevilNamesStr = BrightYellow + "the Clumsy-Clumy-Cumy";}
	    if(DevilNamesInt == 39) {DevilNamesStr = BrightYellow + "a Cliq";}
	    if(DevilNamesInt == 40) {DevilNamesStr = BrightYellow + "a Rattlint";}
	    if(DevilNamesInt == 41) {DevilNamesStr = BrightYellow + "the Wicko-Wickno Wig Man";}
	    if(DevilNamesInt == 42) {DevilNamesStr = BrightYellow + "the Weakling";}
	    if(DevilNamesInt == 43) {DevilNamesStr = BrightYellow + "the Earthling";}
	    if(DevilNamesInt == 44) {DevilNamesStr = BrightYellow + "an Arrogant Lion";}
	    if(DevilNamesInt == 45) {DevilNamesStr = BrightYellow + "a Wandering Egyptian";}
	    if(DevilNamesInt == 46) {DevilNamesStr = BrightYellow + "a Hoglin";}
	    if(DevilNamesInt == 47) {DevilNamesStr = BrightYellow + "the Piglet Boss";}
	    if(DevilNamesInt == 48) {DevilNamesStr = BrightYellow + "a Chinese Villain";}
	    if(DevilNamesInt == 49) {DevilNamesStr = BrightYellow + "a Suicide Bomber";}
	    if(DevilNamesInt == 50) {DevilNamesStr = BrightYellow + "a Prismarine Enchanter";}


      switch (DevilNamesInt) {
       case 1:
        DevilNamesStr = BrightYellow + "a Custodian";
        break;
       case 2:
        DevilNamesStr = BrightYellow + "the Corrupted Claw";
        break;
       case 3:
        DevilNamesStr = BrightYellow + "the Master Monarch";
        break;
       case 4:
        DevilNamesStr = BrightYellow + "the Aqua Gorilla";
        break;
       case 5:
        DevilNamesStr = BrightYellow + "a Masterminded Coward";
        break;
       case 6:
        DevilNamesStr = BrightYellow + "a Gremlin";
        break;
       case 7:
        DevilNamesStr = BrightYellow + "the Yaubast";
        break;
       case 8:
        DevilNamesStr = BrightYellow + "a Radscorpian";
        break;
       case 9:
        DevilNamesStr = BrightYellow + "a Dinosaur";
        break;
       case 10:
        DevilNamesStr = BrightYellow + "a Mole Rat";
        break;
       case 11:
        DevilNamesStr = BrightYellow + "Lord Rhino";
        break;
      }



	    
	    SlowPrint(BrightBlue + "You decided to attack " + DevilNamesStr + BrightBlue + " , do you want to continue?", 10);
	    SlowPrint("\n  [1] Continue Attacking\n  [2] Run Away\n  ::: ", 1);
	    int RunAway = mainscnr.nextInt();
	    switch(RunAway) {
	      case 1:
        System.out.println("");
	      break;
	      case 2:
	      System.out.println("\033[H\033[2J");
        System.out.println("You ran away in shame.\n\n\nPress [1] to go back to the Lobby.");
	      ScreenTransition = 2;
	      break;
	    }


	  } // Fight: Subsection [1] < Lobby

    public static void screen5() {
      
      // Console Steup
	    System.out.println("\033[H\033[2J");
	    
	    // Scanner Setup
	    Scanner mainscnr = new Scanner(System.in);

      // Main

      // Improve Stat Type + Costs Number Of Gold
      System.out.println(Yellow + "  [1] Improve " + Cyan + "Damage Per Hit -- " + Yellow + "Costs" + BrightYellow + " 10 Gold");
      System.out.println(Yellow + "  [2] Improve " + Purple + "Armor Defense -- " + Yellow + "Costs" + BrightYellow + " 10 Gold");
      System.out.println(Yellow + "  [3] Improve " + Red + "Luck Level -- " + Yellow + "Costs" + BrightYellow + " 15 Gold");
      System.out.println(Yellow + "  [4] What is my " + Yellow + "Overall Player Level -- " + Yellow + "Costs" + BrightYellow + " 0 Gold");
      int BuyUpgraders = mainscnr.nextInt();
      switch(BuyUpgraders) {
        case 1:
        System.out.println("\033[H\033[2J");
        System.out.println("You purchased Damage Upgraders");
        ScreenTransition = 2;
      }


    } // Upgrade: Subsection [2] < Lobby








	  // Public Static Void Main(String[] Args)
	  public static void main(String[] args) {
	    // Clears the Console
	    System.out.println("\033[H\033[2J");
	    
	    // Screen Transition Setup
	    Scanner mainscnr = new Scanner(System.in);


	    // Main Intro Setup (Transition 0 Setup; If Statements)
	    if (ScreenTransition == 0) {screen1();}
	    int MainIntro = mainscnr.nextInt();

	    // Main Intro (Transition 0; Switch Statements)
	    switch (MainIntro) {
	      case 1:
	       ScreenTransition = 1;
	       break;
	      case 2:
	       ScreenTransition = 0;
	       break;
	      case 3:
	       ScreenTransition = 0;
	       break;
	    }

	    boolean flag = true;
	    while (flag) {
	    	
        // Transition 1 Setup and Switch Statements
		    System.out.println("\033[H\033[2J");
		    if(ScreenTransition == 1) {
		     screen2();
		     int ScreenTwo = mainscnr.nextInt();
		     ScreenTransition = 1;

		     // Switch Statements
		     switch (ScreenTwo) {
		       case 1:
		        ScreenTransition = 2;
		        break;
		       case 2:
		        ScreenTransition = 3;
		        break;
		     }

		    }

		    // Transition 2 Setup and Switch Statements
		    if(ScreenTransition == 2) {
		     screen3();
		     int ScreenThree = mainscnr.nextInt();
		     ScreenTransition = 2;

		     // Switch Statements
		     switch (ScreenThree) {
		       case 1:
		        ScreenTransition = 4;
		        break;
		       case 2:
		        ScreenTransition = 5;
		        break;
		       case 3: 
		        ScreenTransition = 6;
		        break;
		       case 4:
		        ScreenTransition = 7;
		        break;
		     }

		    }

		    // Transition 4 Setup and Switch Statements
		    if(ScreenTransition == 4) {
		      screen4();
		      int ScreenFour = mainscnr.nextInt();
		      ScreenTransition = 4;

		      // Switch Statements
		      switch (ScreenFour) {
		       case 1: 
		        ScreenTransition = 8;
		       case 2:
		        ScreenTransition = 2;
		      }
		    }

        // Transition 5 Setup Switch Statements
        if(ScreenTransition == 5) {
          screen5();
          int ScreenFive = mainscnr.nextInt();
          
          // Switch Statements
          switch (ScreenFive) {
           case 1:
            ScreenTransition = 9;
           case 2:
            ScreenTransition = 10;
           case 3:
            ScreenTransition = 11;
           case 4:
            ScreenTransition = 12;
           case 5:
            ScreenTransition = 13;
          }
        }


		    if(ScreenTransition == 100) {
		    	flag = false;
		    }
	    	
	    }
	    
	    

	  }
	}

